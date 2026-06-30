package com.tencent.mm.plugin.scanner;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\bB\u001b\b\u0016\u0012\u0006\u0010)\u001a\u00020(\u0012\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-B#\b\u0016\u0012\u0006\u0010)\u001a\u00020(\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\u0006\u0010.\u001a\u00020\u000b¢\u0006\u0004\b,\u0010/J \u0010\u0007\u001a\u00020\u00062\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004H\u0002J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bR2\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0002j\b\u0012\u0004\u0012\u00020\u000e`\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR2\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u001f\u0010\u0014R\"\u0010'\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u00060"}, d2 = {"Lcom/tencent/mm/plugin/scanner/MultiCodeMaskView;", "Landroid/widget/RelativeLayout;", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/scanner/ImageQBarDataBean;", "Lkotlin/collections/ArrayList;", "srcDataList", "Ljz5/f0;", "setCancelView", "Lcom/tencent/mm/plugin/scanner/f0;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnMultiCodeMaskViewListener", "", "offSet", "setTopOffset", "Landroid/view/View;", "m", "Ljava/util/ArrayList;", "getMGreenPointViewList", "()Ljava/util/ArrayList;", "setMGreenPointViewList", "(Ljava/util/ArrayList;)V", "mGreenPointViewList", "n", "Lcom/tencent/mm/plugin/scanner/f0;", "getMMultiCodeMaskViewListener", "()Lcom/tencent/mm/plugin/scanner/f0;", "setMMultiCodeMaskViewListener", "(Lcom/tencent/mm/plugin/scanner/f0;)V", "mMultiCodeMaskViewListener", "o", "getMSrcDataList", "setMSrcDataList", "mSrcDataList", "q", "I", "getTopOffSet", "()I", "setTopOffSet", "(I)V", "topOffSet", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "common-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class MultiCodeMaskView extends android.widget.RelativeLayout {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f158631v = 0;

    /* renamed from: d, reason: collision with root package name */
    public final int f158632d;

    /* renamed from: e, reason: collision with root package name */
    public final int f158633e;

    /* renamed from: f, reason: collision with root package name */
    public final int f158634f;

    /* renamed from: g, reason: collision with root package name */
    public final int f158635g;

    /* renamed from: h, reason: collision with root package name */
    public final int f158636h;

    /* renamed from: i, reason: collision with root package name */
    public final int f158637i;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public java.util.ArrayList mGreenPointViewList;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.scanner.f0 mMultiCodeMaskViewListener;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public java.util.ArrayList mSrcDataList;

    /* renamed from: p, reason: collision with root package name */
    public int f158641p;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public int topOffSet;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f158643r;

    /* renamed from: s, reason: collision with root package name */
    public android.animation.ValueAnimator f158644s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.animation.AccelerateInterpolator f158645t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.animation.DecelerateInterpolator f158646u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiCodeMaskView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        setClickable(true);
        this.f158632d = i65.a.h(getContext(), com.tencent.mm.R.dimen.a6t);
        this.f158633e = i65.a.h(getContext(), com.tencent.mm.R.dimen.a6u);
        this.f158634f = i65.a.h(getContext(), com.tencent.mm.R.dimen.a6v);
        this.f158635g = i65.a.h(getContext(), com.tencent.mm.R.dimen.a6w);
        this.f158636h = i65.a.h(getContext(), com.tencent.mm.R.dimen.a6x);
        this.f158637i = com.tencent.mm.ui.zk.a(getContext(), 32);
        this.mGreenPointViewList = new java.util.ArrayList();
        this.mSrcDataList = new java.util.ArrayList();
        this.f158643r = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.scanner.o0(this), true);
        this.f158645t = new android.view.animation.AccelerateInterpolator(1.5f);
        this.f158646u = new android.view.animation.DecelerateInterpolator(1.5f);
    }

    private final void setCancelView(java.util.ArrayList<com.tencent.mm.plugin.scanner.ImageQBarDataBean> arrayList) {
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.boc, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = this.f158633e;
        layoutParams.topMargin = this.f158634f;
        int i17 = this.f158635g;
        inflate.setPadding(i17, i17, i17, i17);
        addView(inflate, layoutParams);
        inflate.setOnClickListener(new com.tencent.mm.plugin.scanner.p0(this, arrayList));
    }

    public final void a() {
        android.animation.ValueAnimator valueAnimator = this.f158644s;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
        android.animation.ValueAnimator valueAnimator2 = this.f158644s;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
        }
        android.animation.ValueAnimator valueAnimator3 = this.f158644s;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.f158644s = null;
        this.f158643r.d();
        this.mGreenPointViewList.clear();
        this.mSrcDataList.clear();
        removeAllViews();
        setVisibility(8);
    }

    public final android.graphics.Rect b(android.view.View view, int i17) {
        android.graphics.Rect rect = new android.graphics.Rect();
        rect.left = (getRootView().getWidth() / 2) - (view.getMeasuredWidth() / 2);
        int i18 = this.f158636h;
        rect.top = (i17 - i18) - view.getMeasuredHeight();
        rect.right = (getRootView().getWidth() / 2) + (view.getMeasuredWidth() / 2);
        rect.bottom = i17 - i18;
        return rect;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x02ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r28, java.util.ArrayList r29, java.util.ArrayList r30, java.util.ArrayList r31, int r32) {
        /*
            Method dump skipped, instructions count: 1005
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.scanner.MultiCodeMaskView.c(int, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, int):void");
    }

    public final void d(long j17, boolean z17) {
        i95.m c17 = i95.n0.c(kd0.g2.class);
        kotlin.jvm.internal.o.d(c17);
        com.tencent.mm.plugin.scanner.d0.f158718a.c(j17, 3, this.mSrcDataList, null, 0L, z17, this.f158641p);
        a();
    }

    public final void e(float f17, float f18, android.view.animation.Interpolator interpolator, android.animation.Animator.AnimatorListener animatorListener) {
        android.animation.ValueAnimator valueAnimator = this.f158644s;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
        android.animation.ValueAnimator valueAnimator2 = this.f158644s;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
        }
        android.animation.ValueAnimator valueAnimator3 = this.f158644s;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.f158644s = null;
        android.animation.ValueAnimator valueAnimator4 = new android.animation.ValueAnimator();
        this.f158644s = valueAnimator4;
        valueAnimator4.setFloatValues(f17, f18);
        valueAnimator4.setInterpolator(interpolator);
        valueAnimator4.setDuration(300L);
        valueAnimator4.addUpdateListener(new com.tencent.mm.plugin.scanner.l0(this));
        valueAnimator4.addListener(animatorListener);
        valueAnimator4.start();
    }

    public final java.util.ArrayList<android.view.View> getMGreenPointViewList() {
        return this.mGreenPointViewList;
    }

    public final com.tencent.mm.plugin.scanner.f0 getMMultiCodeMaskViewListener() {
        return this.mMultiCodeMaskViewListener;
    }

    public final java.util.ArrayList<com.tencent.mm.plugin.scanner.ImageQBarDataBean> getMSrcDataList() {
        return this.mSrcDataList;
    }

    public final int getTopOffSet() {
        return this.topOffSet;
    }

    public final void setMGreenPointViewList(java.util.ArrayList<android.view.View> arrayList) {
        kotlin.jvm.internal.o.g(arrayList, "<set-?>");
        this.mGreenPointViewList = arrayList;
    }

    public final void setMMultiCodeMaskViewListener(com.tencent.mm.plugin.scanner.f0 f0Var) {
        this.mMultiCodeMaskViewListener = f0Var;
    }

    public final void setMSrcDataList(java.util.ArrayList<com.tencent.mm.plugin.scanner.ImageQBarDataBean> arrayList) {
        kotlin.jvm.internal.o.g(arrayList, "<set-?>");
        this.mSrcDataList = arrayList;
    }

    public final void setOnMultiCodeMaskViewListener(com.tencent.mm.plugin.scanner.f0 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.mMultiCodeMaskViewListener = listener;
    }

    public final void setTopOffSet(int i17) {
        this.topOffSet = i17;
    }

    public final void setTopOffset(int i17) {
        this.topOffSet = i17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiCodeMaskView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        setClickable(true);
        this.f158632d = i65.a.h(getContext(), com.tencent.mm.R.dimen.a6t);
        this.f158633e = i65.a.h(getContext(), com.tencent.mm.R.dimen.a6u);
        this.f158634f = i65.a.h(getContext(), com.tencent.mm.R.dimen.a6v);
        this.f158635g = i65.a.h(getContext(), com.tencent.mm.R.dimen.a6w);
        this.f158636h = i65.a.h(getContext(), com.tencent.mm.R.dimen.a6x);
        this.f158637i = com.tencent.mm.ui.zk.a(getContext(), 32);
        this.mGreenPointViewList = new java.util.ArrayList();
        this.mSrcDataList = new java.util.ArrayList();
        this.f158643r = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.scanner.o0(this), true);
        this.f158645t = new android.view.animation.AccelerateInterpolator(1.5f);
        this.f158646u = new android.view.animation.DecelerateInterpolator(1.5f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiCodeMaskView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        setClickable(true);
        this.f158632d = i65.a.h(getContext(), com.tencent.mm.R.dimen.a6t);
        this.f158633e = i65.a.h(getContext(), com.tencent.mm.R.dimen.a6u);
        this.f158634f = i65.a.h(getContext(), com.tencent.mm.R.dimen.a6v);
        this.f158635g = i65.a.h(getContext(), com.tencent.mm.R.dimen.a6w);
        this.f158636h = i65.a.h(getContext(), com.tencent.mm.R.dimen.a6x);
        this.f158637i = com.tencent.mm.ui.zk.a(getContext(), 32);
        this.mGreenPointViewList = new java.util.ArrayList();
        this.mSrcDataList = new java.util.ArrayList();
        this.f158643r = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.scanner.o0(this), true);
        this.f158645t = new android.view.animation.AccelerateInterpolator(1.5f);
        this.f158646u = new android.view.animation.DecelerateInterpolator(1.5f);
    }
}
