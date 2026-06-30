package wl5;

/* loaded from: classes15.dex */
public class x {
    public db5.g A;
    public int B;
    public int C;
    public final android.view.View.OnAttachStateChangeListener D;
    public final android.view.ViewTreeObserver.OnScrollChangedListener E;
    public final android.view.ViewTreeObserver.OnPreDrawListener F;
    public final android.view.ViewTreeObserver.OnGlobalLayoutListener G;
    public final android.view.View.OnTouchListener H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f447154J;
    public boolean K;
    public int S;
    public final boolean T;
    public wl5.p X;
    public wl5.u Y;
    public wl5.r Z;

    /* renamed from: a, reason: collision with root package name */
    public wl5.q f447155a;

    /* renamed from: a0, reason: collision with root package name */
    public java.util.ArrayList f447156a0;

    /* renamed from: b, reason: collision with root package name */
    public wl5.q f447157b;

    /* renamed from: d, reason: collision with root package name */
    public wl5.t f447159d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f447160e;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f447162g;

    /* renamed from: h, reason: collision with root package name */
    public wl5.n f447163h;

    /* renamed from: i, reason: collision with root package name */
    public android.content.Context f447164i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.View f447165j;

    /* renamed from: k, reason: collision with root package name */
    public final wl5.v f447166k;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View.OnClickListener f447170o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View.OnTouchListener f447171p;

    /* renamed from: r, reason: collision with root package name */
    public int f447173r;

    /* renamed from: s, reason: collision with root package name */
    public android.text.Spannable f447174s;

    /* renamed from: t, reason: collision with root package name */
    public final rl5.r f447175t;

    /* renamed from: u, reason: collision with root package name */
    public int f447176u;

    /* renamed from: v, reason: collision with root package name */
    public int f447177v;

    /* renamed from: w, reason: collision with root package name */
    public int f447178w;

    /* renamed from: x, reason: collision with root package name */
    public final int f447179x;

    /* renamed from: y, reason: collision with root package name */
    public final int f447180y;

    /* renamed from: z, reason: collision with root package name */
    public int f447181z;

    /* renamed from: c, reason: collision with root package name */
    public final wl5.w f447158c = new wl5.w(this);

    /* renamed from: f, reason: collision with root package name */
    public boolean f447161f = true;

    /* renamed from: l, reason: collision with root package name */
    public boolean f447167l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f447168m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f447169n = false;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f447172q = new java.util.ArrayList();
    public boolean L = false;
    public boolean M = true;
    public boolean N = true;
    public boolean O = true;
    public boolean P = false;
    public boolean Q = false;
    public final int[] R = new int[2];
    public final java.lang.Runnable U = new wl5.e(this);
    public final java.lang.Runnable V = new wl5.f(this);
    public final int[] W = new int[2];

    public x(wl5.o oVar) {
        this.f447160e = true;
        this.f447162g = true;
        this.f447176u = 0;
        this.I = false;
        this.f447154J = true;
        this.K = false;
        this.S = 0;
        this.T = true;
        android.view.View view = oVar.f447117a;
        this.f447165j = view;
        wl5.v vVar = oVar.f447118b;
        this.f447166k = vVar;
        this.f447170o = oVar.f447119c;
        this.f447171p = oVar.f447120d;
        this.f447175t = oVar.f447121e;
        this.f447176u = oVar.f447125i;
        this.S = oVar.f447126j;
        this.T = oVar.f447127k;
        this.f447160e = oVar.f447128l;
        this.f447162g = oVar.f447129m;
        this.f447164i = view.getContext();
        this.f447179x = oVar.f447123g;
        this.f447180y = oVar.f447122f;
        this.B = wl5.y.e(this.f447165j);
        if (this.f447181z == 0) {
            this.f447181z = (int) wl5.y.p(this.f447165j);
        } else {
            this.f447181z = com.tencent.mm.ui.zk.a(this.f447164i, oVar.f447124h);
        }
        wl5.g gVar = new wl5.g(this);
        this.D = gVar;
        wl5.h hVar = new wl5.h(this);
        this.F = hVar;
        wl5.i iVar = new wl5.i(this);
        this.E = iVar;
        wl5.j jVar = new wl5.j(this);
        this.G = jVar;
        wl5.k kVar = new wl5.k(this);
        this.H = kVar;
        java.util.Objects.toString(this.f447165j.getContext());
        java.util.Objects.toString(this.f447165j.getViewTreeObserver());
        if (!this.f447154J) {
            com.tencent.mm.ui.yk.a("SelectableTextHelper", "not destroy, isReInit: %s.", java.lang.Boolean.valueOf(this.I));
            this.I = true;
            return;
        }
        com.tencent.mm.ui.yk.a("SelectableTextHelper", "not init yet, need to init.", new java.lang.Object[0]);
        this.I = false;
        this.f447154J = false;
        this.K = false;
        if (vVar == null) {
            android.view.View view2 = this.f447165j;
            wl5.y.q(view2, wl5.y.o(view2), android.widget.TextView.BufferType.SPANNABLE);
        }
        j();
        this.f447165j.setOnLongClickListener(new wl5.l(this));
        com.tencent.mm.ui.yk.c("SelectableTextHelper", "init setOnTouchListener: mTextView=%s, mOnTouchListener=%s, hashCode=%s", this.f447165j, kVar, java.lang.Integer.valueOf(hashCode()));
        this.f447165j.setOnTouchListener(kVar);
        this.f447165j.setOnClickListener(new wl5.m(this));
        this.f447165j.addOnAttachStateChangeListener(gVar);
        this.f447165j.getViewTreeObserver().addOnPreDrawListener(hVar);
        this.f447165j.getViewTreeObserver().addOnScrollChangedListener(iVar);
        this.f447165j.getViewTreeObserver().addOnGlobalLayoutListener(jVar);
        this.f447165j.getViewTreeObserver().addOnGlobalLayoutListener(new wl5.b(this));
    }

