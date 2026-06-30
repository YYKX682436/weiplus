package com.tencent.mm.plugin.sns.ad.timeline.feedback.ui;

/* loaded from: classes4.dex */
public class FeedbackContentViewGroup extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f163203d;

    /* renamed from: e, reason: collision with root package name */
    public int f163204e;

    public FeedbackContentViewGroup(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(boolean z17, int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLayoutInner", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
        java.util.List list = this.f163203d;
        int childCount = getChildCount();
        int i28 = this.f163204e;
        java.util.Iterator it = list.iterator();
        int i29 = 0;
        int i37 = 0;
        int i38 = 0;
        while (it.hasNext()) {
            int i39 = ((m74.a) it.next()).f324512a;
            int i47 = 0;
            int i48 = 0;
            while (i47 < i39 && i29 < childCount) {
                android.view.View childAt = getChildAt(i29);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                childAt.layout(i48, i37, measuredWidth + i48, measuredHeight + i37);
                i29++;
                i48 += measuredWidth + i28;
                i47++;
                i38 = measuredHeight;
            }
            i37 += i38 + i28;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayoutInner", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
    }

    public final void b(int i17, int i18) {
        m74.a aVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMeasureInner", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
        measureChildren(i17, i18);
        int i19 = this.f163204e;
        int childCount = getChildCount();
        int measuredWidth = getMeasuredWidth();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initRows", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
        java.util.List list = this.f163203d;
        java.util.LinkedList linkedList = (java.util.LinkedList) list;
        linkedList.clear();
        for (int i27 = 0; i27 < childCount; i27++) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("newRow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup$Row");
            m74.a aVar2 = new m74.a();
            aVar2.f324512a = 0;
            aVar2.f324513b = measuredWidth;
            aVar2.f324514c = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newRow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup$Row");
            linkedList.add(aVar2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initRows", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
        int i28 = 0;
        for (int i29 = 0; i29 < childCount; i29++) {
            android.view.View childAt = getChildAt(i29);
            int min = java.lang.Math.min(childAt.getMeasuredWidth(), measuredWidth);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findRowWithSufficientWidth", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findRowWithSufficientWidth", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
                    aVar = null;
                    break;
                }
                aVar = (m74.a) it.next();
                if (aVar != null && !aVar.f324514c) {
                    if (aVar.f324513b >= min) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findRowWithSufficientWidth", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
                        break;
                    }
                    aVar.f324514c = true;
                }
            }
            if (aVar != null) {
                aVar.f324512a++;
                aVar.f324513b -= min + i19;
            }
            if (i28 == 0) {
                i28 = childAt.getMeasuredHeight();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeInvalidRow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
        java.util.Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            m74.a aVar3 = (m74.a) it6.next();
            if (aVar3 == null || aVar3.f324512a == 0) {
                it6.remove();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeInvalidRow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
        int size = ((java.util.LinkedList) list).size();
        int i37 = i28 * size;
        if (size > 1) {
            i37 += (size - 1) * i19;
        }
        setMeasuredDimension(measuredWidth, i37);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMeasureInner", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
        try {
            a(z17, i17, i18, i19, i27);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
        super.onMeasure(i17, i18);
        try {
            b(i17, i18);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
    }

    public FeedbackContentViewGroup(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        this.f163203d = new java.util.LinkedList();
        try {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initialize", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
            this.f163204e = i65.a.b(getContext(), 12);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initialize", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
        } catch (java.lang.Throwable unused) {
        }
    }
}
