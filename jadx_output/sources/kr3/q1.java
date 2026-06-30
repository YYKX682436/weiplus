package kr3;

/* loaded from: classes11.dex */
public class q1 extends com.tencent.mm.ui.component.UIComponent {
    public static final java.util.List A = kz5.c0.i(com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.j1.class, com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.w0.class, com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.n0.class, com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.g.class, com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0.class);

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f311450d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.o4 f311451e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f311452f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f311453g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f311454h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f311455i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f311456m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f311457n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f311458o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f311459p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f311460q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f311461r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f311462s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f311463t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f311464u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f311465v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f311466w;

    /* renamed from: x, reason: collision with root package name */
    public int f311467x;

    /* renamed from: y, reason: collision with root package name */
    public long f311468y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f311469z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f311450d = jz5.h.b(new kr3.z0(activity));
        this.f311451e = com.tencent.mm.sdk.platformtools.o4.M("MicroMsg.ModProfile.ContactAssembleManagerUIC");
        this.f311452f = jz5.h.b(new kr3.o1(this));
        this.f311453g = jz5.h.b(new kr3.t0(this));
        this.f311454h = jz5.h.b(new kr3.y0(this));
        this.f311457n = jz5.h.b(new kr3.p1(this));
        this.f311459p = jz5.h.b(new kr3.s0(this, activity));
        this.f311460q = jz5.h.b(new kr3.x0(this));
        this.f311461r = jz5.h.b(new kr3.w0(this));
        this.f311462s = jz5.h.b(new kr3.u0(this));
        this.f311463t = jz5.h.b(new kr3.v0(this));
        this.f311464u = jz5.h.b(new kr3.r0(this));
        this.f311465v = new java.util.concurrent.atomic.AtomicInteger(1);
        this.f311468y = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(gm0.j1.b().h());
        sb6.append('_');
        sb6.append(c01.id.c());
        this.f311469z = sb6.toString();
    }

    public static final void O6(kr3.q1 q1Var) {
        if (!q1Var.S6()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ContactAssembleManagerUIC", "onSaveWrapper(): not change, exit");
            q1Var.W6(null);
            q1Var.getActivity().finish();
        } else {
            if (q1Var.U6()) {
                q1Var.f311456m = true;
                kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
                com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(q1Var.getActivity(), q1Var.getActivity().getString(com.tencent.mm.R.string.f490573yv), q1Var.getString(com.tencent.mm.R.string.p6s), true, true, new kr3.g1(h0Var));
                com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ContactAssembleManagerUIC", "modProfileSync");
                h0Var.f310123d = kotlinx.coroutines.l.d(v65.m.b(q1Var.getActivity()), null, null, new kr3.f1(q1Var, Q, null), 3, null);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ContactAssembleManagerUIC", "onSaveWrapper(): not valid");
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(q1Var.getActivity());
            u1Var.g(q1Var.getString(com.tencent.mm.R.string.nbj));
            u1Var.a(true);
            u1Var.n(q1Var.getString(com.tencent.mm.R.string.f489708h));
            u1Var.q(false);
        }
    }

    public static java.lang.Object Y6(kr3.q1 q1Var, com.tencent.mm.ui.widget.dialog.u3 u3Var, java.lang.String str, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showSaveFailDialog");
        }
        if ((i17 & 2) != 0) {
            str = q1Var.getString(com.tencent.mm.R.string.f490910n92);
        }
        q1Var.getClass();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new kr3.n1(u3Var, q1Var, str, null), continuation);
        return g17 == pz5.a.f359186d ? g17 : jz5.f0.f302826a;
    }

    public final void P6(int i17) {
        if (i17 > 0) {
            this.f311466w = true;
        } else if (i17 < 0) {
            this.f311467x = java.lang.Math.min(this.f311467x, i17);
        }
        if (this.f311465v.decrementAndGet() <= 0) {
            int i18 = this.f311467x;
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
            if (this.f311466w) {
                androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
                int i28 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var3 = new com.tencent.mm.ui.widget.dialog.e4(activity3);
                e4Var3.d(com.tencent.mm.R.string.f492768od2);
                e4Var3.f211779f = false;
                e4Var3.c();
            }
        }
    }

    public final java.util.List Q6() {
        return (java.util.List) ((jz5.n) this.f311459p).getValue();
    }

    public final com.tencent.mm.contact.o R6() {
        return (com.tencent.mm.contact.o) ((jz5.n) this.f311453g).getValue();
    }

    public final boolean S6() {
        boolean z17 = true;
        if (this.f311455i) {
            return true;
        }
        java.util.List<java.lang.Class> Q6 = Q6();
        if (!(Q6 instanceof java.util.Collection) || !Q6.isEmpty()) {
            for (java.lang.Class cls : Q6) {
                androidx.appcompat.app.AppCompatActivity activity = getActivity();
                kotlin.jvm.internal.o.g(activity, "activity");
                if (((kr3.t) pf5.z.f353948a.a(activity).a(cls)).Z6()) {
                    break;
                }
            }
        }
        z17 = false;
        this.f311455i = z17;
        return z17;
    }

    public final boolean T6() {
        return ((java.lang.Boolean) ((jz5.n) this.f311461r).getValue()).booleanValue();
    }

    public final boolean U6() {
        java.util.List<java.lang.Class> Q6 = Q6();
        if ((Q6 instanceof java.util.Collection) && Q6.isEmpty()) {
            return true;
        }
        for (java.lang.Class cls : Q6) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            if (!((kr3.t) pf5.z.f353948a.a(activity).a(cls)).a7()) {
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
        u1Var.b(new kr3.i1(this));
        u1Var.q(false);
        return false;
    }

    public final void W6(java.lang.Boolean bool) {
        com.tencent.mm.contact.o R6;
        ((ku5.t0) ku5.t0.f312615d).a(new kr3.m1(this, bool));
        for (java.lang.Class cls : Q6()) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((kr3.t) pf5.z.f353948a.a(activity).a(cls)).e7();
        }
        if (!kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE) || (R6 = R6()) == null) {
            return;
        }
        ((yq3.v) R6).o();
    }

    public final void X6() {
        androidx.core.widget.NestedScrollView nestedScrollView;
        jz5.f0 f0Var;
        if (T6() || (nestedScrollView = (androidx.core.widget.NestedScrollView) findViewById(com.tencent.mm.R.id.mcq)) == null) {
            return;
        }
        android.view.View view = this.f311458o;
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
        return (kotlinx.coroutines.y0) this.f311450d.getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        return !V6();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        jz5.g gVar;
        android.widget.LinearLayout linearLayout;
        this.f311468y = java.lang.System.currentTimeMillis();
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.rji);
        jz5.g gVar2 = this.f311460q;
        if (((java.lang.Boolean) ((jz5.n) gVar2).getValue()).booleanValue()) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.obp);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/mod/ContactAssembleManagerUICWxContact", "loadAssembleViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/profile/ui/mod/ContactAssembleManagerUICWxContact", "loadAssembleViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f483448sl4);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/mod/ContactAssembleManagerUICWxContact", "loadAssembleViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/profile/ui/mod/ContactAssembleManagerUICWxContact", "loadAssembleViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.util.Iterator it = Q6().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            gVar = this.f311457n;
            if (!hasNext) {
                break;
            }
            java.lang.Class cls = (java.lang.Class) it.next();
            android.view.View inflate = com.tencent.mm.ui.id.b(getActivity()).inflate(com.tencent.mm.R.layout.e3w, (android.view.ViewGroup) linearLayout2, false);
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            kr3.t tVar = (kr3.t) pf5.z.f353948a.a(activity).a(cls);
            if (((java.lang.Boolean) ((jz5.n) gVar2).getValue()).booleanValue() && T6()) {
                android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.hjn);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/profile/ui/mod/ContactAssembleManagerUICWxContact", "loadAssembleViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/profile/ui/mod/ContactAssembleManagerUICWxContact", "loadAssembleViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
                com.tencent.mm.ui.MMActivity mMActivity = activity2 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity2 : null;
                if (mMActivity != null) {
                    java.lang.String str = (java.lang.String) ((jz5.n) this.f311462s).getValue();
                    if (str == null) {
                        str = getString(tVar.k7());
                    }
                    mMActivity.setMMTitle(str);
                }
            } else {
                android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.hjn);
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/profile/ui/mod/ContactAssembleManagerUICWxContact", "loadAssembleViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewById4, "com/tencent/mm/plugin/profile/ui/mod/ContactAssembleManagerUICWxContact", "loadAssembleViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            tVar.f311479g = inflate;
            if (tVar.getUsername() == null || tVar.U6() == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.BaseRemarkUI", "username(" + tVar.getUsername() + ") or contact(" + tVar.U6() + ") is null");
            }
            java.lang.String username = tVar.getUsername();
            com.tencent.mm.contact.o U6 = tVar.U6();
            if (username != null && U6 != null) {
                tVar.f311476d = (android.widget.LinearLayout) tVar.findViewById(com.tencent.mm.R.id.uy8);
                tVar.f311477e = (com.tencent.mm.ui.base.FlowLayout) tVar.findViewById(com.tencent.mm.R.id.uy9);
                tVar.f311478f = (android.widget.TextView) tVar.findViewById(com.tencent.mm.R.id.uy_);
                if (!tVar.X6()) {
                    ((android.widget.TextView) tVar.findViewById(com.tencent.mm.R.id.hjn)).setText(tVar.k7());
                }
                com.tencent.mm.ui.base.FlowLayout flowLayout = tVar.f311477e;
                if (flowLayout != null) {
                    flowLayout.setVisibility(8);
                }
                android.widget.TextView textView = tVar.f311478f;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                android.view.View b76 = tVar.b7(username, U6);
                tVar.f311480h = b76;
                if (b76 != null && (linearLayout = tVar.f311476d) != null) {
                    linearLayout.addView(b76, -1, -2);
                }
                tVar.c7();
            }
            jz5.g gVar3 = this.f311463t;
            if (((java.lang.Number) ((jz5.n) gVar3).getValue()).intValue() == tVar.i7()) {
                this.f311458o = inflate;
                java.lang.String str2 = "highlight-" + ((java.lang.Number) ((jz5.n) gVar3).getValue()).intValue();
                com.tencent.mm.sdk.platformtools.o4 o4Var = this.f311451e;
                boolean i17 = o4Var.i(str2, false);
                if (!i17) {
                    o4Var.G(str2, true);
                }
                boolean z17 = !i17;
                lr3.a Y6 = tVar.Y6();
                if (Y6 != null) {
                    android.view.View view = tVar.f311480h;
                    if (view != null) {
                        view.post(new kr3.n(z17, Y6));
                    }
                    kotlinx.coroutines.l.d(v65.m.b(tVar.getActivity()), null, null, new kr3.p(Y6, null), 3, null);
                }
            }
            this.f311465v.incrementAndGet();
            if (!((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue()) {
                tVar.T6(new kr3.a1(this, tVar));
            }
            linearLayout2.addView(inflate);
        }
        P6(0);
        if (T6()) {
            androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
            com.tencent.mm.ui.MMActivity mMActivity2 = activity3 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity3 : null;
            if (mMActivity2 != null) {
                mMActivity2.applyHalfScreenActionbarHeight();
            }
        } else {
            ((androidx.core.widget.NestedScrollView) findViewById(com.tencent.mm.R.id.mcq)).post(new kr3.b1(this));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("contact: ");
        sb6.append(R6());
        sb6.append(", isStranger: ");
        sb6.append(((java.lang.Boolean) ((jz5.n) this.f311454h).getValue()).booleanValue());
        sb6.append(", username: ");
        com.tencent.mm.contact.o R6 = R6();
        sb6.append(R6 != null ? ((yq3.v) R6).h() : null);
        sb6.append(", encryptUsername: ");
        com.tencent.mm.contact.o R62 = R6();
        sb6.append(R62 != null ? ((yq3.v) R62).e() : null);
        sb6.append(", viewOnly: ");
        sb6.append(((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue());
        sb6.append(", addContactScene: ");
        sb6.append(((java.lang.Number) ((jz5.n) this.f311464u).getValue()).intValue());
        com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ContactAssembleManagerUIC", sb6.toString());
        androidx.appcompat.app.AppCompatActivity activity4 = getActivity();
        com.tencent.mm.ui.MMActivity mMActivity3 = activity4 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity4 : null;
        if (mMActivity3 != null) {
            if (!((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue()) {
                if (!T6()) {
                    mMActivity3.setMMTitle("");
                }
                mMActivity3.addTextOptionMenu(0, mMActivity3.getString(com.tencent.mm.R.string.f490441v5), new kr3.k1(this), null, com.tencent.mm.ui.fb.GREEN);
                mMActivity3.getController().t0(false);
                mMActivity3.getController().x0(mMActivity3.getString(com.tencent.mm.R.string.f490347sg), new kr3.l1(this, mMActivity3));
                return;
            }
            mMActivity3.getController().t0(true);
            mMActivity3.setBackBtn(new kr3.j1(mMActivity3), com.tencent.mm.R.raw.icons_filled_down_arrow);
            mMActivity3.getMabBackBtn().setBackground(i65.a.i(mMActivity3, com.tencent.mm.R.drawable.f480879a64));
            int f17 = i65.a.f(mMActivity3, com.tencent.mm.R.dimen.f479704cz);
            mMActivity3.getMabBackBtn().setLayoutParams(new android.widget.LinearLayout.LayoutParams(f17, f17));
            int f18 = i65.a.f(mMActivity3, com.tencent.mm.R.dimen.f479644bj);
            mMActivity3.getMabBackBtn().setPadding(f18, f18, f18, f18);
            int f19 = i65.a.f(mMActivity3, com.tencent.mm.R.dimen.f479688cn);
            int f27 = i65.a.f(mMActivity3, com.tencent.mm.R.dimen.f479693cs);
            android.view.ViewParent parent = mMActivity3.getMabBackBtn().getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.setPadding(f19, f27, f19, f27);
            }
            android.view.View findViewById5 = mMActivity3.findViewById(com.tencent.mm.R.id.obp);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(findViewById5, arrayList5.toArray(), "com/tencent/mm/plugin/profile/ui/mod/ContactAssembleManagerUICWxContact", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(findViewById5, "com/tencent/mm/plugin/profile/ui/mod/ContactAssembleManagerUICWxContact", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById6 = mMActivity3.findViewById(com.tencent.mm.R.id.f483448sl4);
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById6, arrayList6.toArray(), "com/tencent/mm/plugin/profile/ui/mod/ContactAssembleManagerUICWxContact", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(findViewById6, "com/tencent/mm/plugin/profile/ui/mod/ContactAssembleManagerUICWxContact", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
