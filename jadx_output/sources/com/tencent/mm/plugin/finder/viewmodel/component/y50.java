package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class y50 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC f136530d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y50(com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC finderSpeedControlUIC) {
        super(1);
        this.f136530d = finderSpeedControlUIC;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC finderSpeedControlUIC = this.f136530d;
        finderSpeedControlUIC.getClass();
        com.tencent.mars.xlog.Log.i("FinderSpeedControlUIC", "Speed indicator clicked: " + floatValue);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        in5.s0 V6 = finderSpeedControlUIC.V6();
        if (V6 != null) {
            android.view.View p17 = V6.p(com.tencent.mm.R.id.f484486ee3);
            if (p17 != null) {
                arrayList.add(p17);
            }
            com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) V6.p(com.tencent.mm.R.id.e_k);
            cw2.da videoView = finderVideoLayout != null ? finderVideoLayout.getVideoView() : null;
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = videoView instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) videoView : null;
            if (finderThumbPlayerProxy != null) {
                android.app.Activity context = finderSpeedControlUIC.getContext();
                kotlin.jvm.internal.o.g(context, "context");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.class);
                kotlin.jvm.internal.o.f(a17, "get(...)");
                com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.a7((com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC) a17, V6, arrayList, finderThumbPlayerProxy, null, null, null, 56, null);
            }
            hc2.f1.x(V6.itemView);
        }
        return jz5.f0.f302826a;
    }
}
