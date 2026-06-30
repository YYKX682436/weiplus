package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class v50 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f136209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC f136210e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f136211f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v50(float f17, com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC finderSpeedControlUIC, in5.s0 s0Var) {
        super(0);
        this.f136209d = f17;
        this.f136210e = finderSpeedControlUIC;
        this.f136211f = s0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        float f17 = this.f136209d;
        boolean z17 = f17 == 1.0f;
        com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC finderSpeedControlUIC = this.f136210e;
        if (z17) {
            ow2.h hVar = finderSpeedControlUIC.f133648s;
            in5.s0 s0Var = this.f136211f;
            hVar.f(s0Var, false);
            finderSpeedControlUIC.b(s0Var);
        } else {
            finderSpeedControlUIC.f133648s.h(f17);
        }
        return jz5.f0.f302826a;
    }
}
