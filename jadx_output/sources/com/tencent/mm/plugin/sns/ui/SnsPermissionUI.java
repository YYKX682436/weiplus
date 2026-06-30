package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class SnsPermissionUI extends com.tencent.mm.ui.base.preference.MMPreference implements com.tencent.mm.modelbase.u0 {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f167352r = 0;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f167355f;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f167353d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f167354e = "";

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f167356g = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f167357h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f167358i = false;

    /* renamed from: m, reason: collision with root package name */
    public long f167359m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f167360n = 0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f167361o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f167362p = false;

    /* renamed from: q, reason: collision with root package name */
    public int f167363q = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    public final int V6() {
        ?? r27;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkActionCode", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        com.tencent.mm.storage.z3 z3Var = this.f167356g;
        if (z3Var != null) {
            boolean x27 = z3Var.x2();
            r27 = x27;
            if (W6(this.f167354e, 5L)) {
                r27 = (x27 ? 1 : 0) | 2;
            }
        } else {
            r27 = 0;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkActionCode", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        return r27;
    }

    public final boolean W6(java.lang.String str, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isInTagList", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        com.tencent.mm.plugin.sns.storage.q2 D0 = com.tencent.mm.plugin.sns.model.l4.Lj().D0(j17);
        if (com.tencent.mm.sdk.platformtools.t8.K0(D0.field_memberList)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isInTagList", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
            return false;
        }
        boolean contains = com.tencent.mm.sdk.platformtools.t8.P1(D0.field_memberList.split(",")).contains(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isInTagList", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        return contains;
    }

    public final void X6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateState", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        gm0.j1.i();
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f167354e, true);
        this.f167356g = n17;
        n17.X1(this.f167354e);
        boolean x27 = this.f167356g.x2();
        boolean W6 = W6(this.f167354e, 5L);
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f167355f).h("sns_outside_permiss");
        checkBoxPreference.O(x27);
        int i17 = this.f167356g.I;
        if (i17 == 1) {
            checkBoxPreference.J(com.tencent.mm.R.string.jdc);
        } else if (i17 == 2) {
            checkBoxPreference.J(com.tencent.mm.R.string.jdb);
        }
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference2 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f167355f).h("sns_black_permiss");
        if (i17 == 1) {
            checkBoxPreference2.J(com.tencent.mm.R.string.j9h);
        } else if (i17 == 2) {
            checkBoxPreference2.J(com.tencent.mm.R.string.j9g);
        }
        checkBoxPreference2.O(W6);
        if (!this.f167356g.r2()) {
            ((com.tencent.mm.ui.base.preference.h0) this.f167355f).w("sns_black_permiss");
        }
        com.tencent.mm.ui.base.preference.PreferenceFooterCategory preferenceFooterCategory = (com.tencent.mm.ui.base.preference.PreferenceFooterCategory) ((com.tencent.mm.ui.base.preference.h0) this.f167355f).h("sns_openim_desc_footer");
        boolean z17 = com.tencent.mm.storage.z3.m4(this.f167354e) && "3552365301".equals(this.f167356g.Q0());
        this.f167362p = z17;
        if (z17) {
            ((com.tencent.mm.ui.base.preference.h0) this.f167355f).m("sns_outside_permiss", true);
            preferenceFooterCategory.G(com.tencent.mm.R.string.jdd);
        } else {
            ((com.tencent.mm.ui.base.preference.h0) this.f167355f).m("sns_openim_desc_footer", true);
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f167355f).notifyDataSetChanged();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateState", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
            boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
            return dispatchKeyEvent;
        }
        setResult(-1, new android.content.Intent());
        finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        return true;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getResourceId", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getResourceId", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        return com.tencent.mm.R.xml.f494960cq;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        this.f167355f = getPreferenceScreen();
        if (this.f167356g != null && com.tencent.mm.storage.z3.m4(this.f167354e) && "3552365301".equals(this.f167356g.Q0())) {
            setMMTitle(com.tencent.mm.R.string.jdf);
        } else {
            setMMTitle(com.tencent.mm.R.string.jde);
        }
        setBackBtn(new com.tencent.mm.plugin.sns.ui.eo(this));
        this.f167361o = W6(this.f167354e, 5L);
        X6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        super.onCreate(bundle);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(291, this);
        this.f167354e = getIntent().getStringExtra("sns_permission_userName");
        getIntent().getBooleanExtra("sns_permission_anim", false);
        this.f167359m = getIntent().getLongExtra("sns_permission_snsinfo_svr_id", 0L);
        this.f167360n = getIntent().getIntExtra("sns_permission_block_scene", 0);
        gm0.j1.i();
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f167354e, true);
        this.f167356g = n17;
        if (n17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsPermissionUI", "the error cause by get contact by %s", this.f167354e);
            finish();
        }
        this.f167356g.X1(this.f167354e);
        initView();
        this.f167363q = V6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        super.onDestroy();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doSync", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doSync", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        gm0.j1.i();
        gm0.j1.n().f273288b.q(291, this);
        long j17 = this.f167359m;
        if (j17 != 0 && j17 != -1) {
            com.tencent.mm.autogen.events.SnsFinishBlockUserEvent snsFinishBlockUserEvent = new com.tencent.mm.autogen.events.SnsFinishBlockUserEvent();
            boolean z17 = this.f167358i;
            am.rv rvVar = snsFinishBlockUserEvent.f54809g;
            rvVar.f7847a = z17;
            rvVar.f7848b = this.f167359m;
            snsFinishBlockUserEvent.e();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportPerMission", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.os.SystemClock.elapsedRealtime();
        int V6 = V6();
        com.tencent.mm.autogen.mmdata.rpt.SnsPermissionReportStruct snsPermissionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsPermissionReportStruct();
        snsPermissionReportStruct.f60682d = snsPermissionReportStruct.b("Username", this.f167354e, true);
        snsPermissionReportStruct.f60683e = snsPermissionReportStruct.b("PublishId", ca4.z0.t0(this.f167359m), true);
        snsPermissionReportStruct.f60684f = this.f167363q;
        snsPermissionReportStruct.f60685g = V6;
        snsPermissionReportStruct.f60686h = 5;
        snsPermissionReportStruct.k();
        android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportPerMission", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        if (this.f167362p) {
            boolean W6 = W6(this.f167354e, 5L);
            boolean z19 = this.f167361o;
            if (z19 && !W6) {
                com.tencent.mm.plugin.sns.statistics.s0.f164937k0.L(this.f167354e, 2, 2);
            } else if (z19 || !W6) {
                com.tencent.mm.plugin.sns.statistics.s0.f164937k0.L(this.f167354e, 2, 1);
            } else {
                com.tencent.mm.plugin.sns.statistics.s0.f164937k0.L(this.f167354e, 2, 3);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        java.lang.String str = preference.f197780q;
        if (str.equals("sns_outside_permiss")) {
            com.tencent.mm.autogen.events.SnsPermissionNotifyEvent snsPermissionNotifyEvent = new com.tencent.mm.autogen.events.SnsPermissionNotifyEvent();
            am.jw jwVar = snsPermissionNotifyEvent.f54827g;
            jwVar.getClass();
            jwVar.f7102a = false;
            jwVar.f7103b = this.f167354e;
            snsPermissionNotifyEvent.e();
            if (this.f167356g.x2()) {
                c01.e2.x0(this.f167356g, false, true);
            } else {
                c01.e2.x0(this.f167356g, true, true);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
            return true;
        }
        if (!str.equals("sns_black_permiss")) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
            return false;
        }
        com.tencent.mm.autogen.events.SnsPermissionNotifyEvent snsPermissionNotifyEvent2 = new com.tencent.mm.autogen.events.SnsPermissionNotifyEvent();
        am.jw jwVar2 = snsPermissionNotifyEvent2.f54827g;
        jwVar2.getClass();
        jwVar2.f7102a = true;
        jwVar2.f7103b = this.f167354e;
        snsPermissionNotifyEvent2.e();
        boolean W6 = W6(this.f167354e, 5L);
        java.lang.String str2 = this.f167354e;
        int i17 = W6 ? 2 : 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateTagIdList", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        if (i17 == 1) {
            this.f167357h = true;
            this.f167358i = false;
        } else {
            this.f167357h = false;
            this.f167358i = false;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(str2);
        com.tencent.mm.plugin.sns.model.e3 e3Var = new com.tencent.mm.plugin.sns.model.e3(i17, 5L, "", linkedList.size(), linkedList, this.f167360n);
        gm0.j1.i();
        gm0.j1.n().f273288b.g(e3Var);
        this.f167353d = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.jfx), true, true, new com.tencent.mm.plugin.sns.ui.fo(this, e3Var));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateTagIdList", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        return true;
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsPermissionUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str + " " + m1Var.getType());
        if (m1Var.getType() == 291) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f167353d;
            if (u3Var != null) {
                u3Var.dismiss();
                this.f167353d = null;
            }
            X6();
            if (this.f167357h) {
                this.f167358i = true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
    }
}
