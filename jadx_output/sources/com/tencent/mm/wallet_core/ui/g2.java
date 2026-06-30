package com.tencent.mm.wallet_core.ui;

/* loaded from: classes8.dex */
public final class g2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.WcPayBannerView f214185d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.tw4 f214186e;

    public g2(com.tencent.mm.wallet_core.ui.WcPayBannerView wcPayBannerView, r45.tw4 tw4Var) {
        this.f214185d = wcPayBannerView;
        this.f214186e = tw4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wallet_core/ui/WcPayBannerView$setBannerData$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f214185d.getContext();
        r45.tw4 tw4Var = this.f214186e;
        com.tencent.mm.wallet_core.ui.r1.V(context, tw4Var.f386834g, true);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24273, tw4Var.f386835h, 2);
        yj0.a.h(this, "com/tencent/mm/wallet_core/ui/WcPayBannerView$setBannerData$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
