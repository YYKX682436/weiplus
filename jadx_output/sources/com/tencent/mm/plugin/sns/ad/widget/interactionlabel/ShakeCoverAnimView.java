package com.tencent.mm.plugin.sns.ad.widget.interactionlabel;

/* loaded from: classes4.dex */
public class ShakeCoverAnimView extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f163586d;

    /* renamed from: e, reason: collision with root package name */
    public float f163587e;

    public ShakeCoverAnimView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.ShakeCoverAnimView");
        int b17 = i65.a.b(getContext(), 32);
        if (this.f163586d == null) {
            android.view.View view = new android.view.View(getContext());
            this.f163586d = view;
            view.setLayoutParams(new android.view.ViewGroup.LayoutParams(b17, b17));
            this.f163586d.setBackgroundResource(com.tencent.mm.R.drawable.b1a);
            addView(this.f163586d);
        }
        int measuredHeight = getMeasuredHeight();
        this.f163586d.layout(0, measuredHeight, b17 + 0, measuredHeight + b17);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        if (measuredWidth > 0 && measuredHeight2 > 0) {
            int i28 = b17 / 2;
            int i29 = measuredWidth - i28;
            int i37 = measuredHeight2 + i28;
            this.f163587e = ((float) ((java.lang.Math.sqrt((i29 * i29) + (i37 * i37)) * 2.0d) / b17)) + 0.5f;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.ShakeCoverAnimView");
    }

    public ShakeCoverAnimView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
    }
}
