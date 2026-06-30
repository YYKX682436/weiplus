package p14;

/* loaded from: classes4.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.qrcode.ShowQRCodeStep1UI f351242d;

    public p0(com.tencent.mm.plugin.setting.ui.qrcode.ShowQRCodeStep1UI showQRCodeStep1UI) {
        this.f351242d = showQRCodeStep1UI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.setting.ui.qrcode.ShowQRCodeStep1UI showQRCodeStep1UI = this.f351242d;
        byte[] bArr = showQRCodeStep1UI.f160123g;
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
        sb6.append(q75.c.d());
        sb6.append("mmqrcode");
        sb6.append(java.lang.System.currentTimeMillis());
        sb6.append(".png");
        java.lang.String sb7 = sb6.toString();
        java.io.OutputStream outputStream = null;
        try {
            try {
                outputStream = com.tencent.mm.vfs.w6.K(sb7, false);
                outputStream.write(bArr);
                dp.a.makeText(showQRCodeStep1UI, showQRCodeStep1UI.getString(com.tencent.mm.R.string.f492304g00, q75.c.c(sb7)), 1).show();
                ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
                q75.c.f(sb7, showQRCodeStep1UI);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ShowQRCodeStep1UI", e17, "", new java.lang.Object[0]);
                if (outputStream == null) {
                    return;
                }
            }
            try {
                outputStream.close();
            } catch (java.lang.Exception unused) {
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
