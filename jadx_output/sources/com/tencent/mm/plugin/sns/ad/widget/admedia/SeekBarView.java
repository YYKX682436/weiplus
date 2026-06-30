package com.tencent.mm.plugin.sns.ad.widget.admedia;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u000b3B\u001d\b\u0016\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/B%\b\u0016\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\b.\u00102R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\"\u0010\u001d\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010)\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u00064"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/widget/admedia/SeekBarView;", "Landroid/widget/RelativeLayout;", "Lcom/tencent/mm/plugin/sns/ad/widget/appcompat/AdAppCompatTextView;", "d", "Lcom/tencent/mm/plugin/sns/ad/widget/appcompat/AdAppCompatTextView;", "getCurrentTimeText", "()Lcom/tencent/mm/plugin/sns/ad/widget/appcompat/AdAppCompatTextView;", "currentTimeText", "e", "getEndTimeText", "endTimeText", "Li84/b;", "f", "Li84/b;", "getPointView", "()Li84/b;", "pointView", "Landroid/view/View;", "g", "Landroid/view/View;", "getPlayedProgressLine", "()Landroid/view/View;", "playedProgressLine", "h", "getUnplayedProgressLine", "unplayedProgressLine", "", "s", "Z", "isRefreshing", "()Z", "setRefreshing", "(Z)V", "", "value", "t", "F", "getProgress", "()F", "setProgress", "(F)V", "progress", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "i84/c", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class SeekBarView extends android.widget.RelativeLayout {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f163296w = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView currentTimeText;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView endTimeText;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final i84.b pointView;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final android.view.View playedProgressLine;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final android.view.View unplayedProgressLine;

    /* renamed from: i, reason: collision with root package name */
    public kotlinx.coroutines.y0 f163302i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.a f163303m;

    /* renamed from: n, reason: collision with root package name */
    public float f163304n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.l f163305o;

    /* renamed from: p, reason: collision with root package name */
    public yz5.l f163306p;

    /* renamed from: q, reason: collision with root package name */
    public final int f163307q;

    /* renamed from: r, reason: collision with root package name */
    public int f163308r;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public boolean isRefreshing;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public float progress;

    /* renamed from: u, reason: collision with root package name */
    public float f163311u;

    /* renamed from: v, reason: collision with root package name */
    public float f163312v;

    public SeekBarView(android.content.Context context) {
        super(context);
        this.currentTimeText = new com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView(getContext());
        this.endTimeText = new com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView(getContext());
        this.pointView = new i84.b(getContext());
        this.playedProgressLine = new android.view.View(getContext());
        this.unplayedProgressLine = new android.view.View(getContext());
        this.f163304n = 0.1f;
        this.f163307q = 88;
    }

    public final yz5.a a(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getConvertToXmlPxInt", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        i84.d dVar = new i84.d(this, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getConvertToXmlPxInt", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        return dVar;
    }

    public final void b(yz5.l convertToXmlPx, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        kotlin.jvm.internal.o.g(convertToXmlPx, "convertToXmlPx");
        this.f163306p = convertToXmlPx;
        setGravity(16);
        int floatValue = (int) ((java.lang.Number) convertToXmlPx.invoke(64)).floatValue();
        int floatValue2 = (int) ((java.lang.Number) convertToXmlPx.invoke(34)).floatValue();
        com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView adAppCompatTextView = this.currentTimeText;
        addView(adAppCompatTextView, floatValue, floatValue2);
        adAppCompatTextView.setTextColor(i18);
        adAppCompatTextView.setAlpha(0.4f);
        android.view.ViewGroup.LayoutParams layoutParams = adAppCompatTextView.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.addRule(15);
        }
        androidx.core.widget.a0.b(adAppCompatTextView, 1, (int) ((java.lang.Number) convertToXmlPx.invoke(24)).floatValue(), 1, 0);
        int floatValue3 = (int) ((java.lang.Number) convertToXmlPx.invoke(64)).floatValue();
        int floatValue4 = (int) ((java.lang.Number) convertToXmlPx.invoke(34)).floatValue();
        com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView adAppCompatTextView2 = this.endTimeText;
        addView(adAppCompatTextView2, floatValue3, floatValue4);
        adAppCompatTextView2.setTextColor(i18);
        adAppCompatTextView2.setAlpha(0.4f);
        android.view.ViewGroup.LayoutParams layoutParams3 = adAppCompatTextView2.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams3 : null;
        if (layoutParams4 != null) {
            layoutParams4.addRule(11);
        }
        if (layoutParams4 != null) {
            layoutParams4.addRule(15);
        }
        androidx.core.widget.a0.b(adAppCompatTextView2, 1, (int) ((java.lang.Number) convertToXmlPx.invoke(24)).floatValue(), 1, 0);
        int i19 = this.f163307q;
        int i27 = i17 - (i19 * 2);
        this.f163308r = i27;
        android.view.View view = this.playedProgressLine;
        addView(view, (int) ((java.lang.Number) convertToXmlPx.invoke(java.lang.Integer.valueOf(i27))).floatValue(), (int) ((java.lang.Number) convertToXmlPx.invoke(4)).floatValue());
        view.setBackgroundColor(i18);
        view.setClipToOutline(true);
        view.setOutlineProvider(new i84.c((int) ((java.lang.Number) convertToXmlPx.invoke(1)).floatValue()));
        android.view.ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams6 = layoutParams5 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams5 : null;
        if (layoutParams6 != null) {
            layoutParams6.leftMargin = ((java.lang.Number) ((i84.d) a(i19)).invoke()).intValue();
        }
        if (layoutParams6 != null) {
            layoutParams6.addRule(15);
        }
        android.view.View view2 = this.unplayedProgressLine;
        addView(view2, (int) ((java.lang.Number) convertToXmlPx.invoke(java.lang.Integer.valueOf(this.f163308r))).floatValue(), (int) ((java.lang.Number) convertToXmlPx.invoke(4)).floatValue());
        view2.setClipToOutline(true);
        view2.setOutlineProvider(new i84.c((int) ((java.lang.Number) convertToXmlPx.invoke(1)).floatValue()));
        view2.setBackgroundColor(i18);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.5f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/admedia/SeekBarView", "initView", "(Lkotlin/jvm/functions/Function1;II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/widget/admedia/SeekBarView", "initView", "(Lkotlin/jvm/functions/Function1;II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.ViewGroup.LayoutParams layoutParams7 = view2.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams8 = layoutParams7 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams7 : null;
        if (layoutParams8 != null) {
            layoutParams8.addRule(15);
        }
        if (layoutParams8 != null) {
            layoutParams8.addRule(11);
        }
        if (layoutParams8 != null) {
            layoutParams8.rightMargin = ((java.lang.Number) ((i84.d) a(i19)).invoke()).intValue();
        }
        int floatValue5 = (int) ((java.lang.Number) convertToXmlPx.invoke(24)).floatValue();
        int floatValue6 = (int) ((java.lang.Number) convertToXmlPx.invoke(24)).floatValue();
        i84.b bVar = this.pointView;
        addView(bVar, floatValue5, floatValue6);
        bVar.setColor(i18);
        android.view.ViewGroup.LayoutParams layoutParams9 = bVar.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams10 = layoutParams9 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams9 : null;
        if (layoutParams10 != null) {
            layoutParams10.leftMargin = ((java.lang.Number) ((i84.d) a(i19)).invoke()).intValue();
        }
        if (layoutParams10 != null) {
            layoutParams10.addRule(15);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
    }

    public final void c(yz5.a provider, float f17, yz5.l progressToText) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setProgressProvider", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        kotlin.jvm.internal.o.g(provider, "provider");
        kotlin.jvm.internal.o.g(progressToText, "progressToText");
        this.f163303m = provider;
        this.f163304n = java.lang.Math.max(f17, 0.1f);
        this.f163305o = progressToText;
        java.lang.String str = (java.lang.String) progressToText.invoke(java.lang.Float.valueOf(f17));
        if (str == null) {
            str = "00:00";
        }
        this.endTimeText.setText(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setProgressProvider", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
    }

    public final com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView getCurrentTimeText() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentTimeText", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentTimeText", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        return this.currentTimeText;
    }

    public final com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView getEndTimeText() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEndTimeText", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEndTimeText", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        return this.endTimeText;
    }

    public final android.view.View getPlayedProgressLine() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPlayedProgressLine", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPlayedProgressLine", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        return this.playedProgressLine;
    }

    public final i84.b getPointView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPointView", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPointView", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        return this.pointView;
    }

    public final float getProgress() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getProgress", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        float f17 = this.progress;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getProgress", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        return f17;
    }

    public final android.view.View getUnplayedProgressLine() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUnplayedProgressLine", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUnplayedProgressLine", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        return this.unplayedProgressLine;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        super.onAttachedToWindow();
        kotlinx.coroutines.y0 y0Var = this.f163302i;
        if (y0Var != null) {
            kotlinx.coroutines.z0.c(y0Var, null);
        }
        kotlinx.coroutines.y0 b17 = kotlinx.coroutines.z0.b();
        this.f163302i = b17;
        kotlinx.coroutines.l.d(b17, null, null, new i84.g(this, null), 3, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        super.onDetachedFromWindow();
        kotlinx.coroutines.y0 y0Var = this.f163302i;
        if (y0Var != null) {
            kotlinx.coroutines.z0.c(y0Var, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
    }

    public final void setProgress(float f17) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setProgress", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        this.progress = java.lang.Math.min(java.lang.Math.max(f17, 0.0f), this.f163304n);
        android.view.View view = this.playedProgressLine;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
        android.view.View view2 = this.unplayedProgressLine;
        android.view.ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams3 : null;
        i84.b bVar = this.pointView;
        android.view.ViewGroup.LayoutParams layoutParams5 = bVar.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams6 = layoutParams5 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams5 : null;
        float f18 = this.progress / this.f163304n;
        if (layoutParams2 != null) {
            layoutParams2.width = ((java.lang.Number) ((i84.d) a((int) (this.f163308r * f18))).invoke()).intValue();
        }
        int i17 = this.f163307q;
        if (layoutParams2 != null) {
            layoutParams2.leftMargin = ((java.lang.Number) ((i84.d) a(i17)).invoke()).intValue();
        }
        if (layoutParams4 != null) {
            layoutParams4.width = ((java.lang.Number) ((i84.d) a((int) ((1.0f - f18) * this.f163308r))).invoke()).intValue();
        }
        if (layoutParams6 != null) {
            layoutParams6.leftMargin = ((layoutParams2 != null ? layoutParams2.width : 0) + ((java.lang.Number) ((i84.d) a(i17)).invoke()).intValue()) - ((java.lang.Number) ((i84.d) a(12)).invoke()).intValue();
        }
        yz5.l lVar = this.f163305o;
        if (lVar == null || (str = (java.lang.String) lVar.invoke(java.lang.Float.valueOf(this.progress))) == null) {
            str = "00:00";
        }
        this.currentTimeText.setText(str);
        view.requestLayout();
        view2.requestLayout();
        bVar.requestLayout();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setProgress", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
    }

    public final void setRefreshing(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRefreshing", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        this.isRefreshing = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRefreshing", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
    }

    public SeekBarView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.currentTimeText = new com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView(getContext());
        this.endTimeText = new com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView(getContext());
        this.pointView = new i84.b(getContext());
        this.playedProgressLine = new android.view.View(getContext());
        this.unplayedProgressLine = new android.view.View(getContext());
        this.f163304n = 0.1f;
        this.f163307q = 88;
    }

    public SeekBarView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.currentTimeText = new com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView(getContext());
        this.endTimeText = new com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView(getContext());
        this.pointView = new i84.b(getContext());
        this.playedProgressLine = new android.view.View(getContext());
        this.unplayedProgressLine = new android.view.View(getContext());
        this.f163304n = 0.1f;
        this.f163307q = 88;
    }
}
