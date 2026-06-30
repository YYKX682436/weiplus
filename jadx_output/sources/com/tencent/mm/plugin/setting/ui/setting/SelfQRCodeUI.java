package com.tencent.mm.plugin.setting.ui.setting;

@gm0.a2
/* loaded from: classes5.dex */
public class SelfQRCodeUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements com.tencent.mm.modelbase.u0 {
    public static final java.lang.String C = fp.m.b().toString() + "/Pictures/Screenshots/";

    /* renamed from: p, reason: collision with root package name */
    public android.widget.LinearLayout f160184p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.LinearLayout f160185q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f160186r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f160187s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ImageView f160188t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.ImageView f160189u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.ImageView f160190v;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.setting.ui.setting.x2 f160192x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.List f160193y;

    /* renamed from: d, reason: collision with root package name */
    public android.app.ProgressDialog f160175d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f160176e = null;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f160177f = null;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f160178g = null;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f160179h = null;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f160180i = "";

    /* renamed from: m, reason: collision with root package name */
    public boolean f160181m = false;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f160182n = null;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Bitmap f160183o = null;

    /* renamed from: w, reason: collision with root package name */
    public boolean f160191w = false;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.Set f160194z = new java.util.HashSet();
    public final com.tencent.mm.sdk.platformtools.b4 A = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.setting.ui.setting.q2(this), true);
    public final l75.q0 B = new com.tencent.mm.plugin.setting.ui.setting.r2(this);

    public static void U6(com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI selfQRCodeUI) {
        db5.e1.K(selfQRCodeUI, true, selfQRCodeUI.getString(com.tencent.mm.R.string.i2g), selfQRCodeUI.getString(com.tencent.mm.R.string.i2h), selfQRCodeUI.getString(com.tencent.mm.R.string.i2i), selfQRCodeUI.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.setting.ui.setting.h2(selfQRCodeUI), null);
    }

    public final void V6(int i17) {
        com.tencent.mm.modelbase.m1 m1Var;
        int q17 = this.f160181m ? com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) gm0.j1.u().c().l(66561, null)) : 0;
        if (com.tencent.mm.storage.z3.q4(this.f160180i)) {
            ab0.y yVar = (ab0.y) i95.n0.c(ab0.y.class);
            java.lang.String str = this.f160180i;
            ((za0.i) yVar).getClass();
            m1Var = new l41.w(str);
            gm0.j1.d().g(m1Var);
        } else {
            kd0.x2 x2Var = (kd0.x2) i95.n0.c(kd0.x2.class);
            java.lang.String str2 = this.f160180i;
            ((jd0.q2) x2Var).getClass();
            g21.a aVar = new g21.a(str2, q17, i17);
            gm0.j1.d().g(aVar);
            m1Var = aVar;
        }
        this.f160175d = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f492967ih3), true, true, new com.tencent.mm.plugin.setting.ui.setting.e2(this, m1Var));
    }

    public final void W6(int i17, int i18, java.lang.String str, com.tencent.mm.plugin.setting.ui.setting.w2 w2Var) {
        o25.s1 a17 = f14.g.a();
        androidx.appcompat.app.AppCompatActivity context = getContext();
        ((com.tencent.mm.app.o7) a17).getClass();
        if (com.tencent.mm.ui.pc.a(context, i17, i18, str, 7)) {
            return;
        }
        if (i17 != 0 || i18 != 0) {
            dp.a.makeText(this, getString(com.tencent.mm.R.string.fds, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
            return;
        }
        byte[] b17 = w2Var.b();
        this.f160182n = b17;
        this.f160183o = com.tencent.mm.sdk.platformtools.x.G(b17);
        if (!com.tencent.mm.storage.z3.R4(this.f160180i)) {
            rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
            java.lang.String str2 = this.f160180i;
            ((qv.o) u2Var).getClass();
            if (!r01.z.j(str2)) {
                if (this.f160181m) {
                    java.lang.String c17 = w2Var.c();
                    android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487327oa4);
                    android.view.View view = (android.view.View) textView.getParent();
                    if (com.tencent.mm.sdk.platformtools.t8.K0(c17)) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI$GetQRCodeLambda;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI$GetQRCodeLambda;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        textView.setText(c17);
                        view.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.l2(this));
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI$GetQRCodeLambda;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI$GetQRCodeLambda;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                this.f160176e.setImageBitmap(this.f160183o);
            }
        }
        enableOptionMenu(true);
        java.lang.String a18 = w2Var.a();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(a18)) {
            ((android.widget.TextView) findViewById(com.tencent.mm.R.id.lfl)).setText(a18);
        }
        this.f160176e.setImageBitmap(this.f160183o);
    }

    public final void X6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SelfQRCodeNewUI", "updateNewFriendData, selfCode = %s", java.lang.Boolean.valueOf(this.f160191w));
        if (this.f160191w) {
            xg3.y Ri = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ri();
            if (Ri instanceof com.tencent.mm.storage.o7) {
                com.tencent.mm.storage.o7 o7Var = (com.tencent.mm.storage.o7) Ri;
                try {
                    int b17 = o7Var.b1();
                    com.tencent.mars.xlog.Log.i("MicroMsg.SelfQRCodeNewUI", "initView, newCount = %s", java.lang.Integer.valueOf(b17));
                    if (b17 > 0) {
                        this.f160185q.setVisibility(0);
                        android.view.View view = this.f160186r;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI", "updateNewFriendData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI", "updateNewFriendData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        this.f160184p.setBackground(getResources().getDrawable(com.tencent.mm.R.drawable.azc));
                        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.setting.ui.setting.k2(this, 2L));
                        this.f160187s.setText(getString(com.tencent.mm.R.string.f492968ih4, java.lang.Integer.valueOf(b17)));
                        this.f160185q.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.s2(this));
                        java.util.List d17 = o7Var.d1(3);
                        this.f160193y = d17;
                        if (((java.util.ArrayList) d17).size() >= 3) {
                            Y6((com.tencent.mm.storage.m7) ((java.util.ArrayList) this.f160193y).get(2), (com.tencent.mm.storage.m7) ((java.util.ArrayList) this.f160193y).get(1), (com.tencent.mm.storage.m7) ((java.util.ArrayList) this.f160193y).get(0));
                        } else if (((java.util.ArrayList) this.f160193y).size() >= 2) {
                            Y6((com.tencent.mm.storage.m7) ((java.util.ArrayList) this.f160193y).get(1), (com.tencent.mm.storage.m7) ((java.util.ArrayList) this.f160193y).get(0), null);
                        } else if (((java.util.ArrayList) this.f160193y).size() >= 1) {
                            Y6((com.tencent.mm.storage.m7) ((java.util.ArrayList) this.f160193y).get(0), null, null);
                        } else {
                            Y6(null, null, null);
                        }
                    } else {
                        this.f160185q.setVisibility(4);
                        android.view.View view2 = this.f160186r;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList2.add(4);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI", "updateNewFriendData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI", "updateNewFriendData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        this.f160184p.setBackground(getResources().getDrawable(com.tencent.mm.R.drawable.az8));
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SelfQRCodeNewUI", "updateNewFriendData, e = %s", e17);
                }
            }
        }
    }

    public final void Y6(com.tencent.mm.storage.m7 m7Var, com.tencent.mm.storage.m7 m7Var2, com.tencent.mm.storage.m7 m7Var3) {
        java.util.Set set = this.f160194z;
        if (m7Var != null) {
            this.f160188t.setVisibility(0);
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.f160188t, m7Var.field_talker, null);
            ((java.util.HashSet) set).add(m7Var.field_talker);
        } else {
            this.f160188t.setVisibility(8);
        }
        if (m7Var2 != null) {
            this.f160189u.setVisibility(0);
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.f160189u, m7Var2.field_talker, null);
            ((java.util.HashSet) set).add(m7Var2.field_talker);
        } else {
            this.f160189u.setVisibility(8);
        }
        if (m7Var3 == null) {
            this.f160190v.setVisibility(8);
            return;
        }
        this.f160190v.setVisibility(0);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.f160190v, m7Var3.field_talker, null);
        ((java.util.HashSet) set).add(m7Var3.field_talker);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ckc;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        java.lang.String stringExtra = getIntent().getStringExtra("from_userName");
        this.f160180i = stringExtra;
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            this.f160180i = c01.z1.r();
        }
        if (c01.z1.r().equals(this.f160180i)) {
            this.f160181m = true;
        }
        java.lang.String str = "";
        if (com.tencent.mm.storage.z3.R4(this.f160180i)) {
            setMMTitle(com.tencent.mm.R.string.ixw);
            ((android.widget.TextView) findViewById(com.tencent.mm.R.id.lfl)).setText("");
            enableOptionMenu(false);
        } else {
            rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
            java.lang.String str2 = this.f160180i;
            ((qv.o) u2Var).getClass();
            if (r01.z.j(str2)) {
                setMMTitle(com.tencent.mm.R.string.c1i);
                ((android.widget.TextView) findViewById(com.tencent.mm.R.id.lfl)).setText(com.tencent.mm.R.string.c1j);
                enableOptionMenu(false);
            } else {
                setMMTitle(com.tencent.mm.R.string.ix7);
                this.f160191w = true;
            }
        }
        this.f160185q = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.mkx);
        this.f160186r = findViewById(com.tencent.mm.R.id.mky);
        this.f160187s = (android.widget.TextView) findViewById(com.tencent.mm.R.id.o_9);
        this.f160188t = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.mkz);
        this.f160189u = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f486831ml0);
        this.f160190v = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f486832ml1);
        this.f160184p = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.lew);
        this.f160176e = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f486841ml4);
        this.f160177f = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.gyk);
        this.f160178g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kb_);
        this.f160179h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.d0r);
        this.f160184p.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.plugin.setting.ui.setting.n2(this));
        if (!com.tencent.mm.storage.z3.R4(this.f160180i)) {
            rv.u2 u2Var2 = (rv.u2) i95.n0.c(rv.u2.class);
            java.lang.String str3 = this.f160180i;
            ((qv.o) u2Var2).getClass();
            if (!r01.z.j(str3)) {
                java.lang.String str4 = (java.lang.String) gm0.j1.u().c().l(42, null);
                java.lang.String string = getString(com.tencent.mm.R.string.f490420uh);
                if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                    java.lang.String str5 = (java.lang.String) gm0.j1.u().c().l(2, null);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(string);
                    sb6.append(str5);
                    com.tencent.mm.storage.z3.y3(str5);
                } else {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append(string);
                    sb7.append(str4);
                }
                android.graphics.Bitmap bitmap = this.f160183o;
                if (bitmap == null) {
                    V6(1);
                } else {
                    this.f160176e.setImageBitmap(bitmap);
                }
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.f160177f, c01.z1.r(), null);
                this.f160178g.setText(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(this, (java.lang.String) gm0.j1.u().c().l(4, null), i65.a.h(getContext(), com.tencent.mm.R.dimen.f479853h2)));
                c01.fb a17 = c01.fb.a();
                java.lang.String d17 = a17.d();
                if (d17 == null) {
                    d17 = "";
                }
                java.lang.String c17 = a17.c();
                if (c17 == null) {
                    c17 = "";
                }
                this.f160179h.setText(((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).Di(d17) + " " + c17);
                int j17 = com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) gm0.j1.u().c().l(12290, null), 0);
                if (j17 == 1) {
                    this.f160178g.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, i65.a.i(this, com.tencent.mm.R.raw.ic_sex_male), (android.graphics.drawable.Drawable) null);
                    str = getResources().getString(com.tencent.mm.R.string.j1n);
                } else if (j17 == 2) {
                    this.f160178g.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, i65.a.i(this, com.tencent.mm.R.raw.ic_sex_female), (android.graphics.drawable.Drawable) null);
                    str = getResources().getString(com.tencent.mm.R.string.j1m);
                }
                androidx.appcompat.app.AppCompatActivity activity = getContext();
                kotlin.jvm.internal.o.g(activity, "activity");
                ((n14.a) pf5.z.f353948a.a(activity).a(n14.a.class)).setValue("sex_key", str);
                addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.setting.ui.setting.o2(this));
                setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.p2(this));
            }
        }
        V6(1);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.f160177f, this.f160180i, null);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f160180i, true);
        this.f160178g.setSingleLine(false);
        this.f160178g.setMaxLines(3);
        if (c01.e2.R(this.f160180i)) {
            this.f160178g.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, getResources().getDrawable(com.tencent.mm.R.raw.open_im_main_logo), (android.graphics.drawable.Drawable) null);
        } else {
            this.f160178g.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        }
        if (n17 != null) {
            java.lang.String P0 = n17.P0();
            if (com.tencent.mm.sdk.platformtools.t8.K0(P0)) {
                P0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().W0(this.f160180i).field_displayname;
            }
            android.widget.TextView textView = this.f160178g;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            float textSize = this.f160178g.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, P0, textSize));
        } else {
            this.f160178g.setVisibility(8);
        }
        this.f160179h.setVisibility(8);
        addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.setting.ui.setting.o2(this));
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.p2(this));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public boolean isLayoutInDecorView() {
        return true;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        hideActionbarLine();
        com.tencent.mm.plugin.setting.ui.setting.x2 x2Var = new com.tencent.mm.plugin.setting.ui.setting.x2(this, this);
        this.f160192x = x2Var;
        x2Var.startWatching();
        gm0.j1.d().a(be1.r0.CTRL_INDEX, this);
        gm0.j1.d().a(uc1.o1.CTRL_INDEX, this);
        initView();
        this.f160176e.post(new com.tencent.mm.plugin.setting.ui.setting.m2(this));
        r45.t54 t54Var = (r45.t54) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ni(this, 1, 3, r45.t54.class);
        if (t54Var != null && "launch_type_my_qrcode".equals(t54Var.f386157d)) {
            com.tencent.mm.autogen.mmdata.rpt.WC3DTouchHomeShortCutStruct wC3DTouchHomeShortCutStruct = new com.tencent.mm.autogen.mmdata.rpt.WC3DTouchHomeShortCutStruct();
            wC3DTouchHomeShortCutStruct.f62064d = 3L;
            wC3DTouchHomeShortCutStruct.f62065e = 1L;
            wC3DTouchHomeShortCutStruct.k();
            wC3DTouchHomeShortCutStruct.o();
        }
        if (this.f160191w) {
            xg3.y Ri = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ri();
            if (Ri instanceof com.tencent.mm.storage.o7) {
                ((com.tencent.mm.storage.o7) Ri).add(this.B);
            }
            X6();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(be1.r0.CTRL_INDEX, this);
        gm0.j1.d().q(uc1.o1.CTRL_INDEX, this);
        com.tencent.mm.plugin.setting.ui.setting.x2 x2Var = this.f160192x;
        if (x2Var != null) {
            x2Var.stopWatching();
        }
        android.graphics.Bitmap bitmap = this.f160183o;
        if (bitmap != null && !bitmap.isRecycled()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SelfQRCodeNewUI", "bitmap recycle %s", this.f160183o.toString());
            this.f160183o.recycle();
        }
        if (this.f160191w) {
            java.util.List list = this.f160193y;
            if (list != null && !((java.util.ArrayList) list).isEmpty()) {
                xg3.y Ri = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ri();
                if (!(Ri instanceof com.tencent.mm.storage.o7)) {
                    return;
                }
                com.tencent.mm.storage.o7 o7Var = (com.tencent.mm.storage.o7) Ri;
                java.util.Iterator it = ((java.util.HashSet) this.f160194z).iterator();
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SelfQRCodeNewUI", "onDestroy, unsetNew item.field_talker = %s,", str);
                        o7Var.f1(str);
                    }
                }
            }
            gm0.j1.i();
            if (gm0.j1.a()) {
                xg3.y Ri2 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ri();
                if (Ri2 instanceof com.tencent.mm.storage.o7) {
                    ((com.tencent.mm.storage.o7) Ri2).remove(this.B);
                }
            }
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (com.tencent.mm.storage.z3.R4(this.f160180i)) {
            return;
        }
        rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
        java.lang.String str = this.f160180i;
        ((qv.o) u2Var).getClass();
        if (r01.z.j(str)) {
            return;
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.ml7);
        if ((c01.z1.j() & 2) == 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI", "checkHideQRCode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI", "checkHideQRCode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f160176e.setAlpha(1.0f);
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI", "checkHideQRCode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI", "checkHideQRCode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f160176e.setAlpha(0.1f);
        findViewById(com.tencent.mm.R.id.ml6).setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.t2(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SelfQRCodeNewUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        android.app.ProgressDialog progressDialog = this.f160175d;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f160175d = null;
        }
        if (m1Var instanceof kd0.j2) {
            W6(i17, i18, str, new com.tencent.mm.plugin.setting.ui.setting.i2(this, (kd0.j2) m1Var));
        } else if (m1Var instanceof ab0.t) {
            r45.ak3 ak3Var = (r45.ak3) ((com.tencent.mm.modelbase.o) m1Var.getReqResp()).f70711b.f70700a;
            W6(i17, i18, str, new com.tencent.mm.plugin.setting.ui.setting.j2(this, ak3Var.f370065d.f192156a, ak3Var.f370066e));
        }
    }

    @Override // com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(n14.a.class);
    }
}
