package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public abstract class FTSBaseUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements com.tencent.mm.plugin.fts.ui.w0, tj5.w, tj5.n, com.tencent.mm.plugin.fts.ui.d0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f137903d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.fts.ui.f0 f137904e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f137905f;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.search.FTSSearchView f137907h;

    /* renamed from: g, reason: collision with root package name */
    public boolean f137906g = false;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f137908i = null;

    /* renamed from: m, reason: collision with root package name */
    public boolean f137909m = false;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f137910n = "";

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f137911o = new com.tencent.mm.plugin.fts.ui.v0(this);

    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        if (oVar == tj5.o.UserInput) {
            java.lang.String p17 = o13.n.p(str);
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f137910n) || !this.f137910n.equals(p17)) {
                V6(p17);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSBaseUI", "Same query %s %s", this.f137910n, p17);
            }
        }
    }

    public boolean G0() {
        hideVKB();
        this.f137907h.getFtsEditText().d();
        return false;
    }

    @Override // com.tencent.mm.plugin.fts.ui.d0
    public void R3(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSBaseUI", "onEnd resultCount=%d | isFinished=%b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        if (z17) {
            if (i17 > 0) {
                a7();
            } else {
                b7();
            }
        } else if (i17 > 0) {
            a7();
        } else {
            c7();
        }
        if (this.f137906g) {
            this.f137906g = false;
            this.f137903d.setSelection(0);
        }
    }

    @Override // tj5.n
    public void U1(boolean z17) {
    }

    public abstract com.tencent.mm.plugin.fts.ui.f0 U6(com.tencent.mm.plugin.fts.ui.w0 w0Var);

    public void V6(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            e7();
            return;
        }
        this.f137910n = str;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f137911o;
        n3Var.removeMessages(1);
        n3Var.sendEmptyMessageDelayed(1, 300L);
    }

    public java.lang.String W6() {
        java.lang.String str = this.f137908i;
        return str != null ? str : getString(com.tencent.mm.R.string.f490549y8);
    }

    public void X6() {
    }

    public void Y6() {
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = new com.tencent.mm.ui.search.FTSSearchView((android.content.Context) this, false);
        this.f137907h = fTSSearchView;
        fTSSearchView.setSearchViewListener(this);
        this.f137907h.getFtsEditText().setHint(W6());
        this.f137907h.getFtsEditText().g();
        this.f137907h.getFtsEditText().setFtsEditTextListener(this);
        this.f137907h.getFtsEditText().setCanDeleteTag(false);
        getSupportActionBar().y(this.f137907h);
        this.f137903d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.mfg);
        if (getFooterView() != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSBaseUI", "searchResultLV addFooterView");
            this.f137903d.addFooterView(getFooterView());
        }
        com.tencent.mm.plugin.fts.ui.f0 U6 = U6(this);
        this.f137904e = U6;
        U6.f138054n = this;
        this.f137903d.setAdapter((android.widget.ListAdapter) U6);
        this.f137903d.setOnScrollListener(this.f137904e);
        this.f137903d.setOnItemClickListener(this.f137904e);
        this.f137903d.setOnTouchListener(new com.tencent.mm.plugin.fts.ui.t0(this));
        this.f137905f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kcl);
        setBackBtn(new com.tencent.mm.plugin.fts.ui.u0(this));
    }

    public void Z6() {
        this.f137905f.setVisibility(8);
        this.f137903d.setVisibility(8);
    }

    public void a7() {
        this.f137905f.setVisibility(8);
        this.f137903d.setVisibility(0);
    }

    public void b7() {
        this.f137905f.setVisibility(0);
        this.f137905f.setText(o13.q.m(getString(com.tencent.mm.R.string.icq), getString(com.tencent.mm.R.string.icp), this.f137910n));
        this.f137903d.setVisibility(8);
    }

    public void c7() {
        this.f137905f.setVisibility(8);
        this.f137903d.setVisibility(8);
    }

    public void d7() {
        com.tencent.mm.plugin.fts.ui.f0 f0Var = this.f137904e;
        if (f0Var == null) {
            return;
        }
        this.f137906g = true;
        java.lang.String str = this.f137910n;
        f0Var.f138052i = this.f137909m;
        f0Var.o(str, null);
        c7();
    }

    public void e7() {
        this.f137910n = "";
        this.f137911o.removeMessages(1);
        this.f137906g = false;
        this.f137904e.p();
        this.f137907h.getFtsEditText().setHint(W6());
        Z6();
    }

    @Override // com.tencent.mm.plugin.fts.ui.w0
    public /* bridge */ /* synthetic */ android.content.Context getContext() {
        return super.getContext();
    }

    public android.view.View getFooterView() {
        return null;
    }

    @Override // com.tencent.mm.plugin.fts.ui.w0
    public android.widget.ListView getListView() {
        return this.f137903d;
    }

    @Override // tj5.n
    public void o3(int i17, tj5.x xVar) {
    }

    public void onClickBackBtn(android.view.View view) {
        hideVKB();
        finish();
    }

    public void onClickCancelBtn(android.view.View view) {
    }

    public void onClickClearTextBtn(android.view.View view) {
        e7();
        if (this.f137907h.getFtsEditText().k()) {
            showVKB();
        } else {
            this.f137907h.getFtsEditText().m();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        showMMLogo();
        setMMTitle("");
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478489a));
        X6();
        Y6();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.f137911o.removeMessages(1);
        this.f137904e.g();
        super.onDestroy();
    }

    @Override // tj5.n
    public void x0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSBaseUI", "on tap search key");
    }

    public void x6(android.view.View view, u13.g gVar, boolean z17) {
    }
}
