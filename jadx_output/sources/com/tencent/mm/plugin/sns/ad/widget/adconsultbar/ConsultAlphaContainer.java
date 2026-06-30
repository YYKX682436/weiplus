package com.tencent.mm.plugin.sns.ad.widget.adconsultbar;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/widget/adconsultbar/ConsultAlphaContainer;", "Landroid/widget/FrameLayout;", "", "pressed", "Ljz5/f0;", "setPressed", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ConsultAlphaContainer extends android.widget.FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsultAlphaContainer(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
    }

    @Override // android.view.View
    public void setPressed(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPressed", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.ConsultAlphaContainer");
        super.setPressed(z17);
        if (z17) {
            n3.t1 t1Var = new n3.t1(this);
            while (t1Var.hasNext()) {
                android.view.View view = (android.view.View) t1Var.next();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Float.valueOf(0.5f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adconsultbar/ConsultAlphaContainer", "setPressed", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/widget/adconsultbar/ConsultAlphaContainer", "setPressed", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        } else {
            n3.t1 t1Var2 = new n3.t1(this);
            while (t1Var2.hasNext()) {
                android.view.View view2 = (android.view.View) t1Var2.next();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adconsultbar/ConsultAlphaContainer", "setPressed", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/widget/adconsultbar/ConsultAlphaContainer", "setPressed", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPressed", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.ConsultAlphaContainer");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsultAlphaContainer(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
    }
}
