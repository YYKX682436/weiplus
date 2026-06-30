package com.tencent.mm.plugin.sns.ad.widget.living;

/* loaded from: classes4.dex */
public abstract class z extends com.tencent.mm.plugin.sns.ui.widget.l implements com.tencent.mm.plugin.sns.ad.widget.living.h0 {

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f163775o;

    /* renamed from: p, reason: collision with root package name */
    public final int f163776p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f163777q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f163778r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f163779s;

    public z(java.lang.String str, androidx.lifecycle.y yVar, android.view.View view, int i17, i64.b1 b1Var) {
        super(str, yVar, view);
        this.f163775o = view;
        this.f163776p = i17;
        this.f163777q = jz5.h.b(new com.tencent.mm.plugin.sns.ad.widget.living.w(this));
        this.f163778r = jz5.h.b(new com.tencent.mm.plugin.sns.ad.widget.living.x(this));
        this.f163779s = jz5.h.b(new com.tencent.mm.plugin.sns.ad.widget.living.y(this));
    }

    public final void A(int i17) {
        android.graphics.drawable.Drawable e17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetUIByLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        android.view.View view = this.f163775o;
        android.content.Context context = view != null ? view.getContext() : null;
        if (context == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetUIByLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
            return;
        }
        android.widget.LinearLayout y17 = y();
        if (y17 != null) {
            y17.setVisibility(0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMLivingIcon", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        jz5.g gVar = this.f163778r;
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) gVar).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMLivingIcon", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        a84.v0.a(context, imageView, 14, 14);
        android.widget.LinearLayout y18 = y();
        if (y18 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBackgroundResIdByStatus", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
            int i18 = z(i17) ? com.tencent.mm.R.drawable.d8w : com.tencent.mm.R.drawable.d8x;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBackgroundResIdByStatus", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
            y18.setBackgroundResource(i18);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMLivingIcon", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        android.widget.ImageView imageView2 = (android.widget.ImageView) ((jz5.n) gVar).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMLivingIcon", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        if (imageView2 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLivingIconDrawableByStatus", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
            if (z(i17)) {
                e17 = com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.sns_ad_finder_live_logo, context.getColor(com.tencent.mm.R.color.OrangeRed_100));
                kotlin.jvm.internal.o.d(e17);
            } else {
                e17 = com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.sns_ad_finder_live_logo, context.getColor(com.tencent.mm.R.color.amo));
                kotlin.jvm.internal.o.d(e17);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLivingIconDrawableByStatus", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
            imageView2.setImageDrawable(e17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLivingTextByStatus", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMLivingText", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView = (com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView) ((jz5.n) this.f163779s).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMLivingText", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        if (improveTextView != null) {
            if (z(i17)) {
                improveTextView.setText(improveTextView.getContext().getString(com.tencent.mm.R.string.j7q));
                improveTextView.setTextColor(improveTextView.getContext().getColor(com.tencent.mm.R.color.OrangeRed_100));
            } else {
                improveTextView.setText(improveTextView.getContext().getString(com.tencent.mm.R.string.f493178oj2));
                improveTextView.setTextColor(improveTextView.getContext().getColor(com.tencent.mm.R.color.FG_1));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLivingTextByStatus", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetUIByLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
    }

    @Override // com.tencent.mm.plugin.sns.ad.widget.living.h0
    public void a(java.lang.String str, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLiveStatusChanged", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        com.tencent.mars.xlog.Log.i(j(), "status changed, status is " + i18);
        if (ca4.z0.T((com.tencent.mm.plugin.sns.storage.SnsInfo) i()).equals(str) && i17 != i18 && n(i())) {
            A(i18);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLiveStatusChanged", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void d(java.lang.Object obj, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        com.tencent.mm.plugin.sns.storage.SnsInfo model = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        kotlin.jvm.internal.o.g(model, "model");
        java.lang.String T = ca4.z0.T(model);
        int c17 = com.tencent.mm.plugin.sns.ad.widget.living.i0.c(T, 2);
        com.tencent.mars.xlog.Log.i(j(), "optLivingStatus, snsId is " + T + ", status is " + c17);
        com.tencent.mm.plugin.sns.ad.widget.living.i0.a(T, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestFinderLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        android.widget.LinearLayout y17 = y();
        if ((y17 != null ? y17.getContext() : null) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestFinderLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        } else {
            if (!com.tencent.mm.plugin.sns.ad.widget.living.v.f163766e.a(model)) {
                e74.i.f().d(this.f163776p, model);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestFinderLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        }
        A(c17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void v(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        super.v((com.tencent.mm.plugin.sns.storage.SnsInfo) obj);
        android.widget.LinearLayout y17 = y();
        if (y17 != null) {
            y17.setVisibility(8);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
    }

    public final android.widget.LinearLayout y() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMLivingContainer", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ((jz5.n) this.f163777q).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMLivingContainer", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        return linearLayout;
    }

    public final boolean z(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isLiving", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        boolean z17 = i17 == 2 || i17 == 770;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLiving", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        return z17;
    }
}
