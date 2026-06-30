package com.tencent.mm.plugin.topstory.ui.video;

/* loaded from: classes15.dex */
public abstract class TopStoryBaseVideoUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements fn4.b, pm4.s {
    public static final /* synthetic */ int X = 0;
    public fn4.k0 G;
    public fn4.a1 H;
    public fn4.r0 I;

    /* renamed from: J, reason: collision with root package name */
    public fn4.l1 f175126J;
    public fn4.z0 K;
    public boolean L;
    public in4.q M;
    public boolean N;
    public in4.h P;
    public android.graphics.Point Q;
    public int R;
    public androidx.recyclerview.widget.w1 S;
    public androidx.recyclerview.widget.w1 T;
    public boolean U;
    public sm4.j V;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f175127d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f175128e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f175129f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f175130g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f175131h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f175132i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageButton f175133m;

    /* renamed from: n, reason: collision with root package name */
    public fn4.c0 f175134n;

    /* renamed from: o, reason: collision with root package name */
    public r45.un6 f175135o;

    /* renamed from: p, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f175136p;

    /* renamed from: q, reason: collision with root package name */
    public androidx.recyclerview.widget.LinearLayoutManager f175137q;

    /* renamed from: r, reason: collision with root package name */
    public fn4.e f175138r;

    /* renamed from: s, reason: collision with root package name */
    public fn4.d f175139s;

    /* renamed from: t, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f175140t;

    /* renamed from: u, reason: collision with root package name */
    public androidx.recyclerview.widget.LinearLayoutManager f175141u;

    /* renamed from: v, reason: collision with root package name */
    public fn4.e f175142v;

    /* renamed from: w, reason: collision with root package name */
    public fn4.d f175143w;

    /* renamed from: x, reason: collision with root package name */
    public an4.a f175144x;

    /* renamed from: y, reason: collision with root package name */
    public xm4.a f175145y;

    /* renamed from: z, reason: collision with root package name */
    public final androidx.recyclerview.widget.w2 f175146z = new fn4.w(this);
    public boolean A = true;
    public int B = 0;
    public long C = -1;
    public long D = -1;
    public boolean E = false;
    public final fn4.b0 F = new fn4.x(this);
    public final com.tencent.mm.modelbase.u0 W = new fn4.p(this);

    @Override // fn4.b
    public void A4(int i17, java.lang.String str) {
    }

    @Override // fn4.b
    public com.tencent.mm.ui.MMActivity B() {
        return this;
    }

    @Override // fn4.b
    public void B2() {
        a7();
    }

    @Override // fn4.b
    public void E3(java.lang.String str) {
        this.f175135o.f387519y = str;
    }

    @Override // fn4.b
    public void F2(android.view.View view, int i17) {
        if (this.f175126J.d()) {
            this.f175126J.h();
            this.L = true;
        }
        in4.q qVar = new in4.q(getContext(), this.K.d(i17), new fn4.y(this, view, i17));
        this.M = qVar;
        if (this.U) {
            qVar.c(view, true, 0 - i65.a.b(getContext(), 40), i65.a.b(getContext(), 16));
            try {
                ((gn4.c0) this.f175126J.f264574c.getControlBar()).z();
            } catch (java.lang.Exception unused) {
            }
        } else {
            qVar.c(view, false, 0, 0);
        }
        jx3.f.INSTANCE.d(17080, 65, 1);
    }

    @Override // fn4.b
    public boolean H4() {
        return this.f175135o.f387506i != 326;
    }

    @Override // fn4.b
    public boolean H6() {
        return this.f175135o.f387506i != 36;
    }

    @Override // fn4.b
    public fn4.l1 I2() {
        return this.f175126J;
    }

    @Override // fn4.b
    public void O1(java.util.List list, boolean z17) {
        com.tencent.mm.sdk.platformtools.u3.h(new fn4.n(this, list, z17));
    }

    @Override // fn4.b
    public fn4.r0 Q4() {
        return this.I;
    }

