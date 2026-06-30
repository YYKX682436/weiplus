package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class uh extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.g84 f114563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f114564e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fy2.d f114565f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.wh f114566g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh(r45.g84 g84Var, boolean z17, fy2.d dVar, com.tencent.mm.plugin.finder.live.plugin.wh whVar) {
        super(0);
        this.f114563d = g84Var;
        this.f114564e = z17;
        this.f114565f = dVar;
        this.f114566g = whVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateBgDecoration loadDecorationRes:");
        r45.g84 g84Var = this.f114563d;
        sb6.append(g84Var != null ? g84Var.getString(1) : null);
        sb6.append(" result:");
        boolean z17 = this.f114564e;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveDecorationPlugin", sb6.toString());
        if (z17) {
            this.f114565f.f267240g = g84Var;
            com.tencent.mm.plugin.finder.live.plugin.wh whVar = this.f114566g;
            whVar.u1();
            whVar.f365323d.postDelayed(whVar.f114937q, ((java.lang.Number) ae2.in.f3688a.z().r()).longValue() * 1000);
        }
        return jz5.f0.f302826a;
    }
}
