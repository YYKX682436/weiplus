package com.tencent.mm.plugin.topstory.ui.video.fs;

/* loaded from: classes15.dex */
public class TopStoryFSVideoUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements fn4.b, pm4.s {
    public static long S;
    public static final /* synthetic */ int T = 0;
    public boolean A;
    public fn4.k0 F;
    public fn4.a1 G;
    public fn4.r0 H;
    public fn4.l1 I;

    /* renamed from: J, reason: collision with root package name */
    public fn4.z0 f175147J;
    public android.graphics.Point K;
    public int L;
    public androidx.recyclerview.widget.w1 M;
    public boolean N;
    public in4.q P;
    public boolean Q;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f175148d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f175149e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f175150f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f175151g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageButton f175152h;

    /* renamed from: i, reason: collision with root package name */
    public r45.un6 f175153i;

    /* renamed from: m, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f175154m;

    /* renamed from: n, reason: collision with root package name */
    public androidx.recyclerview.widget.LinearLayoutManager f175155n;

    /* renamed from: o, reason: collision with root package name */
    public gn4.c1 f175156o;

    /* renamed from: p, reason: collision with root package name */
    public gn4.x0 f175157p;

    /* renamed from: q, reason: collision with root package name */
    public android.app.ProgressDialog f175158q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f175159r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f175160s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f175161t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f175162u;

    /* renamed from: v, reason: collision with root package name */
    public in4.k f175163v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f175164w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog f175165x;

    /* renamed from: y, reason: collision with root package name */
    public xm4.a f175166y;

    /* renamed from: z, reason: collision with root package name */
    public an4.a f175167z;
    public final androidx.recyclerview.widget.w2 B = new gn4.f0(this);
    public int C = 0;
    public long D = -1;
    public final long E = -1;
    public final com.tencent.mm.modelbase.u0 R = new gn4.l0(this);

    @Override // fn4.b
    public void A4(int i17, java.lang.String str) {
        com.tencent.mm.sdk.platformtools.u3.h(new gn4.j0(this, str));
    }

    @Override // fn4.b
    public com.tencent.mm.ui.MMActivity B() {
        return this;
    }

    @Override // fn4.b
    public void B2() {
        W6();
    }

    @Override // fn4.b
    public void E3(java.lang.String str) {
        this.f175153i.f387519y = str;
    }

    @Override // fn4.b
    public void F2(android.view.View view, int i17) {
        if (this.I.d()) {
            this.I.h();
            this.N = true;
        }
        in4.q qVar = new in4.q(getContext(), this.f175147J.d(i17), new gn4.g0(this, view, i17));
        this.P = qVar;
        qVar.c(view, true, 0, 0);
        try {
            ((gn4.c0) this.I.f264574c.getControlBar()).z();
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // fn4.b
    public boolean H4() {
        return this.f175153i.f387506i != 326;
    }

    @Override // fn4.b
    public boolean H6() {
        return this.f175153i.f387506i != 36;
    }

    @Override // fn4.b
    public fn4.l1 I2() {
        return this.I;
    }

    @Override // fn4.b
    public void O1(java.util.List list, boolean z17) {
        this.f175156o.x(list, z17);
        com.tencent.mm.sdk.platformtools.u3.i(new gn4.i0(this), 50L);
    }

    @Override // fn4.b
    public fn4.r0 Q4() {
        return this.H;
    }

    @Override // fn4.b
    public void R2() {
        runOnUiThread(new gn4.m0(this));
    }

    @Override // fn4.b
    public void T2(int i17, r45.x56 x56Var) {
    }

    @Override // fn4.b
    public void U0(r45.xn6 xn6Var, android.view.View view) {
        if (xn6Var != null) {
            if (!com.tencent.mars.comm.NetStatusUtil.isConnected(this)) {
                dp.a.makeText(getContext(), getString(com.tencent.mm.R.string.k0_), 0).show();
                return;
            }
            java.lang.String str = xn6Var.G;
            int i17 = xn6Var.R ? 5 : 4;
            java.lang.String str2 = "" + java.lang.System.currentTimeMillis();
            r45.un6 un6Var = this.f175153i;
            gm0.j1.d().g(new sm4.j(xn6Var, str, i17, str2, un6Var.f387506i, un6Var.f387507m, p6() ? qf1.f.CTRL_INDEX : qf1.j.CTRL_INDEX, xn6Var.f390259h, xn6Var.S, 1));
            boolean z17 = !xn6Var.R;
            xn6Var.R = z17;
            if (z17) {
                xn6Var.X++;
            } else {
                xn6Var.X--;
            }
            ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.poh)).setText(wm4.u.p(xn6Var.X));
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryFSVideoUI", "onWowBtnClick thumb:" + xn6Var.R);
        }
    }

