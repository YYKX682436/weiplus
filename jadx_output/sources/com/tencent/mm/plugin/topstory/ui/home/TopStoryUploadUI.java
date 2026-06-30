package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public class TopStoryUploadUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {
    public static final o11.g D;

    /* renamed from: d, reason: collision with root package name */
    public int f174915d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f174916e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f174917f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f174918g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f174919h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f174920i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f174921m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f174922n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f174923o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f174924p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f174925q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f174926r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f174927s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f174928t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f174929u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f174930v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f174931w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.SnsEditText f174932x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f174933y;

    /* renamed from: z, reason: collision with root package name */
    public long f174934z = 0;
    public boolean A = false;
    public com.tencent.mm.ui.widget.dialog.u3 B = null;
    public final com.tencent.mm.pluginsdk.ui.span.z C = new com.tencent.mm.plugin.topstory.ui.home.i2(this);

    static {
        o11.f fVar = new o11.f();
        fVar.f342078b = true;
        fVar.f342079c = true;
        fVar.f342096t = false;
        fVar.f342091o = com.tencent.mm.R.color.f479219t7;
        D = fVar.a();
    }

    public static void T6(com.tencent.mm.plugin.topstory.ui.home.TopStoryUploadUI topStoryUploadUI) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
        com.tencent.mm.ui.ga gaVar = topStoryUploadUI.mController;
        if (gaVar != null) {
            java.lang.String string = topStoryUploadUI.getResources().getString(com.tencent.mm.R.string.f489811ce);
            if (gaVar.G == null || (weImageView = gaVar.K) == null) {
                return;
            }
            weImageView.setContentDescription(string);
        }
    }

    public final void U6() {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17080, 3, 2, this.f174917f);
        if (this.f174932x.getText().toString().length() > 0) {
            db5.e1.l(this, com.tencent.mm.R.string.f493398k15, 0, com.tencent.mm.R.string.f490608zu, com.tencent.mm.R.string.f490503wx, true, new com.tencent.mm.plugin.topstory.ui.home.k2(this), new com.tencent.mm.plugin.topstory.ui.home.a2(this), com.tencent.mm.R.color.f478734fp);
        } else {
            V6(false);
        }
    }

    public final void V6(boolean z17) {
        if (z17) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_LAST_ENTER_TAB_REC_INT, 110);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_HAS_HAOKAN_RESULT_INT, 1);
            lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
            java.lang.String str = this.f174917f;
            ((kt.c) i0Var).getClass();
            com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(str);
            com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView.Resp resp = new com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView.Resp();
            resp.extMsg = "";
            resp.errStr = "";
            resp.openId = h17.field_openId;
            resp.errCode = 0;
            resp.businessType = this.f174916e;
            android.os.Bundle bundle = new android.os.Bundle();
            resp.toBundle(bundle);
            bundle.putString("_openbusinessview_app_name", h17.field_appName);
            bundle.putString("_openbusinessview_package_name", h17.field_packageName);
            o11.g gVar = wm4.u.f447309a;
            wm4.u.u(this, 54, bundle, "", new java.util.HashMap());
        } else {
            ((kt.s0) ((lt.r0) i95.n0.c(lt.r0.class))).Ai(this.f174916e, "", this.f174917f, 0, "");
        }
        finish();
        this.A = true;
    }

    public final void W6() {
        int length = this.f174932x.getText().toString().length();
        if (length <= 0) {
            this.f174932x.setHint(com.tencent.mm.R.string.f493397k14);
        } else {
            this.f174932x.setHint("");
        }
        if (length < 180) {
            this.f174928t.setVisibility(8);
            this.f174929u.setVisibility(8);
            return;
        }
        this.f174928t.setVisibility(0);
        this.f174929u.setVisibility(0);
        int color = length <= 200 ? getResources().getColor(com.tencent.mm.R.color.a9a) : getResources().getColor(com.tencent.mm.R.color.a2y);
        this.f174928t.setText("" + length);
        this.f174928t.setTextColor(color);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        U6();
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d29;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("micromsg.topstory.TopStoryUploadUI", "onCreate");
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.k19);
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490551ya), new com.tencent.mm.plugin.topstory.ui.home.j2(this), null, com.tencent.mm.ui.fb.YELLOW);
        setBackBtn(new com.tencent.mm.plugin.topstory.ui.home.b2(this));
        gm0.j1.d().a(2534, this);
        this.f174915d = getIntent().getIntExtra("KEY_TYPE", 0);
        this.f174916e = getIntent().getStringExtra("KEY_BIZTYPE");
        this.f174917f = getIntent().getStringExtra("KEY_APPID");
        this.f174920i = getIntent().getStringExtra("KEY_EXTINFO");
        this.f174918g = getIntent().getStringExtra("KEY_TITLE");
        getIntent().getStringExtra("KEY_DESC");
        this.f174919h = getIntent().getStringExtra("KEY_THUMBURL");
        this.f174921m = getIntent().getStringExtra("KEY_APPVERSION");
        this.f174922n = getIntent().getStringExtra("KEY_MEDIANAME");
        getIntent().getStringExtra("KEY_MEDIAHEADURL");
        com.tencent.mars.xlog.Log.i("micromsg.topstory.TopStoryUploadUI", "onCreate, thumbUrl:%s", this.f174919h);
        this.f174923o = findViewById(com.tencent.mm.R.id.ozb);
        this.f174926r = (android.widget.TextView) findViewById(com.tencent.mm.R.id.p0t);
        this.f174927s = (android.widget.TextView) findViewById(com.tencent.mm.R.id.oyj);
        this.f174932x = (com.tencent.mm.plugin.sns.ui.SnsEditText) findViewById(com.tencent.mm.R.id.c86);
        this.f174933y = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hzs);
        this.f174928t = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pnx);
        this.f174929u = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487743po0);
        this.f174924p = findViewById(com.tencent.mm.R.id.a1l);
        this.f174925q = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.a1k);
        this.f174930v = (android.widget.TextView) findViewById(com.tencent.mm.R.id.a1n);
        this.f174931w = (android.widget.TextView) findViewById(com.tencent.mm.R.id.a1i);
        com.tencent.mars.xlog.Log.i("micromsg.topstory.TopStoryUploadUI", "onProcessBitmap type = " + this.f174915d + "， isfile exist = " + com.tencent.mm.vfs.w6.j(this.f174919h));
        int i17 = this.f174915d;
        o11.g gVar = D;
        if (i17 == 1) {
            android.view.View view = this.f174923o;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/home/TopStoryUploadUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/home/TopStoryUploadUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f174924p;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/home/TopStoryUploadUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/home/TopStoryUploadUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f174926r.setText(this.f174918g);
            this.f174927s.setText(this.f174922n);
            n11.a.b().i(this.f174919h, this.f174925q, gVar, new com.tencent.mm.plugin.topstory.ui.home.d2(this));
        } else {
            android.view.View view3 = this.f174923o;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/topstory/ui/home/TopStoryUploadUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/topstory/ui/home/TopStoryUploadUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.f174924p;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/topstory/ui/home/TopStoryUploadUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/topstory/ui/home/TopStoryUploadUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f174930v.setText(this.f174918g);
            this.f174931w.setText(this.f174922n);
            n11.a.b().h(this.f174919h, this.f174925q, gVar);
        }
        this.f174933y.setText(java.lang.String.format("<a href='%s'>%s</a>", "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyi) + "/cgi-bin/recweb/clientjump?tag=colikefirstsight#wechat_redirect", getString(com.tencent.mm.R.string.k17)));
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).oj(this.f174933y, 1);
        ((ke0.e) ((le0.u) i95.n0.c(le0.u.class))).wi(this.C);
        W6();
        this.f174932x.addTextChangedListener(new com.tencent.mm.plugin.topstory.ui.home.e2(this));
        this.f174932x.setOnFocusChangeListener(new com.tencent.mm.plugin.topstory.ui.home.g2(this));
        this.mController.G.j().postDelayed(new com.tencent.mm.plugin.topstory.ui.home.h2(this), 150L);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17080, 6, 1, this.f174917f);
        if (com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).getBoolean("tophitory_show_init_dialog", false)) {
            return;
        }
        mf0.g0 g0Var = (mf0.g0) i95.n0.c(mf0.g0.class);
        com.tencent.mm.plugin.topstory.ui.home.c2 c2Var = new com.tencent.mm.plugin.topstory.ui.home.c2(this);
        boolean Ai = ((lf0.h0) g0Var).Ai();
        aw4.m0 m0Var = aw4.n0.f14901a;
        if (!Ai) {
            m0Var.e(this, c2Var, getResources().getString(com.tencent.mm.R.string.k1e));
        } else {
            m0Var.b(this, c2Var, getResources().getString(com.tencent.mm.R.string.f493405on5), getResources().getString(com.tencent.mm.R.string.f493404on4), true, "tophitory_show_init_dialog");
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("micromsg.topstory.TopStoryUploadUI", "onDestroy");
        super.onDestroy();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.B;
        if (u3Var != null) {
            u3Var.dismiss();
            this.B = null;
        }
        ((ke0.e) ((le0.u) i95.n0.c(le0.u.class))).Ni(this.C);
        gm0.j1.d().q(2534, this);
        if (this.A) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17080, 3, 2, this.f174917f);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.B;
        if (u3Var != null) {
            u3Var.dismiss();
            this.B = null;
        }
        if (i17 == 0 && i18 == 0) {
            if (m1Var instanceof sm4.g) {
                r45.ie ieVar = ((r45.q50) ((sm4.g) m1Var).f409941e.f70711b.f70700a).BaseResponse;
                if (ieVar.f376959d == 0) {
                    V6(true);
                    return;
                }
                r45.du5 du5Var = ieVar.f376960e;
                if (du5Var == null || com.tencent.mm.sdk.platformtools.t8.K0(du5Var.f372756d)) {
                    db5.e1.s(this, getString(com.tencent.mm.R.string.k18), getString(com.tencent.mm.R.string.f493399k16));
                } else {
                    db5.e1.s(this, ieVar.f376960e.f372756d, getString(com.tencent.mm.R.string.f493399k16));
                }
            }
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            db5.e1.s(this, getString(com.tencent.mm.R.string.k0_), getString(com.tencent.mm.R.string.f493399k16));
        } else {
            db5.e1.s(this, str, getString(com.tencent.mm.R.string.f493399k16));
        }
        jx3.f.INSTANCE.idkeyStat(1032L, 2L, 1L, false);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(m82.q.class);
    }
}
