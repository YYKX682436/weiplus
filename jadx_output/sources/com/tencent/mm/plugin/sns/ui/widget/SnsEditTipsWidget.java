package com.tencent.mm.plugin.sns.ui.widget;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u0001\u0002B%\b\u0016\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015B\u001d\b\u0016\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/widget/SnsEditTipsWidget;", "Lcom/tencent/mm/ui/widget/MMTextView;", "Lcom/tencent/mm/plugin/sns/ui/widget/x2;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljz5/f0;", "setOnEditTipsVisibilityChangedListener", "", "h", "I", "getErrorColorResId", "()I", "errorColorResId", "i", "getTipsColorResId", "tipsColorResId", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class SnsEditTipsWidget extends com.tencent.mm.ui.widget.MMTextView {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final int errorColorResId;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final int tipsColorResId;

    /* renamed from: m, reason: collision with root package name */
    public int f170885m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f170886n;

    public SnsEditTipsWidget(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.errorColorResId = com.tencent.mm.R.color.f478532ac;
        this.tipsColorResId = com.tencent.mm.R.color.f478873jj;
    }

    public final boolean b(java.lang.String newText) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkVisibilityByText", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
        kotlin.jvm.internal.o.g(newText, "newText");
        int f17 = com.tencent.mm.ui.tools.v4.f(newText);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkVisibilityByTextLength", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
        this.f170885m = f17;
        getVisibility();
        int c17 = c();
        int f18 = f();
        int i17 = this.f170885m;
        ca4.e1 e1Var = ca4.f1.f39897a;
        boolean z17 = true;
        if (i17 > c17) {
            java.lang.String newText2 = d(ca4.e1.a(e1Var, i17, false, 2, null) - ca4.e1.a(e1Var, c17, false, 2, null));
            int d17 = i65.a.d(getContext(), this.errorColorResId);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("show", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
            kotlin.jvm.internal.o.g(newText2, "newText");
            setVisibility(0);
            setTextColor(d17);
            setText(newText2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("show", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
            if (!this.f170886n) {
                this.f170886n = true;
                performHapticFeedback(3, 2);
            }
        } else if (i17 >= c17 - f18) {
            java.lang.String newText3 = e(ca4.e1.a(e1Var, c17, false, 2, null) - ca4.e1.a(e1Var, this.f170885m, false, 2, null));
            int d18 = i65.a.d(getContext(), this.tipsColorResId);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("show", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
            kotlin.jvm.internal.o.g(newText3, "newText");
            setVisibility(0);
            setTextColor(d18);
            setText(newText3);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("show", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hide", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
            setVisibility(8);
            setText("");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hide", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
            z17 = false;
        }
        getVisibility();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkVisibilityByTextLength", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkVisibilityByText", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
        return z17;
    }

    public abstract int c();

    public abstract java.lang.String d(int i17);

    public abstract java.lang.String e(int i17);

    public abstract int f();

    public final int getErrorColorResId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getErrorColorResId", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getErrorColorResId", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
        return this.errorColorResId;
    }

    public final int getTipsColorResId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTipsColorResId", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTipsColorResId", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
        return this.tipsColorResId;
    }

    public final void setOnEditTipsVisibilityChangedListener(com.tencent.mm.plugin.sns.ui.widget.x2 listener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnEditTipsVisibilityChangedListener", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
        kotlin.jvm.internal.o.g(listener, "listener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnEditTipsVisibilityChangedListener", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
    }

    public SnsEditTipsWidget(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.errorColorResId = com.tencent.mm.R.color.f478532ac;
        this.tipsColorResId = com.tencent.mm.R.color.f478873jj;
    }
}
