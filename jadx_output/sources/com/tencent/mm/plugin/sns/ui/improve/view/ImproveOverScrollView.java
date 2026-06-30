package com.tencent.mm.plugin.sns.ui.improve.view;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB\u001b\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019B#\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u001bR0\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveOverScrollView;", "Landroid/widget/RelativeLayout;", "Lkotlin/Function1;", "", "Ljz5/f0;", "g", "Lyz5/l;", "getRefreshCallback", "()Lyz5/l;", "setRefreshCallback", "(Lyz5/l;)V", "refreshCallback", "Lbd4/u0;", "p", "Lbd4/u0;", "getDispatchTouchListener", "()Lbd4/u0;", "setDispatchTouchListener", "(Lbd4/u0;)V", "dispatchTouchListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bd4/v0", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ImproveOverScrollView extends android.widget.RelativeLayout {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f169154y = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f169155d;

    /* renamed from: e, reason: collision with root package name */
    public final int f169156e;

    /* renamed from: f, reason: collision with root package name */
    public final int f169157f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public yz5.l refreshCallback;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f169159h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Rect f169160i;

    /* renamed from: m, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f169161m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.QFadeImageView f169162n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout f169163o;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public bd4.u0 dispatchTouchListener;

    /* renamed from: q, reason: collision with root package name */
    public boolean f169165q;

    /* renamed from: r, reason: collision with root package name */
    public float f169166r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f169167s;

    /* renamed from: t, reason: collision with root package name */
    public android.animation.ObjectAnimator f169168t;

    /* renamed from: u, reason: collision with root package name */
    public android.animation.ObjectAnimator f169169u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f169170v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f169171w;

    /* renamed from: x, reason: collision with root package name */
    public float f169172x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImproveOverScrollView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        int f17;
        kotlin.jvm.internal.o.g(context, "context");
        this.f169155d = new java.util.ArrayList();
        if (pc4.d.f353410a.y()) {
            f17 = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479659bw);
        } else {
            f17 = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479670c7);
        }
        this.f169156e = f17;
        this.f169157f = i65.a.f(getContext(), com.tencent.mm.R.dimen.a2t);
        this.f169160i = new android.graphics.Rect();
    }

    public final void a(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("directShowTopLoading", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
        com.tencent.mm.ui.widget.QFadeImageView qFadeImageView = this.f169162n;
        if (qFadeImageView != null) {
            qFadeImageView.setTranslationY(this.f169156e);
        }
        c();
        yz5.l lVar = this.refreshCallback;
        if (lVar != null) {
            lVar.invoke(java.lang.Integer.valueOf(i17));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("directShowTopLoading", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
    }

    public final void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideTopLoadingView", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.OverScrollView", "hideTopLoadingView: ");
        this.f169170v = true;
        this.f169171w = false;
        android.animation.ObjectAnimator objectAnimator = this.f169168t;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.f169168t = null;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f169162n, "translationY", this.f169157f);
        this.f169169u = ofFloat;
        if (ofFloat != null) {
            ofFloat.addListener(new bd4.w0(this));
        }
        android.animation.ObjectAnimator objectAnimator2 = this.f169169u;
        if (objectAnimator2 != null) {
            objectAnimator2.setDuration(700L);
        }
        android.animation.ObjectAnimator objectAnimator3 = this.f169169u;
        if (objectAnimator3 != null) {
            objectAnimator3.setInterpolator(new android.view.animation.LinearInterpolator());
        }
        android.animation.ObjectAnimator objectAnimator4 = this.f169169u;
        if (objectAnimator4 != null) {
            objectAnimator4.start();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideTopLoadingView", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
    }

    public final void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showTopLoadingView", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
        if (this.f169168t != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showTopLoadingView", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
            return;
        }
        com.tencent.mm.ui.widget.QFadeImageView qFadeImageView = this.f169162n;
        if (qFadeImageView != null) {
            qFadeImageView.setTranslationY(this.f169156e);
        }
        com.tencent.mm.ui.widget.QFadeImageView qFadeImageView2 = this.f169162n;
        if (qFadeImageView2 != null) {
            qFadeImageView2.clearAnimation();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.OverScrollView", "showTopLoadingView");
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f169162n, "rotation", 0.0f, 360.0f);
        this.f169168t = ofFloat;
        if (ofFloat != null) {
            ofFloat.setDuration(700L);
        }
        android.animation.ObjectAnimator objectAnimator = this.f169168t;
        if (objectAnimator != null) {
            objectAnimator.setInterpolator(new android.view.animation.LinearInterpolator());
        }
        android.animation.ObjectAnimator objectAnimator2 = this.f169168t;
        if (objectAnimator2 != null) {
            objectAnimator2.setRepeatCount(-1);
        }
        android.animation.ObjectAnimator objectAnimator3 = this.f169168t;
        if (objectAnimator3 != null) {
            objectAnimator3.start();
        }
        this.f169171w = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showTopLoadingView", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
    }

    public final void d(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateTopLoadingImgPositionWithAbsOffset", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
        com.tencent.mm.ui.widget.QFadeImageView qFadeImageView = this.f169162n;
        if (qFadeImageView != null) {
            qFadeImageView.clearAnimation();
        }
        android.animation.ObjectAnimator objectAnimator = this.f169169u;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        android.animation.ObjectAnimator objectAnimator2 = this.f169168t;
        if (objectAnimator2 != null) {
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            this.f169168t = null;
            this.f169171w = true;
        }
        com.tencent.mm.ui.widget.QFadeImageView qFadeImageView2 = this.f169162n;
        if (qFadeImageView2 != null) {
            qFadeImageView2.setRotation((-f17) * 3);
        }
        com.tencent.mm.ui.widget.QFadeImageView qFadeImageView3 = this.f169162n;
        kotlin.jvm.internal.o.d(qFadeImageView3);
        float translationY = qFadeImageView3.getTranslationY() + ((f17 - this.f169172x) * 0.8f);
        int i17 = this.f169156e;
        if (translationY > i17) {
            com.tencent.mm.ui.widget.QFadeImageView qFadeImageView4 = this.f169162n;
            if (qFadeImageView4 != null) {
                qFadeImageView4.setTranslationY(i17);
            }
        } else {
            int i18 = this.f169157f;
            if (translationY < i18) {
                com.tencent.mm.ui.widget.QFadeImageView qFadeImageView5 = this.f169162n;
                if (qFadeImageView5 != null) {
                    qFadeImageView5.setTranslationY(i18);
                }
            } else {
                com.tencent.mm.ui.widget.QFadeImageView qFadeImageView6 = this.f169162n;
                kotlin.jvm.internal.o.d(qFadeImageView6);
                qFadeImageView6.setTranslationY(translationY);
            }
        }
        this.f169172x = f17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateTopLoadingImgPositionWithAbsOffset", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0156 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00d8  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 861
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final bd4.u0 getDispatchTouchListener() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDispatchTouchListener", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
        bd4.u0 u0Var = this.dispatchTouchListener;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDispatchTouchListener", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
        return u0Var;
    }

    public final yz5.l getRefreshCallback() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRefreshCallback", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
        yz5.l lVar = this.refreshCallback;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRefreshCallback", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
        return lVar;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFinishInflate", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
        super.onFinishInflate();
        this.f169159h = getChildAt(0);
        this.f169161m = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.hbs);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setupTopLoadingImg", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
        com.tencent.mm.ui.widget.QFadeImageView qFadeImageView = (com.tencent.mm.ui.widget.QFadeImageView) findViewById(com.tencent.mm.R.id.nak);
        this.f169162n = qFadeImageView;
        if (qFadeImageView != null) {
            qFadeImageView.setScaleType(al5.q2.MATRIX);
        }
        com.tencent.mm.ui.widget.QFadeImageView qFadeImageView2 = this.f169162n;
        if (qFadeImageView2 != null) {
            qFadeImageView2.setImageResource(com.tencent.mm.R.raw.friendactivity_refresh);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupTopLoadingImg", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
        java.util.ArrayList arrayList = this.f169155d;
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        arrayList.add(zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC.class));
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        arrayList.add(zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.sns.ui.improve.component.a2.class));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinishInflate", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
        super.onLayout(z17, i17, i18, i19, i27);
        android.view.View view = this.f169159h;
        if (view != null) {
            this.f169160i.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
    }

    public final void setDispatchTouchListener(bd4.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDispatchTouchListener", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
        this.dispatchTouchListener = u0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDispatchTouchListener", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
    }

    public final void setRefreshCallback(yz5.l lVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRefreshCallback", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
        this.refreshCallback = lVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRefreshCallback", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImproveOverScrollView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        int f17;
        kotlin.jvm.internal.o.g(context, "context");
        this.f169155d = new java.util.ArrayList();
        if (pc4.d.f353410a.y()) {
            f17 = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479659bw);
        } else {
            f17 = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479670c7);
        }
        this.f169156e = f17;
        this.f169157f = i65.a.f(getContext(), com.tencent.mm.R.dimen.a2t);
        this.f169160i = new android.graphics.Rect();
    }
}
