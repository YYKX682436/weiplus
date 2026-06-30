package com.tencent.mm.plugin.sns.ad.widget.living;

/* loaded from: classes4.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f163681d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f163682e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f163683f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f163684g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f163685h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f163686i;

    /* renamed from: m, reason: collision with root package name */
    public int f163687m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f163688n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f163689o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f163690p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f163691q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f163692r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.modelsns.SnsAdClick f163693s;

    public b(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f163681d = context;
        this.f163682e = "AdFinderNoticeSuccessHalfScreenWidget";
    }

    public final void a() {
        com.tencent.mm.ui.widget.dialog.k0 k0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = this.f163683f;
        boolean z17 = false;
        if (k0Var2 != null && k0Var2.i()) {
            z17 = true;
        }
        if (z17 && (k0Var = this.f163683f) != null) {
            k0Var.u();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.storage.ADInfo adInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/living/AdFinderNoticeSuccessHalfScreenWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String str = null;
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        java.lang.String str2 = this.f163682e;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.bys) {
            a();
            com.tencent.mars.xlog.Log.i(str2, "click close btn");
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.kfg) {
            com.tencent.mars.xlog.Log.i(str2, "click notice more btn, jump to finder profile UI, snsId is " + this.f163688n + ", mSource is " + this.f163687m);
            a();
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = this.f163686i;
            int q17 = com.tencent.mm.sdk.platformtools.t8.q1(adClickActionInfo != null ? java.lang.Integer.valueOf(adClickActionInfo.f162569a) : null);
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo2 = this.f163686i;
            java.lang.String str3 = adClickActionInfo2 != null ? adClickActionInfo2.finderUsername : null;
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f163685h;
            if (snsInfo != null && (adInfo = snsInfo.getAdInfo(this.f163687m)) != null) {
                str = adInfo.uxInfo;
            }
            l44.s4.h(this.f163681d, str3, str, this.f163688n, l44.s4.c(q17));
            com.tencent.mm.modelsns.SnsAdClick snsAdClick = this.f163693s;
            if (snsAdClick == null) {
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/living/AdFinderNoticeSuccessHalfScreenWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
                return;
            }
            ca4.z0.x0(snsAdClick);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/living/AdFinderNoticeSuccessHalfScreenWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
    }
}
