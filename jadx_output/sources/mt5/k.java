package mt5;

/* loaded from: classes8.dex */
public class k extends lt5.g {
    public final java.lang.String b(android.content.Context context, java.lang.String str) {
        android.database.Cursor cursor;
        try {
            cursor = context.getContentResolver().query(android.net.Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new java.lang.String[]{str}, null);
        } catch (java.lang.Throwable unused) {
            cursor = null;
        }
        java.lang.String str2 = "";
        if (cursor == null) {
            return "";
        }
        try {
            if (cursor.moveToNext()) {
                try {
                    str2 = cursor.getString(cursor.getColumnIndex("value"));
                } catch (java.lang.Throwable unused2) {
                }
            }
            return str2;
        } finally {
            try {
                cursor.close();
            } catch (java.lang.Throwable unused3) {
            }
        }
    }
}
