package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class n2 extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 {

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageView f165368s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f165369t;

    /* renamed from: u, reason: collision with root package name */
    public android.animation.AnimatorSet f165370u;

    /* renamed from: v, reason: collision with root package name */
    public int f165371v;

    /* renamed from: w, reason: collision with root package name */
    public final int f165372w;

    public n2(android.content.Context context, ab4.t tVar, android.view.ViewGroup viewGroup) {
        super(context, tVar, viewGroup);
        this.f165371v = 0;
        tVar.f2824n = 2.1474836E9f;
        this.f165372w = i65.a.b(context, 130);
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public boolean D(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
        if (!super.D(jSONObject)) {
            com.tencent.mars.xlog.Log.e("AdLandingPageBottomSwipeComponet", "setComponentKVReportData super failed");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
            return false;
        }
        try {
            jSONObject.put("jumpCount", this.f165371v);
            com.tencent.mars.xlog.Log.i("AdLandingPageBottomSwipeComponet", "setComponentKVReportData json=" + jSONObject.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("AdLandingPageBottomSwipeComponet", "setComponentKVReportData exp=" + e17.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
            return false;
        }
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void G() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
        android.view.ViewGroup.LayoutParams layoutParams = this.f165056n.getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins((int) P().f2821h, (int) P().f2819f, (int) P().f2822i, (int) P().f2820g);
            this.f165056n.setLayoutParams(marginLayoutParams);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void L() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
        super.L();
        this.f165370u.removeAllListeners();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
    }

    public void O() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doJump", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
        this.f165371v++;
        android.content.Context context = this.f165049d;
        if (context instanceof com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI) {
            try {
                int i17 = P().H;
                com.tencent.mars.xlog.Log.i("AdLandingPageBottomSwipeComponet", "doJump, swipCount=" + this.f165371v + ", actionType=" + i17);
                if (i17 == 0) {
                    com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = (com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI) context;
                    long n17 = com.tencent.mm.plugin.sns.storage.w2.n(snsAdNativeLandingPagesUI.getIntent().getStringExtra("sns_landing_pages_share_sns_id"));
                    a84.a0.a(this.f165049d, P().F, u(), snsAdNativeLandingPagesUI.getIntent().getIntExtra("sns_landig_pages_from_source", 0), n17, P().f2817d);
                    snsAdNativeLandingPagesUI.overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("AdLandingPageBottomSwipeComponet", "doJump exp=" + th6.toString());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doJump", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
    }

    public final ab4.t P() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
        ab4.t tVar = (ab4.t) this.f165050e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
        return tVar;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
        this.f165368s = (android.widget.ImageView) this.f165056n.findViewById(com.tencent.mm.R.id.nst);
        this.f165369t = (android.widget.TextView) this.f165056n.findViewById(com.tencent.mm.R.id.nsu);
        android.widget.ImageView imageView = this.f165368s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initAnimator", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(imageView, "translationY", 0.0f, -i65.a.b(this.f165049d, 12));
        ofFloat.setDuration(1000L);
        ofFloat.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(imageView, "alpha", 0.0f, 0.8f);
        ofFloat2.setDuration(1000L);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(imageView, "alpha", 0.8f, 0.0f);
        ofFloat3.setDuration(500L);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.f165370u = animatorSet;
        animatorSet.play(ofFloat).with(ofFloat2);
        this.f165370u.play(ofFloat3).after(ofFloat);
        this.f165370u.addListener(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m2(this));
        this.f165370u.start();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initAnimator", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
        if (P().f2825o) {
            this.f165369t.setTextColor(android.graphics.Color.parseColor("#CC000000"));
            this.f165368s.setImageResource(com.tencent.mm.R.drawable.bus);
        } else {
            this.f165369t.setTextColor(android.graphics.Color.parseColor("#CCFFFFFF"));
            this.f165368s.setImageResource(com.tencent.mm.R.drawable.but);
        }
        this.f165056n.findViewById(com.tencent.mm.R.id.f483752by4).setOnClickListener(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.l2(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
        if (this.f165369t == null || this.f165368s == null || P() == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
            return;
        }
        if (!android.text.TextUtils.isEmpty(P().G)) {
            this.f165369t.setText(P().G);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public int v() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
        return com.tencent.mm.R.layout.cpb;
    }
}
