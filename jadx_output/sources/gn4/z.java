package gn4;

/* loaded from: classes15.dex */
public class z extends fn4.g {
    public static final /* synthetic */ int V = 0;
    public gn4.c0 G;
    public fn4.h0 H;
    public android.view.View.OnClickListener I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.View.OnClickListener f273664J;
    public android.view.View.OnClickListener K;
    public android.view.View.OnClickListener L;
    public android.view.View.OnClickListener M;
    public boolean N;
    public android.view.View P;
    public android.widget.TextView Q;
    public android.widget.TextView R;
    public android.widget.ImageView S;
    public android.widget.ImageView T;
    public final com.tencent.mm.pluginsdk.ui.b1 U;

    public z(android.content.Context context, fn4.b bVar, fn4.a aVar) {
        super(context, bVar, aVar);
        this.U = new gn4.l(this);
        if (this.A.p6()) {
            this.f264512g.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        }
    }

    @Override // fn4.g
    public void a() {
        if (this instanceof gn4.f1) {
            return;
        }
        android.view.View view = this.P;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "closePointVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "closePointVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // fn4.g
    public com.tencent.mm.pluginsdk.ui.e1 b(r45.xn6 xn6Var) {
        return com.tencent.mm.pluginsdk.ui.e1.CONTAIN;
    }

    @Override // fn4.g
    public void c() {
        gn4.c0 c0Var = this.G;
        if (c0Var != null) {
            c0Var.w();
        }
    }

    @Override // fn4.g
    public void d() {
        super.d();
        boolean z17 = this instanceof gn4.f1;
        if (!z17) {
            this.P = findViewById(com.tencent.mm.R.id.kz7);
            this.Q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kz8);
            this.R = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486352kz5);
            this.S = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.kz6);
            this.T = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f486351kz4);
        }
        this.I = new gn4.q(this);
        this.f273664J = new gn4.r(this);
        this.K = new gn4.s(this);
        this.L = new gn4.t(this);
        this.M = new gn4.u(this);
        this.f264517o.setOnClickListener(new gn4.v(this));
        this.f264515m.setOnClickListener(new gn4.w(this));
        this.f264516n.setOnClickListener(new gn4.x(this));
        this.f264521s.setOnClickListener(new gn4.g(this));
        if (!z17) {
            this.P.setOnClickListener(new gn4.i(this));
            this.T.setOnClickListener(new gn4.j(this));
        }
        r();
        if (getFSVideoUIComponent().p6()) {
            this.G = new gn4.g1(getContext());
        } else {
            this.G = new gn4.c0(getContext());
            if (com.tencent.mm.ui.bk.u(getContext(), false)) {
                this.G.I.setPadding(i65.a.b(getContext(), 24), 0, i65.a.b(getContext(), 24), 0);
            }
        }
        this.G.setOnlyFS(z17);
        this.G.w();
        this.G.setShareBtnClickListener(this.f273664J);
        this.G.setWowBtnClickListener(this.K);
        this.G.setTagBtnClickListener(this.L);
        this.G.setSourceItemClickListener(this.M);
        if (1 >= com.tencent.mars.xlog.Log.getLogLevel()) {
            this.G.setTitleClickListener(new gn4.m(this));
        }
        this.G.setOnUpdateProgressLenListener(new gn4.n(this));
        this.G.setIplaySeekCallback(new gn4.o(this));
        this.G.setOnPlayButtonClickListener(new gn4.p(this));
    }

    @Override // fn4.g
    public boolean e() {
        android.view.View view = this.P;
        return view != null && view.getVisibility() == 0;
    }

    public gn4.a getFSItemUIComponent() {
        return (gn4.a) this.f264528z;
    }

    public fn4.b getFSVideoUIComponent() {
        return this.A;
    }

    @Override // fn4.g
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d1o;
    }

    public java.lang.String getSessionId() {
        return this.D;
    }

    public r45.xn6 getVideoInfo() {
        return this.E;
    }

    @Override // fn4.g
    public com.tencent.mm.pluginsdk.ui.b1 getVideoViewCallback() {
        return this.U;
    }

    @Override // fn4.g
    public void i() {
        super.i();
    }

    @Override // fn4.g
    public void l() {
        gn4.c0 c0Var = this.G;
        if (c0Var != null) {
            c0Var.x();
        }
    }

    @Override // fn4.g
    public void m() {
        r45.on6 on6Var;
        if (this instanceof gn4.f1) {
            return;
        }
        r45.pn6 pn6Var = this.E.Y;
        if (pn6Var == null || (on6Var = pn6Var.f383243n) == null) {
            android.view.View view = this.P;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "showPointVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "showPointVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        this.Q.setText(on6Var.f382382d);
        this.R.setText(this.E.Y.f383243n.f382383e);
        n11.a.b().h(this.E.Y.f383243n.f382388m, this.S, fn4.g.F);
        android.view.View view2 = this.P;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "showPointVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "showPointVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        pm4.y.i(this.A.r0(), this.E, 1);
    }

    @Override // fn4.g
    public void o() {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.G.f273599x0;
        if (b4Var != null) {
            b4Var.d();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        fn4.h0 h0Var = this.H;
        if (h0Var == null) {
            return true;
        }
        h0Var.a(motionEvent);
        return true;
    }

    @Override // fn4.g
    public void p() {
        super.p();
        gn4.c0 c0Var = this.G;
        if (c0Var != null) {
            c0Var.setVideoTotalTime(this.E.f390258g);
            this.G.A(this.E);
        }
        if (getFSItemUIComponent() != null && ((gn4.d0) getFSItemUIComponent()).getAdapterPosition() != getFSVideoUIComponent().Y2()) {
            if (getFSVideoUIComponent().s1().b()) {
                j();
            } else {
                k(getNoNetTip(), getContext().getString(com.tencent.mm.R.string.f493446k80));
            }
        }
        android.widget.TextView textView = this.f264514i;
        if (textView != null) {
            textView.setText(this.E.f390255d);
            com.tencent.mm.ui.bk.r0(this.f264514i.getPaint(), 0.8f);
        }
    }

    public void r() {
        this.H = new fn4.h0(getContext(), this, new gn4.y(this));
    }

    public void s() {
        android.view.View view = this.f264521s;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f264520r;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f264512g.setVisibility(0);
        this.f264510e.setVisibility(8);
        this.f264509d.setVisibility(8);
        this.f264525w.setVisibility(8);
    }

    public void t() {
        android.view.View view = this.f264521s;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!(getFSVideoUIComponent().s1().f264569c == 2) || su4.r2.k()) {
            android.view.View view2 = this.f264520r;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view3 = this.f264520r;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f264512g.setVisibility(0);
        this.f264510e.setVisibility(8);
        this.f264509d.setVisibility(8);
        this.f264525w.setVisibility(8);
        android.view.View view4 = this.f264523u;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view5 = this.f264522t;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f264515m.setVisibility(0);
        this.f264516n.setVisibility(8);
        this.f264519q.setVisibility(8);
    }

    public void u() {
        this.G.B(this.E);
    }

    @Override // fn4.g
    public gn4.c0 getControlBar() {
        return this.G;
    }
}
