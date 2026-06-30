package dk2;

/* loaded from: classes3.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.g0 f233229d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(dk2.g0 g0Var) {
        super(0);
        this.f233229d = g0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveAnchorVerifyManager", "recoveryLive");
        dk2.g0 g0Var = this.f233229d;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = g0Var.f233469b;
        if (k0Var != null) {
            qo0.c.a(k0Var, qo0.b.H4, null, 2, null);
        }
        g0Var.d(false);
        return jz5.f0.f302826a;
    }
}
