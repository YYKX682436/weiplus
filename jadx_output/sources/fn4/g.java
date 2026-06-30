package fn4;

/* loaded from: classes15.dex */
public abstract class g extends android.widget.RelativeLayout {
    public static final o11.g F;
    public final fn4.b A;
    public android.widget.TextView B;
    public fn4.f C;
    public java.lang.String D;
    public r45.xn6 E;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.FrameLayout f264509d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f264510e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f264511f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f264512g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f264513h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f264514i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f264515m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f264516n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f264517o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f264518p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f264519q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f264520r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f264521s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f264522t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f264523u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f264524v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.FrameLayout f264525w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ImageView f264526x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.ImageView f264527y;

    /* renamed from: z, reason: collision with root package name */
    public final fn4.a f264528z;

    static {
        o11.f fVar = new o11.f();
        fVar.f342078b = true;
        fVar.f342079c = true;
        F = fVar.a();
    }

    public g(android.content.Context context, fn4.b bVar, fn4.a aVar) {
        super(context);
        this.C = fn4.f.UNKNOWN;
        this.D = "";
        this.A = bVar;
        this.f264528z = aVar;
        d();
    }

    public abstract void a();

    public abstract com.tencent.mm.pluginsdk.ui.e1 b(r45.xn6 xn6Var);

    public abstract void c();

