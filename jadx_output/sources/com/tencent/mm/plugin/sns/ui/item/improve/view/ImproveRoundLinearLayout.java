package com.tencent.mm.plugin.sns.ui.item.improve.view;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0006B\u001b\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013B#\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0012\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/item/improve/view/ImproveRoundLinearLayout;", "Landroid/widget/LinearLayout;", "", "percent", "Ljz5/f0;", "setRadius", "Lpd4/c;", "d", "Lpd4/c;", "getCornerRadius", "()Lpd4/c;", "setCornerRadius", "(Lpd4/c;)V", "cornerRadius", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ImproveRoundLinearLayout extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public pd4.c cornerRadius;

    /* renamed from: e, reason: collision with root package name */
    public float f169351e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Path f169352f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImproveRoundLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f169351e = 0.5f;
        this.f169352f = new android.graphics.Path();
        a(context, attributeSet, 0);
    }

    public final void a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveRoundLinearLayout");
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.H, i17, 0);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        float dimension = obtainStyledAttributes.getDimension(0, 0.0f);
        this.cornerRadius = new pd4.c(dimension, dimension, dimension, dimension);
        setWillNotDraw(false);
        obtainStyledAttributes.recycle();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveRoundLinearLayout");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void dispatchDraw(android.graphics.Canvas r15) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveRoundLinearLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    public final pd4.c getCornerRadius() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCornerRadius", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveRoundLinearLayout");
        pd4.c cVar = this.cornerRadius;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCornerRadius", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveRoundLinearLayout");
        return cVar;
    }

    public final void setCornerRadius(pd4.c cVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCornerRadius", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveRoundLinearLayout");
        this.cornerRadius = cVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCornerRadius", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveRoundLinearLayout");
    }

    public final void setRadius(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRadius", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveRoundLinearLayout");
        if (f17 >= 0.0f && f17 <= 0.5f) {
            this.f169351e = f17;
            invalidate();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRadius", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveRoundLinearLayout");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImproveRoundLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f169351e = 0.5f;
        this.f169352f = new android.graphics.Path();
        a(context, attributeSet, i17);
    }
}