    @Override // fn4.b
    public void R2() {
        runOnUiThread(new fn4.q(this));
    }

    @Override // fn4.b
    public void U0(r45.xn6 xn6Var, android.view.View view) {
        if (xn6Var != null) {
            if (!com.tencent.mars.comm.NetStatusUtil.isConnected(this)) {
                dp.a.makeText(getContext(), getString(com.tencent.mm.R.string.k0_), 0).show();
                return;
            }
            if (this.V != null) {
                gm0.j1.d().d(this.V);
            }
            java.lang.String str = xn6Var.G;
            int i17 = xn6Var.R ? 5 : 4;
            java.lang.String str2 = "" + java.lang.System.currentTimeMillis();
            r45.un6 un6Var = this.f175135o;
            this.V = new sm4.j(xn6Var, str, i17, str2, un6Var.f387506i, un6Var.f387507m, p6() ? qf1.f.CTRL_INDEX : qf1.j.CTRL_INDEX, xn6Var.f390259h, xn6Var.S, 1);
            gm0.j1.d().g(this.V);
            boolean z17 = !xn6Var.R;
            xn6Var.R = z17;
            if (z17) {
                xn6Var.X++;
            } else {
                xn6Var.X--;
            }
            ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.poh)).setText(wm4.u.p(xn6Var.X));
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryBaseVideoUI", "onWowBtnClick thumb:" + xn6Var.R);
        }
    }

    public abstract fn4.e U6();

    public abstract fn4.e V6();

    public abstract fn4.d W6();

    @Override // fn4.b
    public void X1(int i17) {
        this.f175135o.f387516v = i17;
    }

    public abstract fn4.d X6();

    @Override // fn4.b
    public int Y2() {
        return this.f175135o.f387516v;
    }

    public void Y6() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.D = android.os.SystemClock.elapsedRealtime();
    }

    public final int Z6() {
        return ((android.media.AudioManager) getApplicationContext().getSystemService("audio")).getStreamVolume(3);
    }

    @Override // fn4.b
    public void a2(r45.xn6 xn6Var) {
        if (!this.U) {
            this.f175128e.setText(com.tencent.mm.R.string.hsn);
            this.f175132i.setVisibility(8);
        }
        an4.a aVar = this.f175144x;
        if (aVar != null) {
            aVar.c0(this.f175135o, xn6Var);
        }
        xm4.a aVar2 = this.f175145y;
        if (aVar2 != null) {
            aVar2.u0(this.f175135o, xn6Var);
        }
    }

    public final void a7() {
        getWindow().setFlags(201327616, 201327616);
        android.view.View decorView = getWindow().getDecorView();
        if (fp.h.a(19)) {
            decorView.setSystemUiVisibility(2);
        } else {
            decorView.setSystemUiVisibility(4098);
        }
        getWindow().addFlags(128);
    }

    public void b7() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().w(new android.graphics.drawable.ColorDrawable(0));
            getSupportActionBar().o();
        }
        a7();
        this.f175127d = findViewById(com.tencent.mm.R.id.f487336oc0);
        this.f175128e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.odf);
        this.f175132i = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ne8);
        this.f175129f = findViewById(com.tencent.mm.R.id.k0z);
        this.f175130g = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f486061k11);
        this.f175131h = findViewById(com.tencent.mm.R.id.jqy);
        android.widget.ImageButton imageButton = (android.widget.ImageButton) findViewById(com.tencent.mm.R.id.aa8);
        this.f175133m = imageButton;
        imageButton.getDrawable().setColorFilter(getResources().getColor(com.tencent.mm.R.color.f478553an), android.graphics.PorterDuff.Mode.SRC_ATOP);
        this.f175133m.setOnClickListener(new fn4.r(this));
        this.f175129f.setOnClickListener(new fn4.s(this));
        android.view.View view = this.f175129f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.f487560p03);
        this.f175136p = recyclerView;
        androidx.recyclerview.widget.w2 w2Var = this.f175146z;
        recyclerView.i(w2Var);
        this.f175136p.setItemAnimator(new fn4.a0(this, null));
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(this);
        this.f175137q = linearLayoutManager;
        this.f175136p.setLayoutManager(linearLayoutManager);
        this.S = new androidx.recyclerview.widget.v1(this.f175137q);
        fn4.e U6 = U6();
        this.f175138r = U6;
        this.f175136p.setAdapter(U6);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.gfj);
        this.f175140t = recyclerView2;
        recyclerView2.i(w2Var);
        this.f175140t.setItemAnimator(new fn4.a0(this, null));
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager2 = new androidx.recyclerview.widget.LinearLayoutManager(this);
        this.f175141u = linearLayoutManager2;
        this.f175140t.setLayoutManager(linearLayoutManager2);
        this.T = new androidx.recyclerview.widget.v1(this.f175141u);
        fn4.e V6 = V6();
        this.f175142v = V6;
        this.f175140t.setAdapter(V6);
        this.f175140t.setVisibility(8);
        if (!this.E && !p6()) {
            fn4.c0 c0Var = new fn4.c0(getApplicationContext());
            this.f175134n = c0Var;
            c0Var.enable();
            this.f175134n.f264487e = this.F;
            this.E = true;
        }
        boolean z17 = this.f175135o.f387518x;
        if (z17) {
            j7(z17);
        }
        this.G.f264568b = this;
        this.f175131h.setOnClickListener(new fn4.t(this));
    }

    public void c7() {
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_context");
        r45.un6 un6Var = new r45.un6();
        this.f175135o = un6Var;
        try {
            un6Var.parseFrom(byteArrayExtra);
        } catch (java.lang.Exception unused) {
            finish();
        }
        fn4.z0 z0Var = new fn4.z0();
        this.K = z0Var;
        z0Var.f264631a = this;
        fn4.r0 r0Var = new fn4.r0();
        this.I = r0Var;
        r0Var.c(this);
        fn4.a1 a1Var = new fn4.a1();
        this.H = a1Var;
        a1Var.f264476c++;
        a1Var.f264475b = this;
        fn4.l1 l1Var = new fn4.l1();
        this.f175126J = l1Var;
        l1Var.f264572a++;
        l1Var.f264581j = this;
        this.G = new fn4.k0();
        this.f175139s = X6();
        this.f175143w = W6();
        xm4.a aVar = new xm4.a(new xm4.b(this));
        this.f175145y = aVar;
        aVar.b(8, this.f175135o.f387512r);
        this.f175145y.Z(getResources().getString(com.tencent.mm.R.string.k07));
        an4.a aVar2 = new an4.a(new an4.b(this));
        this.f175144x = aVar2;
        aVar2.y(8, this.f175135o.f387512r);
        this.f175144x.L(getResources().getString(com.tencent.mm.R.string.k07));
    }

    @Override // fn4.b
    public androidx.recyclerview.widget.w1 d2() {
        return this.U ? this.T : this.S;
    }

    public void d7() {
    }

    public void e7(int i17) {
    }

    public abstract void f7(r45.xn6 xn6Var, android.view.View view, boolean z17);

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        xm4.a aVar = this.f175145y;
        if (aVar != null) {
            aVar.p();
        }
        super.finish();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        if ((android.os.SystemClock.elapsedRealtime() - r9.D) >= 50) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0070, code lost:
    
        if ((android.os.SystemClock.elapsedRealtime() - r9.D) >= 50) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g7() {
        /*
            r9 = this;
            boolean r0 = r9.U
            if (r0 == 0) goto La
            fn4.d r0 = r9.f175143w
            r0.b(r9)
            goto Lf
        La:
            fn4.d r0 = r9.f175139s
            r0.b(r9)
        Lf:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r9.u6()
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r0 = r0.y()
            r9.B = r0
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r9.u6()
            int r0 = r0.getItemCount()
            long r1 = r9.C
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r4 = 50
            if (r3 <= 0) goto L38
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.f192989a
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r6 = r6 - r1
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 < 0) goto L8b
        L38:
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.f192989a
            long r1 = android.os.SystemClock.elapsedRealtime()
            r9.C = r1
            fn4.z0 r1 = r9.K
            int r2 = r1.f264633c
            r3 = 1
            r6 = 0
            if (r2 == r3) goto L5d
            int r2 = r9.B
            int r0 = r0 - r3
            if (r2 < r0) goto L74
            boolean r0 = r1.f264632b
            if (r0 != 0) goto L74
            long r0 = r9.D
            long r7 = android.os.SystemClock.elapsedRealtime()
            long r7 = r7 - r0
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 < 0) goto L74
            goto L72
        L5d:
            int r2 = r9.B
            int r0 = r0 - r2
            r2 = 3
            if (r0 > r2) goto L74
            boolean r0 = r1.f264632b
            if (r0 != 0) goto L74
            long r0 = r9.D
            long r7 = android.os.SystemClock.elapsedRealtime()
            long r7 = r7 - r0
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 < 0) goto L74
        L72:
            r0 = r3
            goto L75
        L74:
            r0 = r6
        L75:
            r45.un6 r1 = r9.f175135o
            int r2 = r1.f387506i
            r4 = 36
            if (r2 == r4) goto L81
            boolean r1 = r1.A
            if (r1 == 0) goto L82
        L81:
            r3 = r6
        L82:
            if (r3 != 0) goto L85
            goto L86
        L85:
            r6 = r0
        L86:
            if (r6 == 0) goto L8b
            r9.Y6()
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI.g7():void");
    }

    @Override // fn4.b
    public androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        return this.U ? this.f175140t : this.f175136p;
    }

    @Override // fn4.b
    public int getVideoHeight() {
        if (this.R == 0) {
            if (p6()) {
                this.R = 1280;
                int i17 = (y4().y * 3) / 5;
                if (this.R > i17) {
                    this.R = i17;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryBaseVideoUI", "getVideoHeight %d maxVideoHeight %d", java.lang.Integer.valueOf(this.R), java.lang.Integer.valueOf(i17));
            } else {
                this.R = (getVideoWidth() * 280) / com.tencent.mm.plugin.appbrand.jsapi.storage.e0.CTRL_INDEX;
            }
        }
        return this.R;
    }

    @Override // fn4.b
    public int getVideoWidth() {
        return java.lang.Math.min(y4().x, y4().y);
    }

    @Override // fn4.b
    public boolean h1() {
        return this.U;
    }

    @Override // fn4.b
    public int h3() {
        return this.f175135o.f387520z;
    }

    public void h7(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryBaseVideoUI", "setNeedScrollEvent %b", java.lang.Boolean.valueOf(z17));
        this.A = z17;
    }

    public final void i7() {
        if (this.f175135o.f387518x) {
            this.f175130g.setBackgroundResource(com.tencent.mm.R.raw.top_story_volume_off);
        } else {
            this.f175130g.setBackgroundResource(com.tencent.mm.R.raw.top_story_volume_on);
        }
        fn4.l1 l1Var = this.f175126J;
        if (l1Var.f264576e) {
            l1Var.l(this.f175135o.f387518x);
        }
    }

    @Override // fn4.b
    public boolean isMute() {
        return this.f175135o.f387518x;
    }

    public void j7(boolean z17) {
        if (z17) {
            this.f175135o.f387518x = true;
        } else {
            this.f175135o.f387518x = false;
            if (Z6() == 0) {
                to.a.c((android.media.AudioManager) getContext().getSystemService("audio"), 3, 1, 0);
            }
        }
        i7();
    }

    @Override // fn4.b
    public void k4(int i17) {
        this.f175135o.f387520z = i17;
    }

    @Override // fn4.b
    public int l4() {
        return wm4.a.f447283a;
    }

    @Override // fn4.b
    public void m() {
    }

    @Override // fn4.b
    public fn4.a1 o4() {
        return this.H;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        d7();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        c7();
        b7();
        gm0.j1.d().a(2802, this.W);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        pm4.y.g(this.f175135o, getActivityBrowseTimeMs(), this.K.d(this.f175135o.f387516v));
        if (this.E) {
            this.f175134n.disable();
            this.f175134n.f264487e = null;
            this.f175134n = null;
        }
        if (this.V != null) {
            gm0.j1.d().d(this.V);
        }
        gm0.j1.d().q(2802, this.W);
        this.K.i();
        ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).Ai().getClass();
        this.f175126J.f();
        fn4.k0 k0Var = this.G;
        k0Var.getClass();
        gm0.j1.n().d(k0Var.f264570d);
        k0Var.f264568b = null;
        k0Var.f264569c = 0;
        k0Var.f264567a = false;
        this.H.b();
        this.I.d();
        uu4.a.a(16);
        xm4.a aVar = this.f175145y;
        if (aVar != null) {
            aVar.o0();
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 25 && keyEvent.getAction() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryBaseVideoUI", "onKeyDown KEYCODE_VOLUME_DOWN %d", java.lang.Integer.valueOf(Z6()));
            this.f175135o.f387518x = Z6() <= 1;
            i7();
        } else if (i17 == 24 && keyEvent.getAction() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryBaseVideoUI", "onKeyDown KEYCODE_VOLUME_UP %d", java.lang.Integer.valueOf(Z6()));
            this.f175135o.f387518x = false;
            i7();
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            fn4.c1 c1Var = this.f175126J.f264573b;
            if (c1Var != null) {
                c1Var.e();
            }
            ((pm4.r) i95.n0.c(pm4.r.class)).getClass();
        } catch (java.lang.Exception unused) {
        }
        uu4.a.a(15);
        an4.a aVar = this.f175144x;
        if (aVar != null) {
            aVar.A();
        }
        xm4.a aVar2 = this.f175145y;
        if (aVar2 != null) {
            aVar2.z();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        a7();
        i7();
        ((pm4.r) i95.n0.c(pm4.r.class)).getClass();
        fn4.l1 l1Var = this.f175126J;
        fn4.c1 c1Var = l1Var.f264573b;
        if (c1Var != null) {
            c1Var.g();
            fn4.g gVar = l1Var.f264574c;
            if (gVar != null) {
                gVar.c();
            }
        }
        fn4.k0 k0Var = this.G;
        k0Var.f264569c = k0Var.a();
        uu4.a.a(14);
        an4.a aVar = this.f175144x;
        if (aVar != null) {
            aVar.z();
        }
        xm4.a aVar2 = this.f175145y;
        if (aVar2 != null) {
            aVar2.x();
        }
    }

    @Override // fn4.b
    public boolean p6() {
        return this.f175135o.f387505h == 100203;
    }

    @Override // fn4.b
    public r45.un6 r0() {
        return this.f175135o;
    }

    @Override // fn4.b
    public fn4.k0 s1() {
        return this.G;
    }

    @Override // fn4.b
    public fn4.z0 s4() {
        return this.K;
    }

    @Override // fn4.b
    public void t() {
    }

    @Override // fn4.b
    public fn4.e t0() {
        return this.U ? this.f175142v : this.f175138r;
    }

    @Override // fn4.b
    public java.lang.String t3() {
        java.lang.String str = this.f175135o.f387519y;
        return str == null ? "" : str;
    }

    @Override // fn4.b
    public androidx.recyclerview.widget.RecyclerView.LayoutManager u6() {
        return this.U ? this.f175141u : this.f175137q;
    }

    @Override // fn4.b
    public android.graphics.Point y4() {
        if (this.Q == null) {
            this.Q = com.tencent.mm.ui.bk.h(this);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryBaseVideoUI", "lxl screenSize:%s, %s", java.lang.Integer.valueOf(this.Q.x), java.lang.Integer.valueOf(this.Q.y));
        return this.Q;
    }

    @Override // pm4.s
    public void z3(int i17, int i18) {
        this.f175126J.e(i17, i18);
    }

    @Override // fn4.b
    public java.lang.String z4() {
        return pm4.w.j(this.f175135o.f387512r);
    }
}
