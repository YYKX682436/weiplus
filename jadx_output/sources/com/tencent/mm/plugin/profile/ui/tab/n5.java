package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes8.dex */
public final class n5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f154490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f154491e;

    public n5(java.lang.ref.WeakReference weakReference, boolean z17) {
        this.f154490d = weakReference;
        this.f154491e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String d17;
        com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo contactWidgetTabBizInfo = (com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo) this.f154490d.get();
        if (contactWidgetTabBizInfo == null) {
            return;
        }
        com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI = contactWidgetTabBizInfo.f154198d;
        if (contactInfoUI.isFinishing() || contactInfoUI.isDestroyed()) {
            return;
        }
        com.tencent.mm.storage.z3 z3Var = contactWidgetTabBizInfo.f154206n;
        boolean z17 = this.f154491e;
        if (z3Var != null && (d17 = z3Var.d1()) != null) {
            gr3.e.d(d17, z17 ? 2803 : 2801, contactWidgetTabBizInfo.f154201g, contactInfoUI.getIntent(), contactWidgetTabBizInfo.Z, contactWidgetTabBizInfo.f154208p, 0, null, null, null, 0, 0, 4032, null);
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetTabBizInfo", "[PhotoAccountGuide] switchToPhoto");
            contactWidgetTabBizInfo.K = false;
            contactWidgetTabBizInfo.L = false;
            com.tencent.wechat.iam.biz.g.f217742b.e(7, new com.tencent.mm.plugin.profile.ui.tab.w6(new java.lang.ref.WeakReference(db5.e1.Q(contactWidgetTabBizInfo.f154198d, null, null, true, false, null)), new java.lang.ref.WeakReference(contactWidgetTabBizInfo)));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetTabBizInfo", "[PhotoAccountGuide] openRegisterPage");
        contactWidgetTabBizInfo.K = true;
        contactWidgetTabBizInfo.L = false;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("from", "profile_follow_guide");
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1422);
        jSONObject2.put("nativeExtraData", jSONObject.toString());
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        tk.t tVar = tk.u.f419871e;
        jSONObject3.put("mpPublishAction", 4);
        jSONObject3.put("publishScene", "photoAccountGuideCardByProfile");
        tk.s[] sVarArr = tk.s.f419870d;
        jSONObject3.put("bizType", 2);
        jSONObject3.put("weAppParam", jSONObject2);
        ((ox.o) ((tk.q) i95.n0.c(tk.q.class))).Ai(contactInfoUI, jSONObject3, new com.tencent.mm.plugin.profile.ui.tab.s5(new java.lang.ref.WeakReference(contactWidgetTabBizInfo)));
    }
}
