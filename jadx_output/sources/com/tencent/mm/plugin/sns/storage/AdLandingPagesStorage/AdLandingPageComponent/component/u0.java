package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class u0 extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a {

    /* renamed from: s, reason: collision with root package name */
    public final ab4.m f165518s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f165519t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.ImageView f165520u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.ImageView f165521v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f165522w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.LinearLayout f165523x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.LinearLayout f165524y;

    /* renamed from: z, reason: collision with root package name */
    public int f165525z;

    public u0(android.content.Context context, ab4.m mVar, android.view.ViewGroup viewGroup) {
        super(context, mVar, viewGroup);
        this.f165518s = mVar;
    }

    public static /* synthetic */ ab4.m P(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
        ab4.m mVar = u0Var.f165518s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
        return mVar;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public boolean D(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
        if (!super.D(jSONObject)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
            return false;
        }
        try {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
            int i17 = this.f165525z;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
            jSONObject.put("clickCount", i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
            return true;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("AdLandingBorderedComp", e17, "", new java.lang.Object[0]);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
            return false;
        }
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
        android.view.View view = this.f165056n;
        this.f165520u = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.i0a);
        this.f165521v = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.m38);
        this.f165522w = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f484050cu2);
        this.f165523x = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.hd_);
        this.f165524y = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.cg7);
        this.f165519t = this.f165523x;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
        android.widget.TextView textView = this.f165522w;
        ab4.m mVar = this.f165518s;
        textView.setText(mVar.I.f2854d);
        boolean z17 = mVar.f2825o;
        android.content.Context context = this.f165049d;
        if (z17) {
            this.f165520u.setImageDrawable(i65.a.i(context, com.tencent.mm.R.drawable.f481908br2));
            this.f165521v.setImageDrawable(i65.a.i(context, com.tencent.mm.R.drawable.bre));
            this.f165522w.setTextColor(-16777216);
            this.f165523x.setBackgroundResource(com.tencent.mm.R.drawable.f480751bs);
        } else {
            this.f165520u.setImageDrawable(i65.a.i(context, com.tencent.mm.R.drawable.f481907br1));
            this.f165521v.setImageDrawable(i65.a.i(context, com.tencent.mm.R.drawable.brd));
            this.f165522w.setTextColor(-1);
            this.f165523x.setBackgroundResource(com.tencent.mm.R.drawable.f480752bt);
        }
        this.f165523x.setPadding((int) mVar.f2821h, 0, (int) mVar.f2822i, 0);
        this.f165524y.setPadding(0, (int) mVar.f2819f, 0, (int) mVar.f2820g);
        O(this.f165523x);
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.t0 t0Var = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.t0(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnclickLsn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
        android.view.View view = this.f165519t;
        if (view != null) {
            view.setOnClickListener(t0Var);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnclickLsn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public int v() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
        return com.tencent.mm.R.layout.cpp;
    }
}
