package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class o90 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ea0 f113724d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l81.b1 f113725e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.y23 f113726f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f113727g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f113728h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o90(com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var, l81.b1 b1Var, r45.y23 y23Var, cm2.m0 m0Var, boolean z17) {
        super(2);
        this.f113724d = ea0Var;
        this.f113725e = b1Var;
        this.f113726f = y23Var;
        this.f113727g = m0Var;
        this.f113728h = z17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Boolean) obj).booleanValue();
        zl2.r4 r4Var = zl2.r4.f473950a;
        com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var = this.f113724d;
        android.content.Context context = ea0Var.f365323d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        r4Var.h3(context, false);
        com.tencent.mm.plugin.finder.live.plugin.ea0.t1(ea0Var, this.f113727g, this.f113728h, this.f113725e, this.f113726f);
        return jz5.f0.f302826a;
    }
}
