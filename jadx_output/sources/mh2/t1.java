package mh2;

/* loaded from: classes10.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mh2.u1 f326462d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f326463e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(mh2.u1 u1Var, boolean z17) {
        super(0);
        this.f326462d = u1Var;
        this.f326463e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f326463e;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        mh2.u1 u1Var = this.f326462d;
        u1Var.f326475j = valueOf;
        com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = u1Var.f326474i;
        if (z17) {
            ripperAnimateView.d();
        } else {
            kotlin.jvm.internal.o.f(ripperAnimateView, "access$getWaveAnim$p(...)");
            int i17 = com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView.f111717o;
            ripperAnimateView.e(false);
        }
        return jz5.f0.f302826a;
    }
}
