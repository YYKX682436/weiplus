package com.tencent.wework.api.util;

/* loaded from: classes12.dex */
public abstract class OpenDataUtils {
    public static long a(android.content.Context context, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        try {
            android.net.Uri build = new android.net.Uri.Builder().scheme("content").authority(str2 + ".wwapi").appendPath("bundle").appendQueryParameter("pakage", str).build();
            build.toString();
            android.content.ContentValues contentValues = new android.content.ContentValues();
            android.os.Parcel obtain = android.os.Parcel.obtain();
            bundle.writeToParcel(obtain, 0);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, marshall);
            return android.content.ContentUris.parseId(context.getContentResolver().insert(build, contentValues));
        } catch (java.lang.Throwable th6) {
            th6.toString();
            return -1L;
        }
    }
}
