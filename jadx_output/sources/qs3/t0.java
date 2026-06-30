package qs3;

/* loaded from: classes15.dex */
public final class t0 implements ns.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.radar.ui.RadarViewController f366391a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f366392b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.oi5 f366393c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ps3.e f366394d;

    public t0(com.tencent.mm.plugin.radar.ui.RadarViewController radarViewController, java.lang.String str, r45.oi5 oi5Var, ps3.e eVar) {
        this.f366391a = radarViewController;
        this.f366392b = str;
        this.f366393c = oi5Var;
        this.f366394d = eVar;
    }

    @Override // ns.j
    public final void a(boolean z17) {
        ps3.e eVar = this.f366394d;
        r45.oi5 oi5Var = this.f366393c;
        java.lang.String str = this.f366392b;
        com.tencent.mm.plugin.radar.ui.RadarViewController radarViewController = this.f366391a;
        if (!z17) {
            com.tencent.mm.plugin.radar.ui.RadarViewController.a(radarViewController, str, oi5Var, eVar);
            return;
        }
        ((ms.a) ((ns.k) i95.n0.c(ns.k.class))).Bi(radarViewController.getContext(), 1, str, new qs3.s0(radarViewController, str, oi5Var, eVar));
    }
}
