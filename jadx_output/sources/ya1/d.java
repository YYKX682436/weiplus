package ya1;

/* loaded from: classes7.dex */
public abstract class d {
    public static void a(java.io.InputStream inputStream, java.lang.String str) {
        if (inputStream == null || !c(str)) {
            return;
        }
        androidx.exifinterface.media.ExifInterface exifInterface = new androidx.exifinterface.media.ExifInterface(str);
        ya1.c.a(new androidx.exifinterface.media.ExifInterface(inputStream), exifInterface);
        exifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, null);
        exifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_WIDTH, null);
        exifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_THUMBNAIL_IMAGE_WIDTH, null);
        exifInterface.saveAttributes();
    }

    public static void b(java.lang.String str, java.lang.String str2) {
        if (c(str) && c(str2)) {
            androidx.exifinterface.media.ExifInterface exifInterface = new androidx.exifinterface.media.ExifInterface(str2);
            ya1.c.a(new androidx.exifinterface.media.ExifInterface(str), exifInterface);
            exifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, null);
            exifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_WIDTH, null);
            exifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_THUMBNAIL_IMAGE_WIDTH, null);
            exifInterface.saveAttributes();
        }
    }

    public static boolean c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        return !m17.a() ? false : m17.f213266a.F(m17.f213267b);
    }
}
