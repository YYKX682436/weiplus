package z23;

/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final z23.i f469747a = new z23.i();

    public final void a(java.lang.String source, java.lang.String dst) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(dst, "dst");
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(source, false);
        kotlin.jvm.internal.o.d(i17);
        android.media.ExifInterface exifInterface = new android.media.ExifInterface(i17);
        java.lang.String attribute = exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE);
        java.lang.String attribute2 = exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE);
        java.lang.String attribute3 = exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE_REF);
        java.lang.String attribute4 = exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE_REF);
        java.lang.String attribute5 = exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_LONGITUDE);
        java.lang.String attribute6 = exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_LONGITUDE_REF);
        java.lang.String i18 = com.tencent.mm.vfs.w6.i(dst, false);
        kotlin.jvm.internal.o.d(i18);
        android.media.ExifInterface exifInterface2 = new android.media.ExifInterface(i18);
        if (attribute != null) {
            exifInterface2.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE, attribute);
        }
        if (attribute2 != null) {
            exifInterface2.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE, attribute2);
        }
        if (attribute3 != null) {
            exifInterface2.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE_REF, attribute3);
        }
        if (attribute4 != null) {
            exifInterface2.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE_REF, attribute4);
        }
        if (attribute5 != null) {
            exifInterface2.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_LONGITUDE, attribute5);
        }
        if (attribute6 != null) {
            exifInterface2.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_LONGITUDE_REF, attribute6);
        }
        try {
            exifInterface2.saveAttributes();
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PhotoExifUtil", e17, "saveAttributes error!", new java.lang.Object[0]);
        }
    }
}
