package kr3;

/* loaded from: classes11.dex */
public class q0 extends com.tencent.mm.ui.component.UIComponent {
    public static final java.util.List A = kz5.c0.i(com.tencent.mm.plugin.profile.ui.mod.components.k1.class, com.tencent.mm.plugin.profile.ui.mod.components.x0.class, com.tencent.mm.plugin.profile.ui.mod.components.o0.class, com.tencent.mm.plugin.profile.ui.mod.components.h.class, com.tencent.mm.plugin.profile.ui.mod.components.j0.class);

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f311430d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.o4 f311431e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f311432f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f311433g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f311434h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f311435i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f311436m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f311437n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f311438o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f311439p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f311440q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f311441r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f311442s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f311443t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f311444u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f311445v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f311446w;

    /* renamed from: x, reason: collision with root package name */
    public int f311447x;

    /* renamed from: y, reason: collision with root package name */
    public long f311448y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f311449z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f311430d = jz5.h.b(new kr3.a0(activity));
        this.f311431e = com.tencent.mm.sdk.platformtools.o4.M("MicroMsg.ModProfile.ContactAssembleManagerUIC");
        this.f311432f = jz5.h.b(new kr3.o0(this));
        this.f311437n = jz5.h.b(new kr3.p0(this));
        this.f311439p = jz5.h.b(new kr3.v(this, activity));
        this.f311440q = jz5.h.b(new kr3.z(this));
        this.f311441r = jz5.h.b(new kr3.y(this));
        this.f311442s = jz5.h.b(new kr3.w(this));
        this.f311443t = jz5.h.b(new kr3.x(this));
        this.f311444u = jz5.h.b(new kr3.u(this));
        this.f311445v = new java.util.concurrent.atomic.AtomicInteger(1);
        this.f311448y = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(gm0.j1.b().h());
        sb6.append('_');
        sb6.append(c01.id.c());
        this.f311449z = sb6.toString();
    }

    public static final void O6(kr3.q0 q0Var) {
        if (!q0Var.S6()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ContactAssembleManagerUIC", "onSaveWrapper(): not change, exit");
            q0Var.W6(null);
            q0Var.getActivity().finish();
        } else {
            if (q0Var.U6()) {
                q0Var.f311436m = true;
                kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
                com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(q0Var.getActivity(), q0Var.getActivity().getString(com.tencent.mm.R.string.f490573yv), q0Var.getString(com.tencent.mm.R.string.p6s), true, true, new kr3.g0(h0Var));
                com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ContactAssembleManagerUIC", "modProfileSync");
                h0Var.f310123d = kotlinx.coroutines.l.d(q0Var.getLifecycleScope(), null, null, new kr3.f0(q0Var, Q, null), 3, null);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ContactAssembleManagerUIC", "onSaveWrapper(): not valid");
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(q0Var.getActivity());
            u1Var.g(q0Var.getString(com.tencent.mm.R.string.nbj));
            u1Var.a(true);
            u1Var.n(q0Var.getString(com.tencent.mm.R.string.f489708h));
            u1Var.q(false);
        }
    }

    public static final void P6(android.content.Intent intent) {
        kotlin.jvm.internal.o.g(intent, "intent");
        lk5.s.e(intent, true);
        if (j62.e.g().c(new com.tencent.mm.repairer.config.remark.RepairerConfigProfileWxContact()) == 1) {
            java.util.Iterator it = kr3.q1.A.iterator();
            while (it.hasNext()) {
                pf5.j0.a(intent, (java.lang.Class) it.next());
            }
        } else {
            java.util.Iterator it6 = A.iterator();
            while (it6.hasNext()) {
                pf5.j0.a(intent, (java.lang.Class) it6.next());
            }
        }
        intent.putExtra(com.tencent.mm.ui.vas.VASActivity.KEY_VAS_START_MODE, 1);
    }

    public final void Q6(int i17) {
        if (i17 > 0) {
            this.f311446w = true;
        } else if (i17 < 0) {
            this.f311447x = java.lang.Math.min(this.f311447x, i17);
        }
        if (this.f311445v.decrementAndGet() <= 0) {
            int i18 = this.f311447x;
            if (i18 == -1) {
                androidx.appcompat.app.AppCompatActivity activity = getActivity();
                int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activity);
                e4Var.d(com.tencent.mm.R.string.f492810oe5);
                e4Var.f211779f = false;
                e4Var.c();
                return;
            }
            if (i18 != 0) {
                androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
                int i27 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(activity2);
                e4Var2.d(com.tencent.mm.R.string.ocw);
                e4Var2.f211779f = false;
                e4Var2.c();
                return;
            }
            if (this.f311446w) {
                androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
                int i28 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var3 = new com.tencent.mm.ui.widget.dialog.e4(activity3);
                e4Var3.d(com.tencent.mm.R.string.f492768od2);
                e4Var3.f211779f = false;
                e4Var3.c();
            }
        }
    }

    public final java.util.List R6() {
        return (java.util.List) ((jz5.n) this.f311439p).getValue();
    }

    public final boolean S6() {
        boolean z17 = true;
        if (this.f311435i) {
            return true;
        }
        java.util.List<java.lang.Class> R6 = R6();
        if (!(R6 instanceof java.util.Collection) || !R6.isEmpty()) {
            for (java.lang.Class cls : R6) {
                androidx.appcompat.app.AppCompatActivity activity = getActivity();
                kotlin.jvm.internal.o.g(activity, "activity");
                if (((kr3.j) pf5.z.f353948a.a(activity).a(cls)).a7()) {
                    break;
                }
            }
        }
        z17 = false;
        this.f311435i = z17;
        return z17;
    }

    public final boolean T6() {
        return ((java.lang.Boolean) ((jz5.n) this.f311441r).getValue()).booleanValue();
    }

    public final boolean U6() {
        java.util.List<java.lang.Class> R6 = R6();
        if ((R6 instanceof java.util.Collection) && R6.isEmpty()) {
            return true;
        }
        for (java.lang.Class cls : R6) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            if (!((kr3.j) pf5.z.f353948a.a(activity).a(cls)).b7()) {
                return false;
            }
        }
        return true;
    }

    public final boolean V6() {
        if (!S6()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ContactAssembleManagerUIC", "onCancelClick(): not change, exit");
            W6(null);
            return true;
        }
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(getActivity());
        u1Var.g(getString(com.tencent.mm.R.string.bgj));
        u1Var.a(true);
        u1Var.n(getString(com.tencent.mm.R.string.bgl));
        u1Var.j(getString(com.tencent.mm.R.string.bgk));
        u1Var.b(new kr3.i0(this));
        u1Var.q(false);
        return false;
    }

    public final void W6(java.lang.Boolean bool) {
        ((ku5.t0) ku5.t0.f312615d).a(new kr3.m0(this, bool));
        for (java.lang.Class cls : R6()) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((kr3.j) pf5.z.f353948a.a(activity).a(cls)).f7();
        }
    }

    public final void X6() {
        androidx.core.widget.NestedScrollView nestedScrollView;
        jz5.f0 f0Var;
        if (T6() || (nestedScrollView = (androidx.core.widget.NestedScrollView) findViewById(com.tencent.mm.R.id.mcq)) == null) {
            return;
        }
        android.view.View view = this.f311438o;
        if (view != null) {
            int[] iArr = new int[2];
            nestedScrollView.getLocationOnScreen(iArr);
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr2);
            int height = iArr2[1] + view.getHeight() + i65.a.h(getActivity(), com.tencent.mm.R.dimen.f479649bo);
            int height2 = iArr[1] + nestedScrollView.getHeight();
            if (height >= height2) {
                nestedScrollView.s(0 - nestedScrollView.getScrollX(), (height - height2) - nestedScrollView.getScrollY(), 250, false);
            }
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((vf5.j) pf5.z.f353948a.a(activity).a(vf5.j.class)).P6(nestedScrollView);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            kotlin.jvm.internal.o.g(activity2, "activity");
            ((vf5.j) pf5.z.f353948a.a(activity2).a(vf5.j.class)).P6(nestedScrollView);
        }
    }

    @Override // pf5.e
    public kotlinx.coroutines.y0 getLifecycleScope() {
        return (kotlinx.coroutines.y0) this.f311430d.getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        return !V6();
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0369, code lost:
    
        if ((r5 == null || r26.n0.N(r5)) != false) goto L90;
     */
    @Override // com.tencent.mm.ui.component.UIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r28) {
        /*
            Method dump skipped, instructions count: 1357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kr3.q0.onCreate(android.os.Bundle):void");
    }
}
