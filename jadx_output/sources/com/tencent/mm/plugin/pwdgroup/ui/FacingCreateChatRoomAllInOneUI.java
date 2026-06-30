package com.tencent.mm.plugin.pwdgroup.ui;

/* loaded from: classes15.dex */
public class FacingCreateChatRoomAllInOneUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ int f154750y0 = 0;
    public fs3.y A;
    public android.view.View B;
    public android.widget.TextView C;
    public com.tencent.mm.ui.widget.MMScrollGridView D;
    public android.view.View E;
    public android.view.View F;
    public com.tencent.mm.plugin.pwdgroup.ui.widget.MMCallBackScrollView G;
    public android.app.ProgressDialog H;
    public android.widget.TextView I;
    public boolean K;
    public java.lang.Runnable L;
    public com.tencent.mm.sdk.platformtools.n3 M;
    public es3.a Q;
    public es3.a R;
    public int S;
    public android.view.animation.Animation T;
    public android.view.animation.AnimationSet U;
    public android.view.animation.Animation V;

    /* renamed from: d, reason: collision with root package name */
    public i11.e f154752d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f154754f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f154755g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f154756h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.model.lbs.Location f154757i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f154758m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.pwdgroup.ui.widget.MMPwdInputView f154759n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f154760o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ProgressBar f154761p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f154763q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.pwdgroup.ui.widget.MMKeyBoardView f154764r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f154765s;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f154769w;

    /* renamed from: e, reason: collision with root package name */
    public boolean f154753e = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f154766t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f154767u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f154768v = false;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.LinkedList f154770x = new java.util.LinkedList();

    /* renamed from: y, reason: collision with root package name */
    public final java.util.HashMap f154772y = new java.util.HashMap();

    /* renamed from: z, reason: collision with root package name */
    public final java.util.LinkedList f154773z = new java.util.LinkedList();

    /* renamed from: J, reason: collision with root package name */
    public boolean f154751J = false;
    public final com.tencent.mm.sdk.platformtools.b4 N = new com.tencent.mm.sdk.platformtools.b4(new fs3.k(this), false);
    public final com.tencent.mm.sdk.platformtools.n3 P = new fs3.l(this);
    public final android.view.MenuItem.OnMenuItemClickListener W = new fs3.m(this);
    public final gs3.e X = new fs3.n(this);
    public final android.view.View.OnClickListener Y = new fs3.o(this);
    public final gs3.d Z = new fs3.p(this);

    /* renamed from: p0, reason: collision with root package name */
    public final i11.c f154762p0 = new fs3.r(this);

    /* renamed from: x0, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f154771x0 = new com.tencent.mm.sdk.platformtools.b4(new fs3.s(this), false);

    public static void T6(com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI facingCreateChatRoomAllInOneUI, int i17) {
        facingCreateChatRoomAllInOneUI.H = db5.e1.Q(facingCreateChatRoomAllInOneUI, facingCreateChatRoomAllInOneUI.getString(com.tencent.mm.R.string.f490573yv), facingCreateChatRoomAllInOneUI.getString(com.tencent.mm.R.string.f490604zq), true, true, new fs3.f(facingCreateChatRoomAllInOneUI));
        facingCreateChatRoomAllInOneUI.Y6();
        java.lang.String str = facingCreateChatRoomAllInOneUI.f154758m;
        java.lang.String str2 = facingCreateChatRoomAllInOneUI.f154769w;
        com.tencent.mm.pluginsdk.model.lbs.Location location = facingCreateChatRoomAllInOneUI.f154757i;
        c01.d9.e().g(new es3.a(i17, str, str2, location.f189366d, location.f189367e, location.f189368f, location.f189369g, location.f189370h, location.f189371i));
    }

    public static void U6(com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI facingCreateChatRoomAllInOneUI) {
        com.tencent.mm.sdk.platformtools.b4 b4Var = facingCreateChatRoomAllInOneUI.f154771x0;
        if (b4Var != null) {
            b4Var.d();
        }
        boolean z17 = facingCreateChatRoomAllInOneUI.f154755g;
        fs3.u uVar = fs3.u.Loading;
        if (!z17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "tryGetChatRoomUser location is no ready.");
            facingCreateChatRoomAllInOneUI.Z6(uVar);
            if (b4Var != null) {
                b4Var.c(15000L, 15000L);
                return;
            }
            return;
        }
        if (facingCreateChatRoomAllInOneUI.f154754f) {
            facingCreateChatRoomAllInOneUI.Z6(uVar);
        }
        if (facingCreateChatRoomAllInOneUI.f154755g && facingCreateChatRoomAllInOneUI.f154754f && !facingCreateChatRoomAllInOneUI.f154756h) {
            facingCreateChatRoomAllInOneUI.f154756h = true;
            facingCreateChatRoomAllInOneUI.f154754f = false;
            java.lang.String str = facingCreateChatRoomAllInOneUI.f154758m;
            com.tencent.mm.pluginsdk.model.lbs.Location location = facingCreateChatRoomAllInOneUI.f154757i;
            facingCreateChatRoomAllInOneUI.R = new es3.a(0, str, "", location.f189366d, location.f189367e, location.f189368f, location.f189369g, location.f189370h, location.f189371i);
            c01.d9.e().g(facingCreateChatRoomAllInOneUI.R);
        }
    }

    public final void V6() {
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        this.f154752d = i11.h.e();
        c01.d9.e().a(vd1.j.CTRL_INDEX, this);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        initView();
        com.tencent.mm.plugin.report.service.b1.f(3, 10);
    }

    public final void W6() {
        i11.e eVar;
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Di(d85.g0.LOCAION, d85.f0.f227161i, new fs3.c(this)) || (eVar = this.f154752d) == null) {
            return;
        }
        ((i11.h) eVar).k(this.f154762p0, true);
    }

    public final void X6() {
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(this, com.tencent.mm.R.anim.f477724l);
        android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(this, com.tencent.mm.R.anim.f477723k);
        loadAnimation.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        loadAnimation.setAnimationListener(new fs3.i(this, loadAnimation2));
        loadAnimation2.setAnimationListener(new fs3.j(this));
        com.tencent.mm.plugin.pwdgroup.ui.widget.MMPwdInputView mMPwdInputView = this.f154759n;
        if (mMPwdInputView != null) {
            mMPwdInputView.startAnimation(loadAnimation);
        }
        com.tencent.mm.plugin.pwdgroup.ui.widget.MMKeyBoardView mMKeyBoardView = this.f154764r;
        if (mMKeyBoardView != null) {
            mMKeyBoardView.setKeyBoardEnable(false);
        }
    }

    public final void Y6() {
        this.f154768v = true;
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.N;
        if (b4Var != null) {
            b4Var.d();
        }
        c01.d9.e().d(this.Q);
    }

    public final void Z6(fs3.u uVar) {
        if (this.f154763q != null) {
            int ordinal = uVar.ordinal();
            if (ordinal == 0) {
                com.tencent.mm.plugin.pwdgroup.ui.widget.MMKeyBoardView mMKeyBoardView = this.f154764r;
                if (mMKeyBoardView != null) {
                    mMKeyBoardView.setKeyBoardEnable(true);
                }
                this.f154753e = false;
                this.f154761p.setVisibility(8);
                this.f154763q.setVisibility(8);
                return;
            }
            if (ordinal == 1) {
                com.tencent.mm.plugin.pwdgroup.ui.widget.MMKeyBoardView mMKeyBoardView2 = this.f154764r;
                if (mMKeyBoardView2 != null) {
                    mMKeyBoardView2.setKeyBoardEnable(false);
                }
                this.f154763q.setText(com.tencent.mm.R.string.hqu);
                this.f154761p.setVisibility(0);
                this.f154763q.setVisibility(8);
                return;
            }
            if (ordinal == 2) {
                com.tencent.mm.plugin.pwdgroup.ui.widget.MMKeyBoardView mMKeyBoardView3 = this.f154764r;
                if (mMKeyBoardView3 != null) {
                    mMKeyBoardView3.setKeyBoardEnable(true);
                }
                this.f154761p.setVisibility(8);
                this.f154763q.setVisibility(0);
                this.f154763q.setText(com.tencent.mm.R.string.hqr);
                X6();
                return;
            }
            if (ordinal != 3) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "unknow statue tip");
                return;
            }
            com.tencent.mm.plugin.pwdgroup.ui.widget.MMKeyBoardView mMKeyBoardView4 = this.f154764r;
            if (mMKeyBoardView4 != null) {
                mMKeyBoardView4.setKeyBoardEnable(true);
            }
            this.f154761p.setVisibility(8);
            this.f154763q.setVisibility(0);
            this.f154763q.setText(com.tencent.mm.R.string.hqt);
            X6();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.aaq;
    }

    public void hideLoading() {
        android.app.ProgressDialog progressDialog = this.H;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.H.dismiss();
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.HashSet hashSet = new java.util.HashSet(super.importUIComponents());
        hashSet.add(ir3.b.class);
        return hashSet;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.cfx);
        setBackBtn(this.W);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.a9e));
        setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.f479476a20));
        this.f154760o = findViewById(com.tencent.mm.R.id.dpd);
        this.f154761p = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.dpc);
        this.f154763q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dpe);
        this.f154764r = (com.tencent.mm.plugin.pwdgroup.ui.widget.MMKeyBoardView) findViewById(com.tencent.mm.R.id.dpb);
        this.f154765s = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dpa);
        com.tencent.mm.plugin.pwdgroup.ui.widget.MMPwdInputView mMPwdInputView = (com.tencent.mm.plugin.pwdgroup.ui.widget.MMPwdInputView) findViewById(com.tencent.mm.R.id.dp9);
        this.f154759n = mMPwdInputView;
        mMPwdInputView.setOnFinishInputListener(this.X);
        this.f154759n.requestFocus();
        this.f154764r.setOnInputDeleteListener(this.Z);
        Z6(fs3.u.Normal);
        this.B = findViewById(com.tencent.mm.R.id.f484290dp2);
        this.C = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f484292dp4);
        com.tencent.mm.ui.widget.MMScrollGridView mMScrollGridView = (com.tencent.mm.ui.widget.MMScrollGridView) findViewById(com.tencent.mm.R.id.f484291dp3);
        this.D = mMScrollGridView;
        mMScrollGridView.setVisibility(4);
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.f484293dp5)).setOnClickListener(this.Y);
        this.E = findViewById(com.tencent.mm.R.id.dp6);
        this.F = findViewById(com.tencent.mm.R.id.dp7);
        this.C.setText(com.tencent.mm.R.string.f491180c92);
        this.G = (com.tencent.mm.plugin.pwdgroup.ui.widget.MMCallBackScrollView) findViewById(com.tencent.mm.R.id.dpf);
        this.I = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dp_);
        this.G.setMMOnScrollListener(new fs3.d(this));
        fs3.y yVar = new fs3.y(this);
        this.A = yVar;
        this.D.setAdapter((android.widget.ListAdapter) yVar);
        this.A.a(this.f154770x);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 30764) {
            if (intent == null) {
                finish();
                return;
            }
            android.os.Bundle bundleExtra = intent.getBundleExtra("result_data");
            if (bundleExtra == null || !bundleExtra.getString("go_next", "").equals("gdpr_auth_location")) {
                finish();
                return;
            }
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            j35.u.i(this, "android.permission.ACCESS_FINE_LOCATION", 64);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        customfixStatusbar(true);
        super.onCreate(bundle);
        if (u11.c.f((java.lang.String) gm0.j1.u().c().l(274436, null))) {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            if (!j35.u.d(this, "android.permission.ACCESS_FINE_LOCATION", true)) {
                if (!((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue()) {
                    c71.b.c(this, getString(com.tencent.mm.R.string.f492399gh2, com.tencent.mm.sdk.platformtools.m2.d()), 30764, true);
                    return;
                } else {
                    ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                    j35.u.i(this, "android.permission.ACCESS_FINE_LOCATION", 64);
                    return;
                }
            }
        } else {
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            java.lang.String string = getString(com.tencent.mm.R.string.f491183c95);
            fs3.t tVar = new fs3.t(this);
            ((sb0.f) jVar).getClass();
            boolean b17 = j35.u.b(this, "android.permission.ACCESS_FINE_LOCATION", 64, null, string, tVar, java.lang.Boolean.FALSE);
            com.tencent.mars.xlog.Log.i("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "summerper checkPermission checkCamera[%b]", java.lang.Boolean.valueOf(b17));
            if (!b17) {
                return;
            }
        }
        V6();
        if (com.tencent.mm.ui.b4.c(this)) {
            getController().H0(getResources().getColor(com.tencent.mm.R.color.f479476a20));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        java.lang.Runnable runnable;
        c01.d9.e().q(vd1.j.CTRL_INDEX, this);
        i11.e eVar = this.f154752d;
        if (eVar != null) {
            ((i11.h) eVar).m(this.f154762p0);
        }
        if (!this.f154767u) {
            c01.d9.e().c(vd1.j.CTRL_INDEX);
            com.tencent.mm.pluginsdk.model.lbs.Location location = this.f154757i;
            if (location != null) {
                this.R = new es3.a(2, this.f154758m, "", location.f189366d, location.f189367e, location.f189368f, location.f189369g, location.f189370h, location.f189371i);
                c01.d9.e().g(this.R);
            }
        }
        if (this.f154751J) {
            Y6();
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.M;
        if (n3Var != null && (runnable = this.L) != null) {
            n3Var.removeCallbacks(runnable);
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        i11.e eVar = this.f154752d;
        if (eVar != null) {
            ((i11.h) eVar).m(this.f154762p0);
        }
        if (this.f154751J) {
            Y6();
        }
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 64) {
            return;
        }
        if (iArr[0] != 0) {
            db5.e1.C(this, getString(com.tencent.mm.R.string.hhm), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.aq7), false, new fs3.a(this), new fs3.b(this));
        } else {
            V6();
            W6();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        W6();
        if (this.f154751J) {
            this.f154768v = false;
            com.tencent.mm.sdk.platformtools.b4 b4Var = this.N;
            if (b4Var != null) {
                b4Var.c(0L, 0L);
            }
        }
        super.onResume();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var.getType() != 653) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "cpan[onSceneEnd] unknow scene type");
            return;
        }
        if (((en.a) ((en.k) i95.n0.c(en.k.class))).Zi(this, i17, i18, str)) {
            return;
        }
        es3.a aVar = (es3.a) m1Var;
        fs3.u uVar = fs3.u.ToSimple;
        fs3.u uVar2 = fs3.u.Unknow;
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.N;
        int i19 = aVar.f256424f;
        com.tencent.mm.modelbase.o oVar = aVar.f256423e;
        if (i19 != 0) {
            if (i19 == 3) {
                if (i17 == 0 && i18 == 0) {
                    return;
                }
                if (i18 != -431) {
                    Z6(uVar2);
                    return;
                } else {
                    Z6(uVar);
                    this.f154753e = true;
                    return;
                }
            }
            if (i19 != 1) {
                hideLoading();
                return;
            }
            if (i17 == 0 && i18 == 0) {
                hideLoading();
                java.lang.String str2 = ((r45.xo0) oVar.f70711b.f70700a).f390291g;
                this.f154767u = true;
                finish();
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Chat_User", str2);
                intent.putExtra("enter_room_from_uri_jump", true);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.j(intent, this);
                return;
            }
            if (i18 == -432 && !this.f154766t) {
                this.f154766t = true;
                this.P.sendEmptyMessageDelayed(10002, 3000L);
                return;
            }
            if (i18 == -23) {
                hideLoading();
                db5.e1.y(this, getString(com.tencent.mm.R.string.f491182c94), "", getString(com.tencent.mm.R.string.f490507x1), new fs3.g(this));
                if (b4Var != null) {
                    b4Var.c(3000L, 3000L);
                    return;
                }
                return;
            }
            hideLoading();
            tm.a b17 = tm.a.b(str);
            if (b17 != null) {
                b17.c(getContext(), null, null);
            } else {
                db5.e1.y(this, getString(com.tencent.mm.R.string.hqt), "", getString(com.tencent.mm.R.string.f490507x1), new fs3.g(this));
            }
            if (b4Var != null) {
                b4Var.c(3000L, 3000L);
                return;
            }
            return;
        }
        this.f154756h = false;
        if (this.f154751J) {
            if (b4Var != null) {
                b4Var.c(3000L, 3000L);
            }
            if (i17 == 0 && i18 == 0) {
                java.util.LinkedList linkedList = ((r45.xo0) oVar.f70711b.f70700a).f390290f;
                if (this.M == null) {
                    this.M = new com.tencent.mm.sdk.platformtools.n3("FacingCreateChatRoomAllInOneUI");
                }
                java.lang.Runnable runnable = this.L;
                if (runnable != null) {
                    this.M.removeCallbacks(runnable);
                }
                fs3.h hVar = new fs3.h(this, linkedList);
                this.L = hVar;
                this.M.post(hVar);
                this.f154769w = ((r45.xo0) oVar.f70711b.f70700a).f390288d;
                return;
            }
            return;
        }
        if (i17 != 0 || i18 != 0) {
            if (i18 == -431) {
                this.f154753e = true;
                Z6(uVar);
                return;
            } else {
                this.f154753e = true;
                Z6(uVar2);
                return;
            }
        }
        Z6(fs3.u.Normal);
        this.S = this.f154765s.getHeight();
        this.T = android.view.animation.AnimationUtils.loadAnimation(this, com.tencent.mm.R.anim.f477779b8);
        this.V = android.view.animation.AnimationUtils.loadAnimation(this, com.tencent.mm.R.anim.f477769ay);
        android.view.animation.AnimationSet animationSet = new android.view.animation.AnimationSet(true);
        this.U = animationSet;
        animationSet.addAnimation(android.view.animation.AnimationUtils.loadAnimation(this, com.tencent.mm.R.anim.f477869dt));
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, 0.0f, 0.0f, -this.S);
        translateAnimation.setDuration(300L);
        this.U.addAnimation(translateAnimation);
        this.T.setDuration(200L);
        this.U.setDuration(300L);
        this.V.setDuration(300L);
        this.T.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        this.U.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        this.V.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        this.U.setFillAfter(true);
        translateAnimation.setFillAfter(true);
        this.U.setAnimationListener(new fs3.e(this));
        this.f154759n.setVisibility(4);
        this.f154759n.setAnimation(translateAnimation);
        this.f154764r.startAnimation(this.T);
        this.f154760o.startAnimation(this.T);
        this.f154765s.startAnimation(this.T);
        this.E.startAnimation(this.V);
        this.B.startAnimation(this.U);
        android.view.View view = this.E;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/pwdgroup/ui/FacingCreateChatRoomAllInOneUI", "switchToDetailUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/pwdgroup/ui/FacingCreateChatRoomAllInOneUI", "switchToDetailUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f154764r.setVisibility(8);
        this.f154765s.setVisibility(8);
        this.f154751J = true;
        this.f154768v = false;
        if (b4Var != null) {
            b4Var.c(0L, 0L);
        }
    }
}
