package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class d60 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC f134082d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f134083e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy f134084f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d60(com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC finderSpeedControlUIC, in5.s0 s0Var, com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy) {
        super(1);
        this.f134082d = finderSpeedControlUIC;
        this.f134083e = s0Var;
        this.f134084f = finderThumbPlayerProxy;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("triggerSpeedPlay change speed from ");
        com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC finderSpeedControlUIC = this.f134082d;
        sb6.append(finderSpeedControlUIC.f133651v);
        sb6.append(" to ");
        sb6.append(floatValue);
        com.tencent.mars.xlog.Log.i("FinderSpeedControlUIC", sb6.toString());
        finderSpeedControlUIC.f133651v = floatValue;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("long_press_accelerate_switch", null, com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.P6(finderSpeedControlUIC, this.f134083e, finderSpeedControlUIC.f133651v, false, false, true, 8, null), 1, false);
        in5.s0 V6 = finderSpeedControlUIC.V6();
        android.widget.TextView textView = V6 != null ? (android.widget.TextView) V6.p(com.tencent.mm.R.id.f484865tr1) : null;
        if (textView != null) {
            textView.setText(finderSpeedControlUIC.getContext().getString(finderSpeedControlUIC.U6() ? com.tencent.mm.R.string.p5j : com.tencent.mm.R.string.f492084o20, finderSpeedControlUIC.b7(finderSpeedControlUIC.f133651v)));
        }
        float f17 = finderSpeedControlUIC.f133651v;
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f134084f;
        finderThumbPlayerProxy.setPlaySpeed(f17);
        hc2.f1.x(finderThumbPlayerProxy);
        finderSpeedControlUIC.f133648s.i(finderSpeedControlUIC.f133651v);
        finderSpeedControlUIC.f133646q = java.lang.System.currentTimeMillis();
        finderSpeedControlUIC.f133647r = finderThumbPlayerProxy.getCurrentPlayMs();
        return jz5.f0.f302826a;
    }
}
