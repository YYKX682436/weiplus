package fr2;

/* loaded from: classes2.dex */
public final class x extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.google.android.material.appbar.AppBarLayout f265763d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f265764e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f265765f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f265766g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f265767h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f265768i;

    /* renamed from: m, reason: collision with root package name */
    public dk2.of f265769m;

    /* renamed from: n, reason: collision with root package name */
    public o25.y1 f265770n;

    /* renamed from: o, reason: collision with root package name */
    public r45.zz2 f265771o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(androidx.appcompat.app.AppCompatActivity act) {
        super(act);
        kotlin.jvm.internal.o.g(act, "act");
    }

    public static final float O6(fr2.x xVar, int i17, float f17) {
        xVar.getClass();
        float f18 = i17;
        if (f18 <= 0.0f) {
            return 1.0f;
        }
        if (f18 >= f17) {
            return 0.0f;
        }
        java.lang.Float valueOf = java.lang.Float.valueOf(f17);
        if (!(valueOf.floatValue() > 0.0f)) {
            valueOf = null;
        }
        return (f17 - f18) / (valueOf != null ? valueOf.floatValue() : 1.0f);
    }

    public final void P6(r45.vz2 vz2Var) {
        jz5.f0 f0Var;
        if (vz2Var != null) {
            com.tencent.mm.plugin.finder.live.util.a3 a3Var = com.tencent.mm.plugin.finder.live.util.a3.f115443a;
            android.widget.ImageView imageView = this.f265764e;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("themeBgView");
                throw null;
            }
            java.util.LinkedList background_color = vz2Var.f388695m;
            kotlin.jvm.internal.o.f(background_color, "background_color");
            com.tencent.mm.plugin.finder.live.util.u2 u2Var = com.tencent.mm.plugin.finder.live.util.u2.f115717f;
            a3Var.c(imageView, background_color, u2Var);
            android.widget.ImageView imageView2 = this.f265765f;
            if (imageView2 == null) {
                kotlin.jvm.internal.o.o("themeHeaderBgView");
                throw null;
            }
            a3Var.d(imageView2, vz2Var.f388689d);
            android.widget.ImageView imageView3 = this.f265767h;
            if (imageView3 == null) {
                kotlin.jvm.internal.o.o("headerBgView");
                throw null;
            }
            java.util.LinkedList navbar_bg_color = vz2Var.f388696n;
            kotlin.jvm.internal.o.f(navbar_bg_color, "navbar_bg_color");
            a3Var.c(imageView3, navbar_bg_color, u2Var);
            android.widget.TextView textView = this.f265768i;
            if (textView == null) {
                kotlin.jvm.internal.o.o("headerTitleTextView");
                throw null;
            }
            java.util.LinkedList navbar_text_color = vz2Var.f388697o;
            kotlin.jvm.internal.o.f(navbar_text_color, "navbar_text_color");
            com.tencent.mm.plugin.finder.live.util.a3.e(a3Var, textView, navbar_text_color, null, null, 6, null);
            android.widget.TextView textView2 = this.f265768i;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("headerTitleTextView");
                throw null;
            }
            textView2.setText(vz2Var.f388690e);
            android.widget.TextView textView3 = this.f265768i;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("headerTitleTextView");
                throw null;
            }
            com.tencent.mm.ui.bk.r0(textView3.getPaint(), 0.8f);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            android.widget.ImageView imageView4 = this.f265764e;
            if (imageView4 != null) {
                imageView4.setBackgroundColor(-16777216);
            } else {
                kotlin.jvm.internal.o.o("themeBgView");
                throw null;
            }
        }
    }

    public final void Q6(r45.zz2 info) {
        kotlin.jvm.internal.o.g(info, "info");
        this.f265771o = info;
        android.view.View findViewById = getContext().findViewById(com.tencent.mm.R.id.r6i);
        if (findViewById == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLiveThemeActionBarUIC", "refreshShareInfo", "(Lcom/tencent/mm/protocal/protobuf/FinderThemeLiveStreamShareInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLiveThemeActionBarUIC", "refreshShareInfo", "(Lcom/tencent/mm/protocal/protobuf/FinderThemeLiveStreamShareInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void R6(r45.vz2 vz2Var) {
        android.view.View findViewById;
        if (vz2Var == null || (findViewById = getContext().findViewById(com.tencent.mm.R.id.nv_)) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLiveThemeActionBarUIC", "setTabListBackground", "(Lcom/tencent/mm/protocal/protobuf/FinderThemeLiveStreamAppearance;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewById.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLiveThemeActionBarUIC", "setTabListBackground", "(Lcom/tencent/mm/protocal/protobuf/FinderThemeLiveStreamAppearance;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        com.tencent.mm.plugin.finder.live.util.a3 a3Var = com.tencent.mm.plugin.finder.live.util.a3.f115443a;
        java.util.LinkedList navbar_bg_color = vz2Var.f388696n;
        kotlin.jvm.internal.o.f(navbar_bg_color, "navbar_bg_color");
        a3Var.c(findViewById, navbar_bg_color, com.tencent.mm.plugin.finder.live.util.u2.f115717f);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.View findViewById = getContext().findViewById(com.tencent.mm.R.id.o5u);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f265764e = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = getContext().findViewById(com.tencent.mm.R.id.gyo);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f265765f = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = getContext().findViewById(com.tencent.mm.R.id.f483085w6);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f265763d = (com.google.android.material.appbar.AppBarLayout) findViewById3;
        android.view.View findViewById4 = getContext().findViewById(com.tencent.mm.R.id.f482436ej);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f265766g = findViewById4;
        android.view.View findViewById5 = getContext().findViewById(com.tencent.mm.R.id.gy9);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f265767h = (android.widget.ImageView) findViewById5;
        android.view.View findViewById6 = getContext().findViewById(com.tencent.mm.R.id.fnn);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f265768i = (android.widget.TextView) findViewById6;
        android.widget.ImageView imageView = this.f265767h;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("headerBgView");
            throw null;
        }
        imageView.setAlpha(0.0f);
        android.widget.TextView textView = this.f265768i;
        if (textView == null) {
            kotlin.jvm.internal.o.o("headerTitleTextView");
            throw null;
        }
        textView.setAlpha(0.0f);
        android.widget.ImageView imageView2 = this.f265765f;
        if (imageView2 == null) {
            kotlin.jvm.internal.o.o("themeHeaderBgView");
            throw null;
        }
        imageView2.setAlpha(0.5f);
        int h17 = com.tencent.mm.ui.bl.h(getContext());
        android.view.View view = this.f265766g;
        if (view == null) {
            kotlin.jvm.internal.o.o("headerLayout");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = i65.a.b(getContext(), 48) + h17;
        }
        android.view.View findViewById7 = getContext().findViewById(com.tencent.mm.R.id.nhk);
        if (findViewById7 != null && (layoutParams = findViewById7.getLayoutParams()) != null) {
            layoutParams.height = h17;
        }
        android.view.View findViewById8 = getContext().findViewById(com.tencent.mm.R.id.r6i);
        if (findViewById8 != null) {
            findViewById8.setOnClickListener(new fr2.r(this));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById8, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLiveThemeActionBarUIC", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById8.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById8, "com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLiveThemeActionBarUIC", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        kotlin.jvm.internal.e0 e0Var = new kotlin.jvm.internal.e0();
        kotlin.jvm.internal.e0 e0Var2 = new kotlin.jvm.internal.e0();
        com.google.android.material.appbar.AppBarLayout appBarLayout = this.f265763d;
        if (appBarLayout == null) {
            kotlin.jvm.internal.o.o("appBarLayout");
            throw null;
        }
        appBarLayout.a(new fr2.s(e0Var, e0Var2, this));
        dk2.of a17 = dk2.of.f233859j.a(getContext().getIntent());
        this.f265769m = a17;
        P6(a17 != null ? a17.f233863c : null);
        dk2.of ofVar = this.f265769m;
        R6(ofVar != null ? ofVar.f233863c : null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        this.f265770n = null;
    }
}
