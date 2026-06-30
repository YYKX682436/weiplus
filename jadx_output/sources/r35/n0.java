package r35;

/* loaded from: classes15.dex */
public class n0 implements p11.c {

    /* renamed from: a, reason: collision with root package name */
    public final int f369210a;

    public n0(int i17) {
        this.f369210a = i17;
    }

    @Override // p11.c
    public q11.b b(java.lang.String str) {
        boolean z17;
        int i17 = this.f369210a;
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            q11.b a17 = r35.z.f369329a.a(str, false, new r35.c0(i17));
            if (a17 != null) {
                java.lang.String str2 = a17.f359535e;
                byte[] bArr = a17.f359533c;
                long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                r35.y yVar = r35.y.f369326a;
                if (qk.c.f() && yVar.d(str2) && qk.c.g(str)) {
                    if (bArr == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ChattingBizImgDownloader", "response.data is null");
                        if (yVar.a(i17)) {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1111L, 10L, 1L);
                        }
                        return c(str);
                    }
                    int i18 = a17.f359536f;
                    if (i18 > 0 && i18 != bArr.length) {
                        if (yVar.a(i17)) {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1111L, 10L, 1L);
                        }
                        return c(str);
                    }
                    android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    com.tencent.mm.graphics.e.b(bArr, 0, bArr.length, options);
                    if (options.outHeight >= 1 && options.outWidth >= 1) {
                        if (yVar.a(i17)) {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1111L, 9L, 1L);
                        }
                    }
                    com.tencent.mars.xlog.Log.e("MicroMsg.ChattingBizImgDownloader", "decode wxpic fail");
                    if (yVar.a(i17)) {
                        r35.x.f369320a.b(str2, false);
                    }
                    if (yVar.d(str2)) {
                        if (!(str.length() == 0) && (i17 == 1 || i17 == 2 || i17 == 3)) {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17492, str, 2, 1, java.lang.Integer.valueOf(i17));
                        }
                    }
                    return c(str);
                }
                if (m11.n1.g()) {
                    if (str2 != null && str2.length() != 0) {
                        z17 = false;
                        if ((z17 && kotlin.jvm.internal.o.b(str2, "image/webp")) && qk.c.h(str)) {
                            r9 = true;
                        }
                    }
                    z17 = true;
                    if (z17 && kotlin.jvm.internal.o.b(str2, "image/webp")) {
                        r9 = true;
                    }
                }
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.idkeyStat(86L, 4L, currentTimeMillis2, false);
                if (r9) {
                    g0Var.idkeyStat(86L, 17L, currentTimeMillis2, false);
                }
            }
            return a17;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingBizImgDownloader", "get image data failed.:%s", e17.toString());
            return new q11.b((byte[]) null, 2, (java.lang.String) null);
        }
    }

    public final q11.b c(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingBizImgDownloader", "tryToGetNormalImage after get WxPic failed");
        try {
            java.lang.System.currentTimeMillis();
            q11.b a17 = r35.z.f369329a.a(str, true, new r35.c0(this.f369210a));
            if (a17 == null) {
                return a17;
            }
            java.lang.System.currentTimeMillis();
            return a17;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingBizImgDownloader", "get image data failed.:%s", e17.toString());
            return new q11.b((byte[]) null, 2, (java.lang.String) null);
        }
    }
}
