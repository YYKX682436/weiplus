package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class k extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a {

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageView f165296s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ImageView f165297t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f165298u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.LinearLayout f165299v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.LinearLayout f165300w;

    /* renamed from: x, reason: collision with root package name */
    public int f165301x;

    public k(android.content.Context context, ab4.e eVar, android.view.ViewGroup viewGroup) {
        super(context, eVar, viewGroup);
    }

    public static /* synthetic */ ab4.e P(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k kVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingContactComp");
        ab4.e R = kVar.R();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingContactComp");
        return R;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public boolean D(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingContactComp");
        if (!super.D(jSONObject)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingContactComp");
            return false;
        }
        try {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingContactComp");
            int i17 = this.f165301x;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingContactComp");
            jSONObject.put("clickCount", i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingContactComp");
            return true;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("AdLandingBorderedComp", e17, "", new java.lang.Object[0]);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingContactComp");
            return false;
        }
    }

    public final ab4.e R() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingContactComp");
        ab4.e eVar = (ab4.e) this.f165050e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingContactComp");
        return eVar;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingContactComp");
        if (R().I.isEmpty()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingContactComp");
            return;
        }
        android.view.View view = this.f165056n;
        this.f165296s = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.i0a);
        this.f165297t = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.m38);
        this.f165298u = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f484050cu2);
        this.f165300w = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.cg7);
        this.f165299v = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.hd_);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingContactComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingContactComp");
        this.f165298u.setText((java.lang.CharSequence) R().I.get(0));
        boolean z17 = R().f2825o;
        android.content.Context context = this.f165049d;
        if (z17) {
            this.f165296s.setImageDrawable(i65.a.i(context, com.tencent.mm.R.drawable.f482166bt1));
            this.f165297t.setImageDrawable(i65.a.i(context, com.tencent.mm.R.drawable.bre));
            this.f165298u.setTextColor(-16777216);
            this.f165299v.setBackgroundResource(com.tencent.mm.R.drawable.f480751bs);
        } else {
            this.f165296s.setImageDrawable(i65.a.i(context, com.tencent.mm.R.drawable.f482165bt0));
            this.f165297t.setImageDrawable(i65.a.i(context, com.tencent.mm.R.drawable.brd));
            this.f165298u.setTextColor(-1);
            this.f165299v.setBackgroundResource(com.tencent.mm.R.drawable.f480752bt);
        }
        this.f165299v.setPadding((int) R().f2821h, 0, (int) R().f2822i, 0);
        this.f165300w.setPadding(0, (int) R().f2819f, 0, (int) R().f2820g);
        O(this.f165299v);
        this.f165299v.setOnClickListener(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingContactComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public int v() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingContactComp");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingContactComp");
        return com.tencent.mm.R.layout.cpp;
    }
}
