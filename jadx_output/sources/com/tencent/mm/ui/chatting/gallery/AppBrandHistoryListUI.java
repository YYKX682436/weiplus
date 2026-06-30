package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes9.dex */
public class AppBrandHistoryListUI extends com.tencent.mm.ui.MMActivity implements zb5.i {

    /* renamed from: d, reason: collision with root package name */
    public zb5.h f200540d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f200541e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f200542f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f200543g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f200544h;

    @Override // zb5.i
    public void A(boolean z17, int i17) {
        T6(false);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandHistoryListUI", "[onDataLoaded] isFirst:%s addCount:%s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        if (i17 <= 0) {
            this.f200542f.setVisibility(0);
            this.f200541e.setVisibility(8);
            this.f200542f.setText(getString(com.tencent.mm.R.string.b5e));
        } else {
            this.f200542f.setVisibility(8);
            this.f200541e.setVisibility(0);
            this.f200541e.getAdapter().notifyItemRangeChanged(0, i17);
        }
    }

    @Override // zb5.i
    public void P(boolean z17) {
        T6(true);
    }

    public final void T6(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandHistoryListUI", "[setProgress] isVisible:%s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            this.f200543g = com.tencent.mm.ui.widget.dialog.u3.f(this, getString(com.tencent.mm.R.string.ggc), true, 0, null);
            return;
        }
        android.app.ProgressDialog progressDialog = this.f200543g;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f200543g.dismiss();
        this.f200543g = null;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488139i8;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(getString(com.tencent.mm.R.string.ax9));
        this.f200542f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.mf6);
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.h0u);
        this.f200541e = recyclerView;
        recyclerView.setBackgroundColor(-1);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f200541e;
        com.tencent.mm.ui.chatting.presenter.y yVar = (com.tencent.mm.ui.chatting.presenter.y) this.f200540d;
        if (yVar.f202545h == null) {
            yVar.f202545h = new androidx.recyclerview.widget.LinearLayoutManager(this);
        }
        recyclerView2.setLayoutManager(yVar.f202545h);
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f200541e;
        com.tencent.mm.ui.chatting.presenter.y yVar2 = (com.tencent.mm.ui.chatting.presenter.y) this.f200540d;
        yVar2.f202542e = this.f200544h;
        yVar2.f202544g = new com.tencent.mm.ui.chatting.adapter.k0(yVar2.f202541d, yVar2);
        com.tencent.mm.ui.chatting.adapter.k0.f198430f = yVar2.i();
        recyclerView3.setAdapter(yVar2.f202544g);
        this.f200541e.setHasFixedSize(true);
        setBackBtn(new com.tencent.mm.ui.chatting.gallery.d(this));
    }

    @Override // zb5.i
    public void j0(java.lang.String str, boolean z17, int i17) {
    }

    @Override // com.tencent.mm.ui.chatting.view.b
    public void l2(com.tencent.mm.ui.chatting.presenter.z zVar) {
        this.f200540d = (zb5.h) zVar;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f200544h = getIntent().getStringExtra("Chat_User");
        com.tencent.mm.ui.chatting.presenter.n nVar = new com.tencent.mm.ui.chatting.presenter.n(this);
        nVar.f202543f = this;
        l2(nVar);
        initView();
        this.f200540d.a(true);
        if (com.tencent.mm.storage.z3.R4(this.f200544h)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14562, this.f200544h, 0);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14562, this.f200544h, 1);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f200540d.onDetach();
    }

    @Override // zb5.i
    public void onFinish() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandHistoryListUI", "[onRefreshed]");
        finish();
    }
}