    public final void U6() {
        android.view.View view = this.f175160s;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "fetchFirstPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "fetchFirstPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f175159r;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "fetchFirstPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "fetchFirstPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f175147J.p(0);
    }

    public final int V6() {
        return ((android.media.AudioManager) getContext().getSystemService("audio")).getStreamVolume(3);
    }

    public final void W6() {
        getWindow().setFlags(201327616, 201327616);
        android.view.View decorView = getWindow().getDecorView();
        if (fp.h.a(19)) {
            decorView.setSystemUiVisibility(2);
        } else {
            decorView.setSystemUiVisibility(4102);
        }
        getWindow().addFlags(128);
    }

    @Override // fn4.b
    public void X1(int i17) {
        this.f175153i.f387516v = i17;
    }

    public void X6(r45.xn6 xn6Var, android.view.View view, boolean z17) {
        in4.k kVar;
        java.lang.String str;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryFSVideoUI", "onLikeSceneEnd vid:%s, thumb:%s", xn6Var.f390259h, java.lang.Boolean.valueOf(z17));
        if (!z17) {
            if (this.f175162u.getVisibility() != 0 || (kVar = this.f175163v) == null || (str = kVar.f292978f) == null || !str.equals(xn6Var.f390259h)) {
                return;
            }
            android.view.View view2 = this.f175162u;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "onLikeSceneEnd", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "onLikeSceneEnd", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.lang.String str2 = "" + java.lang.System.currentTimeMillis();
        java.lang.String str3 = xn6Var.G;
        java.lang.String str4 = xn6Var.f390255d;
        r45.un6 un6Var = this.f175153i;
        sm4.f fVar = new sm4.f(str2, str3, "", "", "", "", str4, un6Var.f387507m, un6Var.f387506i, p6() ? qf1.f.CTRL_INDEX : qf1.j.CTRL_INDEX, xn6Var.f390259h, xn6Var.S, 1);
        android.view.View view3 = this.f175162u;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "onLikeSceneEnd", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "onLikeSceneEnd", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f175163v = new in4.k(this, this.f175164w, new gn4.o0(this, xn6Var), fVar, xn6Var.f390259h);
        this.f175162u.postDelayed(new gn4.p0(this), 2000L);
        this.f175163v.a(view, true, 0, 0);
    }

    @Override // fn4.b
    public int Y2() {
        return this.f175153i.f387516v;
    }

    public final void Y6() {
        if (this.f175153i.f387518x) {
            this.f175150f.setBackgroundResource(com.tencent.mm.R.raw.top_story_volume_off);
        } else {
            this.f175150f.setBackgroundResource(com.tencent.mm.R.raw.top_story_volume_on);
        }
        fn4.l1 l1Var = this.I;
        if (l1Var.f264576e) {
            l1Var.l(this.f175153i.f387518x);
        }
    }

    @Override // fn4.b
    public void a2(r45.xn6 xn6Var) {
        an4.a aVar = this.f175167z;
        if (aVar != null) {
            aVar.c0(this.f175153i, xn6Var);
        }
        xm4.a aVar2 = this.f175166y;
        if (aVar2 != null) {
            aVar2.u0(this.f175153i, xn6Var);
        }
    }

    @Override // fn4.b
    public int b1() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_topstory_v_video_play, 0);
    }

    @Override // fn4.b
    public androidx.recyclerview.widget.w1 d2() {
        return this.M;
    }

    @Override // fn4.b
    public void g1(r45.xn6 xn6Var, fn4.g gVar, int i17, int i18) {
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return p6() ? 1 : 0;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d1r;
    }

    @Override // fn4.b
    public androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        return this.f175154m;
    }

    @Override // fn4.b
    public int getVideoHeight() {
        if (this.L == 0) {
            if (p6()) {
                this.L = 1280;
                int i17 = (y4().y * 3) / 5;
                if (this.L > i17) {
                    this.L = i17;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryFSVideoUI", "getVideoHeight %d maxVideoHeight %d", java.lang.Integer.valueOf(this.L), java.lang.Integer.valueOf(i17));
            } else {
                this.L = (getVideoWidth() * 280) / com.tencent.mm.plugin.appbrand.jsapi.storage.e0.CTRL_INDEX;
            }
        }
        return this.L;
    }

    @Override // fn4.b
    public int getVideoWidth() {
        return java.lang.Math.min(y4().x, y4().y);
    }

    @Override // fn4.b
    public boolean h1() {
        return false;
    }

    @Override // fn4.b
    public int h3() {
        return this.f175153i.f387520z;
    }

    @Override // fn4.b
    public boolean isMute() {
        return this.f175153i.f387518x;
    }

    @Override // fn4.b
    public void k4(int i17) {
        this.f175153i.f387520z = i17;
    }

    @Override // fn4.b
    public int l4() {
        return 0;
    }

    @Override // fn4.b
    public void m() {
        this.f175148d.animate().alpha(0.0f).setDuration(200L).setStartDelay(1800L);
        android.view.View view = this.f175162u;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "onEnterImmersionModel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "onEnterImmersionModel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // fn4.b
    public fn4.a1 o4() {
        return this.G;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        fn4.m a17;
        fn4.b1.f264481b.b(this, i17, i18, intent);
        if (i17 == 10001) {
            if (((this.F.f264569c == 1) || su4.r2.k()) && (a17 = fn4.d.a(this)) != null) {
                a17.s(false);
            }
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            customfixStatusbar(true);
        }
        super.onCreate(bundle);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_context");
        r45.un6 un6Var = new r45.un6();
        this.f175153i = un6Var;
        try {
            un6Var.parseFrom(byteArrayExtra);
        } catch (java.lang.Exception unused) {
            finish();
        }
        fn4.z0 z0Var = new fn4.z0();
        this.f175147J = z0Var;
        z0Var.f264631a = this;
        fn4.r0 r0Var = new fn4.r0();
        this.H = r0Var;
        r0Var.c(this);
        fn4.a1 a1Var = new fn4.a1();
        this.G = a1Var;
        a1Var.f264476c++;
        a1Var.f264475b = this;
        fn4.l1 l1Var = new fn4.l1();
        this.I = l1Var;
        l1Var.f264572a++;
        l1Var.f264581j = this;
        this.F = new fn4.k0();
        this.f175157p = new gn4.x0();
        r45.xn6 xn6Var = this.f175153i.f387509o;
        if (xn6Var != null) {
            fn4.z0 z0Var2 = this.f175147J;
            synchronized (z0Var2) {
                ((java.util.LinkedList) z0Var2.b()).add(xn6Var);
            }
        }
        xm4.a aVar = new xm4.a(new xm4.b(this));
        this.f175166y = aVar;
        aVar.b(8, this.f175153i.f387512r);
        this.f175166y.Z(getResources().getString(com.tencent.mm.R.string.k07));
        an4.a aVar2 = new an4.a(new an4.b(this));
        this.f175167z = aVar2;
        aVar2.y(8, this.f175153i.f387512r);
        this.f175167z.L(getResources().getString(com.tencent.mm.R.string.k07));
        if (getSupportActionBar() != null) {
            getSupportActionBar().w(new android.graphics.drawable.ColorDrawable(0));
            getSupportActionBar().o();
        }
        if (this.f175153i.f387514t) {
            this.F.f264567a = true;
        }
        W6();
        this.f175148d = findViewById(com.tencent.mm.R.id.f487336oc0);
        this.f175149e = findViewById(com.tencent.mm.R.id.k0z);
        this.f175151g = findViewById(com.tencent.mm.R.id.jqy);
        this.f175150f = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f486061k11);
        android.widget.ImageButton imageButton = (android.widget.ImageButton) findViewById(com.tencent.mm.R.id.aa8);
        this.f175152h = imageButton;
        imageButton.getDrawable().setColorFilter(getResources().getColor(com.tencent.mm.R.color.f478553an), android.graphics.PorterDuff.Mode.SRC_ATOP);
        this.f175152h.setOnClickListener(new gn4.q0(this));
        this.f175149e.setOnClickListener(new gn4.r0(this));
        android.view.View view = this.f175149e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f175161t = findViewById(com.tencent.mm.R.id.gfi);
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.f487560p03);
        this.f175154m = recyclerView;
        recyclerView.i(this.B);
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(this);
        this.f175155n = linearLayoutManager;
        this.f175154m.setLayoutManager(linearLayoutManager);
        this.M = new androidx.recyclerview.widget.v1(this.f175155n);
        gn4.c1 c1Var = new gn4.c1(this);
        this.f175156o = c1Var;
        android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.f489587d24, (android.view.ViewGroup) null);
        inflate.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        this.f175160s = inflate.findViewById(com.tencent.mm.R.id.gbx);
        this.f175159r = inflate.findViewById(com.tencent.mm.R.id.f485041gc1);
        x.o oVar = c1Var.f264490e;
        oVar.g(oVar.h() + 200000, inflate);
        this.f175154m.setAdapter(this.f175156o);
        new gn4.c().b(this.f175154m);
        r45.un6 un6Var2 = this.f175153i;
        if (!((un6Var2.f387506i == 36 || un6Var2.A) ? false : true)) {
            android.view.View view2 = this.f175160s;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f175159r;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(4);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (this.F.b()) {
            U6();
            this.A = false;
            r45.un6 un6Var3 = this.f175153i;
            if (un6Var3.f387506i != 21 && un6Var3.f387510p == null) {
                this.f175158q = db5.e1.Q(this, "", getString(com.tencent.mm.R.string.ggc), true, true, new gn4.s0(this));
            }
        } else {
            dp.a.makeText(this, com.tencent.mm.R.string.hsk, 1).show();
            this.A = true;
        }
        this.f175156o.f273602i = true;
        android.view.View view4 = this.f175161t;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if ((this.F.f264569c == 2) && su4.r2.k() && java.lang.System.currentTimeMillis() - S > 86400000) {
            dp.a.makeText(this, com.tencent.mm.R.string.k0d, 0).show();
            S = java.lang.System.currentTimeMillis();
        }
        this.f175162u = findViewById(com.tencent.mm.R.id.czk);
        this.f175164w = findViewById(com.tencent.mm.R.id.czl);
        android.view.View view5 = this.f175162u;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f175162u.setOnTouchListener(new gn4.t0(this));
        com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog topStoryCommentFloatDialog = (com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog) findViewById(com.tencent.mm.R.id.f483840c72);
        this.f175165x = topStoryCommentFloatDialog;
        topStoryCommentFloatDialog.setVisibility(8);
        this.f175165x.d(this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new gn4.u0(this));
        if (p6()) {
            this.f175152h.setImageResource(com.tencent.mm.R.raw.top_story_close_icon);
            if (com.tencent.mm.ui.bk.u(this, false)) {
                int p17 = com.tencent.mm.ui.bk.p(this);
                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f175148d.getLayoutParams();
                layoutParams.topMargin = p17 + i65.a.b(this, 12);
                this.f175148d.setLayoutParams(layoutParams);
            }
        }
        this.f175151g.setOnClickListener(new gn4.v0(this));
        gm0.j1.d().a(2802, this.R);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        pm4.y.g(this.f175153i, getActivityBrowseTimeMs(), this.f175147J.d(this.f175153i.f387516v));
        gm0.j1.d().q(2802, this.R);
        this.f175147J.i();
        ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).Ai().getClass();
        this.I.f();
        fn4.k0 k0Var = this.F;
        k0Var.getClass();
        gm0.j1.n().d(k0Var.f264570d);
        k0Var.f264568b = null;
        k0Var.f264569c = 0;
        k0Var.f264567a = false;
        this.G.b();
        this.H.d();
        this.f175165x.f175260h.d();
        uu4.a.a(16);
        xm4.a aVar = this.f175166y;
        if (aVar != null) {
            aVar.o0();
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4 && this.f175165x.getVisibility() == 0) {
            this.f175165x.b();
            return true;
        }
        if (i17 == 25 && keyEvent.getAction() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryFSVideoUI", "onKeyDown KEYCODE_VOLUME_DOWN %d", java.lang.Integer.valueOf(V6()));
            this.f175153i.f387518x = V6() <= 1;
            Y6();
        } else if (i17 == 24 && keyEvent.getAction() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryFSVideoUI", "onKeyDown KEYCODE_VOLUME_UP %d", java.lang.Integer.valueOf(V6()));
            this.f175153i.f387518x = false;
            Y6();
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        fn4.c1 c1Var = this.I.f264573b;
        if (c1Var != null) {
            c1Var.e();
        }
        ((pm4.r) i95.n0.c(pm4.r.class)).getClass();
        com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog topStoryCommentFloatDialog = this.f175165x;
        topStoryCommentFloatDialog.f175260h.f210400e = null;
        gm0.j1.d().q(2906, topStoryCommentFloatDialog);
        uu4.a.a(15);
        an4.a aVar = this.f175167z;
        if (aVar != null) {
            aVar.A();
        }
        xm4.a aVar2 = this.f175166y;
        if (aVar2 != null) {
            aVar2.z();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        W6();
        Y6();
        ((pm4.r) i95.n0.c(pm4.r.class)).getClass();
        fn4.l1 l1Var = this.I;
        fn4.c1 c1Var = l1Var.f264573b;
        if (c1Var != null) {
            c1Var.g();
            fn4.g gVar = l1Var.f264574c;
            if (gVar != null) {
                gVar.c();
            }
        }
        fn4.k0 k0Var = this.F;
        k0Var.f264569c = k0Var.a();
        com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog topStoryCommentFloatDialog = this.f175165x;
        topStoryCommentFloatDialog.f175260h.f210400e = topStoryCommentFloatDialog;
        gm0.j1.d().a(2906, topStoryCommentFloatDialog);
        uu4.a.a(14);
        an4.a aVar = this.f175167z;
        if (aVar != null) {
            aVar.z();
        }
        xm4.a aVar2 = this.f175166y;
        if (aVar2 != null) {
            aVar2.x();
        }
    }

    @Override // fn4.b
    public boolean p6() {
        return this.f175153i.f387505h == 100203;
    }

    @Override // fn4.b
    public r45.un6 r0() {
        return this.f175153i;
    }

    @Override // fn4.b
    public fn4.k0 s1() {
        return this.F;
    }

    @Override // fn4.b
    public fn4.z0 s4() {
        return this.f175147J;
    }

    @Override // fn4.b
    public void t() {
        this.f175148d.animate().cancel();
        android.view.View view = this.f175148d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "onExitImmersionModel", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "onExitImmersionModel", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // fn4.b
    public fn4.e t0() {
        return this.f175156o;
    }

    @Override // fn4.b
    public boolean t1(int i17) {
        android.view.View view = this.f175162u;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "tryToPlayPositionVideo", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "tryToPlayPositionVideo", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryFSVideoUI", "tryToPlayPositionVideo %d", java.lang.Integer.valueOf(i17));
        try {
            if (i17 >= (this.f175156o.getItemCount() - this.f175156o.y()) - this.f175156o.z()) {
                return false;
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f175154m;
            int z17 = i17 + this.f175156o.z();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(z17));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(recyclerView, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "tryToPlayPositionVideo", "(I)Z", "Undefined", "smoothScrollToPosition", "(I)V");
            recyclerView.c1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI", "tryToPlayPositionVideo", "(I)Z", "Undefined", "smoothScrollToPosition", "(I)V");
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TopStory.TopStoryFSVideoUI", "tryToPlayPositionVideo Exception:%s", e17.getMessage());
            return false;
        }
    }

    @Override // fn4.b
    public java.lang.String t3() {
        java.lang.String str = this.f175153i.f387519y;
        return str == null ? "" : str;
    }

    @Override // fn4.b
    public androidx.recyclerview.widget.RecyclerView.LayoutManager u6() {
        return this.f175155n;
    }

    @Override // fn4.b
    public void v6(r45.xn6 xn6Var, fn4.g gVar, int i17, int i18) {
    }

    @Override // fn4.b
    public android.graphics.Point y4() {
        if (this.K == null) {
            this.K = com.tencent.mm.ui.bk.h(this);
        }
        return this.K;
    }

    @Override // pm4.s
    public void z3(int i17, int i18) {
        if ((i18 == 2 || i18 == 1) && this.A) {
            U6();
        }
        this.I.e(i17, i18);
    }

    @Override // fn4.b
    public java.lang.String z4() {
        return pm4.w.j(this.f175153i.f387512r);
    }
}
