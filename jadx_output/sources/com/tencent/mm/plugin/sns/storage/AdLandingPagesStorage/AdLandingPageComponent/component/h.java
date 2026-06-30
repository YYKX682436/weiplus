package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class h extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 {

    /* renamed from: s, reason: collision with root package name */
    public final int f165222s;

    /* renamed from: t, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f165223t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.Map f165224u;

    /* renamed from: v, reason: collision with root package name */
    public androidx.recyclerview.widget.LinearLayoutManager f165225v;

    /* renamed from: w, reason: collision with root package name */
    public java.util.Set f165226w;

    public h(android.content.Context context, ab4.v vVar, android.view.ViewGroup viewGroup) {
        super(context, vVar, viewGroup);
        this.f165222s = i65.a.b(context, 12);
        this.f165224u = new java.util.HashMap();
        this.f165226w = new java.util.HashSet();
    }

    public static void O(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h hVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        hVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateChildrenExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyChildrenAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = hVar.f165225v;
        if (linearLayoutManager != null) {
            hVar.R(linearLayoutManager.w(), hVar.f165225v.y());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyChildrenAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        int w17 = hVar.f165225v.w();
        int y17 = hVar.f165225v.y();
        for (java.util.Map.Entry entry : ((java.util.HashMap) hVar.f165224u).entrySet()) {
            if (((java.lang.Integer) entry.getKey()).intValue() < w17 || ((java.lang.Integer) entry.getKey()).intValue() > y17) {
                ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.c) entry.getValue()).a();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateChildrenExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public boolean C(org.json.JSONArray jSONArray) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        if (jSONArray == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
            return false;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (D(jSONObject)) {
            jSONArray.put(jSONObject);
        }
        try {
            java.util.Map map = this.f165224u;
            java.util.Set set = this.f165226w;
            this.f165226w = new java.util.HashSet();
            this.f165224u = new java.util.HashMap();
            for (java.util.Map.Entry entry : map.entrySet()) {
                ab4.d0 d0Var = (ab4.d0) P().F.get(((java.lang.Integer) entry.getKey()).intValue());
                if (!d0Var.f2834x && (d0Var instanceof ab4.x)) {
                    ab4.x xVar = (ab4.x) d0Var;
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("cid", ((ab4.d0) P().F.get(((java.lang.Integer) entry.getKey()).intValue())).f2817d);
                    jSONObject2.put(dm.n.COL_EXPOSURECOUNT, ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.c) entry.getValue()).f165106a);
                    jSONObject2.put("stayTime", ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.c) entry.getValue()).f165107b);
                    if (set.contains(entry.getKey())) {
                        java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(xVar.imgeUrl);
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        jSONObject3.put("urlMd5", a17);
                        jSONObject3.put("needDownload", 1);
                        jSONObject2.put("imgUrlInfo", jSONObject3);
                    }
                    jSONArray.put(jSONObject2);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
            return true;
        } catch (org.json.JSONException e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("AdLandingCarouselComp", com.tencent.mm.sdk.platformtools.z3.c(e17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
            return false;
        }
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void K() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        super.K();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyChildrenAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = this.f165225v;
        if (linearLayoutManager != null) {
            R(linearLayoutManager.w(), this.f165225v.y());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyChildrenAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void M() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        super.M();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyChildrenDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = this.f165225v;
        if (linearLayoutManager != null) {
            int y17 = this.f165225v.y();
            for (int w17 = linearLayoutManager.w(); w17 <= y17; w17++) {
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.c cVar = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.c) ((java.util.HashMap) this.f165224u).get(java.lang.Integer.valueOf(w17));
                if (cVar != null) {
                    cVar.a();
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyChildrenDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
    }

    public final ab4.v P() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        ab4.v vVar = (ab4.v) this.f165050e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        return vVar;
    }

    public final void R(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startItmesExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        while (i17 <= i18) {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.c cVar = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.c) this.f165224u.get(java.lang.Integer.valueOf(i17));
            if (cVar == null) {
                cVar = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.c(this, null);
                this.f165224u.put(java.lang.Integer.valueOf(i17), cVar);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("beginExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$ExposureInfo");
            if (cVar.f165109d) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beginExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$ExposureInfo");
            } else {
                cVar.f165109d = true;
                cVar.f165108c = java.lang.System.currentTimeMillis();
                cVar.f165106a++;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beginExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$ExposureInfo");
            }
            i17++;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startItmesExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) this.f165056n.findViewById(com.tencent.mm.R.id.lq8);
        this.f165223t = recyclerView;
        recyclerView.setBackgroundColor(P().G);
        java.util.Iterator it = P().F.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            ab4.d0 d0Var = (ab4.d0) it.next();
            if (d0Var instanceof ab4.x) {
                int i18 = ((int) (d0Var.f2820g + d0Var.f2819f + ((ab4.x) d0Var).f2830t)) + (this.f165222s << 1);
                if (i17 <= i18) {
                    i17 = i18;
                }
            }
        }
        android.view.ViewGroup.LayoutParams layoutParams = this.f165223t.getLayoutParams();
        layoutParams.height = i17;
        this.f165223t.setLayoutParams(layoutParams);
        this.f165223t.setAdapter(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e(this, null));
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(this.f165049d);
        this.f165225v = linearLayoutManager;
        linearLayoutManager.Q(0);
        this.f165223t.setLayoutManager(this.f165225v);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f165223t;
        recyclerView2.i(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.g(this, recyclerView2, this.f165225v));
        this.f165223t.setNestedScrollingEnabled(false);
        this.f165223t.setHasFixedSize(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public int v() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp");
        return com.tencent.mm.R.layout.cpf;
    }
}
