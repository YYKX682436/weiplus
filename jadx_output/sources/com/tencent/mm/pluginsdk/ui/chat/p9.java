package com.tencent.mm.pluginsdk.ui.chat;

@j95.b
/* loaded from: classes5.dex */
public final class p9 extends i95.w implements xs.h1 {
    public final android.database.Cursor Ai(android.content.ContentResolver contentResolver, long j17, boolean z17) {
        java.lang.String str = "(date_added >= " + (j17 - 30) + ')';
        if (z17) {
            str = str + " AND (date_added <= " + j17 + ')';
        }
        return contentResolver.query(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new java.lang.String[]{"_id", "_data", "date_added"}, str, null, "date_added desc limit 1");
    }

    public final android.database.Cursor wi(android.content.ContentResolver contentResolver, long j17, boolean z17) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("android:query-arg-limit", 1);
        bundle.putStringArray("android:query-arg-sort-columns", new java.lang.String[]{"date_added"});
        bundle.putInt("android:query-arg-sort-direction", 1);
        java.lang.String str = "(date_added >= " + (j17 - 30) + ')';
        if (z17) {
            str = str + " AND (date_added <= " + j17 + ')';
        }
        bundle.putString("android:query-arg-sql-selection", str);
        return contentResolver.query(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new java.lang.String[]{"_id", "_data", "date_added"}, bundle, null);
    }
}
