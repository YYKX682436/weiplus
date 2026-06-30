package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f118381d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f118382e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f118383f;

    /* renamed from: g, reason: collision with root package name */
    public final wd2.g f118384g;

    public g(android.content.Context context, boolean z17, zl2.u4 u4Var, boolean z18, int i17, kotlin.jvm.internal.i iVar) {
        boolean z19 = (i17 & 2) != 0 ? true : z17;
        zl2.u4 uiMode = (i17 & 4) != 0 ? zl2.u4.f473988d : u4Var;
        boolean z27 = (i17 & 8) != 0 ? false : z18;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(uiMode, "uiMode");
        this.f118381d = context;
        android.view.View b17 = b();
        this.f118382e = b17;
        android.view.View c17 = c();
        this.f118383f = c17;
        wd2.g gVar = new wd2.g(context, z19, uiMode, z27);
        if (b17 != null) {
            gVar.f444842i.addView(b17);
            android.view.View view = gVar.f444840g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/actionsheet/FinderLiveBottomSheet", "setLeftView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/actionsheet/FinderLiveBottomSheet", "setLeftView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (c17 != null) {
            gVar.f444846m.addView(c17);
            gVar.f444847n.setVisibility(8);
        }
        gVar.f444851r = new com.tencent.mm.plugin.finder.live.widget.d(this);
        gVar.f444852s = new com.tencent.mm.plugin.finder.live.widget.e(this);
        zl2.u4 u4Var2 = gVar.f444835b;
        android.widget.FrameLayout frameLayout = gVar.f444839f;
        android.view.View m17 = m(frameLayout, u4Var2);
        m17 = m17 == null ? android.view.LayoutInflater.from(gVar.f444834a).inflate(j(), (android.view.ViewGroup) frameLayout, false) : m17;
        kotlin.jvm.internal.o.d(m17);
        p(m17);
        com.tencent.mm.ui.widget.dialog.y1 y1Var = gVar.f444836c;
        y1Var.f212033o = true ^ (this instanceof fh2.c);
        gVar.b(l());
        int n17 = n();
        android.view.View view2 = gVar.f444837d;
        if (n17 == 0) {
            float dimension = view2.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479727dj);
            float dimension2 = view2.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
            float dimension3 = view2.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479646bl);
            com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = y1Var.f212036r;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.f44453z = new wd2.f(gVar, dimension, dimension3, dimension2);
            }
            android.view.View view3 = gVar.f444848o;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/actionsheet/FinderLiveBottomSheet", "setScrollHeaderVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/actionsheet/FinderLiveBottomSheet", "setScrollHeaderVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            gVar.f444838e.setVisibility(8);
        } else {
            android.view.View view4 = gVar.f444848o;
            if (view4 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/actionsheet/FinderLiveBottomSheet", "setScrollHeaderVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/actionsheet/FinderLiveBottomSheet", "setScrollHeaderVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        y1Var.f212044z = r();
        gVar.d(o());
        jz5.l k17 = k();
        gVar.e((java.lang.String) k17.f302833d, (java.lang.String) k17.f302834e);
        frameLayout.addView(m17);
        android.graphics.drawable.Drawable i18 = i();
        if (i18 != null) {
            view2.setBackgroundDrawable(i18);
        }
        this.f118384g = gVar;
        if (b17 != null) {
            b17.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.b(this));
        }
        if (c17 != null) {
            c17.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.c(this));
        }
    }

    public void a() {
        this.f118384g.f444836c.q();
    }

    public android.view.View b() {
        return null;
    }

    public android.view.View c() {
        return null;
    }

    public final android.view.View d(int i17) {
        return this.f118384g.f444836c.f212025d.findViewById(i17);
    }

    public com.tencent.mm.ui.widget.imageview.WeImageView e() {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(this.f118381d);
        weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_arrow);
        weImageView.setRotation(180.0f);
        weImageView.setIconColor(weImageView.getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
        weImageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(i65.a.b(weImageView.getContext(), 12), i65.a.b(weImageView.getContext(), 24)));
        return weImageView;
    }

    public android.widget.TextView f() {
        android.widget.TextView textView = new android.widget.TextView(this.f118381d);
        textView.setTextSize(0, textView.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479688cn));
        textView.setBackground(textView.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.a0s));
        int b17 = i65.a.b(textView.getContext(), 12);
        int b18 = i65.a.b(textView.getContext(), 4);
        textView.setPadding(b17, b18, b17, b18);
        textView.setEnabled(false);
        textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.f478494f));
        textView.setText(textView.getContext().getResources().getString(com.tencent.mm.R.string.f490441v5));
        return textView;
    }

    public android.widget.TextView g() {
        android.widget.TextView textView = new android.widget.TextView(this.f118381d);
        textView.setTextSize(0, textView.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479674cb));
        textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
        textView.setText(textView.getContext().getResources().getString(com.tencent.mm.R.string.f490347sg));
        return textView;
    }

    public com.tencent.mm.ui.widget.imageview.WeImageView h() {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(this.f118381d);
        weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_close);
        weImageView.setIconColor(weImageView.getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
        weImageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(i65.a.b(weImageView.getContext(), 24), i65.a.b(weImageView.getContext(), 24)));
        return weImageView;
    }

    public android.graphics.drawable.Drawable i() {
        return null;
    }

    public abstract int j();

    public jz5.l k() {
        return new jz5.l("", "");
    }

    public int l() {
        return 0;
    }

    public android.view.View m(android.view.ViewGroup root, zl2.u4 uiMode) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(uiMode, "uiMode");
        return null;
    }

    public int n() {
        return 8;
    }

    public java.lang.String o() {
        return "";
    }

    public abstract void p(android.view.View view);

    public boolean q() {
        return this.f118384g.f444836c.f();
    }

    public boolean r() {
        return this instanceof ni2.w;
    }

    public void s() {
    }

    public void t() {
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).mj(this);
    }

    public void u() {
        a();
    }

    public void v() {
        a();
    }

    public void w() {
        wd2.g gVar = this.f118384g;
        gVar.f(0);
        com.tencent.mars.xlog.Log.i("BaseBottomPanelSheet", "start openPanel");
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).oj(this);
        gVar.f444837d.getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.mm.plugin.finder.live.widget.f(this));
    }

    public void x(java.lang.String mainTitle, java.lang.String secondTitle) {
        kotlin.jvm.internal.o.g(mainTitle, "mainTitle");
        kotlin.jvm.internal.o.g(secondTitle, "secondTitle");
        this.f118384g.e(mainTitle, secondTitle);
    }
}
