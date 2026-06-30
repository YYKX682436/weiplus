package wh0;

/* loaded from: classes11.dex */
public class e extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.network.v0 f445915d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0[] f445916e = {null};

    public e(java.lang.String str, int i17, int i18) {
        this.f445915d = new wh0.d(str, i17, i18);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        synchronized (this.f445916e) {
            com.tencent.mm.modelbase.u0 u0Var2 = this.f445916e[0];
            if (u0Var2 != null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SendWxAICommandCgi", "[!] reuse netscene, last queue callback:%s, new callback:%s", u0Var2, u0Var);
            }
            this.f445916e[0] = u0Var;
        }
        return dispatch(sVar, this.f445915d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 17907;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        synchronized (this.f445916e) {
            com.tencent.mm.modelbase.u0 u0Var = this.f445916e[0];
            if (u0Var != null) {
                u0Var.onSceneEnd(i18, i19, str, this);
            }
        }
    }
}
