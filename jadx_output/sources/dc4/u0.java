package dc4;

/* loaded from: classes4.dex */
public class u0 implements jb4.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dc4.v0 f228830a;

    public u0(dc4.v0 v0Var) {
        this.f228830a = v0Var;
    }

    @Override // jb4.c0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouchBegin", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchBegin", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3");
    }

    @Override // jb4.c0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAngleChange", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAngleChange", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3");
    }

    @Override // jb4.c0
    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(if1.q.NAME, "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$208", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        this.f228830a.E++;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$208", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(if1.q.NAME, "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3");
    }

    @Override // jb4.c0
    public void d(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUpdateImage", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3");
        dc4.v0 v0Var = this.f228830a;
        if (dc4.v0.l(v0Var).getVisibility() == 0) {
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(350L);
            alphaAnimation.setAnimationListener(new dc4.s0(this));
            com.tencent.mars.xlog.Log.i("MicroMsg.SphereImageView.SphereCardAdDetailItem", "do maskImage anim");
            dc4.v0.l(v0Var).startAnimation(alphaAnimation);
        }
        if (dc4.v0.n(v0Var) == null || jb4.v.c(dc4.v0.n(v0Var).f166095g, "scene_timeline")) {
            v0Var.f228848x.setSensorEnabled(true);
            v0Var.f228848x.setTouchEnabled(true);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SphereImageView.SphereCardAdDetailItem", "disable touch before shot");
            v0Var.f228848x.setTouchEnabled(false);
            v0Var.f228848x.k();
            v0Var.f228848x.d();
            com.tencent.mm.sdk.platformtools.u3.i(new dc4.t0(this, str), 800L);
        }
        if (dc4.v0.m(v0Var).getVisibility() == 0) {
            dc4.v0.m(v0Var).setVisibility(8);
            com.tencent.mars.xlog.Log.i("MicroMsg.SphereImageView.SphereCardAdDetailItem", "hide progressView");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUpdateImage", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3");
    }

    @Override // jb4.c0
    public void onDetachedFromWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetachedFromWindow, hash=");
        dc4.v0 v0Var = this.f228830a;
        sb6.append(v0Var.f228848x.hashCode());
        com.tencent.mars.xlog.Log.i("MicroMsg.SphereImageView.SphereCardAdDetailItem", sb6.toString());
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
            int i17 = v0Var.E;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
            jSONObject.put("panCount", i17);
            jSONObject.put("type", 1);
            java.lang.String encode = java.net.URLEncoder.encode(jSONObject.toString(), com.tencent.mapsdk.internal.rv.f51270c);
            java.lang.String aid = v0Var.f228832e.getAid();
            if (aid == null) {
                aid = "";
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17539, v0Var.f228832e.getTimeLine().Id, aid, v0Var.f228832e.getAdInfo().uxInfo, 2, encode);
            com.tencent.mars.xlog.Log.i("MicroMsg.SphereImageView.SphereCardAdDetailItem", "KVReport, id=17539, touchCount=" + encode);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SphereImageView.SphereCardAdDetailItem", "kvStat exp:" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        v0Var.E = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        v0Var.D = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3");
    }
}
