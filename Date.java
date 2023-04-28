 String CurrentDate;
    String FinalDate;
    String DifferanceDate;

//         Get Current Date Time
        Calendar c = Calendar.getInstance();
        @SuppressLint("SimpleDateFormat")
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyy");
        CurrentDate = sdf.format(c.getTime());
//        Toast.makeText(getApplicationContext(), CurrentDate, Toast.LENGTH_LONG).show();
        FinalDate="240323";
        ExpiryData();
        int numDate = Integer.parseInt(DifferanceDate);
        if (numDate<90){
            Toast.makeText(ScannedHome.this, "Item Date Not Expire"+numDate, Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(ScannedHome.this, "Item Date Expire, Please try again", Toast.LENGTH_SHORT).show();
        }

 private void ExpiryData() {
        try {
//            String FinalDate= "031022";
            Date date1;
            Date date2;
            SimpleDateFormat dates = new SimpleDateFormat("ddMMyy");
            date1 = dates.parse(CurrentDate);
            date2 = dates.parse(FinalDate);
            long difference = Math.abs(date1.getTime() - date2.getTime());
            long differenceDates = difference / (24 * 60 * 60 * 1000);
            String dayDifference = Long.toString(differenceDates);
            DifferanceDate = dayDifference;
//            Toast.makeText(this,  dayDifference , Toast.LENGTH_SHORT).show();
        } catch (Exception exception) {
            Toast.makeText(this, "Unable to find difference", Toast.LENGTH_SHORT).show();
        }

    }
