package uh5;

/* loaded from: classes12.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final long f428014a = (long) (java.lang.Runtime.getRuntime().maxMemory() * 0.05d);

    public final android.graphics.Bitmap a(java.lang.String str, int i17, int i18) {
        int i19;
        int i27;
        int i28;
        java.lang.String str2 = str + "_tmp.jpg";
        try {
        } catch (java.lang.Throwable th6) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MediaGallery.LimitImageDecoder", "dkprog tryUseImageOpt failed. file:%s e:%s", str, com.tencent.mm.sdk.platformtools.z3.c(th6));
        }
        if (fp.h.a(16)) {
            return null;
        }
        if (!z65.c.a()) {
            try {
                int P = com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("UseOptImageRecv"), 0);
                kk.v vVar = new kk.v(c01.d9.b().C());
                long j17 = 100;
                com.tencent.mars.xlog.Log.i("MediaGallery.LimitImageDecoder", "fromPathToImgInfo opt:%d uin:(%d,%d) debug:%b sdk:%d", java.lang.Integer.valueOf(P), java.lang.Long.valueOf(vVar.longValue()), java.lang.Long.valueOf(vVar.longValue() / j17), java.lang.Boolean.valueOf(z65.c.a()), java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
                if ((((int) (vVar.longValue() / j17)) % 100) + 1 > P) {
                    return null;
                }
            } catch (java.lang.Exception e17) {
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MediaGallery.LimitImageDecoder", "get useopt :%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                return null;
            }
        }
        com.tencent.mm.vfs.w6.u(com.tencent.mm.vfs.w6.r(str2));
        com.tencent.mm.vfs.w6.c(str, str2);
        boolean IsJpegFile = com.tencent.mm.sdk.platformtools.MMNativeJpeg.IsJpegFile(str2);
        boolean isProgressive = com.tencent.mm.sdk.platformtools.MMNativeJpeg.isProgressive(str2);
        boolean a17 = com.tencent.mm.sdk.platformtools.x1.a(str2);
        int k17 = (int) com.tencent.mm.vfs.w6.k(str2);
        if (IsJpegFile && isProgressive) {
            r4 = a17 ? com.tencent.mm.sdk.platformtools.MMNativeJpeg.decodeAsBitmap(str2) : null;
            uh5.g gVar = uh5.h.f428009d;
            if (r4 != null) {
                i27 = i17;
                i28 = i18;
                i19 = k17;
            } else {
                i19 = 0 - k17;
                i27 = i17;
                i28 = i18;
            }
            gVar.a(str, i28, i27, i19);
        }
        com.tencent.mars.xlog.Log.i("MediaGallery.LimitImageDecoder", "dkprog tryUseImageOpt jpeg:%b isprog:%b inte:%b len:%d [%d,%d] bm:%s path:%s", java.lang.Boolean.valueOf(IsJpegFile), java.lang.Boolean.valueOf(isProgressive), java.lang.Boolean.valueOf(a17), java.lang.Integer.valueOf(k17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), r4, str);
        com.tencent.mm.vfs.w6.h(str2);
        return r4;
    }
}
