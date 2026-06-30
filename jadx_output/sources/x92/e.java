package x92;

/* loaded from: classes2.dex */
public class e extends x92.r {
    public final int A;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f452674g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f452675h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f452676i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f452677m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f452678n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f452679o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f452680p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.FrameLayout f452681q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f452682r;

    /* renamed from: s, reason: collision with root package name */
    public com.google.android.material.appbar.AppBarLayout f452683s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f452684t;

    /* renamed from: u, reason: collision with root package name */
    public v92.g f452685u;

    /* renamed from: v, reason: collision with root package name */
    public final int f452686v;

    /* renamed from: w, reason: collision with root package name */
    public int f452687w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f452688x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f452689y;

    /* renamed from: z, reason: collision with root package name */
    public float f452690z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f452686v = activity.getResources().getColor(com.tencent.mm.R.color.a9e);
        this.f452687w = activity.getResources().getColor(com.tencent.mm.R.color.f478979mi);
        this.A = i65.a.b(getContext(), 72);
    }

    @Override // x92.r
    public void O6(int i17, java.lang.String str) {
        android.view.View view;
        if (!this.f452688x && !this.f452689y && (view = this.f452676i) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "setInvalidView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "setInvalidView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.LinearLayout linearLayout = this.f452677m;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        android.widget.LinearLayout linearLayout2 = this.f452678n;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(4);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f452679o;
        if (weImageView != null) {
            weImageView.setIconColor(getResources().getColor(com.tencent.mm.R.color.f478714f5));
        }
        android.view.View findViewById = getActivity().findViewById(com.tencent.mm.R.id.lb_);
        if (findViewById != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "setInvalidView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "setInvalidView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) activity).getController().O0(com.tencent.mm.ui.bk.C());
        android.view.View view2 = this.f452675h;
        if (view2 == null) {
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "setInvalidView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "setInvalidView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // x92.r
    public void R6() {
        super.R6();
        this.f452674g = (android.widget.FrameLayout) getActivity().findViewById(com.tencent.mm.R.id.f484919fx3);
        this.f452675h = getActivity().findViewById(com.tencent.mm.R.id.f483953cj5);
        this.f452683s = (com.google.android.material.appbar.AppBarLayout) getActivity().findViewById(com.tencent.mm.R.id.f483235a24);
        android.view.View findViewById = getActivity().findViewById(com.tencent.mm.R.id.f482618jh);
        this.f452676i = findViewById;
        if (this.f452688x || this.f452689y) {
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.FrameLayout frameLayout = this.f452674g;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
        }
        this.f452681q = (android.widget.FrameLayout) getActivity().findViewById(com.tencent.mm.R.id.lb_);
        this.f452682r = (android.widget.TextView) getActivity().findViewById(com.tencent.mm.R.id.f482534h0);
        this.f452679o = (com.tencent.mm.ui.widget.imageview.WeImageView) getActivity().findViewById(com.tencent.mm.R.id.e9e);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) getActivity().findViewById(com.tencent.mm.R.id.e9d);
        android.widget.LinearLayout linearLayout2 = null;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new x92.c(this));
        } else {
            linearLayout = null;
        }
        this.f452677m = linearLayout;
        this.f452680p = (com.tencent.mm.ui.widget.imageview.WeImageView) getActivity().findViewById(com.tencent.mm.R.id.e9g);
        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) getActivity().findViewById(com.tencent.mm.R.id.e9f);
        if (linearLayout3 != null) {
            linearLayout3.setOnClickListener(new x92.d(this));
            linearLayout2 = linearLayout3;
        }
        this.f452678n = linearLayout2;
        this.f452684t = getActivity().findViewById(com.tencent.mm.R.id.f482585ii);
        setNormalStyle();
    }

    @Override // x92.r
    public void T6(com.tencent.mm.protobuf.f fVar) {
        super.T6(fVar);
        android.widget.TextView textView = this.f452682r;
        if (textView == null) {
            return;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        java.lang.String Y6 = Y6();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(activity, Y6));
    }

    @Override // x92.r
    public void U6() {
        android.view.View view;
        z5();
        android.view.View view2 = this.f452675h;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "updateViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "updateViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f452688x || this.f452689y || (view = this.f452676i) == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "updateViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "updateViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void V6(float f17, float f18) {
        if (f17 < 0.5d) {
            Z6(this.f452682r, 4);
        } else {
            Z6(this.f452682r, 0);
        }
        android.widget.LinearLayout linearLayout = this.f452677m;
        if (linearLayout != null) {
            linearLayout.setAlpha(f18);
        }
        android.widget.LinearLayout linearLayout2 = this.f452678n;
        if (linearLayout2 == null) {
            return;
        }
        linearLayout2.setAlpha(f18);
    }

    public void W6(com.google.android.material.appbar.AppBarLayout view, float f17) {
        float f18;
        kotlin.jvm.internal.o.g(view, "view");
        float min = java.lang.Math.min(1.0f, (java.lang.Math.abs(f17) * 1.0f) / this.A);
        if (min == this.f452690z) {
            return;
        }
        this.f452690z = min;
        if (min < 0.5f) {
            f18 = (0.5f - min) / 0.5f;
            android.view.View view2 = this.f452676i;
            if (view2 != null) {
                view2.setBackgroundColor(this.f452686v);
            }
            android.widget.FrameLayout frameLayout = this.f452681q;
            if (frameLayout != null) {
                frameLayout.setAlpha(0.0f);
            }
            V6(min, f18);
        } else {
            f18 = (min - 0.5f) / 0.5f;
            int i17 = (int) (255 * f18);
            android.view.View view3 = this.f452676i;
            if (view3 != null) {
                view3.setBackgroundColor(com.tencent.mm.ui.uk.a(this.f452687w, i17));
            }
            android.widget.FrameLayout frameLayout2 = this.f452681q;
            if (frameLayout2 != null) {
                frameLayout2.setAlpha(f18);
            }
            V6(min, f18);
        }
        android.view.View view4 = this.f452684t;
        if (view4 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(min));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "contentOffsetChange", "(Lcom/google/android/material/appbar/AppBarLayout;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view4.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "contentOffsetChange", "(Lcom/google/android/material/appbar/AppBarLayout;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderTopicActionBarUIC", "alpha : " + f18);
    }

    public v92.g X6() {
        return new v92.g(getActivity());
    }

    public java.lang.String Y6() {
        return "";
    }

    public final void Z6(android.view.View view, int i17) {
        if ((view != null && view.getVisibility() == i17) || view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "setVisibleStats", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "setVisibleStats", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // x92.r, x92.q
    public void b2() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) activity).getController().O0(true);
        int color = getResources().getColor(com.tencent.mm.R.color.f478982ml);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f452679o;
        if (weImageView != null) {
            weImageView.setIconColor(color);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f452680p;
        if (weImageView2 != null) {
            weImageView2.setIconColor(color);
        }
        android.widget.TextView textView = this.f452682r;
        if (textView != null) {
            textView.setTextColor(getResources().getColor(com.tencent.mm.R.color.f478978mh));
        }
        this.f452687w = getActivity().getResources().getColor(com.tencent.mm.R.color.f478979mi);
    }

    @Override // x92.r, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.google.android.material.appbar.AppBarLayout appBarLayout;
        this.f452688x = getIntent().getBooleanExtra("key_drawer_mode", false);
        this.f452689y = getIntent().getBooleanExtra("key_is_half_mode", false);
        super.onCreate(bundle);
        android.view.View decorView = getActivity().getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(1280);
        com.tencent.mm.ui.r0.a(getActivity(), false);
        androidx.appcompat.app.b supportActionBar = getActivity().getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.w(new android.graphics.drawable.ColorDrawable(0));
            supportActionBar.o();
        }
        android.view.View decorView2 = getActivity().getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView2, "getDecorView(...)");
        decorView2.getViewTreeObserver().addOnPreDrawListener(new x92.b(decorView2, this));
        android.widget.FrameLayout frameLayout = this.f452681q;
        if (frameLayout != null) {
            frameLayout.setAlpha(0.0f);
        }
        if (this.f452688x || (appBarLayout = this.f452683s) == null) {
            return;
        }
        x92.a aVar = new x92.a(this);
        aVar.a(appBarLayout, 0);
        appBarLayout.a(aVar);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
    }

    @Override // x92.r, x92.q
    public void setNormalStyle() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) activity).getController().O0(com.tencent.mm.ui.bk.C());
        int color = getResources().getColor(com.tencent.mm.R.color.f478714f5);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f452679o;
        if (weImageView != null) {
            weImageView.setIconColor(color);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f452680p;
        if (weImageView2 != null) {
            weImageView2.setIconColor(color);
        }
        android.widget.TextView textView = this.f452682r;
        if (textView != null) {
            textView.setTextColor(getResources().getColor(com.tencent.mm.R.color.a0c));
        }
        this.f452687w = getActivity().getResources().getColor(com.tencent.mm.R.color.f478489a);
    }
}
