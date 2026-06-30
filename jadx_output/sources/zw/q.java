package zw;

/* loaded from: classes7.dex */
public final class q {
    public q(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(java.lang.String srcPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        int orientationInDegree = com.tencent.mm.compatible.util.Exif.fromFile(srcPath).getOrientationInDegree();
        if (orientationInDegree == 0) {
            return srcPath;
        }
        int i17 = orientationInDegree % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
        try {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            android.graphics.Bitmap d17 = com.tencent.mm.graphics.e.d(srcPath, options);
            if (d17 == null) {
                com.tencent.mars.xlog.Log.e("Biz.BizImageUtil", "rotate image, get null bmp");
                return srcPath;
            }
            android.graphics.Bitmap w07 = com.tencent.mm.sdk.platformtools.x.w0(d17, i17);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(lp0.b.K());
            sb6.append("microMsg.tmp.");
            sb6.append(java.lang.System.currentTimeMillis());
            zw.q qVar = zw.r.f476539a;
            sb6.append(qVar.d(options) ? com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG : ".png");
            java.lang.String sb7 = sb6.toString();
            try {
                com.tencent.mm.sdk.platformtools.x.D0(w07, 100, qVar.d(options) ? android.graphics.Bitmap.CompressFormat.JPEG : android.graphics.Bitmap.CompressFormat.PNG, sb7, true);
                if (qVar.d(options)) {
                    b(srcPath, sb7);
                }
                return sb7;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("Biz.BizImageUtil", "rotate image, exception occurred when saving | %s", e17);
                com.tencent.mm.vfs.w6.h(sb7);
                return srcPath;
            }
        } catch (java.lang.NullPointerException | java.lang.OutOfMemoryError unused) {
            return srcPath;
        }
    }

    public final void b(java.lang.String srcPath, java.lang.String dstPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(dstPath, "dstPath");
        if (c(srcPath) && c(dstPath)) {
            androidx.exifinterface.media.ExifInterface exifInterface = new androidx.exifinterface.media.ExifInterface(dstPath);
            androidx.exifinterface.media.ExifInterface exifInterface2 = new androidx.exifinterface.media.ExifInterface(srcPath);
            for (java.lang.String str : zw.p.f476538a) {
                java.lang.String attribute = exifInterface2.getAttribute(str);
                if (attribute != null) {
                    exifInterface.setAttribute(str, attribute);
                }
            }
            exifInterface.saveAttributes();
            exifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, null);
            exifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_WIDTH, null);
            exifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_THUMBNAIL_IMAGE_WIDTH, null);
            exifInterface.saveAttributes();
        }
    }

    public final boolean c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        kotlin.jvm.internal.o.d(str);
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

    public final boolean d(android.graphics.BitmapFactory.Options options) {
        java.lang.String str;
        if (options == null || (str = options.outMimeType) == null) {
            return false;
        }
        java.util.Locale locale = java.util.Locale.getDefault();
        kotlin.jvm.internal.o.f(locale, "getDefault(...)");
        java.lang.String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        return r26.n0.L(lowerCase, "jpg", 0, false, 6, null) >= 0 || r26.n0.L(lowerCase, "jpeg", 0, false, 6, null) >= 0;
    }

    public final boolean e(java.lang.String imageFile) {
        kotlin.jvm.internal.o.g(imageFile, "imageFile");
        return com.tencent.mm.compatible.util.Exif.fromFile(imageFile).getOrientationInDegree() != 0;
    }
}
