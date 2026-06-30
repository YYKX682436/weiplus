package com.tencent.mm.plugin.topstory.ui.video.list;

/* loaded from: classes15.dex */
public class TopStoryListVideoUI extends com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI implements hn4.b {
    public android.widget.Button A1;
    public android.view.View B1;
    public android.view.View C1;
    public in4.k D1;
    public android.view.View E1;
    public in4.k F1;
    public android.view.View G1;
    public com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog H1;
    public boolean I1;
    public long J1 = 0;
    public android.view.View Y;
    public android.widget.TextView Z;

    /* renamed from: l1, reason: collision with root package name */
    public android.view.View f175168l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.app.ProgressDialog f175169p0;

    /* renamed from: p1, reason: collision with root package name */
    public android.view.View f175170p1;

    /* renamed from: x0, reason: collision with root package name */
    public hn4.j f175171x0;

    /* renamed from: x1, reason: collision with root package name */
    public android.view.View f175172x1;

    /* renamed from: y0, reason: collision with root package name */
    public gn4.f f175173y0;

    /* renamed from: y1, reason: collision with root package name */
    public android.view.View f175174y1;

    /* renamed from: z1, reason: collision with root package name */
    public android.view.View f175175z1;

    public static boolean k7(com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI topStoryListVideoUI, android.view.View view, float f17, float f18) {
        topStoryListVideoUI.getClass();
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i17 = iArr[0];
        int i18 = iArr[1];
        return f18 >= ((float) i18) && f18 <= ((float) (view.getMeasuredHeight() + i18)) && f17 >= ((float) i17) && f17 <= ((float) (view.getMeasuredWidth() + i17));
    }

    @Override // com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI, fn4.b
    public void A4(int i17, java.lang.String str) {
        com.tencent.mm.sdk.platformtools.u3.h(new hn4.q0(this, str));
    }

    @Override // com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI, fn4.b
    public void O1(java.util.List list, boolean z17) {
        super.O1(list, z17);
        com.tencent.mm.sdk.platformtools.u3.i(new hn4.p0(this), 50L);
    }

