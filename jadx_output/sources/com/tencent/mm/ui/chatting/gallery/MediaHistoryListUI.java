package com.tencent.mm.ui.chatting.gallery;

@db5.a(3)
/* loaded from: classes9.dex */
public class MediaHistoryListUI extends com.tencent.mm.ui.MMActivity implements zb5.i {

    /* renamed from: d, reason: collision with root package name */
    public zb5.h f200763d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f200764e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f200765f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f200766g;

    /* renamed from: h, reason: collision with root package name */
    public android.app.ProgressDialog f200767h;

    /* renamed from: i, reason: collision with root package name */
    public a31.v f200768i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f200769m = false;

    @Override // zb5.i
    public void A(boolean z17, int i17) {
        U6(false);
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryListUI", "[onDataLoaded] isFirst:%s addCount:%s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        if (i17 <= 0) {
            this.f200765f.setVisibility(0);
            this.f200766g.setVisibility(8);
            this.f200765f.setText(getString(com.tencent.mm.R.string.b5e));
        } else {
            this.f200765f.setVisibility(8);
            this.f200766g.setVisibility(0);
            this.f200766g.getAdapter().notifyDataSetChanged();
        }
    }

    @Override // zb5.i
    public void P(boolean z17) {
        U6(true);
    }

    public final int T6(android.content.Intent intent) {
        int intExtra = intent.getIntExtra("key_media_type", -1);
        if (intExtra == 2) {
            return 1;
        }
        int i17 = 3;
        if (intExtra == 3) {
            return 2;
        }
        if (intExtra != 4) {
            i17 = 5;
            if (intExtra == 5) {
                return 4;
            }
            if (intExtra != 6) {
                switch (intExtra) {
                    case 102:
                        return 11;
                    case 103:
                        return 12;
                    case 104:
                        return 8;
                    case 105:
                        return 9;
                    case 106:
                        return 10;
                    default:
                        return 0;
                }
            }
        }
        return i17;
    }

