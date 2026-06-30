package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class c60 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC f133969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f133970e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c60(com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC finderSpeedControlUIC, in5.s0 s0Var) {
        super(1);
        this.f133969d = finderSpeedControlUIC;
        this.f133970e = s0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        long j17;
        com.tencent.mm.plugin.finder.view.image.FinderImageBanner imageBanner;
        float floatValue = ((java.lang.Number) obj).floatValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("triggerSpeedPlay change speed from ");
        com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC finderSpeedControlUIC = this.f133969d;
        sb6.append(finderSpeedControlUIC.f133651v);
        sb6.append(" to ");
        sb6.append(floatValue);
        com.tencent.mars.xlog.Log.i("FinderSpeedControlUIC", sb6.toString());
        finderSpeedControlUIC.f133651v = floatValue;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("long_press_accelerate_switch", null, com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.P6(finderSpeedControlUIC, this.f133970e, finderSpeedControlUIC.f133651v, false, false, true, 8, null), 1, false);
        in5.s0 s0Var = this.f133970e;
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.f484865tr1);
        if (textView != null) {
            textView.setText(finderSpeedControlUIC.getContext().getString(finderSpeedControlUIC.U6() ? com.tencent.mm.R.string.p5j : com.tencent.mm.R.string.f492084o20, finderSpeedControlUIC.b7(finderSpeedControlUIC.f133651v)));
        }
        com.tencent.mm.plugin.finder.view.FinderMediaLayout finderMediaLayout = (com.tencent.mm.plugin.finder.view.FinderMediaLayout) s0Var.p(com.tencent.mm.R.id.fs6);
        if (finderMediaLayout != null && (imageBanner = finderMediaLayout.getImageBanner()) != null) {
            imageBanner.setLoopSpeed(finderSpeedControlUIC.f133651v);
            hc2.f1.x(imageBanner);
        }
        finderSpeedControlUIC.f133648s.i(finderSpeedControlUIC.f133651v);
        finderSpeedControlUIC.f133646q = java.lang.System.currentTimeMillis();
        so2.j5 j5Var = (so2.j5) s0Var.f293125i;
        java.lang.Integer valueOf = j5Var != null ? java.lang.Integer.valueOf(j5Var.h()) : null;
        if (valueOf != null && valueOf.intValue() == 4) {
            com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k);
            zy2.g5 videoView = finderVideoLayout != null ? finderVideoLayout.getVideoView() : null;
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = videoView instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) videoView : null;
            if (finderThumbPlayerProxy != null) {
                j17 = finderThumbPlayerProxy.getCurrentPlayMs();
                finderSpeedControlUIC.f133647r = j17;
                return jz5.f0.f302826a;
            }
        }
        j17 = 0;
        finderSpeedControlUIC.f133647r = j17;
        return jz5.f0.f302826a;
    }
}