    @Override // fn4.b
    public void T2(int i17, r45.x56 x56Var) {
        if (this.U) {
            exitFullScreen();
        }
        boolean z17 = true;
        this.G.f264567a = true;
        this.f175126J.m();
        r45.xn6 d17 = this.K.d(this.f175135o.f387516v);
        r45.un6 a17 = pm4.w.a(this.f175135o);
        a17.f387512r = java.util.UUID.randomUUID().toString();
        a17.f387501d = d17.f390259h;
        a17.f387505h = x56Var.f389797f;
        a17.f387509o = null;
        a17.f387510p = x56Var;
        a17.f387514t = this.G.f264567a;
        java.util.Iterator it = a17.f387511q.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            r45.x50 x50Var = (r45.x50) it.next();
            if ("show_tag_list".equals(x50Var.f389788d)) {
                x50Var.f389790f = x56Var.f389795d;
                break;
            }
        }
        if (!z17) {
            r45.x50 x50Var2 = new r45.x50();
            x50Var2.f389788d = "show_tag_list";
            x50Var2.f389790f = x56Var.f389795d;
            a17.f387511q.add(x50Var2);
        }
        su4.r2.q(this, a17, 10001);
        uu4.a.a(28);
        om4.t Ai = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).Ai();
        r45.un6 un6Var = this.f175135o;
        Ai.a(un6Var, d17, un6Var.f387516v, 4, x56Var.f389796e + ":" + x56Var.f389795d);
    }

    @Override // com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI
    public fn4.e U6() {
        hn4.j jVar = new hn4.j(this);
        this.f175171x0 = jVar;
        android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.f489585d22, (android.view.ViewGroup) null);
        inflate.setClickable(false);
        inflate.setFocusableInTouchMode(false);
        inflate.setFocusable(false);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.gy_);
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.gyq);
        if (this.f175135o.f387510p != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "createHeaderView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "createHeaderView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "createHeaderView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "createHeaderView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.gze);
            this.Z = textView;
            textView.setText(this.f175135o.f387510p.f389800i);
            android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.nqb);
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f175135o.f387510p.f389801m)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(this.f175135o.f387510p.f389801m);
            }
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "createHeaderView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "createHeaderView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "createHeaderView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "createHeaderView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = new androidx.recyclerview.widget.RecyclerView.LayoutParams(-1, -2);
        if (com.tencent.mm.ui.bk.u(this, false)) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = com.tencent.mm.ui.bk.p(this);
        }
        inflate.setLayoutParams(layoutParams);
        x.o oVar = jVar.f264489d;
        oVar.g(oVar.h() + 100000, inflate);
        hn4.j jVar2 = this.f175171x0;
        android.view.View inflate2 = android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.f489587d24, (android.view.ViewGroup) null);
        inflate2.setPadding(0, 0, 0, ((i65.a.k(getContext()) * 2) / 5) - getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.acn));
        inflate2.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        this.f175170p1 = inflate2.findViewById(com.tencent.mm.R.id.gbx);
        this.f175168l1 = inflate2.findViewById(com.tencent.mm.R.id.f485041gc1);
        x.o oVar2 = jVar2.f264490e;
        oVar2.g(oVar2.h() + 200000, inflate2);
        return this.f175171x0;
    }

    @Override // com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI
    public fn4.e V6() {
        gn4.f fVar = new gn4.f(this);
        this.f175173y0 = fVar;
        android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.f489587d24, (android.view.ViewGroup) null);
        inflate.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        this.f175174y1 = inflate.findViewById(com.tencent.mm.R.id.gbx);
        this.f175172x1 = inflate.findViewById(com.tencent.mm.R.id.f485041gc1);
        x.o oVar = fVar.f264490e;
        oVar.g(oVar.h() + 200000, inflate);
        return this.f175173y0;
    }

    @Override // com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI
    public fn4.d W6() {
        return new gn4.d();
    }

    @Override // com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI
    public fn4.d X6() {
        return new hn4.e();
    }

    @Override // com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI
    public void Y6() {
        if (this.U) {
            android.view.View view = this.f175174y1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "fetchNextPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "fetchNextPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f175172x1;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "fetchNextPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "fetchNextPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view3 = this.f175170p1;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "fetchNextPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "fetchNextPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.f175168l1;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "fetchNextPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "fetchNextPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        fn4.z0 z0Var = this.K;
        z0Var.p(z0Var.e());
    }

    @Override // fn4.b
    public int b1() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI
    public void b7() {
        super.b7();
        this.f175175z1 = findViewById(com.tencent.mm.R.id.gfi);
        this.A1 = (android.widget.Button) findViewById(com.tencent.mm.R.id.mcl);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.obv);
        this.Y = findViewById;
        findViewById.setOnClickListener(new hn4.k0(this));
        overridePendingTransition(com.tencent.mm.ui.uc.f211078a, com.tencent.mm.ui.uc.f211079b);
        if (this.f175135o.f387510p != null) {
            this.f175128e.setVisibility(8);
        }
        this.H.f264477d = 2;
        r45.un6 un6Var = this.f175135o;
        if (!((un6Var.f387506i == 36 || un6Var.A) ? false : true)) {
            android.view.View view = this.f175170p1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f175168l1;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (this.G.b()) {
            l7();
            this.I1 = false;
            r45.un6 un6Var2 = this.f175135o;
            if (un6Var2.f387506i != 21 && un6Var2.f387510p == null) {
                this.f175169p0 = db5.e1.Q(this, "", getString(com.tencent.mm.R.string.ggc), true, true, new hn4.l0(this));
            }
        } else {
            android.widget.Toast.makeText(this, com.tencent.mm.R.string.hsk, 1).show();
            this.I1 = true;
        }
        this.f175171x0.f282577h = true;
        if (this.f175135o.f387514t) {
            this.G.f264567a = true;
        }
        this.f175136p.post(new hn4.m0(this));
        new hn4.d(this).b(this.f175136p);
        new gn4.c().b(this.f175140t);
        this.B1 = findViewById(com.tencent.mm.R.id.czk);
        this.E1 = findViewById(com.tencent.mm.R.id.czl);
        android.view.View view3 = this.B1;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.C1 = findViewById(com.tencent.mm.R.id.czd);
        this.G1 = findViewById(com.tencent.mm.R.id.cze);
        android.view.View view4 = this.C1;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.B1.setOnTouchListener(new hn4.n0(this));
        this.C1.setOnTouchListener(new hn4.o0(this));
        com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog topStoryCommentFloatDialog = (com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog) findViewById(com.tencent.mm.R.id.f483840c72);
        this.H1 = topStoryCommentFloatDialog;
        topStoryCommentFloatDialog.setVisibility(8);
        this.H1.d(this);
        m7();
    }

    @Override // com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI
    public void c7() {
        super.c7();
        r45.xn6 xn6Var = this.f175135o.f387509o;
        if (xn6Var != null) {
            fn4.z0 z0Var = this.K;
            synchronized (z0Var) {
                ((java.util.LinkedList) z0Var.b()).add(xn6Var);
            }
        }
    }

    @Override // com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI
    public void d7() {
        if (this.U) {
            exitFullScreen();
            return;
        }
        if (this.f175135o != null) {
            this.H.a();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("isMute", this.f175135o.f387518x);
            intent.putExtra("MOBILE_CHECK_FLAG", this.f175135o.f387520z);
            intent.putExtra("key_video_play_info", com.tencent.mm.sdk.platformtools.t8.c1(this.H.f264480g, ";"));
            intent.putExtra("key_search_id", this.f175135o.f387507m);
            setResult(-1, intent);
        }
        if (!this.f175144x.U(2, false)) {
            finish();
        }
        if (this.f175145y.m0(2)) {
            return;
        }
        finish();
    }

    @Override // com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI
    public void e7(int i17) {
        boolean z17 = android.provider.Settings.System.getInt(getContentResolver(), "accelerometer_rotation", 0) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryListVideoUI", "onDeviceOrientationChange, orientation: %s sysOrienOn: %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        if (z17) {
            if (i17 == 90 || i17 == 270) {
                if (this.U) {
                    return;
                }
                enterFullScreen();
            } else if ((i17 == 180 || i17 == 0) && this.U) {
                exitFullScreen();
            }
        }
    }

    public void enterFullScreen() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.J1 < 1000) {
            return;
        }
        this.J1 = currentTimeMillis;
        qp1.h0.a(true, true, true);
        fn4.g gVar = this.f175126J.f264574c;
        if (gVar != null) {
            this.f175135o.f387517w = gVar.getControlBar().getmPosition();
            if (this.f175126J.f264574c.getControlBar().getVideoTotalTime() - this.f175135o.f387517w < 2) {
                return;
            }
        }
        h7(false);
        this.U = true;
        android.view.View view = this.C1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "enterFullScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "enterFullScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.B1;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "enterFullScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "enterFullScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!p6()) {
            setRequestedOrientation(0);
        }
        in4.h hVar = this.P;
        if (hVar != null && hVar.isShowing()) {
            this.P.dismiss();
            this.P = null;
        }
        android.view.View view3 = this.Y;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "enterFullScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "enterFullScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f175128e.setVisibility(8);
        this.f175132i.setVisibility(8);
        this.f175136p.setVisibility(8);
        this.f175140t.setVisibility(0);
        this.f175171x0.notifyDataSetChanged();
        if (gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_SHORT_VIDEO_FS_SCROLL_TIPS_INT, 0) == 0) {
            this.f175126J.h();
            android.view.View view4 = this.f175175z1;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "enterFullScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "enterFullScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f175175z1.setOnTouchListener(new hn4.r0(this));
            this.A1.setOnClickListener(new hn4.s0(this));
        } else {
            android.view.View view5 = this.f175175z1;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "enterFullScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "enterFullScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f175173y0.f273611i = true;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = this.f175141u;
        int i17 = this.f175135o.f387516v;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(0);
        arrayList6.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(linearLayoutManager, arrayList6.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "enterFullScreen", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        linearLayoutManager.P(((java.lang.Integer) arrayList6.get(0)).intValue(), ((java.lang.Integer) arrayList6.get(1)).intValue());
        yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "enterFullScreen", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        getSwipeBackLayout().setEnableGesture(false);
        h7(true);
        if (com.tencent.mm.ui.bk.u(this, false)) {
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f175127d.getLayoutParams();
            layoutParams.topMargin = 0;
            layoutParams.leftMargin = i65.a.b(getContext(), 24);
            this.f175127d.setLayoutParams(layoutParams);
        }
    }

    public void exitFullScreen() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.J1 < 1000) {
            return;
        }
        this.J1 = currentTimeMillis;
        qp1.h0.b();
        fn4.g gVar = this.f175126J.f264574c;
        if (gVar != null) {
            this.f175135o.f387517w = gVar.getControlBar().getmPosition();
            if (this.f175126J.f264574c.getControlBar().getVideoTotalTime() - this.f175135o.f387517w < 2) {
                return;
            }
        }
        h7(false);
        this.U = false;
        android.view.View view = this.C1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "exitFullScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "exitFullScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.B1;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "exitFullScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "exitFullScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!p6()) {
            setRequestedOrientation(1);
        }
        in4.h hVar = this.P;
        if (hVar != null && hVar.isShowing()) {
            this.P.dismiss();
            this.P = null;
        }
        android.view.View view3 = this.Y;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "exitFullScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "exitFullScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f175135o.f387510p == null) {
            this.f175128e.setVisibility(0);
        }
        this.f175136p.setVisibility(0);
        this.f175140t.setVisibility(8);
        this.f175173y0.notifyDataSetChanged();
        android.view.View view4 = this.f175175z1;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "exitFullScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "exitFullScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        hn4.j jVar = this.f175171x0;
        jVar.f282578i = true;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = this.f175137q;
        int z17 = this.f175135o.f387516v + jVar.z();
        int l47 = l4();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(java.lang.Integer.valueOf(l47));
        arrayList5.add(java.lang.Integer.valueOf(z17));
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(linearLayoutManager, arrayList5.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "exitFullScreen", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        linearLayoutManager.P(((java.lang.Integer) arrayList5.get(0)).intValue(), ((java.lang.Integer) arrayList5.get(1)).intValue());
        yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "exitFullScreen", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        getSwipeBackLayout().setEnableGesture(true);
        h7(true);
        m7();
    }

    @Override // com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI
    public void f7(r45.xn6 xn6Var, android.view.View view, boolean z17) {
        in4.k kVar;
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryListVideoUI", "onLikeSceneEnd vid:%s, thumb:%s", xn6Var.f390259h, java.lang.Boolean.valueOf(z17));
        if (!z17) {
            if (this.C1.getVisibility() == 0) {
                in4.k kVar2 = this.F1;
                if (kVar2 == null || (str2 = kVar2.f292978f) == null || !str2.equals(xn6Var.f390259h)) {
                    return;
                }
                android.view.View view2 = this.C1;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "onLikeSceneEnd", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "onLikeSceneEnd", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            if (this.B1.getVisibility() != 0 || (kVar = this.D1) == null || (str = kVar.f292978f) == null || !str.equals(xn6Var.f390259h)) {
                return;
            }
            android.view.View view3 = this.B1;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "onLikeSceneEnd", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "onLikeSceneEnd", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.lang.String str3 = "" + java.lang.System.currentTimeMillis();
        java.lang.String str4 = xn6Var.G;
        java.lang.String str5 = xn6Var.f390255d;
        r45.un6 un6Var = this.f175135o;
        sm4.f fVar = new sm4.f(str3, str4, "", "", "", "", str5, un6Var.f387507m, un6Var.f387506i, p6() ? qf1.f.CTRL_INDEX : qf1.j.CTRL_INDEX, xn6Var.f390259h, xn6Var.S, 1);
        if (!this.U) {
            android.view.View view4 = this.C1;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "onLikeSceneEnd", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "onLikeSceneEnd", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view5 = this.B1;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "onLikeSceneEnd", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "onLikeSceneEnd", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            in4.k kVar3 = new in4.k(this, this.E1, new hn4.j0(this, xn6Var), fVar, xn6Var.f390259h);
            this.D1 = kVar3;
            kVar3.a(view, false, 0, (int) ((8.0f * getResources().getDisplayMetrics().density) + 0.5f));
            return;
        }
        android.view.View view6 = this.C1;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view6, arrayList5.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "onLikeSceneEnd", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "onLikeSceneEnd", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view7 = this.B1;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(8);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view7, arrayList6.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "onLikeSceneEnd", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(view7, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "onLikeSceneEnd", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view8 = this.G1;
        this.F1 = new in4.k(this, view8, new hn4.g0(this, xn6Var), fVar, xn6Var.f390259h);
        int i17 = (int) ((10.0f * getResources().getDisplayMetrics().density) + 0.5f);
        android.content.Context context = view.getContext();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        view.getHeight();
        int width = view.getWidth();
        int i18 = com.tencent.mm.ui.bk.h(context).x;
        view8.measure(0, 0);
        int measuredHeight = view8.getMeasuredHeight();
        int measuredWidth = view8.getMeasuredWidth();
        int[] iArr2 = {(iArr[0] + (width / 2)) - (measuredWidth / 2), iArr[1] - measuredHeight};
        com.tencent.mars.xlog.Log.i("PopupUtil", "window pos x:" + iArr2[0] + ", windowWidth:" + measuredWidth + ", screenWidth:" + i18);
        if (iArr2[0] + measuredWidth > i18) {
            iArr2[0] = i18 - measuredWidth;
        }
        iArr2[0] = iArr2[0] + 0;
        iArr2[1] = iArr2[1] + i17;
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) view8.getLayoutParams();
        layoutParams.leftMargin = iArr2[0];
        layoutParams.topMargin = iArr2[1];
        view8.setLayoutParams(layoutParams);
        this.C1.postDelayed(new hn4.h0(this), 1800L);
    }

    @Override // fn4.b
    public void g1(r45.xn6 xn6Var, fn4.g gVar, int i17, int i18) {
        rm4.d dVar;
        if (this.f175135o.f387510p != null || xn6Var == null || xn6Var.N == null || (dVar = this.H.f264479f) == null || dVar.f397452a == 0) {
            return;
        }
        long currentTimeMillis = (java.lang.System.currentTimeMillis() - dVar.f397452a) / 1000;
        r45.sn6 sn6Var = xn6Var.N;
        int i19 = sn6Var.f385870g - 10;
        int i27 = ((sn6Var.f385871h * i18) / 100) - 10;
        if (!sn6Var.f385873m && currentTimeMillis >= i19 && i17 >= i27) {
            fn4.z0 z0Var = this.K;
            r45.un6 un6Var = this.f175135o;
            int e17 = z0Var.e();
            z0Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryVideoDataMgr", "requestRelVideo %s %d %d", xn6Var.f390259h, java.lang.Integer.valueOf(e17), java.lang.Long.valueOf(currentTimeMillis));
            if (z0Var.f264635e != null) {
                gm0.j1.d().d(z0Var.f264635e);
                z0Var.f264635e = null;
            }
            r45.un6 a17 = pm4.w.a(un6Var);
            a17.f387513s = e17;
            z0Var.f264635e = new sm4.h(a17, z0Var.f264631a.Y2(), 1, xn6Var, currentTimeMillis);
            gm0.j1.d().g(z0Var.f264635e);
            gm0.j1.d().a(1943, z0Var.f264636f);
            xn6Var.N.f385873m = true;
        }
        r45.sn6 sn6Var2 = xn6Var.N;
        if (sn6Var2.f385874n || currentTimeMillis < i19 + 10 || i17 < i27 + 10) {
            return;
        }
        sn6Var2.f385874n = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryListVideoUI", "start to show second video info %d", java.lang.Integer.valueOf(sn6Var2.f385872i.size()));
        java.util.Iterator it = xn6Var.N.f385872i.iterator();
        while (it.hasNext()) {
            r45.xn6 xn6Var2 = (r45.xn6) it.next();
            r45.sn6 sn6Var3 = xn6Var2.N;
            if (sn6Var3 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryListVideoUI", "videoId %s not have secondInfo", xn6Var2.f390259h);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryListVideoUI", "videoId %s secondVideoInfoType %d", xn6Var2.f390259h, java.lang.Integer.valueOf(sn6Var3.f385867d));
                r45.sn6 sn6Var4 = xn6Var2.N;
                if (sn6Var4.f385867d == 2) {
                    int i28 = sn6Var4.f385869f;
                    int i29 = this.f175135o.f387516v;
                    int i37 = (i28 > 0 ? i28 : 1) + i29;
                    int e18 = this.K.e() - 1;
                    if (i37 > e18) {
                        i37 = e18;
                    }
                    ((java.util.LinkedList) this.K.b()).add(i37, xn6Var2);
                    com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryListVideoUI", "high complete insert success curPos %s insertOffset %s pos:%s, vid[%s], title:%s", java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i37), xn6Var2.f390259h, xn6Var2.f390255d);
                    getRecyclerView().post(new hn4.e0(this, i37));
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI
    public void g7() {
        super.g7();
        if (this.U || this.Y.getAlpha() == 0.0f) {
            return;
        }
        this.Y.animate().cancel();
        android.view.View view = this.Y;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "onRecyclerViewScroll", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "onRecyclerViewScroll", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return (!this.U || p6()) ? 1 : 0;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489588d25;
    }

    @Override // com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI, fn4.b
    public int l4() {
        return com.tencent.mm.ui.bk.u(this, false) ? wm4.a.f447283a + com.tencent.mm.ui.bk.p(this) : wm4.a.f447283a;
    }

    public final void l7() {
        if (this.U) {
            android.view.View view = this.f175174y1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "fetchFirstPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "fetchFirstPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f175172x1;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "fetchFirstPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "fetchFirstPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view3 = this.f175170p1;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "fetchFirstPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "fetchFirstPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.f175168l1;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "fetchFirstPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "fetchFirstPageData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.K.p(0);
    }

    @Override // com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI, fn4.b
    public void m() {
        android.widget.TextView textView;
        if (this.U) {
            android.view.View view = this.C1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "onEnterImmersionModel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "onEnterImmersionModel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            this.Y.animate().alpha(1.0f).setDuration(200L).setStartDelay(1800L);
        }
        this.f175127d.animate().alpha(0.1f).setDuration(200L).setStartDelay(1800L);
        if (this.f175135o.f387510p == null || (textView = this.Z) == null) {
            return;
        }
        textView.animate().alpha(0.1f).setDuration(200L).setStartDelay(1800L);
    }

    public final void m7() {
        if (com.tencent.mm.ui.bk.u(this, false)) {
            int p17 = com.tencent.mm.ui.bk.p(this);
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f175127d.getLayoutParams();
            layoutParams.topMargin = p17;
            layoutParams.leftMargin = 0;
            this.f175127d.setLayoutParams(layoutParams);
            android.view.ViewGroup.LayoutParams layoutParams2 = this.Y.getLayoutParams();
            layoutParams2.height += p17;
            this.Y.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        r45.un6 un6Var;
        r45.un6 un6Var2;
        fn4.b1.f264481b.b(this, i17, i18, intent);
        if (i17 == 10001) {
            androidx.recyclerview.widget.k3 e17 = hn4.e.e(this);
            if (e17 != null && (e17 instanceof fn4.m)) {
                ((fn4.m) e17).s(false);
            }
            if (intent != null && intent.hasExtra("isMute") && (un6Var2 = this.f175135o) != null) {
                j7(intent.getBooleanExtra("isMute", un6Var2.f387518x));
            }
            if (intent == null || !intent.hasExtra("MOBILE_CHECK_FLAG") || (un6Var = this.f175135o) == null) {
                return;
            }
            this.f175135o.f387520z = intent.getIntExtra("MOBILE_CHECK_FLAG", un6Var.f387520z);
        }
    }

    @Override // com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            customfixStatusbar(true);
        }
        super.onCreate(bundle);
        ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).Di(oq1.b.f347306c, 885);
        uu4.a.a(13);
    }

    @Override // com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.H1.f175260h.d();
    }

    @Override // com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || this.H1.getVisibility() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        this.H1.b();
        return true;
    }

    @Override // com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog topStoryCommentFloatDialog = this.H1;
        topStoryCommentFloatDialog.f175260h.f210400e = null;
        gm0.j1.d().q(2906, topStoryCommentFloatDialog);
    }

    @Override // com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog topStoryCommentFloatDialog = this.H1;
        topStoryCommentFloatDialog.f175260h.f210400e = topStoryCommentFloatDialog;
        gm0.j1.d().a(2906, topStoryCommentFloatDialog);
    }

    @Override // com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI, fn4.b
    public void t() {
        android.widget.TextView textView;
        this.f175127d.animate().cancel();
        android.view.View view = this.f175127d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "onExitImmersionModel", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "onExitImmersionModel", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        if (this.f175135o.f387510p == null || (textView = this.Z) == null) {
            return;
        }
        textView.setAlpha(1.0f);
    }

    @Override // fn4.b
    public boolean t1(int i17) {
        android.view.View view = this.B1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "tryToPlayPositionVideo", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "tryToPlayPositionVideo", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.C1;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "tryToPlayPositionVideo", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "tryToPlayPositionVideo", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryListVideoUI", "tryToPlayPositionVideo %d", java.lang.Integer.valueOf(i17));
        try {
            if (this.U) {
                if (i17 < (this.f175142v.getItemCount() - this.f175142v.y()) - this.f175142v.z()) {
                    androidx.recyclerview.widget.RecyclerView recyclerView = this.f175140t;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(java.lang.Integer.valueOf(i17));
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(recyclerView, arrayList3.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "tryToPlayPositionVideo", "(I)Z", "Undefined", "smoothScrollToPosition", "(I)V");
                    recyclerView.c1(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(recyclerView, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI", "tryToPlayPositionVideo", "(I)Z", "Undefined", "smoothScrollToPosition", "(I)V");
                    return true;
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.TopStory.TopStoryListVideoUI", "tryToPlayPositionVideo fullScreen, position invalid, pos:%s, itemCount:%s, footer:%s, header:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f175142v.getItemCount()), java.lang.Integer.valueOf(this.f175142v.y()), java.lang.Integer.valueOf(this.f175142v.z()));
            } else {
                if (i17 < (this.f175171x0.getItemCount() - this.f175171x0.y()) - this.f175171x0.z()) {
                    this.f175139s.d(this, i17 + this.f175171x0.z());
                    return true;
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.TopStory.TopStoryListVideoUI", "tryToPlayPositionVideo, position invalid, pos:%s, itemCount:%s, footer:%s, header:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f175171x0.getItemCount()), java.lang.Integer.valueOf(this.f175171x0.y()), java.lang.Integer.valueOf(this.f175171x0.z()));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TopStory.TopStoryListVideoUI", "tryToPlayPositionVideo Exception:%s", e17.getMessage());
        }
        return false;
    }

    @Override // fn4.b
    public void v6(r45.xn6 xn6Var, fn4.g gVar, int i17, int i18) {
        r45.pn6 pn6Var = xn6Var.Y;
        if (pn6Var == null || pn6Var.f383243n == null) {
            return;
        }
        if (i17 < pn6Var.f383236d || i17 > pn6Var.f383237e) {
            gVar.a();
        } else {
            if (pn6Var.f383244o) {
                return;
            }
            pn6Var.f383244o = true;
            gVar.m();
        }
    }

    @Override // com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI, pm4.s
    public void z3(int i17, int i18) {
        if ((i18 == 2 || i18 == 1) && this.I1) {
            l7();
        }
        super.z3(i17, i18);
    }
}