    public final void U6(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryListUI", "[setProgress] isVisible:%s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            this.f200767h = com.tencent.mm.ui.widget.dialog.u3.f(this, getString(com.tencent.mm.R.string.ggc), true, 0, null);
            return;
        }
        android.app.ProgressDialog progressDialog = this.f200767h;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f200767h.dismiss();
        this.f200767h = null;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bxc;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f200769m = getIntent().getBooleanExtra("detail_user_dismiss", false);
        a31.v vVar = new a31.v();
        this.f200768i = vVar;
        vVar.c(false);
        a31.v vVar2 = this.f200768i;
        com.tencent.mm.ui.chatting.presenter.y yVar = (com.tencent.mm.ui.chatting.presenter.y) this.f200763d;
        yVar.getClass();
        com.tencent.mm.ui.chatting.presenter.t tVar = new com.tencent.mm.ui.chatting.presenter.t(yVar);
        vVar2.f999u = tVar;
        vVar2.f210324i = tVar;
        this.f200768i.f996r = false;
        this.f200765f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.mf6);
        this.f200766g = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.h0u);
        findViewById(com.tencent.mm.R.id.ch8).setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f478491c));
        this.f200766g.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f478491c));
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f200766g;
        com.tencent.mm.ui.chatting.presenter.y yVar2 = (com.tencent.mm.ui.chatting.presenter.y) this.f200763d;
        if (yVar2.f202545h == null) {
            yVar2.f202545h = new androidx.recyclerview.widget.LinearLayoutManager(this);
        }
        recyclerView.setLayoutManager(yVar2.f202545h);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f200766g;
        com.tencent.mm.ui.chatting.presenter.y yVar3 = (com.tencent.mm.ui.chatting.presenter.y) this.f200763d;
        yVar3.getClass();
        recyclerView2.N(new com.tencent.mm.ui.chatting.presenter.p(yVar3));
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f200766g;
        com.tencent.mm.ui.chatting.presenter.y yVar4 = (com.tencent.mm.ui.chatting.presenter.y) this.f200763d;
        yVar4.f202542e = this.f200764e;
        yVar4.f202544g = new com.tencent.mm.ui.chatting.adapter.k0(yVar4.f202541d, yVar4);
        com.tencent.mm.ui.chatting.adapter.k0.f198430f = yVar4.i();
        recyclerView3.setAdapter(yVar4.f202544g);
        this.f200766g.setHasFixedSize(true);
        setMMTitle(this.f200763d.g());
    }

    @Override // zb5.i
    public void j0(java.lang.String str, boolean z17, int i17) {
        if (z17) {
            java.lang.String string = getString(com.tencent.mm.R.string.b5g, str);
            this.f200765f.setVisibility(0);
            this.f200766g.setVisibility(8);
            android.widget.TextView textView = this.f200765f;
            textView.setText(o13.q.c(textView.getContext(), string, str));
        } else {
            this.f200765f.setVisibility(8);
            this.f200766g.setVisibility(0);
        }
        de5.a aVar = de5.a.f229396a;
        aVar.l(str);
        aVar.j(4, T6(getIntent()));
        int T6 = T6(getIntent());
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiReporter", "reportVerticalResultExpose  >> resultCnt: " + i17);
        com.tencent.mm.autogen.mmdata.rpt.SessionMsgSearchActionLogStruct a17 = aVar.a();
        a17.f60286f = 7L;
        a17.f60284d = a17.b("sessionid", de5.a.f229397b, true);
        a17.f60301u = T6;
        a17.f60294n = i17;
        a17.p(de5.a.f229401f);
        a17.k();
    }

    @Override // com.tencent.mm.ui.chatting.view.b
    public void l2(com.tencent.mm.ui.chatting.presenter.z zVar) {
        this.f200763d = (zb5.h) zVar;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.ui.chatting.presenter.y z0Var;
        super.onCreate(bundle);
        android.transition.Transition inflateTransition = android.transition.TransitionInflater.from(this).inflateTransition(android.R.transition.fade);
        inflateTransition.excludeTarget(getWindow().getDecorView().findViewById(com.tencent.mm.R.id.f482435ei), true);
        inflateTransition.excludeTarget(android.R.id.statusBarBackground, true);
        getWindow().setEnterTransition(inflateTransition);
        this.f200764e = getIntent().getStringExtra("kintent_talker");
        int intExtra = getIntent().getIntExtra("key_media_type", -1);
        if (intExtra == 2) {
            z0Var = new com.tencent.mm.ui.chatting.presenter.z0(this);
        } else if (intExtra == 3) {
            z0Var = new com.tencent.mm.ui.chatting.presenter.c6(this);
        } else if (intExtra == 4) {
            z0Var = new com.tencent.mm.ui.chatting.presenter.o3(this);
        } else if (intExtra == 5) {
            z0Var = new com.tencent.mm.ui.chatting.presenter.y4(this);
        } else if (intExtra != 6) {
            switch (intExtra) {
                case 102:
                    z0Var = new com.tencent.mm.ui.chatting.presenter.b6(this);
                    break;
                case 103:
                    z0Var = new com.tencent.mm.ui.chatting.presenter.p1(this);
                    break;
                case 104:
                    z0Var = new com.tencent.mm.ui.chatting.presenter.m5(this);
                    break;
                case 105:
                    z0Var = new com.tencent.mm.ui.chatting.presenter.l2(this);
                    break;
                case 106:
                    z0Var = new com.tencent.mm.ui.chatting.presenter.m4(this);
                    break;
                default:
                    z0Var = null;
                    break;
            }
        } else {
            z0Var = new com.tencent.mm.ui.chatting.presenter.n(this);
        }
        if (z0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MediaHistoryListUI", "[onCreate] presenter is null!");
            return;
        }
        z0Var.f202543f = this;
        l2(z0Var);
        setActionbarColor(b3.l.getColor(getContext(), com.tencent.mm.R.color.a07));
        hideActionbarLine();
        initView();
        this.f200763d.a(true);
        boolean R4 = com.tencent.mm.storage.z3.R4(this.f200764e);
        com.tencent.mm.storage.a3 W0 = ((com.tencent.mm.storage.b3) c01.d9.b().l()).W0(this.f200764e);
        if (R4) {
            if (ez.v0.f257777a.j(java.lang.Integer.valueOf(this.f200763d.getType()))) {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.Object[] objArr = new java.lang.Object[9];
                objArr[0] = 0;
                objArr[1] = 0;
                objArr[2] = 0;
                objArr[3] = 0;
                objArr[4] = 1;
                objArr[5] = 0;
                objArr[6] = 0;
                objArr[7] = java.lang.Integer.valueOf(W0.A0().size());
                objArr[8] = java.lang.Integer.valueOf(this.f200769m ? 2 : 1);
                g0Var.d(14569, objArr);
                return;
            }
            if (this.f200763d.getType() == -1) {
                com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.Object[] objArr2 = new java.lang.Object[9];
                objArr2[0] = 0;
                objArr2[1] = 0;
                objArr2[2] = 0;
                objArr2[3] = 0;
                objArr2[4] = 0;
                objArr2[5] = 1;
                objArr2[6] = 0;
                objArr2[7] = java.lang.Integer.valueOf(W0.A0().size());
                objArr2[8] = java.lang.Integer.valueOf(this.f200769m ? 2 : 1);
                g0Var2.d(14569, objArr2);
                return;
            }
            if (this.f200763d.getType() == 3) {
                com.tencent.mm.plugin.report.service.g0 g0Var3 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.Object[] objArr3 = new java.lang.Object[9];
                objArr3[0] = 0;
                objArr3[1] = 0;
                objArr3[2] = 0;
                objArr3[3] = 0;
                objArr3[4] = 0;
                objArr3[5] = 0;
                objArr3[6] = 1;
                objArr3[7] = java.lang.Integer.valueOf(W0.A0().size());
                objArr3[8] = java.lang.Integer.valueOf(this.f200769m ? 2 : 1);
                g0Var3.d(14569, objArr3);
                return;
            }
            if (this.f200763d.getType() == 5) {
                com.tencent.mm.plugin.report.service.g0 g0Var4 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.Object[] objArr4 = new java.lang.Object[10];
                objArr4[0] = 0;
                objArr4[1] = 0;
                objArr4[2] = 0;
                objArr4[3] = 0;
                objArr4[4] = 0;
                objArr4[5] = 0;
                objArr4[6] = 0;
                objArr4[7] = java.lang.Integer.valueOf(W0.A0().size());
                objArr4[8] = java.lang.Integer.valueOf(this.f200769m ? 2 : 1);
                objArr4[9] = 1;
                g0Var4.d(14569, objArr4);
                return;
            }
            if (this.f200763d.getType() == 33) {
                com.tencent.mm.plugin.report.service.g0 g0Var5 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.Object[] objArr5 = new java.lang.Object[11];
                objArr5[0] = 0;
                objArr5[1] = 0;
                objArr5[2] = 0;
                objArr5[3] = 0;
                objArr5[4] = 0;
                objArr5[5] = 0;
                objArr5[6] = 0;
                objArr5[7] = java.lang.Integer.valueOf(W0.A0().size());
                objArr5[8] = java.lang.Integer.valueOf(this.f200769m ? 2 : 1);
                objArr5[9] = 0;
                objArr5[10] = 8;
                g0Var5.d(14569, objArr5);
                return;
            }
            return;
        }
        if (ez.v0.f257777a.j(java.lang.Integer.valueOf(this.f200763d.getType()))) {
            com.tencent.mm.plugin.report.service.g0 g0Var6 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr6 = new java.lang.Object[9];
            objArr6[0] = 0;
            objArr6[1] = 0;
            objArr6[2] = 0;
            objArr6[3] = 0;
            objArr6[4] = 1;
            objArr6[5] = 0;
            objArr6[6] = 0;
            objArr6[7] = 0;
            objArr6[8] = java.lang.Integer.valueOf(this.f200769m ? 2 : 0);
            g0Var6.d(14569, objArr6);
            return;
        }
        if (this.f200763d.getType() == -1) {
            com.tencent.mm.plugin.report.service.g0 g0Var7 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr7 = new java.lang.Object[9];
            objArr7[0] = 0;
            objArr7[1] = 0;
            objArr7[2] = 0;
            objArr7[3] = 0;
            objArr7[4] = 0;
            objArr7[5] = 1;
            objArr7[6] = 0;
            objArr7[7] = 0;
            objArr7[8] = java.lang.Integer.valueOf(this.f200769m ? 2 : 0);
            g0Var7.d(14569, objArr7);
            return;
        }
        if (this.f200763d.getType() == 3) {
            com.tencent.mm.plugin.report.service.g0 g0Var8 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr8 = new java.lang.Object[9];
            objArr8[0] = 0;
            objArr8[1] = 0;
            objArr8[2] = 0;
            objArr8[3] = 0;
            objArr8[4] = 0;
            objArr8[5] = 0;
            objArr8[6] = 1;
            objArr8[7] = 0;
            objArr8[8] = java.lang.Integer.valueOf(this.f200769m ? 2 : 0);
            g0Var8.d(14569, objArr8);
            return;
        }
        if (this.f200763d.getType() == 5) {
            com.tencent.mm.plugin.report.service.g0 g0Var9 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr9 = new java.lang.Object[10];
            objArr9[0] = 0;
            objArr9[1] = 0;
            objArr9[2] = 0;
            objArr9[3] = 0;
            objArr9[4] = 0;
            objArr9[5] = 0;
            objArr9[6] = 0;
            objArr9[7] = 0;
            objArr9[8] = java.lang.Integer.valueOf(this.f200769m ? 2 : 0);
            objArr9[9] = 1;
            g0Var9.d(14569, objArr9);
            return;
        }
        if (this.f200763d.getType() == 33) {
            com.tencent.mm.plugin.report.service.g0 g0Var10 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr10 = new java.lang.Object[11];
            objArr10[0] = 0;
            objArr10[1] = 0;
            objArr10[2] = 0;
            objArr10[3] = 0;
            objArr10[4] = 0;
            objArr10[5] = 0;
            objArr10[6] = 0;
            objArr10[7] = 0;
            objArr10[8] = java.lang.Integer.valueOf(this.f200769m ? 2 : 0);
            objArr10[9] = 0;
            objArr10[10] = 8;
            g0Var10.d(14569, objArr10);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, androidx.activity.ComponentActivity, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        a31.v vVar = this.f200768i;
        if (vVar == null) {
            return false;
        }
        vVar.j(this, menu);
        a31.v vVar2 = this.f200768i;
        java.lang.String b17 = this.f200763d.b();
        if (vVar2.f210323h != null && !com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
            vVar2.f210323h.setSelectedTag(b17);
        }
        getContentView().postDelayed(new com.tencent.mm.ui.chatting.gallery.bb(this), 200L);
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f200763d.onDetach();
        de5.a aVar = de5.a.f229396a;
        aVar.l("");
        aVar.j(21, T6(getIntent()));
    }

    @Override // zb5.i
    public void onFinish() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryListUI", "[onRefreshed]");
        finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        finish();
        overridePendingTransition(0, 0);
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onKeyboardStateChanged() {
        super.onKeyboardStateChanged();
        if (keyboardState() == 2) {
            this.f200768i.a();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, android.app.Activity
    public boolean onPrepareOptionsMenu(android.view.Menu menu) {
        this.f200768i.m(this, menu);
        return true;
    }
}
