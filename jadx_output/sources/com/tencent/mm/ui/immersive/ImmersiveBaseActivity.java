package com.tencent.mm.ui.immersive;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/ui/immersive/ImmersiveBaseActivity;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "eh5/a", "app_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes14.dex */
public abstract class ImmersiveBaseActivity extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f208931s = 0;

    /* renamed from: d, reason: collision with root package name */
    public final int f208932d = com.tencent.mm.R.color.f478489a;

    /* renamed from: e, reason: collision with root package name */
    public final int f208933e = com.tencent.mm.R.color.f478489a;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f208934f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f208935g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f208936h;

    /* renamed from: i, reason: collision with root package name */
    public final long f208937i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f208938m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f208939n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f208940o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f208941p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f208942q;

    /* renamed from: r, reason: collision with root package name */
    public n3.g3 f208943r;

    public ImmersiveBaseActivity() {
        kz5.p0 p0Var = kz5.p0.f313996d;
        this.f208934f = p0Var;
        this.f208935g = p0Var;
        this.f208936h = p0Var;
        this.f208937i = 300L;
        this.f208938m = true;
        this.f208939n = jz5.h.b(new eh5.b(this));
        this.f208940o = jz5.h.b(new eh5.d(this));
        this.f208941p = jz5.h.b(new eh5.c(this));
        this.f208942q = jz5.h.b(new eh5.i(this));
    }

    public static void g7(com.tencent.mm.ui.immersive.ImmersiveBaseActivity immersiveBaseActivity, java.util.Map chromeVisibilities, boolean z17, yz5.a aVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setChromeVisibility");
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        if ((i17 & 4) != 0) {
            aVar = null;
        }
        immersiveBaseActivity.getClass();
        kotlin.jvm.internal.o.g(chromeVisibilities, "chromeVisibilities");
        if (z17) {
            for (java.util.Map.Entry entry : chromeVisibilities.entrySet()) {
                java.lang.Class cls = (java.lang.Class) entry.getKey();
                int intValue = ((java.lang.Number) entry.getValue()).intValue();
                com.tencent.mm.ui.immersive.ImmersiveBaseChromeView W6 = immersiveBaseActivity.W6(cls);
                if (W6 != null) {
                    W6.setVisibility(intValue);
                }
            }
            immersiveBaseActivity.U6();
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry2 : chromeVisibilities.entrySet()) {
            java.lang.Class cls2 = (java.lang.Class) entry2.getKey();
            int intValue2 = ((java.lang.Number) entry2.getValue()).intValue();
            com.tencent.mm.ui.immersive.ImmersiveBaseChromeView W62 = immersiveBaseActivity.W6(cls2);
            if (W62 != null && W62.getVisibility() != intValue2) {
                arrayList.add(new jz5.l(W62, java.lang.Integer.valueOf(intValue2)));
            }
        }
        if (arrayList.isEmpty()) {
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        android.view.View view = immersiveBaseActivity.X6().f254624a;
        android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        if (viewGroup == null) {
            return;
        }
        u4.g1.f424480c.remove(viewGroup);
        java.util.ArrayList arrayList2 = (java.util.ArrayList) u4.g1.b().getOrDefault(viewGroup, null);
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList2);
            int size = arrayList3.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((androidx.transition.Transition) arrayList3.get(size)).u(viewGroup);
                }
            }
        }
        androidx.transition.TransitionSet transitionSet = new androidx.transition.TransitionSet();
        transitionSet.b0(0);
        transitionSet.X(new androidx.transition.Fade(1));
        transitionSet.X(new androidx.transition.Fade(2));
        transitionSet.X(new androidx.transition.ChangeBounds());
        transitionSet.Z(immersiveBaseActivity.f208937i);
        transitionSet.c(immersiveBaseActivity.X6().c());
        transitionSet.c(immersiveBaseActivity.X6().b());
        transitionSet.c(immersiveBaseActivity.X6().a());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            transitionSet.c((android.view.View) ((jz5.l) it.next()).f302833d);
        }
        int i18 = 0;
        while (true) {
            if (!(i18 < viewGroup.getChildCount())) {
                transitionSet.T(new eh5.j(transitionSet, aVar));
                u4.g1.a(viewGroup, transitionSet);
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    jz5.l lVar = (jz5.l) it6.next();
                    android.view.View view2 = (android.view.View) lVar.f302833d;
                    int intValue3 = ((java.lang.Number) lVar.f302834e).intValue();
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList4.add(java.lang.Integer.valueOf(intValue3));
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/ui/immersive/ImmersiveBaseActivity", "setChromeVisibility", "(Ljava/util/Map;ZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/ui/immersive/ImmersiveBaseActivity", "setChromeVisibility", "(Ljava/util/Map;ZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                immersiveBaseActivity.U6();
                return;
            }
            int i19 = i18 + 1;
            android.view.View childAt = viewGroup.getChildAt(i18);
            if (childAt == null) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            if (!kotlin.jvm.internal.o.b(childAt, immersiveBaseActivity.X6().c()) && !kotlin.jvm.internal.o.b(childAt, immersiveBaseActivity.X6().b()) && !kotlin.jvm.internal.o.b(childAt, immersiveBaseActivity.X6().a())) {
                transitionSet.r(childAt, true);
            }
            i18 = i19;
        }
    }

    public final void U6() {
        n3.g3 g3Var = this.f208943r;
        if (g3Var == null) {
            android.view.View decorView = getWindow().getDecorView();
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            g3Var = n3.b1.a(decorView);
            if (g3Var == null) {
                int i17 = android.os.Build.VERSION.SDK_INT;
                g3Var = (i17 >= 30 ? new n3.w2() : i17 >= 29 ? new n3.v2() : new n3.u2()).b();
                kotlin.jvm.internal.o.f(g3Var, "build(...)");
            }
        }
        e3.d a17 = g3Var.a(7);
        kotlin.jvm.internal.o.f(a17, "getInsets(...)");
        android.widget.LinearLayout c17 = X6().c();
        int paddingLeft = X6().c().getPaddingLeft();
        jz5.g gVar = this.f208940o;
        boolean e76 = e7((java.util.List) ((jz5.n) gVar).getValue());
        int i18 = a17.f247045b;
        c17.setPadding(paddingLeft, e76 ? i18 : 0, X6().c().getPaddingRight(), X6().c().getPaddingBottom());
        android.widget.LinearLayout b17 = X6().b();
        int paddingLeft2 = X6().b().getPaddingLeft();
        int paddingTop = X6().b().getPaddingTop();
        int paddingRight = X6().b().getPaddingRight();
        jz5.g gVar2 = this.f208941p;
        boolean e77 = e7((java.util.List) ((jz5.n) gVar2).getValue());
        int i19 = a17.f247047d;
        b17.setPadding(paddingLeft2, paddingTop, paddingRight, e77 ? i19 : 0);
        if (e7((java.util.List) ((jz5.n) gVar).getValue())) {
            i18 = 0;
        }
        if (e7((java.util.List) ((jz5.n) gVar2).getValue())) {
            i19 = 0;
        }
        int i27 = android.os.Build.VERSION.SDK_INT;
        n3.x2 w2Var = i27 >= 30 ? new n3.w2() : i27 >= 29 ? new n3.v2() : new n3.u2();
        w2Var.c(7, e3.d.b(0, i18, 0, i19));
        n3.g3 b18 = w2Var.b();
        kotlin.jvm.internal.o.f(b18, "build(...)");
        n3.l1.b(X6().a(), b18);
    }

    public abstract android.view.View V6();

    public final com.tencent.mm.ui.immersive.ImmersiveBaseChromeView W6(java.lang.Class viewClazz) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        kotlin.jvm.internal.o.g(viewClazz, "viewClazz");
        java.util.Iterator it = ((java.util.List) ((jz5.n) this.f208940o).getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (viewClazz.isInstance((android.view.View) obj)) {
                break;
            }
        }
        android.view.View view = (android.view.View) obj;
        if (view == null) {
            java.util.Iterator it6 = ((java.util.List) ((jz5.n) this.f208941p).getValue()).iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it6.next();
                if (viewClazz.isInstance((android.view.View) obj2)) {
                    break;
                }
            }
            view = (android.view.View) obj2;
            if (view == null) {
                java.util.Iterator it7 = ((java.util.List) ((jz5.n) this.f208942q).getValue()).iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it7.next();
                    if (viewClazz.isInstance((android.view.View) obj3)) {
                        break;
                    }
                }
                view = (android.view.View) obj3;
            }
        }
        if (view instanceof com.tencent.mm.ui.immersive.ImmersiveBaseChromeView) {
            return (com.tencent.mm.ui.immersive.ImmersiveBaseChromeView) view;
        }
        return null;
    }

    public final em.n0 X6() {
        return (em.n0) ((jz5.n) this.f208939n).getValue();
    }

    /* renamed from: Y6, reason: from getter */
    public boolean getF208938m() {
        return this.f208938m;
    }

    /* renamed from: Z6, reason: from getter */
    public int getF208933e() {
        return this.f208933e;
    }

    /* renamed from: a7, reason: from getter */
    public java.util.List getF208935g() {
        return this.f208935g;
    }

    /* renamed from: b7, reason: from getter */
    public int getF208932d() {
        return this.f208932d;
    }

    /* renamed from: c7, reason: from getter */
    public java.util.List getF208934f() {
        return this.f208934f;
    }

    /* renamed from: d7, reason: from getter */
    public java.util.List getF208936h() {
        return this.f208936h;
    }

    public final boolean e7(java.util.List list) {
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return false;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.view.View view = (android.view.View) it.next();
            if ((view instanceof com.tencent.mm.ui.immersive.ImmersiveBaseChromeView) && ((com.tencent.mm.ui.immersive.ImmersiveBaseChromeView) view).getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    public final void f7(android.view.ViewGroup viewGroup, eh5.a aVar, java.util.List list, int i17) {
        if (i17 != 0) {
            viewGroup.setBackgroundColor(getContext().getResources().getColor(i17, null));
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.Class cls = (java.lang.Class) it.next();
            com.tencent.mm.ui.immersive.ImmersiveBaseChromeView immersiveBaseChromeView = (com.tencent.mm.ui.immersive.ImmersiveBaseChromeView) cls.getDeclaredConstructor(android.content.Context.class).newInstance(getContext());
            if (immersiveBaseChromeView.getImmersiveType() != aVar) {
                throw new java.lang.IllegalArgumentException("ChromeType must be " + aVar + ", " + immersiveBaseChromeView.getImmersiveType() + " found");
            }
            immersiveBaseChromeView.setVisibilityController(new eh5.f(this, cls));
            viewGroup.addView(immersiveBaseChromeView);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477881e5, com.tencent.mm.R.anim.f477890ee);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public final int getLayoutId() {
        return com.tencent.mm.R.layout.eh8;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public final boolean noActionBar() {
        return true;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        setCurrentStatusColor(0);
        setNavigationbarColor(0);
        new n3.m3(getWindow(), getWindow().getDecorView()).c(!com.tencent.mm.ui.bk.C());
        n3.h2.a(getContext().getWindow(), false);
        android.view.View decorView = getContext().getWindow().getDecorView();
        eh5.e eVar = new eh5.e(this);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.a1.u(decorView, eVar);
        overridePendingTransition(com.tencent.mm.R.anim.f477887eb, com.tencent.mm.R.anim.f477883e7);
        android.widget.LinearLayout c17 = X6().c();
        kotlin.jvm.internal.o.f(c17, "getHeaderContainer(...)");
        f7(c17, eh5.a.f252951d, getF208934f(), getF208932d());
        android.widget.LinearLayout b17 = X6().b();
        kotlin.jvm.internal.o.f(b17, "getFooterContainer(...)");
        f7(b17, eh5.a.f252952e, getF208935g(), getF208933e());
        androidx.constraintlayout.widget.ConstraintLayout d17 = X6().d();
        kotlin.jvm.internal.o.f(d17, "getImmersiveBaseActivity(...)");
        f7(d17, eh5.a.f252953f, getF208936h(), 0);
        X6().a().addView(V6());
        n3.a1.u(X6().a(), new eh5.g(this));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        U6();
    }
}
