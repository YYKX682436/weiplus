package v62;

/* loaded from: classes12.dex */
public class m implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v62.n f433519d;

    public m(v62.n nVar) {
        this.f433519d = nVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17 = ((w62.a) m1Var).f443276f == 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.ExtQrCodeHandler", "hy: check url done. errType: %d, errCode: %d, errMsg %s, scene: %b", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Boolean.valueOf(z17));
        gm0.j1.n().f273288b.q(782, this);
        v62.n nVar = this.f433519d;
        if (i17 == 0 && i18 == 0) {
            nVar.c(java.lang.Boolean.valueOf(z17));
        } else {
            nVar.c(java.lang.Boolean.FALSE);
        }
    }
}
