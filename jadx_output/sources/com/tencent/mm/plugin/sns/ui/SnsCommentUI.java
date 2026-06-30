package com.tencent.mm.plugin.sns.ui;

@db5.a(17)
/* loaded from: classes4.dex */
public class SnsCommentUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f167138o = 0;

    /* renamed from: d, reason: collision with root package name */
    public fl5.i f167139d;

    /* renamed from: f, reason: collision with root package name */
    public int f167141f;

    /* renamed from: h, reason: collision with root package name */
    public int f167143h;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f167146n;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f167140e = null;

    /* renamed from: g, reason: collision with root package name */
    public int f167142g = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f167144i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f167145m = false;

    public static /* synthetic */ fl5.i T6(com.tencent.mm.plugin.sns.ui.SnsCommentUI snsCommentUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        fl5.i iVar = snsCommentUI.f167139d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        return iVar;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finish", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        super.finish();
        if (this.f167145m || this.f167142g != 2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finish", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
            return;
        }
        getIntent().getLongExtra("sns_id", 0L);
        getIntent().getLongExtra("action_st_time", 0L);
        getIntent().getStringExtra("sns_uxinfo");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String stringExtra = getIntent().getStringExtra("sns_actionresult");
        if (stringExtra == null) {
            stringExtra = "";
        }
        stringExtra.concat("|4:0:");
        java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.model.l4.vj().getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.newabtest.SnsAdABTestMgr");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.newabtest.SnsAdABTestMgr");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finish", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        return com.tencent.mm.R.layout.cr6;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        fl5.i iVar = (fl5.i) findViewById(com.tencent.mm.R.id.cgi);
        this.f167139d = iVar;
        iVar.d(((com.tencent.mm.plugin.websearch.w1) ((su4.x0) i95.n0.c(su4.x0.class))).cj());
        this.f167139d.k();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initSelectHelper", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        this.f167139d.b(((com.tencent.mm.plugin.websearch.w1) ((su4.x0) i95.n0.c(su4.x0.class))).bj(), com.tencent.mm.sdk.platformtools.m2.f(getContext()), new com.tencent.mm.plugin.sns.ui.th(this), null);
        this.f167139d.addTextChangedListener(new com.tencent.mm.plugin.sns.ui.uh(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initSelectHelper", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490551ya), new com.tencent.mm.plugin.sns.ui.qh(this), null, com.tencent.mm.ui.fb.GREEN);
        int i17 = this.f167142g;
        if (i17 == 0) {
            setMMTitle(com.tencent.mm.R.string.j9t);
        } else if (i17 == 1) {
            setMMTitle(com.tencent.mm.R.string.jhe);
            gm0.j1.i();
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(68408, "");
            java.lang.String str2 = str != null ? str : "";
            gm0.j1.i();
            this.f167139d.setPasterLen(com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) gm0.j1.u().c().l(7489, 0), 0));
            this.f167139d.append(str2);
            if (str2.length() > 0) {
                enableOptionMenu(true);
            } else {
                enableOptionMenu(false);
            }
        } else if (i17 == 2) {
            setMMTitle(com.tencent.mm.R.string.j5s);
            enableOptionMenu(false);
        }
        setBackBtn(new com.tencent.mm.plugin.sns.ui.rh(this));
        this.f167139d.addTextChangedListener(new com.tencent.mm.plugin.sns.ui.sh(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        com.tencent.mm.ui.bk.u0(this);
        super.onCreate(bundle);
        this.f167141f = getIntent().getIntExtra("sns_comment_localId", 0);
        getIntent().getStringExtra("sns_id");
        this.f167142g = getIntent().getIntExtra("sns_comment_type", 0);
        this.f167143h = getIntent().getIntExtra("sns_source", 0);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(213, this);
        initView();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        super.onDestroy();
        gm0.j1.i();
        gm0.j1.n().f273288b.q(213, this);
        this.f167139d.destroy();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        if (i17 != 4) {
            boolean onKeyDown = super.onKeyDown(i17, keyEvent);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
            return onKeyDown;
        }
        hideVKB();
        finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        super.onPause();
        fl5.i iVar = this.f167139d;
        if (iVar != null) {
            java.lang.String trim = iVar.getText().toString().trim();
            gm0.j1.i();
            gm0.j1.u().c().w(68408, trim);
            if (com.tencent.mm.sdk.platformtools.t8.K0(trim)) {
                gm0.j1.i();
                gm0.j1.u().c().w(7489, 0);
            } else {
                gm0.j1.i();
                gm0.j1.u().c().w(7489, java.lang.Integer.valueOf(this.f167139d.getPasterLen()));
            }
        }
        this.f167139d.onPause();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        super.onResume();
        showVKB();
        this.f167139d.d(((com.tencent.mm.plugin.websearch.w1) ((su4.x0) i95.n0.c(su4.x0.class))).cj());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str + " type = " + m1Var.getType() + " @" + hashCode());
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f167140e;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (m1Var.getType() == 213 && this.f167144i) {
            finish();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
    }
}
