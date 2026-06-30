package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class w50 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC f136302d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f136303e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy f136304f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f136305g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ow2.h f136306h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w50(com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC finderSpeedControlUIC, in5.s0 s0Var, com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy, yz5.a aVar, ow2.h hVar) {
        super(1);
        this.f136302d = finderSpeedControlUIC;
        this.f136303e = s0Var;
        this.f136304f = finderThumbPlayerProxy;
        this.f136305g = aVar;
        this.f136306h = hVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int i17;
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        r45.bn2 dramaInfo;
        r45.qj2 qj2Var;
        float floatValue = ((java.lang.Number) obj).floatValue();
        in5.s0 s0Var = this.f136303e;
        com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC finderSpeedControlUIC = this.f136302d;
        finderSpeedControlUIC.getClass();
        com.tencent.mars.xlog.Log.i("FinderSpeedControlUIC", "handleSpeedSelected ratio: " + floatValue);
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f136304f;
        cw2.wa f130607n = finderThumbPlayerProxy.getF130607n();
        if (f130607n != null && (feedData = f130607n.f224099f) != null && (dramaInfo = feedData.getDramaInfo()) != null && (qj2Var = (r45.qj2) dramaInfo.getCustom(0)) != null) {
            ey2.v2 v2Var = (ey2.v2) pf5.u.f353936a.e(c61.l7.class).a(ey2.v2.class);
            java.lang.Long valueOf = java.lang.Long.valueOf(qj2Var.getLong(0));
            android.app.Activity context = finderSpeedControlUIC.getContext();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            v2Var.V6(valueOf, nyVar != null ? java.lang.Integer.valueOf(nyVar.V6().getInteger(5)) : null, floatValue);
        }
        finderThumbPlayerProxy.setPlaySpeed(floatValue);
        com.tencent.mm.plugin.finder.viewmodel.component.k60 k60Var = ((com.tencent.mm.plugin.finder.viewmodel.component.x60) ((jz5.n) finderSpeedControlUIC.f133636d).getValue()).f136407d;
        k60Var.getClass();
        boolean z17 = k60Var == com.tencent.mm.plugin.finder.viewmodel.component.k60.f134925e;
        ow2.h hVar = this.f136306h;
        if (hVar != null) {
            hVar.g(floatValue, 2000L, new com.tencent.mm.plugin.finder.viewmodel.component.u50(floatValue, hVar, s0Var, z17, finderSpeedControlUIC), com.tencent.mm.plugin.finder.view.yk.f133399e, s0Var, z17);
        }
        java.lang.String videoMediaId = finderThumbPlayerProxy.getVideoMediaId();
        jz5.g gVar = tn2.d.f420822x;
        jz5.g gVar2 = tn2.d.f420822x;
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy videoView = ((tn2.d) gVar2.getValue()).k0().getVideoView();
        if (kotlin.jvm.internal.o.b(videoMediaId, videoView != null ? videoView.getVideoMediaId() : null)) {
            tn2.d dVar = (tn2.d) gVar2.getValue();
            if (dVar.u()) {
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy videoView2 = dVar.k0().getVideoView();
                if (videoView2 != null) {
                    videoView2.setPlaySpeed(floatValue);
                }
            } else {
                com.tencent.mars.xlog.Log.i("BaseFinderMiniViewHelper", "setPlaySpeed, do not have ball");
            }
        }
        yz5.a aVar = this.f136305g;
        if (aVar != null) {
            aVar.invoke();
        }
        if (floatValue == 0.5f) {
            i17 = com.tencent.mm.R.raw.icons_outlined_channels_play_quickly_0_5;
        } else {
            if (!(floatValue == 1.0f)) {
                if (floatValue == 1.5f) {
                    i17 = com.tencent.mm.R.raw.icons_outlined_channels_play_quickly_1_5;
                } else {
                    if (floatValue == 2.0f) {
                        i17 = com.tencent.mm.R.raw.icons_outlined_channels_play_quickly_2;
                    }
                }
            }
            i17 = com.tencent.mm.R.raw.icons_outlined_channels_play_quickly_1;
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) finderSpeedControlUIC.getActivity().findViewById(com.tencent.mm.R.id.iqj);
        if (weImageView != null) {
            weImageView.setImageResource(i17);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) finderSpeedControlUIC.getActivity().findViewById(com.tencent.mm.R.id.f486331kx3);
        if (weImageView2 != null) {
            weImageView2.setImageResource(i17);
        }
        finderSpeedControlUIC.Y6(floatValue);
        return jz5.f0.f302826a;
    }
}
