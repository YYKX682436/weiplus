package com.tencent.mm.plugin.sns.ad.timeline.item.flipcard;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0002B'\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/timeline/item/flipcard/AdFlipCardTouchContainer;", "Landroid/widget/FrameLayout;", "Lt74/f2;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljz5/f0;", "setScrollListener", "Ljz5/l;", "", "getClickPos", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AdFlipCardTouchContainer extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public float f163221d;

    /* renamed from: e, reason: collision with root package name */
    public float f163222e;

    /* renamed from: f, reason: collision with root package name */
    public float f163223f;

    /* renamed from: g, reason: collision with root package name */
    public t74.f2 f163224g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.VelocityTracker f163225h;

    /* renamed from: i, reason: collision with root package name */
    public final int f163226i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f163227m;

    /* renamed from: n, reason: collision with root package name */
    public float f163228n;

    /* renamed from: o, reason: collision with root package name */
    public float f163229o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f163230p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f163231q;

    /* renamed from: r, reason: collision with root package name */
    public float f163232r;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdFlipCardTouchContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final jz5.l getClickPos() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickPos", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTouchContainer");
        jz5.l lVar = new jz5.l(java.lang.Float.valueOf(this.f163228n), java.lang.Float.valueOf(this.f163229o));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickPos", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTouchContainer");
        return lVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTouchContainer");
        super.onDetachedFromWindow();
        android.view.VelocityTracker velocityTracker = this.f163225h;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f163225h = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTouchContainer");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r5 != 3) goto L99;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTouchContainer.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setScrollListener(t74.f2 listener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setScrollListener", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTouchContainer");
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f163224g = listener;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScrollListener", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTouchContainer");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdFlipCardTouchContainer(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f163226i = android.view.ViewConfiguration.getTouchSlop();
        this.f163228n = -1.0f;
        this.f163229o = -1.0f;
        this.f163230p = true;
    }
}
