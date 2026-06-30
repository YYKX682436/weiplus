package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class v2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI f161628d;

    public v2(com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI selfQRCodeUI) {
        this.f161628d = selfQRCodeUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] bArr;
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Di(d85.g0.STORAGE, d85.f0.M, new com.tencent.mm.plugin.setting.ui.setting.u2(this))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SelfQRCodeNewUI", "business switch close ,return");
            return;
        }
        com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI selfQRCodeUI = this.f161628d;
        java.io.OutputStream outputStream = null;
        if (!com.tencent.mm.storage.z3.R4(selfQRCodeUI.f160180i)) {
            rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
            java.lang.String str = selfQRCodeUI.f160180i;
            ((qv.o) u2Var).getClass();
            if (!r01.z.j(str)) {
                bArr = selfQRCodeUI.f160182n;
                if (bArr != null || bArr.length <= 0) {
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
                sb6.append(q75.c.d());
                sb6.append("mmqrcode");
                sb6.append(java.lang.System.currentTimeMillis());
                sb6.append(".png");
                java.lang.String sb7 = sb6.toString();
                try {
                    try {
                        outputStream = com.tencent.mm.sdk.platformtools.u6.a(selfQRCodeUI.getContext(), sb7);
                        outputStream.write(bArr);
                        ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
                        dp.a.makeText(selfQRCodeUI, selfQRCodeUI.getString(com.tencent.mm.R.string.f492304g00, q75.c.e()), 1).show();
                        ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
                        q75.c.f(sb7, selfQRCodeUI);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SelfQRCodeNewUI", e17, "", new java.lang.Object[0]);
                        if (outputStream == null) {
                            return;
                        }
                    }
                    try {
                        outputStream.close();
                    } catch (java.lang.Exception unused) {
                        return;
                    }
                } catch (java.lang.Throwable th6) {
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (java.lang.Exception unused2) {
                        }
                    }
                    throw th6;
                }
            }
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(219L, 10L, 1L, true);
        android.graphics.Bitmap b07 = com.tencent.mm.sdk.platformtools.x.b0(selfQRCodeUI.findViewById(com.tencent.mm.R.id.f486493lf2));
        if (b07 != null) {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            b07.compress(android.graphics.Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
            bArr = byteArrayOutputStream.toByteArray();
        } else {
            bArr = null;
        }
        if (bArr == null) {
            bArr = selfQRCodeUI.f160182n;
        }
        if (bArr != null) {
        }
    }
}
