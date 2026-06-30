package w21;

/* loaded from: classes12.dex */
public class p implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w21.o f442451d;

    public p(w21.o oVar) {
        this.f442451d = oVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        int i17;
        w21.o oVar = this.f442451d;
        w21.w0 j17 = w21.x0.j(oVar.f442432f);
        if (j17 == null || !j17.d()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVoice", "Get info Failed file:" + oVar.f442432f);
            oVar.f442437n = fp.k.a() + 10000;
            oVar.f442430d.onSceneEnd(3, -1, "doScene failed", oVar);
            return false;
        }
        if (!oVar.f442439p && 3 != (i17 = j17.f442492i) && 8 != i17) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if ((currentTimeMillis / 1000) - j17.f442494k > 30) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVoice", "Error ModifyTime in Read file:" + oVar.f442432f);
                oVar.f442437n = fp.k.a() + 10000;
                oVar.f442430d.onSceneEnd(3, -1, "doScene failed", oVar);
                return false;
            }
            if (currentTimeMillis - oVar.f442436m < 2000) {
                java.lang.String str = oVar.f442432f;
                return true;
            }
            w21.t d17 = w21.x0.i(null, oVar.f442432f).d(j17.f442489f, 6000);
            java.lang.String str2 = oVar.f442432f;
            if (d17.f442465b < 2000) {
                return true;
            }
        }
        if (oVar.doScene(oVar.dispatcher(), oVar.f442430d) == -1) {
            oVar.f442437n = fp.k.a() + 10000;
            oVar.f442430d.onSceneEnd(3, -1, "doScene failed", oVar);
        }
        return false;
    }
}
