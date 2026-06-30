package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class dk extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f118108d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f118109e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f118110f;

    /* renamed from: g, reason: collision with root package name */
    public final int f118111g;

    /* renamed from: h, reason: collision with root package name */
    public final int f118112h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f118113i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup f118114m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f118115n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View.OnClickListener f118116o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View.OnClickListener f118117p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f118118q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f118119r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f118120s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f118121t;

    /* renamed from: u, reason: collision with root package name */
    public int f118122u;

    /* renamed from: v, reason: collision with root package name */
    public int f118123v;

    /* renamed from: w, reason: collision with root package name */
    public android.animation.ObjectAnimator f118124w;

    /* renamed from: x, reason: collision with root package name */
    public android.animation.ObjectAnimator f118125x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk(android.content.Context context, android.view.ViewGroup parent, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f118108d = parent;
        this.f118109e = basePlugin;
        this.f118110f = "Finder.FinderLiveGameJoinGuideBubbleWidget";
        this.f118111g = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479688cn);
        this.f118112h = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479688cn);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ar7, (android.view.ViewGroup) this, true);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f118113i = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.bzh);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f118118q = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.obc);
        this.f118119r = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.nrk);
        this.f118120s = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kr8);
        this.f118121t = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.gro);
        inflate.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.yj(this));
        ((android.widget.ImageView) findViewById).setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.zj(this));
    }

    private final android.view.ViewGroup getEntranceRoot() {
        com.tencent.mm.plugin.finder.live.plugin.l X0 = this.f118109e.X0(com.tencent.mm.plugin.finder.live.plugin.ag0.class);
        kotlin.jvm.internal.o.d(X0);
        return ((com.tencent.mm.plugin.finder.live.plugin.ag0) X0).G1();
    }

    public final void a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("v，parent visibility:");
        android.view.ViewGroup viewGroup = this.f118108d;
        sb6.append(viewGroup.getVisibility());
        com.tencent.mars.xlog.Log.i(this.f118110f, sb6.toString());
        if (getVisibility() == 0) {
            if (this.f118125x == null) {
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(viewGroup, "alpha", 1.0f, 0.0f);
                this.f118125x = ofFloat;
                if (ofFloat != null) {
                    ofFloat.addListener(new com.tencent.mm.plugin.finder.live.widget.bk(this));
                }
            }
            android.animation.ObjectAnimator objectAnimator = this.f118125x;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            android.animation.ObjectAnimator objectAnimator2 = this.f118125x;
            if (objectAnimator2 != null) {
                objectAnimator2.start();
            }
        }
    }

    public final boolean b() {
        android.view.ViewGroup viewGroup = this.f118114m;
        if (viewGroup != null && viewGroup.getVisibility() == 0) {
            android.view.View view = this.f118115n;
            if (view != null && view.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.Boolean c() {
        return java.lang.Boolean.valueOf(getVisibility() == 0);
    }

    public final void d(java.lang.String str, java.lang.String str2, int i17) {
        if (android.text.TextUtils.isEmpty(str)) {
            android.widget.TextView textView = this.f118119r;
            if (textView != null) {
                textView.setVisibility(8);
            }
            android.widget.TextView textView2 = this.f118120s;
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(8);
            return;
        }
        android.widget.TextView textView3 = this.f118119r;
        if (textView3 != null) {
            textView3.setText(str);
        }
        if (i17 <= 0) {
            android.widget.TextView textView4 = this.f118120s;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
        } else {
            android.widget.TextView textView5 = this.f118120s;
            if (textView5 != null) {
                textView5.setVisibility(0);
            }
            java.lang.String string = getContext().getString(com.tencent.mm.R.string.f491399cz3, java.lang.Integer.valueOf(i17));
            kotlin.jvm.internal.o.f(string, "getString(...)");
            int L = r26.n0.L(string, java.lang.String.valueOf(i17), 0, false, 6, null);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = getContext();
            java.lang.String substring = string.substring(0, L);
            kotlin.jvm.internal.o.f(substring, "substring(...)");
            java.lang.String substring2 = string.substring(L, string.length());
            kotlin.jvm.internal.o.f(substring2, "substring(...)");
            android.graphics.drawable.Drawable e17 = com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.coin_icon, getContext().getResources().getColor(com.tencent.mm.R.color.Brand_100));
            e17.setBounds(0, 0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479672c9), i65.a.f(getContext(), com.tencent.mm.R.dimen.f479672c9));
            ((ke0.e) xVar).getClass();
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(com.tencent.mm.pluginsdk.ui.span.c0.b(context, substring, substring2, e17, true, false));
            android.widget.TextView textView6 = this.f118120s;
            if (textView6 != null) {
                textView6.setText(spannableStringBuilder);
            }
        }
        android.widget.TextView textView7 = this.f118119r;
        if (textView7 != null) {
            textView7.setVisibility(0);
        }
        if (str2 != null) {
            if (str2.length() > 0) {
                android.widget.TextView textView8 = this.f118119r;
                if (textView8 != null) {
                    textView8.setContentDescription(str2);
                }
                android.widget.TextView textView9 = this.f118120s;
                if (textView9 == null) {
                    return;
                }
                textView9.setContentDescription(" ");
            }
        }
    }

    public final void e(java.lang.String str, boolean z17) {
        android.widget.TextView textView = this.f118118q;
        if (textView != null) {
            textView.setMaxLines(z17 ? 2 : 1);
        }
        if (android.text.TextUtils.isEmpty(str)) {
            android.widget.TextView textView2 = this.f118118q;
            if (textView2 == null) {
                return;
            }
            textView2.setText("");
            return;
        }
        android.widget.TextView textView3 = this.f118118q;
        if (textView3 == null) {
            return;
        }
        textView3.setText(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f() {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.dk.f():boolean");
    }

    public final void g() {
        android.view.View view = this.f118115n;
        android.view.ViewGroup viewGroup = this.f118114m;
        if (view == null || viewGroup == null) {
            return;
        }
        int[] iArr = new int[2];
        getEntranceRoot().getLocationOnScreen(iArr);
        if ((this.f118122u == iArr[0] && this.f118123v == iArr[1]) || getEntranceRoot().getVisibility() == 8) {
            return;
        }
        android.view.ViewParent parent = getEntranceRoot().getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        if (((android.view.ViewGroup) parent).getVisibility() == 8) {
            return;
        }
        this.f118122u = iArr[0];
        this.f118123v = iArr[1];
        int i17 = com.tencent.mm.ui.bl.b(getRootView().getContext()).x;
        com.tencent.mm.ui.bl.h(getContext());
        boolean z17 = getContext().getResources().getConfiguration().orientation == 2;
        int i18 = this.f118111g;
        int i19 = this.f118112h;
        if (z17) {
            int width = viewGroup.getWidth();
            if (width == 0) {
                width = getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479684cj);
            }
            int width2 = (i17 - iArr[0]) - (getEntranceRoot().getWidth() / 2);
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
            int i27 = width2 - (width / 2);
            if (i27 - i19 > 0) {
                layoutParams2.rightMargin = i27 - i19;
            } else {
                layoutParams2.rightMargin = 0;
            }
            viewGroup.setLayoutParams(layoutParams2);
            int width3 = view.getWidth();
            if (width3 != 0) {
                i18 = width3;
            }
            android.view.ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) layoutParams3;
            layoutParams4.rightMargin = (width2 - (i18 / 2)) - i19;
            view.setLayoutParams(layoutParams4);
            return;
        }
        int width4 = viewGroup.getWidth();
        if (width4 == 0) {
            width4 = getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480437xw);
        }
        int width5 = (i17 - iArr[0]) - (getEntranceRoot().getWidth() / 2);
        android.view.ViewGroup.LayoutParams layoutParams5 = viewGroup.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams5, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams6 = (android.widget.LinearLayout.LayoutParams) layoutParams5;
        int i28 = width5 - (width4 / 2);
        if (i28 - i19 > 0) {
            layoutParams6.rightMargin = i28 - i19;
        } else {
            layoutParams6.rightMargin = 0;
        }
        viewGroup.setLayoutParams(layoutParams6);
        int width6 = view.getWidth();
        if (width6 != 0) {
            i18 = width6;
        }
        android.view.ViewGroup.LayoutParams layoutParams7 = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams7, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams8 = (android.widget.LinearLayout.LayoutParams) layoutParams7;
        layoutParams8.rightMargin = (width5 - (i18 / 2)) - i19;
        view.setLayoutParams(layoutParams8);
    }

    public final com.tencent.mm.plugin.finder.live.plugin.l getBasePlugin() {
        return this.f118109e;
    }

    public final android.widget.TextView getGiftTitleTV() {
        return this.f118121t;
    }

    public final android.view.View.OnClickListener getMCloseListener() {
        return this.f118117p;
    }

    public final android.view.View.OnClickListener getMListener() {
        return this.f118116o;
    }

    public final android.widget.TextView getPaySubtitleTV() {
        return this.f118120s;
    }

    public final android.widget.TextView getSubtitleTV() {
        return this.f118119r;
    }

    public final android.widget.TextView getTitleTV() {
        return this.f118118q;
    }

    public final void setGiftTitle(java.lang.String str) {
        android.widget.TextView textView = this.f118121t;
        if (textView != null) {
            textView.setText(str);
        }
        if (android.text.TextUtils.isEmpty(str)) {
            android.widget.TextView textView2 = this.f118121t;
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(8);
            return;
        }
        android.widget.TextView textView3 = this.f118121t;
        if (textView3 == null) {
            return;
        }
        textView3.setVisibility(0);
    }

    public final void setGiftTitleTV(android.widget.TextView textView) {
        this.f118121t = textView;
    }

    public final void setMCloseListener(android.view.View.OnClickListener onClickListener) {
        this.f118117p = onClickListener;
    }

    public final void setMListener(android.view.View.OnClickListener onClickListener) {
        this.f118116o = onClickListener;
    }

    public final void setPaySubtitleTV(android.widget.TextView textView) {
        this.f118120s = textView;
    }

    public final void setSubtitleTV(android.widget.TextView textView) {
        this.f118119r = textView;
    }

    public final void setTitleTV(android.widget.TextView textView) {
        this.f118118q = textView;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        android.view.ViewGroup viewGroup = this.f118114m;
        if (viewGroup != null) {
            viewGroup.setVisibility(i17);
        }
        android.view.View view = this.f118115n;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveGameJoinGuideBubbleWidget", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveGameJoinGuideBubbleWidget", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
