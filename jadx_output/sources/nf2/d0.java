package nf2;

/* loaded from: classes10.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final nf2.e1 f336666a;

    /* renamed from: b, reason: collision with root package name */
    public final nf2.g0 f336667b;

    /* renamed from: c, reason: collision with root package name */
    public final nf2.f1 f336668c;

    /* renamed from: d, reason: collision with root package name */
    public float f336669d;

    /* renamed from: e, reason: collision with root package name */
    public float f336670e;

    /* renamed from: f, reason: collision with root package name */
    public float f336671f;

    /* renamed from: g, reason: collision with root package name */
    public float f336672g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f336673h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f336674i;

    /* renamed from: j, reason: collision with root package name */
    public final android.os.Handler f336675j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.Runnable f336676k;

    /* renamed from: l, reason: collision with root package name */
    public nf2.x f336677l;

    /* renamed from: m, reason: collision with root package name */
    public yz5.p f336678m;

    public d0(nf2.e1 viewProvider, nf2.g0 positionManager, nf2.f1 config) {
        kotlin.jvm.internal.o.g(viewProvider, "viewProvider");
        kotlin.jvm.internal.o.g(positionManager, "positionManager");
        kotlin.jvm.internal.o.g(config, "config");
        this.f336666a = viewProvider;
        this.f336667b = positionManager;
        this.f336668c = config;
        this.f336674i = true;
        this.f336675j = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public final void a() {
        java.lang.Runnable runnable = this.f336676k;
        if (runnable != null) {
            this.f336675j.removeCallbacks(runnable);
        }
        this.f336676k = null;
    }

    public final void b(float f17, float f18) {
        this.f336673h = false;
        com.tencent.mars.xlog.Log.i("LiveLyricsGestureHelper", "exitDragMode: position=(" + f17 + ", " + f18 + ')');
        nf2.x xVar = this.f336677l;
        if (xVar != null) {
            nf2.w wVar = ((nf2.b) xVar).f336656a;
            com.tencent.mm.plugin.finder.live.view.ub ubVar = wVar.f291099e;
            if (ubVar != null) {
                ubVar.onPluginAlphaModify(0.3f, 1.0f);
            }
            float f19 = 100;
            int f27 = e06.p.f((int) (f17 * f19), 0, 100);
            int f28 = e06.p.f((int) (f18 * f19), 0, 100);
            mm2.m6 Z6 = wVar.Z6();
            Z6.getClass();
            Z6.A = e06.p.f(f27, 0, 100);
            Z6.B = e06.p.f(f28, 0, 100);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(wVar.Z6().A);
            sb6.append('#');
            sb6.append(wVar.Z6().B);
            te2.a9.f417883a.e(1, sb6.toString());
        }
    }

    public final android.view.View c() {
        nf2.e1 e1Var = this.f336666a;
        nf2.d1 d1Var = (nf2.d1) e1Var;
        android.view.View view = d1Var.f336686g;
        if (view == null) {
            view = d1Var.f336685f;
        }
        return view == null ? ((nf2.d1) e1Var).f336685f : view;
    }

    public final boolean d(android.view.MotionEvent motionEvent, android.view.View view) {
        android.view.View view2;
        if (!this.f336674i || (view2 = ((nf2.d1) this.f336666a).f336685f) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            nf2.g0 g0Var = this.f336667b;
            if (action == 1) {
                double sqrt = java.lang.Math.sqrt(java.lang.Math.pow(motionEvent.getRawX() - this.f336671f, 2.0d) + java.lang.Math.pow(motionEvent.getRawY() - this.f336672g, 2.0d));
                a();
                if (this.f336673h) {
                    jz5.l c17 = g0Var.c();
                    yz5.p pVar = this.f336678m;
                    java.lang.Object obj = c17.f302834e;
                    java.lang.Object obj2 = c17.f302833d;
                    if (pVar != null) {
                        pVar.invoke(obj2, obj);
                    }
                    com.tencent.mars.xlog.Log.i("LiveLyricsGestureHelper", "position saved: " + c17);
                    b(((java.lang.Number) obj2).floatValue(), ((java.lang.Number) obj).floatValue());
                } else if (sqrt < 10.0d && view != null) {
                    view.performClick();
                }
            } else if (action != 2) {
                if (action == 3) {
                    a();
                    if (this.f336673h) {
                        jz5.l c18 = g0Var.c();
                        yz5.p pVar2 = this.f336678m;
                        java.lang.Object obj3 = c18.f302834e;
                        java.lang.Object obj4 = c18.f302833d;
                        if (pVar2 != null) {
                            pVar2.invoke(obj4, obj3);
                        }
                        b(((java.lang.Number) obj4).floatValue(), ((java.lang.Number) obj3).floatValue());
                    }
                }
            } else {
                if (java.lang.Math.sqrt(java.lang.Math.pow(motionEvent.getRawX() - this.f336671f, 2.0d) + java.lang.Math.pow(motionEvent.getRawY() - this.f336672g, 2.0d)) > 10.0d && !this.f336673h) {
                    a();
                    return true;
                }
                if (this.f336673h) {
                    float rawX = motionEvent.getRawX() - this.f336669d;
                    float rawY = motionEvent.getRawY() - this.f336670e;
                    android.view.View b17 = g0Var.b();
                    if (b17 != null) {
                        jz5.l a17 = g0Var.a(rawX, rawY);
                        b17.setX(((java.lang.Number) a17.f302833d).floatValue());
                        b17.setY(((java.lang.Number) a17.f302834e).floatValue());
                    }
                    jz5.l c19 = g0Var.c();
                    nf2.x xVar = this.f336677l;
                    java.lang.Object obj5 = c19.f302834e;
                    java.lang.Object obj6 = c19.f302833d;
                    if (xVar != null) {
                        float floatValue = ((java.lang.Number) obj6).floatValue();
                        float floatValue2 = ((java.lang.Number) obj5).floatValue();
                        float f17 = 100;
                        int f18 = e06.p.f((int) (floatValue * f17), 0, 100);
                        int f19 = e06.p.f((int) (floatValue2 * f17), 0, 100);
                        mm2.m6 Z6 = ((nf2.b) xVar).f336656a.Z6();
                        Z6.getClass();
                        Z6.A = e06.p.f(f18, 0, 100);
                        Z6.B = e06.p.f(f19, 0, 100);
                    }
                    yz5.p pVar3 = this.f336678m;
                    if (pVar3 != null) {
                        pVar3.invoke(obj6, obj5);
                    }
                }
            }
        } else {
            this.f336671f = motionEvent.getRawX();
            this.f336672g = motionEvent.getRawY();
            this.f336669d = motionEvent.getRawX() - view2.getX();
            this.f336670e = motionEvent.getRawY() - view2.getY();
            nf2.y yVar = new nf2.y(this);
            this.f336676k = yVar;
            this.f336675j.postDelayed(yVar, this.f336668c.f336722d);
        }
        return true;
    }

    public final void e() {
        a();
        this.f336675j.removeCallbacksAndMessages(null);
        this.f336677l = null;
        this.f336678m = null;
        this.f336673h = false;
        android.view.View c17 = c();
        if (c17 != null) {
            c17.setOnTouchListener(null);
        }
        android.view.View view = ((nf2.d1) this.f336666a).f336696q;
        if (view != null) {
            view.setOnTouchListener(null);
        }
        com.tencent.mars.xlog.Log.i("LiveLyricsGestureHelper", "release");
    }
}
