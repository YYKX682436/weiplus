package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class u50 extends kotlin.jvm.internal.q implements yz5.a {
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC C;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f136092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ow2.h f136093e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f136094f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f136095g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u50(float f17, ow2.h hVar, in5.s0 s0Var, boolean z17, com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC finderSpeedControlUIC) {
        super(0);
        this.f136092d = f17;
        this.f136093e = hVar;
        this.f136094f = s0Var;
        this.f136095g = z17;
        this.C = finderSpeedControlUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        float f17 = this.f136092d;
        boolean z17 = f17 == 1.0f;
        ow2.h hVar = this.f136093e;
        if (z17) {
            in5.s0 s0Var = this.f136094f;
            hVar.f(s0Var, this.f136095g);
            this.C.b(s0Var);
        } else {
            hVar.h(f17);
        }
        return jz5.f0.f302826a;
    }
}