    public void d() {
        android.view.LayoutInflater.from(getContext()).inflate(getLayoutId(), this);
        this.f264509d = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.p0z);
        this.f264510e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486476lc3);
        this.f264520r = findViewById(com.tencent.mm.R.id.f487328oa5);
        this.f264521s = findViewById(com.tencent.mm.R.id.oxu);
        this.f264522t = findViewById(com.tencent.mm.R.id.p0q);
        this.f264523u = findViewById(com.tencent.mm.R.id.oxv);
        this.f264524v = findViewById(com.tencent.mm.R.id.oz9);
        this.f264511f = findViewById(com.tencent.mm.R.id.ozd);
        this.f264512g = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.cl7);
        this.f264513h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.p0a);
        this.f264514i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.odf);
        this.f264515m = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.cko);
        this.f264516n = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ckp);
        this.f264519q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lyg);
        this.f264517o = (android.widget.Button) findViewById(com.tencent.mm.R.id.o_c);
        this.f264518p = (android.widget.TextView) findViewById(com.tencent.mm.R.id.o_d);
        this.f264526x = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.kxe);
        this.f264527y = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.kxd);
        this.f264525w = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.kxf);
        this.B = (android.widget.TextView) findViewById(com.tencent.mm.R.id.k6u);
    }

    public abstract boolean e();

    public void f(int i17) {
        fn4.b bVar = this.A;
        fn4.c1 c1Var = bVar.I2().f264573b;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryBaseVideoContainer", "seek to position=%d current=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(c1Var != null ? c1Var.getCurrPosSec() : 0));
        fn4.c1 c1Var2 = bVar.I2().f264573b;
        if (c1Var2 != null) {
            c1Var2.j0(i17, true);
        }
        rm4.d dVar = bVar.o4().f264479f;
        if (dVar != null) {
            dVar.f397457f = 1L;
        }
    }

    public void g() {
        this.C = fn4.f.MOBILE_NET;
        c();
        k(getMobileNetTip(), getContext().getString(com.tencent.mm.R.string.jzw));
    }

    public abstract fn4.h getControlBar();

    public fn4.a getItemUIComponent() {
        return this.f264528z;
    }

    public abstract int getLayoutId();

    public java.lang.String getMobileNetTip() {
        return this.E.f390254J == 0 ? getContext().getString(com.tencent.mm.R.string.k0c) : getContext().getString(com.tencent.mm.R.string.k0b, com.tencent.mm.sdk.platformtools.t8.i0(this.E.f390254J, 100.0d));
    }

    public java.lang.String getNoNetTip() {
        return getContext().getString(com.tencent.mm.R.string.k7r);
    }

    public fn4.f getPauseReason() {
        return this.C;
    }

    public abstract com.tencent.mm.pluginsdk.ui.b1 getVideoViewCallback();

    public android.widget.FrameLayout getVideoViewParent() {
        return this.f264509d;
    }

    public void h() {
        k(getNoNetTip(), this.A.B().getString(com.tencent.mm.R.string.f493446k80));
        getContext().getString(com.tencent.mm.R.string.k0b, com.tencent.mm.sdk.platformtools.t8.i0(this.E.f390254J, 100.0d));
    }

    public void i() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryBaseVideoContainer", "setPlayingContainerStatus, pos:%d", java.lang.Integer.valueOf(this.f264528z.u()));
        android.view.View view = this.f264521s;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setPlayingContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setPlayingContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f264512g.setVisibility(8);
        this.f264510e.setVisibility(8);
        android.view.View view2 = this.f264520r;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setPlayingContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setPlayingContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f264509d.setVisibility(0);
        this.f264509d.setAlpha(1.0f);
    }

    public void j() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryBaseVideoContainer", "setStopContainerStatus, pos:%d", java.lang.Integer.valueOf(this.f264528z.u()));
        this.f264512g.setVisibility(0);
        android.view.View view = this.f264521s;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f264525w.setVisibility(8);
        android.view.View view2 = this.f264522t;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f264520r;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.f264523u;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f264515m.setVisibility(0);
        this.f264516n.setVisibility(8);
        this.f264519q.setVisibility(8);
        this.f264513h.setVisibility(8);
    }

    public void k(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryBaseVideoContainer", "setWarningTipContainerStatus %s %s", str, str2);
        this.f264512g.setVisibility(0);
        android.view.View view = this.f264521s;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setWarningTipContainerStatus", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setWarningTipContainerStatus", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f264522t;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setWarningTipContainerStatus", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setWarningTipContainerStatus", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f264520r;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setWarningTipContainerStatus", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setWarningTipContainerStatus", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.f264523u;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setWarningTipContainerStatus", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setWarningTipContainerStatus", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view5 = this.f264524v;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setWarningTipContainerStatus", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setWarningTipContainerStatus", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view6 = this.f264511f;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(8);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setWarningTipContainerStatus", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setWarningTipContainerStatus", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (android.text.TextUtils.isEmpty(str)) {
            this.f264518p.setVisibility(8);
        } else {
            this.f264518p.setText(str);
            this.f264518p.setVisibility(0);
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            this.f264517o.setVisibility(8);
        } else {
            this.f264517o.setText(str2);
            this.f264517o.setVisibility(0);
        }
    }

    public void l() {
    }

    public abstract void m();

    public boolean n(boolean z17, boolean z18) {
        int i17;
        fn4.b bVar = this.A;
        java.lang.String t37 = bVar.t3();
        java.lang.String str = com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "wifi" : su4.r2.k() ? "wangka" : com.tencent.mars.comm.NetStatusUtil.is4G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "4g" : com.tencent.mars.comm.NetStatusUtil.is3G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "3g" : com.tencent.mars.comm.NetStatusUtil.is2G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "2g" : !com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "fail" : "";
        int h37 = bVar.h3();
        if (!bVar.s1().b()) {
            this.C = fn4.f.NO_NET;
            c();
            k(getNoNetTip(), getContext().getString(com.tencent.mm.R.string.f493446k80));
            bVar.I2().b(this, b(this.E));
            return false;
        }
        if (!str.equals("wifi") && !str.equals(t37)) {
            if (str.equals("wangka")) {
                if (h37 != 1 && h37 != 2) {
                    bVar.k4(1);
                    android.widget.TextView textView = this.B;
                    if (textView != null) {
                        textView.setVisibility(0);
                        this.B.setAlpha(1.0f);
                        this.B.animate().alpha(0.0f).setDuration(3000L).start();
                    } else {
                        db5.t7.makeText(bVar.B(), com.tencent.mm.R.string.k0d, 0).show();
                    }
                }
            } else if (h37 != 2) {
                g();
                bVar.I2().b(this, b(this.E));
                return false;
            }
        }
        bVar.E3(str);
        this.D = java.util.UUID.randomUUID().toString();
        this.C = fn4.f.UNKNOWN;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryBaseVideoContainer", "setStartPlayContainerStatus");
        android.view.View view = this.f264521s;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f264523u;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f264520r;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f264525w.setVisibility(8);
        android.view.View view4 = this.f264522t;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view5 = this.f264524v;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view6 = this.f264511f;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(0);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view7 = this.f264511f;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(0);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view7, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view8 = this.f264511f;
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        arrayList8.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList8);
        yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view8.setAlpha(((java.lang.Float) arrayList8.get(0)).floatValue());
        yj0.a.f(view8, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f264511f.animate().setDuration(4000L).setInterpolator(new android.view.animation.AccelerateInterpolator()).alpha(1.0f).start();
        this.f264512g.setVisibility(0);
        this.f264510e.setVisibility(8);
        this.f264509d.setVisibility(0);
        this.f264509d.setAlpha(0.0f);
        bVar.I2().b(this, b(this.E));
        fn4.l1 I2 = bVar.I2();
        r45.xn6 xn6Var = this.E;
        java.lang.String str2 = this.D;
        int u17 = this.f264528z.u();
        I2.getClass();
        java.util.HashMap hashMap = ((wm4.p) i95.n0.c(wm4.p.class)).f447299f;
        if (hashMap.containsKey(xn6Var.f390259h)) {
            i17 = ((java.lang.Integer) hashMap.get(xn6Var.f390259h)).intValue();
        } else {
            hashMap.put(xn6Var.f390259h, 0);
            i17 = 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryVideoViewMgr", "startPlay, pos:%s, vid:%s videoProgress: %d", java.lang.Integer.valueOf(u17), xn6Var.f390259h, java.lang.Integer.valueOf(i17));
        r45.sn6 sn6Var = xn6Var.N;
        if (sn6Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryVideoViewMgr", "video %s secondVideoInfo %d %d", xn6Var.f390259h, java.lang.Integer.valueOf(sn6Var.f385870g), java.lang.Integer.valueOf(xn6Var.N.f385871h));
        }
        r45.pn6 pn6Var = xn6Var.Y;
        if (pn6Var != null) {
            pn6Var.f383244o = false;
        }
        r45.xn6 xn6Var2 = I2.f264575d;
        if (xn6Var2 != null) {
            if (!xn6Var2.G.equals(xn6Var.G) || z18) {
                I2.f264573b.stop();
                bVar.o4().g(bVar.r0());
                bVar.o4().c();
            }
            return true;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(xn6Var.f390256e)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TopStory.TopStoryVideoViewMgr", "start play video url is null %s %s %s", str2, xn6Var.f390259h, xn6Var.f390255d);
        } else {
            bVar.o4().f(xn6Var, u17, str2);
            I2.f264581j.o4().e(xn6Var);
            I2.f264573b.setLoop(false);
            I2.f264573b.setVideoInfo(xn6Var);
            I2.f264573b.setMute(bVar.isMute());
            I2.f264573b.setKeepScreenOn(true);
            if (i17 == 0) {
                fn4.c1 c1Var = I2.f264573b;
                c1Var.P1 = str2;
                c1Var.start();
            } else {
                fn4.c1 c1Var2 = I2.f264573b;
                c1Var2.P1 = str2;
                c1Var2.j0(i17, true);
            }
            ((com.tencent.mm.plugin.topstory.ui.video.TopStoryVideoPlayTextureView) I2.f264573b.f189748q).setAlpha(1.0f);
            I2.f264575d = xn6Var;
            I2.f264576e = true;
            I2.f264577f = false;
        }
        return true;
    }

    public abstract void o();

    public void p() {
        this.f264512g.setImageDrawable(null);
        n11.a.b().h(this.E.f390257f, this.f264512g, F);
        android.widget.TextView textView = this.B;
        if (textView != null) {
            textView.animate().cancel();
            this.B.setVisibility(8);
        }
    }

    public void q(r45.xn6 xn6Var, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryBaseVideoContainer", "updateView position:%s", java.lang.Integer.valueOf(i17));
        this.E = xn6Var;
        p();
    }
}
