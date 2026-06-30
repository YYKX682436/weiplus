package ef0;

/* loaded from: classes4.dex */
public final class p2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ef0.y2 f252298a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f252299b;

    public p2(ef0.y2 y2Var, kotlin.coroutines.Continuation continuation) {
        this.f252298a = y2Var;
        this.f252299b = continuation;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.TingEntryConfigService", "getListenUserConfig callback errType: " + fVar.f70615a + ", errCode: " + fVar.f70616b);
        int i17 = fVar.f70615a;
        bw5.lc0 lc0Var = null;
        kotlin.coroutines.Continuation continuation = this.f252299b;
        if (i17 == 0 && fVar.f70616b == 0) {
            bw5.q70 q70Var = (bw5.q70) fVar.f70618d;
            if (q70Var != null) {
                lc0Var = q70Var.f31990f[2] ? q70Var.f31988d : new bw5.lc0();
            }
            if (lc0Var != null) {
                ef0.y2 y2Var = this.f252298a;
                y2Var.f252360d = lc0Var;
                y2Var.wi();
            }
            continuation.resumeWith(kotlin.Result.m521constructorimpl(lc0Var));
        } else {
            continuation.resumeWith(kotlin.Result.m521constructorimpl(null));
        }
        return jz5.f0.f302826a;
    }
}
