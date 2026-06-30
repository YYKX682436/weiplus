package gd2;

/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f270564a;

    /* renamed from: b, reason: collision with root package name */
    public final gd2.p f270565b;

    /* renamed from: c, reason: collision with root package name */
    public final g04.h f270566c;

    /* renamed from: d, reason: collision with root package name */
    public final gd2.o f270567d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f270568e;

    /* renamed from: f, reason: collision with root package name */
    public g04.j f270569f;

    /* renamed from: g, reason: collision with root package name */
    public int f270570g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f270571h;

    /* renamed from: i, reason: collision with root package name */
    public int f270572i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.ImageView f270573j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.ImageView f270574k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.ImageView f270575l;

    /* renamed from: m, reason: collision with root package name */
    public final android.animation.ValueAnimator f270576m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f270577n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.network.s0 f270578o;

    /* renamed from: p, reason: collision with root package name */
    public sy3.c f270579p;

    /* renamed from: q, reason: collision with root package name */
    public long f270580q;

    /* renamed from: r, reason: collision with root package name */
    public final sy3.e f270581r;

    public x(com.tencent.mm.ui.MMActivity activity, gd2.p callback, g04.h engineCallBack, gd2.o imageOCRCallback, boolean z17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlin.jvm.internal.o.g(engineCallBack, "engineCallBack");
        kotlin.jvm.internal.o.g(imageOCRCallback, "imageOCRCallback");
        this.f270564a = activity;
        this.f270565b = callback;
        this.f270566c = engineCallBack;
        this.f270567d = imageOCRCallback;
        this.f270568e = z17;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        kotlin.jvm.internal.o.f(ofFloat, "ofFloat(...)");
        this.f270576m = ofFloat;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ScanTranslationResultEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ScanTranslationResultEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.ui.commentimage.menu.FinderCommentImageTransAndOcrLogic$scanTranslationResultEventListener$1
            {
                this.__eventId = -1699517927;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ScanTranslationResultEvent scanTranslationResultEvent) {
                com.tencent.mm.autogen.events.ScanTranslationResultEvent event = scanTranslationResultEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("scanTranslationResult ");
                am.ct ctVar = event.f54739g;
                sb6.append(ctVar.f6400a);
                sb6.append(", ");
                sb6.append(ctVar.f6402c);
                com.tencent.mars.xlog.Log.i("FinderCommentImageTransAndOcrLogic", sb6.toString());
                pm0.v.X(new gd2.w(gd2.x.this, event));
                return true;
            }
        };
        this.f270577n = iListener;
        this.f270578o = new gd2.v(this);
        this.f270581r = new gd2.q(this);
        android.view.View findViewById = activity.findViewById(com.tencent.mm.R.id.ma9);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f270574k = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = activity.findViewById(com.tencent.mm.R.id.ma7);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f270575l = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = activity.findViewById(com.tencent.mm.R.id.ma_);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f270573j = (android.widget.ImageView) findViewById3;
        android.widget.ImageView imageView = this.f270575l;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("cancelTranslationBtn");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin += com.tencent.mm.ui.bk.j(activity);
        android.widget.ImageView imageView2 = this.f270575l;
        if (imageView2 == null) {
            kotlin.jvm.internal.o.o("cancelTranslationBtn");
            throw null;
        }
        imageView2.setLayoutParams(layoutParams2);
        android.widget.ImageView imageView3 = this.f270575l;
        if (imageView3 == null) {
            kotlin.jvm.internal.o.o("cancelTranslationBtn");
            throw null;
        }
        imageView3.setOnClickListener(new gd2.s(this));
        ofFloat.setDuration(5000L);
        ofFloat.addListener(new gd2.r(this, this));
        ofFloat.addUpdateListener(new gd2.t(this, androidx.window.layout.WindowMetricsCalculator.INSTANCE.getOrCreate().computeCurrentWindowMetrics(activity).getBounds().height()));
        iListener.alive();
    }

    public static final void a(gd2.x xVar) {
        android.widget.ImageView imageView = xVar.f270573j;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("scanLine");
            throw null;
        }
        imageView.setVisibility(8);
        android.widget.ImageView imageView2 = xVar.f270574k;
        if (imageView2 == null) {
            kotlin.jvm.internal.o.o("scanTransLayer");
            throw null;
        }
        imageView2.setVisibility(8);
        android.widget.ImageView imageView3 = xVar.f270575l;
        if (imageView3 == null) {
            kotlin.jvm.internal.o.o("cancelTranslationBtn");
            throw null;
        }
        imageView3.setVisibility(8);
        android.animation.ValueAnimator valueAnimator = xVar.f270576m;
        valueAnimator.setRepeatMode(1);
        valueAnimator.setRepeatCount(0);
        valueAnimator.end();
    }

    public final boolean b() {
        sy3.c cVar = this.f270579p;
        if (cVar == null) {
            return false;
        }
        if (cVar == null) {
            kotlin.jvm.internal.o.o("imageOCRHelper");
            throw null;
        }
        if (((kz3.l) cVar).c()) {
            return false;
        }
        ((gd2.j) this.f270567d).a();
        sy3.c cVar2 = this.f270579p;
        if (cVar2 == null) {
            kotlin.jvm.internal.o.o("imageOCRHelper");
            throw null;
        }
        if (!((kz3.l) cVar2).b(this.f270580q)) {
            return false;
        }
        this.f270580q = 0L;
        return true;
    }

    public final void c() {
        this.f270572i = 0;
        android.widget.ImageView imageView = this.f270573j;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("scanLine");
            throw null;
        }
        imageView.setVisibility(8);
        android.widget.ImageView imageView2 = this.f270574k;
        if (imageView2 == null) {
            kotlin.jvm.internal.o.o("scanTransLayer");
            throw null;
        }
        imageView2.setVisibility(8);
        android.widget.ImageView imageView3 = this.f270575l;
        if (imageView3 == null) {
            kotlin.jvm.internal.o.o("cancelTranslationBtn");
            throw null;
        }
        imageView3.setVisibility(8);
        android.animation.ValueAnimator valueAnimator = this.f270576m;
        valueAnimator.setRepeatMode(1);
        valueAnimator.setRepeatCount(0);
        valueAnimator.end();
    }

    public final void d(java.lang.String imgPath) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(imgPath, "imgPath");
        com.tencent.mm.ui.MMActivity mMActivity = this.f270564a;
        if (mMActivity.isFinishing()) {
            return;
        }
        if (this.f270569f == null) {
            i95.m c17 = i95.n0.c(kd0.h2.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            this.f270569f = new com.tencent.mm.plugin.scanner.word.ImageWordScanDetailEngine(mMActivity);
        }
        g04.j jVar = this.f270569f;
        if (jVar != null) {
            ((com.tencent.mm.plugin.scanner.word.ImageWordScanDetailEngine) jVar).b(imgPath, this.f270566c);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("FinderCommentImageTransAndOcrLogic", "scanEngine is null!!");
        }
    }
}