    public static void a(wl5.x xVar, boolean z17) {
        for (android.view.ViewParent parent = xVar.f447165j.getParent(); parent != null; parent = parent.getParent()) {
            parent.requestDisallowInterceptTouchEvent(z17);
        }
    }

    public final int b(int i17, boolean z17) {
        java.util.ArrayList arrayList = this.f447156a0;
        if (arrayList == null) {
            return i17;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            wl5.s sVar = (wl5.s) it.next();
            int i18 = sVar.f447149a;
            if (i17 >= i18 && i17 < sVar.f447150b) {
                return z17 ? i18 : sVar.f447150b;
            }
        }
        return i17;
    }

    public void c() {
        java.util.Objects.toString(this.f447165j.getContext());
        java.util.Objects.toString(this.f447165j.getViewTreeObserver());
        this.I = false;
        this.f447154J = true;
        this.K = false;
        this.f447165j.removeCallbacks(this.U);
        this.f447165j.getViewTreeObserver().removeOnScrollChangedListener(this.E);
        this.f447165j.getViewTreeObserver().removeOnPreDrawListener(this.F);
        this.f447165j.getViewTreeObserver().removeOnGlobalLayoutListener(this.G);
        this.f447165j.removeOnAttachStateChangeListener(this.D);
        this.M = true;
        this.N = true;
        i();
        k();
        this.f447155a = null;
        this.f447157b = null;
        wl5.v vVar = this.f447166k;
        if (vVar != null) {
            vVar.a();
        }
    }

    public void d() {
        db5.g gVar;
        wl5.w wVar = this.f447158c;
        wVar.f447151a = 0;
        wVar.f447152b = 0;
        wVar.f447153c = null;
        android.text.Spannable spannable = this.f447174s;
        if (spannable != null && (gVar = this.A) != null) {
            spannable.removeSpan(gVar);
            this.A = null;
            android.view.View view = this.f447165j;
            if (view != null) {
                view.invalidate();
            }
        }
        wl5.t tVar = this.f447159d;
        if (tVar != null) {
            tVar.a("");
        }
    }

    public android.util.Pair e() {
        wl5.w wVar = this.f447158c;
        return new android.util.Pair(java.lang.Integer.valueOf(wVar.f447151a), java.lang.Integer.valueOf(wVar.f447152b));
    }

    public void f() {
        wl5.q qVar = this.f447155a;
        if (qVar != null) {
            qVar.f447130d.dismiss();
        }
        wl5.q qVar2 = this.f447157b;
        if (qVar2 != null) {
            qVar2.f447130d.dismiss();
        }
        this.f447169n = false;
    }

    public void g() {
        rl5.r rVar = this.f447175t;
        if (rVar != null) {
            rVar.a();
        }
    }

    public void h() {
        wl5.v vVar = this.f447166k;
        if (vVar != null) {
            vVar.a();
        }
    }

