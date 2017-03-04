   @Override
public boolean onKeyDown(int keyCode, KeyEvent event) {
    if ((keyCode == KeyEvent.KEYCODE_BACK)) {
        AlertDialog.Builder alertbox = new AlertDialog.Builder(HomeActivity.this);
        alertbox.setIcon(R.drawable.info_icon);
        alertbox.setTitle("You Want To Exit Programm");
        alertbox.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) { 
               // finish used for destroyed activity
                finish();
            }
        });

        alertbox.setNegativeButton("No", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
                    // Nothing will be happened when clicked on no button 
                    // of Dialog     
          }
        });

        alertbox.show();
    }
    return super.onKeyDown(keyCode, event);
}
