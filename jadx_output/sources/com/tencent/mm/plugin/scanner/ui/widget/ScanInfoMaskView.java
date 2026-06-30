package com.tencent.mm.plugin.scanner.ui.widget;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\u0007\u001a\u00020\u0003¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView;", "Landroid/widget/LinearLayout;", "", "Landroid/view/View;", "successMark", "Ljz5/f0;", "setAnchorView", "getInfoLayout", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-scan_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ScanInfoMaskView extends android.widget.LinearLayout {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f159699z = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f159700d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f159701e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f159702f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f159703g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f159704h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f159705i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f159706m;

    /* renamed from: n, reason: collision with root package name */
    public final int[] f159707n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.animation.Animation f159708o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f159709p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f159710q;

    /* renamed from: r, reason: collision with root package name */
    public final int[] f159711r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f159712s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f159713t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f159714u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f159715v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f159716w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f159717x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f159718y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScanInfoMaskView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void a(boolean z17) {
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator listener;
        android.view.ViewPropertyAnimator updateListener;
        this.f159713t = false;
        this.f159714u = true;
        setVisibility(0);
        android.view.View view = this.f159704h;
        if (view == null) {
            kotlin.jvm.internal.o.o("infoLayout");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewInternal", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewInternal", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f159702f;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("loadingLayout");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewInternal", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewInternal", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f159701e;
        if (view3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewInternal", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewInternal", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (!z17) {
            setVisibility(0);
            android.view.View view4 = this.f159704h;
            if (view4 == null) {
                kotlin.jvm.internal.o.o("infoLayout");
                throw null;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewInternal", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view4.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewInternal", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            return;
        }
        android.view.View view5 = this.f159701e;
        if (view5 == null) {
            return;
        }
        float translationX = view5.getTranslationX();
        int[] iArr = this.f159711r;
        kotlin.jvm.internal.o.d(this.f159701e);
        float paddingLeft = (translationX - iArr[0]) + r7.getPaddingLeft();
        android.view.View view6 = this.f159701e;
        kotlin.jvm.internal.o.d(view6);
        float translationY = view6.getTranslationY() - iArr[1];
        kotlin.jvm.internal.o.d(this.f159701e);
        float paddingTop = translationY + r8.getPaddingTop();
        android.widget.ImageView imageView = this.f159705i;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("infoIcon");
            throw null;
        }
        imageView.setTranslationX(paddingLeft);
        android.widget.ImageView imageView2 = this.f159705i;
        if (imageView2 == null) {
            kotlin.jvm.internal.o.o("infoIcon");
            throw null;
        }
        imageView2.setTranslationY(paddingTop);
        android.view.View view7 = this.f159704h;
        if (view7 == null) {
            kotlin.jvm.internal.o.o("infoLayout");
            throw null;
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view7, arrayList5.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewWithAnimation", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view7.setAlpha(((java.lang.Float) arrayList5.get(0)).floatValue());
        yj0.a.f(view7, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewWithAnimation", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view8 = this.f159701e;
        kotlin.jvm.internal.o.d(view8);
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(0);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view8, arrayList6.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewWithAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view8.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(view8, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewWithAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view8, arrayList7.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewWithAnimation", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view8.setAlpha(((java.lang.Float) arrayList7.get(0)).floatValue());
        yj0.a.f(view8, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewWithAnimation", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view8.setScaleX(1.0f);
        view8.setScaleY(1.0f);
        android.view.View view9 = this.f159701e;
        kotlin.jvm.internal.o.d(view9);
        android.view.ViewPropertyAnimator animate = view9.animate();
        if (animate == null || (alpha = animate.alpha(0.0f)) == null) {
            return;
        }
        float f17 = iArr[1];
        kotlin.jvm.internal.o.d(this.f159701e);
        android.view.ViewPropertyAnimator translationY2 = alpha.translationY(f17 - r4.getPaddingTop());
        if (translationY2 != null) {
            float f18 = iArr[0];
            kotlin.jvm.internal.o.d(this.f159701e);
            android.view.ViewPropertyAnimator translationX2 = translationY2.translationX(f18 - r3.getPaddingLeft());
            if (translationX2 == null || (duration = translationX2.setDuration(300L)) == null || (listener = duration.setListener(null)) == null || (updateListener = listener.setUpdateListener(new d04.z0(this, paddingLeft, paddingTop))) == null) {
                return;
            }
            updateListener.start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r32) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.scanner.ui.widget.ScanInfoMaskView.b(boolean):void");
    }

    public final android.view.View getInfoLayout() {
        android.view.View view = this.f159704h;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("infoLayout");
        throw null;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        boolean z17 = this.f159712s;
        int[] iArr = this.f159711r;
        if (!z17) {
            android.widget.ImageView imageView = this.f159705i;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("infoIcon");
                throw null;
            }
            imageView.getLocationInWindow(iArr);
        }
        boolean z18 = this.f159709p;
        int[] iArr2 = this.f159707n;
        if (!z18) {
            android.view.View view = this.f159703g;
            if (view == null) {
                kotlin.jvm.internal.o.o("loadingIcon");
                throw null;
            }
            view.getLocationInWindow(iArr2);
        }
        int i19 = iArr[0];
        int i27 = iArr[1];
        int i28 = iArr2[0];
        int i29 = iArr2[1];
        if (iArr[0] != 0 || iArr[1] != 0) {
            this.f159712s = true;
            if (this.f159713t) {
                a(true);
            } else if (!this.f159714u) {
                android.view.View view2 = this.f159704h;
                if (view2 == null) {
                    kotlin.jvm.internal.o.o("infoLayout");
                    throw null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "onMeasure", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "onMeasure", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (iArr2[0] == 0 && iArr2[1] == 0) {
            return;
        }
        this.f159709p = true;
        if (this.f159715v) {
            b(this.f159716w);
            return;
        }
        if (this.f159717x) {
            return;
        }
        android.view.View view3 = this.f159702f;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("loadingLayout");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "onMeasure", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "onMeasure", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void setAnchorView(android.view.View view) {
        this.f159701e = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanInfoMaskView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f159707n = new int[2];
        this.f159711r = new int[2];
        this.f159718y = true;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.box, this);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.m7j);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f159700d = findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.m_j);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f159702f = findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.m_i);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f159703g = findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.m_x);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f159704h = findViewById4;
        android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.m_w);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f159705i = (android.widget.ImageView) findViewById5;
        android.view.View findViewById6 = inflate.findViewById(com.tencent.mm.R.id.m_y);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f159706m = (android.widget.TextView) findViewById6;
        android.view.View view = this.f159700d;
        if (view != null) {
            view.setOnTouchListener(d04.x0.f225547d);
            android.view.View view2 = this.f159704h;
            if (view2 != null) {
                android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.f486730ma0);
                if (textView != null) {
                    com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
                }
                android.widget.TextView textView2 = this.f159706m;
                if (textView2 != null) {
                    com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
                    return;
                } else {
                    kotlin.jvm.internal.o.o("opButton");
                    throw null;
                }
            }
            kotlin.jvm.internal.o.o("infoLayout");
            throw null;
        }
        kotlin.jvm.internal.o.o("root");
        throw null;
    }
}
