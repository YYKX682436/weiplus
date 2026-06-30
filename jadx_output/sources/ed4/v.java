package ed4;

/* loaded from: classes4.dex */
public class v implements jb4.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.item.q0 f251328a;

    public v(com.tencent.mm.plugin.sns.ui.item.q0 q0Var) {
        this.f251328a = q0Var;
    }

    @Override // jb4.c0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouchBegin", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchBegin", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3");
    }

    @Override // jb4.c0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAngleChange", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAngleChange", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3");
    }

    @Override // jb4.c0
    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(if1.q.NAME, "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$008", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem");
        this.f251328a.f169413x++;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$008", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(if1.q.NAME, "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3");
    }

    @Override // jb4.c0
    public void d(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUpdateImage", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3");
        com.tencent.mm.plugin.sns.ui.item.q0 q0Var = this.f251328a;
        com.tencent.mm.plugin.sns.storage.p pVar = q0Var.f169407r;
        java.lang.String str2 = pVar != null ? pVar.f166095g : "";
        if (str != null && !str.equals(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "onUpdateImage, url != CardInfo.sphereImageUrl, url=" + str + ", info.url=" + str2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUpdateImage", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3");
            return;
        }
        com.tencent.mm.plugin.sns.ui.item.p0 p0Var = q0Var.f169408s;
        if (p0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "onUpdateImage, viewHolder==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUpdateImage", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "onUpdateImage, isFirstUpdateImage=" + q0Var.f169409t + ", visiable=" + p0Var.M0.getVisibility());
        if (q0Var.f169409t) {
            if (p0Var.M0.getVisibility() == 0) {
                android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(350L);
                alphaAnimation.setAnimationListener(new ed4.t(this, p0Var));
                com.tencent.mars.xlog.Log.i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "do maskImage anim");
                p0Var.M0.startAnimation(alphaAnimation);
            }
            com.tencent.mm.plugin.sns.storage.p pVar2 = q0Var.f169407r;
            if (pVar2 == null || jb4.v.c(pVar2.f166095g, "scene_timeline")) {
                q0Var.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "don't need shot, enable sensor, isInLowPriority=false");
                q0Var.getClass();
                p0Var.G0.setSensorEnabled(true);
                q0Var.f169409t = false;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "disable touch before shot");
                p0Var.G0.setTouchEnabled(false);
                p0Var.G0.k();
                p0Var.G0.d();
                q0Var.f169412w.postDelayed(new ed4.u(this, str, p0Var), 800L);
            }
        }
        if (p0Var.N0.getVisibility() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "hide progressView");
            p0Var.N0.setVisibility(8);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUpdateImage", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3");
    }

    @Override // jb4.c0
    public void onDetachedFromWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3");
        com.tencent.mars.xlog.Log.i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "onDetachedFromWindow reset");
        com.tencent.mm.plugin.sns.ui.item.q0 q0Var = this.f251328a;
        q0Var.f169409t = true;
        q0Var.f169410u = true;
        q0Var.f169411v = null;
        q0Var.f169412w.removeCallbacksAndMessages(null);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem");
            int i17 = q0Var.f169413x;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem");
            jSONObject.put("panCount", i17);
            jSONObject.put("type", 1);
            java.lang.String encode = java.net.URLEncoder.encode(jSONObject.toString(), com.tencent.mapsdk.internal.rv.f51270c);
            com.tencent.mm.plugin.sns.storage.SnsInfo c17 = q0Var.f169251h.c(q0Var.f169408s.f169262c);
            java.lang.String aid = c17.getAid();
            if (aid == null) {
                aid = "";
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17539, c17.getTimeLine().Id, aid, c17.getAdInfo().uxInfo, 1, encode);
            com.tencent.mars.xlog.Log.i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "KVReport, id=17539, touchCount=" + encode + ", snsInfo.hash=" + c17.hashCode());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "kvStat exp:" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem");
        q0Var.f169413x = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3");
    }
}
