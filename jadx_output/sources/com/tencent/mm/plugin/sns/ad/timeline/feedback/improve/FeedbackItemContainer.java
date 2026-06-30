package com.tencent.mm.plugin.sns.ad.timeline.feedback.improve;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB#\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002R\u001b\u0010\b\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/timeline/feedback/improve/FeedbackItemContainer;", "Landroid/widget/FrameLayout;", "", "getDefaultPanelWidth", "i", "Ljz5/g;", "getMScreenWidth", "()I", "mScreenWidth", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "k74/a", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FeedbackItemContainer extends android.widget.FrameLayout {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f163190s = 0;

    /* renamed from: d, reason: collision with root package name */
    public final int f163191d;

    /* renamed from: e, reason: collision with root package name */
    public final int f163192e;

    /* renamed from: f, reason: collision with root package name */
    public final int f163193f;

    /* renamed from: g, reason: collision with root package name */
    public final int f163194g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f163195h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final jz5.g mScreenWidth;

    /* renamed from: m, reason: collision with root package name */
    public k74.a f163197m;

    /* renamed from: n, reason: collision with root package name */
    public int f163198n;

    /* renamed from: o, reason: collision with root package name */
    public int f163199o;

    /* renamed from: p, reason: collision with root package name */
    public int f163200p;

    /* renamed from: q, reason: collision with root package name */
    public int f163201q;

    /* renamed from: r, reason: collision with root package name */
    public final k74.b f163202r;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FeedbackItemContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final int getMScreenWidth() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMScreenWidth", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer");
        int intValue = ((java.lang.Number) ((jz5.n) this.mScreenWidth).getValue()).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMScreenWidth", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer");
        return intValue;
    }

    public final int getDefaultPanelWidth() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDefaultPanelWidth", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer");
        int min = java.lang.Math.min(this.f163194g, getMScreenWidth() - (this.f163192e * 2));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDefaultPanelWidth", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer");
        return min;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer");
        super.onLayout(z17, i17, i18, i19, i27);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("layoutItemList", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer");
        java.util.Iterator it = ((java.util.ArrayList) this.f163195h).iterator();
        int i28 = 0;
        while (it.hasNext()) {
            android.widget.TextView textView = (android.widget.TextView) it.next();
            int i29 = i28 % 2;
            int i37 = this.f163193f;
            int i38 = this.f163191d;
            if (i29 == 0) {
                int i39 = this.f163199o;
                int i47 = (i28 / 2) * (i37 + i39);
                textView.layout(i38, i47, this.f163198n + i38, i39 + i47);
            } else {
                int i48 = this.f163198n;
                int i49 = i38 + i48 + i37;
                int i57 = this.f163199o;
                int i58 = (i28 / 2) * (i37 + i57);
                textView.layout(i49, i58, i48 + i49, i57 + i58);
            }
            i28++;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutItemList", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer");
        super.onMeasure(i17, i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("measureItemList", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer");
        java.util.List list = this.f163195h;
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        java.util.Iterator it = arrayList.iterator();
        int i19 = 0;
        int i27 = 0;
        while (it.hasNext()) {
            android.widget.TextView textView = (android.widget.TextView) it.next();
            if (textView.getMeasuredWidth() > i19) {
                i19 = textView.getMeasuredWidth();
            }
            if (textView.getMeasuredHeight() > i27) {
                i27 = textView.getMeasuredHeight();
            }
        }
        int mScreenWidth = getMScreenWidth() - (this.f163192e * 2);
        int i28 = this.f163191d;
        int i29 = i28 * 2;
        int i37 = this.f163193f;
        int i38 = ((mScreenWidth - i29) - i37) / 2;
        int i39 = ((this.f163194g - i29) - i37) / 2;
        if (i39 > i38) {
            i39 = i38;
        }
        if (i19 > i38) {
            i19 = i38;
        } else if (i19 < i39) {
            i19 = i39;
        }
        this.f163198n = i19;
        this.f163199o = i27;
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            android.widget.TextView textView2 = (android.widget.TextView) it6.next();
            int i47 = textView2.getLayoutParams().width;
            int i48 = textView2.getLayoutParams().height;
            if (textView2.getLayoutParams().width != this.f163198n || textView2.getLayoutParams().height != this.f163199o) {
                android.view.ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
                layoutParams.width = this.f163198n;
                layoutParams.height = this.f163199o;
                textView2.setLayoutParams(layoutParams);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("measureItemList", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer");
        int size = (((java.util.ArrayList) list).size() / 2) + (((java.util.ArrayList) list).size() % 2);
        this.f163200p = (this.f163198n * 2) + (i28 * 2) + i37;
        int i49 = this.f163199o * size;
        int i57 = size - 1;
        this.f163201q = i49 + (i57 > 0 ? i57 * i37 : 0);
        if (getLayoutParams().width != this.f163200p || getLayoutParams().height != this.f163201q) {
            android.view.ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            layoutParams2.width = this.f163200p;
            layoutParams2.height = this.f163201q;
            setLayoutParams(layoutParams2);
        }
        setMeasuredDimension(this.f163200p, this.f163201q);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackItemContainer(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f163191d = c44.b.a(16);
        this.f163192e = c44.b.a(16);
        this.f163193f = c44.b.a(8);
        this.f163194g = c44.b.a(com.tencent.mapsdk.internal.km.f50100e);
        this.f163195h = new java.util.ArrayList();
        this.mScreenWidth = jz5.h.b(new k74.c(this));
        this.f163202r = new k74.b(this);
    }
}
