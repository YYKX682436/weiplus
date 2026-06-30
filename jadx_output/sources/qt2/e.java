package qt2;

/* loaded from: classes2.dex */
public class e extends qt2.j {

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f366560r;

    /* renamed from: s, reason: collision with root package name */
    public r45.jt2 f366561s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.Runnable f366562t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.ViewTreeObserver.OnGlobalLayoutListener f366563u;

    /* renamed from: v, reason: collision with root package name */
    public int f366564v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f366565w;

    /* renamed from: x, reason: collision with root package name */
    public float f366566x;

    /* renamed from: y, reason: collision with root package name */
    public final int f366567y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f366560r = "FinderFirstFeedRecommendTipUIC";
        this.f366565w = true;
        this.f366566x = -1.0f;
        this.f366567y = android.view.ViewConfiguration.getTouchSlop();
    }

    @Override // qt2.j
    public int Q6() {
        return com.tencent.mm.R.id.g6p;
    }

    @Override // qt2.j
    public void S6(androidx.recyclerview.widget.RecyclerView recyclerView) {
        android.widget.TextView textView;
        java.lang.String str;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        super.S6(recyclerView);
        r45.jt2 jt2Var = this.f366561s;
        if (jt2Var != null) {
            android.view.View view = this.f366588e;
            cy1.a aVar = null;
            android.widget.ImageView imageView = view != null ? (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.a9p) : null;
            android.view.View view2 = this.f366588e;
            android.widget.ImageView imageView2 = view2 != null ? (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.a9r) : null;
            android.view.View view3 = this.f366588e;
            android.widget.ImageView imageView3 = view3 != null ? (android.widget.ImageView) view3.findViewById(com.tencent.mm.R.id.a9t) : null;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            if (imageView3 != null) {
                imageView3.setVisibility(8);
            }
            java.util.LinkedList list = jt2Var.getList(2);
            kotlin.jvm.internal.o.f(list, "getFriend_like_users(...)");
            int i17 = 0;
            for (java.lang.Object obj : list) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.g53 g53Var = (r45.g53) obj;
                android.widget.ImageView imageView4 = i17 != 0 ? i17 != 1 ? i17 != 2 ? null : imageView3 : imageView2 : imageView;
                if (imageView4 != null) {
                    mn2.g1 g1Var = mn2.g1.f329975a;
                    g1Var.l().c(new mn2.n(g53Var.getString(2), null, 2, null), imageView4, g1Var.h(mn2.f1.f329960n));
                    imageView4.setVisibility(0);
                }
                i17 = i18;
            }
            android.view.View view4 = this.f366588e;
            if (view4 != null && (textView = (android.widget.TextView) view4.findViewById(com.tencent.mm.R.id.g6q)) != null) {
                java.lang.String string = jt2Var.getString(1);
                str = "";
                if (!(string == null || string.length() == 0)) {
                    ht2.y0 y0Var = (ht2.y0) i95.n0.c(ht2.y0.class);
                    java.lang.String string2 = jt2Var.getString(1);
                    str = y0Var.mj(string2 != null ? string2 : "", (int) textView.getTextSize(), true);
                }
                textView.setText(str);
            }
            android.view.View view5 = this.f366588e;
            if (view5 != null) {
                view5.setOnClickListener(new qt2.a(this));
            }
            android.view.View view6 = this.f366588e;
            if (view6 != null) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(view6, "bottom_recommendation");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(view6, 40, 25496);
                cy1.a aVar2 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
                aVar2.Ai(view6, new qt2.b(this));
                aVar = aVar2;
            }
            if (aVar != null) {
                return;
            }
        }
        android.view.View view7 = this.f366588e;
        if (view7 == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view7, arrayList.toArray(), "com/tencent/mm/plugin/finder/share/FinderFirstFeedRecommendTipUIC", "initContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view7, "com/tencent/mm/plugin/finder/share/FinderFirstFeedRecommendTipUIC", "initContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // qt2.j
    public void V6(float f17) {
        if (this.f366565w) {
            android.view.View view = this.f366588e;
            if (view != null && view.getVisibility() == 0) {
                android.view.View view2 = this.f366588e;
                if (view2 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(4);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/share/FinderFirstFeedRecommendTipUIC", "onScrollDown", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/share/FinderFirstFeedRecommendTipUIC", "onScrollDown", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                Z6();
                this.f366565w = false;
            }
        }
    }

    @Override // qt2.j
    public boolean X6() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.W3).getValue()).r()).intValue() == 1 || ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).f39226d || ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127689f3).getValue()).r()).intValue() != 0 || ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127613b3).getValue()).r()).intValue() != 1 || this.f366561s == null) ? false : true;
    }

    @Override // qt2.j
    public void Y6() {
        android.view.View view;
        if (this.f366589f || T6() || (view = this.f366588e) == null) {
            return;
        }
        this.f366563u = new qt2.d(this, view);
        android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f366563u);
        }
    }

    public final void Z6() {
        int i17 = this.f366564v;
        if (i17 <= 0) {
            i17 = i65.a.b(getContext(), 170);
        }
        qt2.j.P6(this, i17, 260L, 0.0f, 4, null);
    }

    @Override // qt2.j
    public int getIndex() {
        qt2.u uVar;
        androidx.fragment.app.Fragment fragment = getFragment();
        if (fragment == null || (uVar = (qt2.u) pf5.z.f353948a.b(fragment).e(qt2.u.class)) == null) {
            return 0;
        }
        return uVar.f366614g;
    }

    @Override // qt2.j
    public java.lang.String getTag() {
        return this.f366560r;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        android.view.View view = this.f366588e;
        if (view != null) {
            view.removeCallbacks(this.f366562t);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f366560r = "FinderFirstFeedRecommendTipUIC";
        this.f366565w = true;
        this.f366566x = -1.0f;
        this.f366567y = android.view.ViewConfiguration.getTouchSlop();
    }
}