    public void i() {
        f();
        g();
        wl5.v vVar = this.f447166k;
        if (vVar != null) {
            vVar.a();
        }
        this.f447169n = false;
    }

    public final void j() {
        wl5.q qVar = new wl5.q(this, true);
        this.f447155a = qVar;
        qVar.f447147x = this.Z;
        if (this.f447166k != null) {
            qVar.f447130d.setOutsideTouchable(this.f447162g);
            if (this.f447160e) {
                wl5.q qVar2 = this.f447155a;
                qVar2.f447130d.setTouchInterceptor(new wl5.c(this));
            }
            wl5.q qVar3 = this.f447155a;
            qVar3.f447130d.setOnDismissListener(new wl5.d(this));
        }
        wl5.q qVar4 = new wl5.q(this, false);
        this.f447157b = qVar4;
        qVar4.f447147x = this.Z;
    }

    public void k() {
        db5.g gVar;
        this.f447158c.f447153c = null;
        android.text.Spannable spannable = this.f447174s;
        if (spannable == null || (gVar = this.A) == null) {
            return;
        }
        spannable.removeSpan(gVar);
        this.A = null;
        android.view.View view = this.f447165j;
        if (view != null) {
            view.invalidate();
        }
    }

    public void l(int i17, int i18) {
        int i19;
        boolean z17 = this.f447169n;
        wl5.w wVar = this.f447158c;
        if (z17) {
            com.tencent.mm.ui.yk.c("SelectableTextHelper", "is illegalSelect! startPos: %s. endPos:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        } else {
            if (i17 != -1) {
                wVar.f447151a = b(i17, true);
            }
            if (i18 != -1) {
                wVar.f447152b = b(i18, false);
            }
        }
        int i27 = wVar.f447151a;
        if (i27 < 0 || i27 > wl5.y.o(this.f447165j).length() || (i19 = wVar.f447152b) < 0 || i19 > wl5.y.o(this.f447165j).length()) {
            return;
        }
        int i28 = wVar.f447151a;
        int i29 = wVar.f447152b;
        if (i28 > i29) {
            wVar.f447151a = i29;
            wVar.f447152b = i28;
        }
        android.text.Spannable spannable = this.f447174s;
        if (spannable != null) {
            wVar.f447153c = spannable.subSequence(wVar.f447151a, wVar.f447152b).toString();
            db5.g gVar = this.A;
            if (gVar != null) {
                int i37 = wVar.f447151a;
                int i38 = wVar.f447152b;
                gVar.f228338f = i37;
                gVar.f228339g = i38;
            } else {
                wl5.n nVar = this.f447163h;
                int i39 = this.f447179x;
                if (nVar != null) {
                    android.view.View view = this.f447165j;
                    int color = this.f447164i.getResources().getColor(i39);
                    int i47 = wVar.f447151a;
                    int i48 = wVar.f447152b;
                    ((bd4.t1) nVar).getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createSpan", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$createSelectableTextHelper$6");
                    db5.b9 b9Var = new db5.b9(view, color, i47, i48);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSpan", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$createSelectableTextHelper$6");
                    this.A = b9Var;
                } else {
                    this.A = new db5.g(this.f447165j, this.f447164i.getResources().getColor(i39), wVar.f447151a, wVar.f447152b);
                }
            }
            this.f447174s.setSpan(this.A, wl5.y.h(this.f447165j, wl5.y.d(this.f447165j, wVar.f447151a)), wVar.f447152b, 17);
            this.f447165j.invalidate();
            wl5.t tVar = this.f447159d;
            if (tVar != null) {
                tVar.a(wVar.f447153c);
            }
        }
    }

    public void m(boolean z17) {
        this.L = z17;
    }

    public void n(java.lang.Boolean bool) {
        this.f447167l = bool.booleanValue();
    }

    public void o() {
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) this.f447164i.getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        if (this.f447155a == null || this.f447157b == null) {
            j();
        }
        p(this.f447155a);
        p(this.f447157b);
    }

    public final void p(wl5.q qVar) {
        boolean z17;
        int i17;
        int i18;
        if (qVar == null) {
            return;
        }
        boolean z18 = qVar.f447136m;
        wl5.w wVar = this.f447158c;
        int i19 = z18 ? wVar.f447151a : wVar.f447152b;
        if (wVar.f447151a != wVar.f447152b && i19 >= 0 && i19 <= wl5.y.o(this.f447165j).length()) {
            boolean z19 = qVar.f447136m;
            wl5.p pVar = this.X;
            if (pVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canShowHandle", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$createSelectableTextHelper$3");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$canShowCursorHandle", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                z17 = ((bd4.q1) pVar).f19382a.i(z19);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$canShowCursorHandle", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canShowHandle", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$createSelectableTextHelper$3");
            } else {
                z17 = true;
            }
            if (z17) {
                android.text.TextPaint l17 = wl5.y.l(this.f447165j);
                if (l17 != null) {
                    int i27 = (int) l17.getFontMetrics().descent;
                    android.view.View view = this.f447165j;
                    i18 = wl5.y.b(view, wl5.y.d(view, i19)) + i27;
                    i17 = (int) wl5.y.m(this.f447165j, i19);
                } else {
                    i17 = 0;
                    i18 = 0;
                }
                wl5.x xVar = qVar.f447148y;
                xVar.f447165j.getLocationInWindow(qVar.f447140q);
                boolean z27 = qVar.f447136m;
                int i28 = z27 ? qVar.f447133g : 0;
                if (!z27) {
                    int[] e17 = qVar.e(i17, i18);
                    int i29 = e17[0] + qVar.f447135i;
                    i18 = e17[1];
                    i17 = i29;
                }
                try {
                    qVar.f447130d.showAtLocation(xVar.f447165j, 0, (i17 - i28) + qVar.a(), i18 + qVar.b());
                } catch (java.lang.Exception e18) {
                    com.tencent.mm.ui.yk.b("SelectableTextHelper", "error! message: %s.", e18.getMessage());
                }
            }
        }
    }

    public void q() {
        rl5.r rVar = this.f447175t;
        if (rVar != null) {
            int[] iArr = new int[2];
            this.f447165j.getLocationInWindow(iArr);
            wl5.w wVar = this.f447158c;
            int i17 = wVar.f447152b;
            int length = wl5.y.o(this.f447165j).length();
            if (i17 >= length) {
                i17 = length - 1;
            }
            float m17 = wl5.y.m(this.f447165j, wVar.f447151a);
            float m18 = wl5.y.m(this.f447165j, i17);
            if (wl5.y.d(this.f447165j, wVar.f447152b) > wl5.y.d(this.f447165j, wVar.f447151a) || m18 <= m17) {
                android.view.View view = this.f447165j;
                m18 = wl5.y.j(view, wl5.y.d(view, wVar.f447151a));
            }
            if (this.f447176u == 0) {
                this.f447176u = iArr[0] + this.f447165j.getPaddingLeft();
            }
            int i18 = ((int) ((m17 + m18) / 2.0f)) + this.f447176u;
            android.view.View view2 = this.f447165j;
            int i19 = wl5.y.i(view2, wl5.y.d(view2, wVar.f447151a)) + iArr[1] + this.f447164i.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.u_);
            com.tencent.mm.ui.yk.a("SelectableTextHelper", "dancy test posX:%s, startline:%s, endline:%s, leftpadding:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(wl5.y.d(this.f447165j, wVar.f447151a)), java.lang.Integer.valueOf(wl5.y.d(this.f447165j, wVar.f447152b)), java.lang.Integer.valueOf(this.f447176u));
            if (i18 <= 0) {
                i18 = 16;
            }
            if (i19 < 0) {
                i19 = 16;
            }
            if (i18 > wl5.y.n(this.f447164i)) {
                i18 = wl5.y.n(this.f447164i) - 16;
            }
            int i27 = this.S;
            if (i27 != 0) {
                i19 += i27;
            }
            rVar.n(i18, i19);
        }
        wl5.v vVar = this.f447166k;
        if (vVar != null) {
            vVar.b();
        }
    }

    public void r() {
        wl5.v vVar = this.f447166k;
        if (vVar != null) {
            vVar.f(this.f447165j);
        }
    }

    public void s(int i17, int i18) {
        k();
        if (wl5.y.o(this.f447165j) instanceof android.text.Spannable) {
            this.f447174s = (android.text.Spannable) wl5.y.o(this.f447165j);
        }
        if (this.f447174s != null && i17 < wl5.y.o(this.f447165j).length()) {
            l(i17, i18);
            return;
        }
        wl5.w wVar = this.f447158c;
        wVar.f447151a = 0;
        wVar.f447152b = 0;
    }
}
