package v62;

/* loaded from: classes12.dex */
public class k implements com.tencent.mm.plugin.facedetect.model.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v62.l f433517a;

    public k(v62.l lVar) {
        this.f433517a = lVar;
    }

    public void a(java.lang.String str, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ExtQrCodeHandler", "hy: result: %s, code type: %d, code version: %d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        v62.l lVar = this.f433517a;
        if (!K0) {
            lVar.c(new v62.o(i17, str, i18));
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.ExtQrCodeHandler", "hy: not retrieved result!");
            lVar.c(null);
        }
    }
}
