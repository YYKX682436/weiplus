package hn4;

/* loaded from: classes15.dex */
public class z extends fn4.g {
    public static final /* synthetic */ int T = 0;
    public hn4.c0 G;
    public fn4.h0 H;
    public android.view.View.OnClickListener I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f282608J;
    public android.view.View K;
    public android.widget.TextView L;
    public android.view.View M;
    public android.widget.TextView N;
    public android.widget.TextView P;
    public android.widget.ImageView Q;
    public android.widget.ImageView R;
    public final com.tencent.mm.pluginsdk.ui.b1 S;

    public z(android.content.Context context, fn4.b bVar, fn4.a aVar) {
        super(context, bVar, aVar);
        this.S = new hn4.x(this);
    }

    @Override // fn4.g
    public void a() {
        android.view.View view = this.M;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "closePointVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "closePointVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // fn4.g
    public com.tencent.mm.pluginsdk.ui.e1 b(r45.xn6 xn6Var) {
        return com.tencent.mm.pluginsdk.ui.e1.CONTAIN;
    }

    @Override // fn4.g
    public void c() {
        hn4.c0 c0Var = this.G;
        if (c0Var != null) {
            c0Var.w();
        }
    }

    @Override // fn4.g
    public void d() {
        super.d();
        this.K = findViewById(com.tencent.mm.R.id.iqc);
        this.L = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485711iq3);
        this.M = findViewById(com.tencent.mm.R.id.kz7);
        this.N = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kz8);
        this.P = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486352kz5);
        this.Q = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.kz6);
        this.R = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f486351kz4);
        this.I = new hn4.n(this);
        this.f264517o.setOnClickListener(new hn4.o(this));
        this.f264515m.setOnClickListener(new hn4.p(this));
        this.f264516n.setOnClickListener(new hn4.q(this));
        this.f264521s.setOnClickListener(new hn4.r(this));
        this.K.setOnClickListener(new hn4.s(this));
        android.view.View view = this.M;
        if (view != null) {
            view.setOnClickListener(new hn4.u(this));
        }
        android.widget.ImageView imageView = this.R;
        if (imageView != null) {
            imageView.setOnClickListener(new hn4.v(this));
        }
        this.H = new fn4.h0(getContext(), this, new hn4.y(this));
        hn4.c0 c0Var = new hn4.c0(getContext());
        this.G = c0Var;
        c0Var.w();
        this.G.setFullScreenBtnClickListener(this.I);
        this.G.setOnUpdateProgressLenListener(new hn4.k(this));
        this.G.setIplaySeekCallback(new hn4.l(this));
        this.G.setOnPlayButtonClickListener(new hn4.m(this));
    }

    @Override // fn4.g
    public boolean e() {
        return this.M.getVisibility() == 0;
    }

    @Override // fn4.g
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489583d20;
    }

    public hn4.a getListItemUIComponent() {
        return (hn4.a) this.f264528z;
    }

    public hn4.b getListVideoUIComponent() {
        return (hn4.b) this.A;
    }

    public java.lang.String getSessionId() {
        return this.D;
    }

    public r45.xn6 getVideoInfo() {
        return this.E;
    }

    @Override // fn4.g
    public com.tencent.mm.pluginsdk.ui.b1 getVideoViewCallback() {
        return this.S;
    }

    @Override // fn4.g
    public void i() {
        super.i();
    }

    @Override // fn4.g
    public void m() {
        r45.on6 on6Var;
        r45.pn6 pn6Var = this.E.Y;
        if (pn6Var == null || (on6Var = pn6Var.f383243n) == null) {
            android.view.View view = this.M;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "showPointVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "showPointVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        this.N.setText(on6Var.f382382d);
        this.P.setText(this.E.Y.f383243n.f382383e);
        n11.a.b().h(this.E.Y.f383243n.f382388m, this.Q, fn4.g.F);
        android.view.View view2 = this.M;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "showPointVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "showPointVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        pm4.y.i(this.A.r0(), this.E, 1);
        if (getControlBar().getVisibility() == 0) {
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.M.getLayoutParams();
            layoutParams.bottomMargin = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479723df);
            this.M.setLayoutParams(layoutParams);
        } else {
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.M.getLayoutParams();
            layoutParams2.bottomMargin = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479738dv);
            this.M.setLayoutParams(layoutParams2);
        }
    }

    @Override // fn4.g
    public boolean n(boolean z17, boolean z18) {
        boolean n17 = super.n(z17, z18);
        ((com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI) getListVideoUIComponent()).f175126J.l(((com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI) getListVideoUIComponent()).f175135o.f387518x);
        return n17;
    }

    @Override // fn4.g
    public void o() {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.G.F;
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
        hn4.c0 c0Var = this.G;
        if (c0Var != null) {
            c0Var.setVideoTotalTime(this.E.f390258g);
        }
        if (getListItemUIComponent() != null && ((fn4.m) getListItemUIComponent()).u() != ((com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI) getListVideoUIComponent()).f175135o.f387516v) {
            if (((com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI) getListVideoUIComponent()).G.b()) {
                j();
            } else {
                k(getNoNetTip(), getContext().getString(com.tencent.mm.R.string.f493446k80));
            }
        }
        if (this.E.V == null) {
            android.view.View view = this.K;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.K;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = this.L;
        long j17 = this.E.V.f390258g;
        textView.setText(j17 <= 0 ? "00:00" : j17 < 60 ? java.lang.String.format(java.util.Locale.getDefault(), "00:%02d", java.lang.Long.valueOf(j17 % 60)) : j17 < 3600 ? java.lang.String.format(java.util.Locale.getDefault(), "%02d:%02d", java.lang.Long.valueOf(j17 / 60), java.lang.Long.valueOf(j17 % 60)) : java.lang.String.format(java.util.Locale.getDefault(), "%02d:%02d:%02d", java.lang.Long.valueOf(j17 / 3600), java.lang.Long.valueOf((j17 % 3600) / 60), java.lang.Long.valueOf(j17 % 60)));
    }

    @Override // fn4.g
    public hn4.c0 getControlBar() {
        return this.G;
    }
}
