package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes5.dex */
public class KindaPlatformLayout extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.remittance.ui.a9 f157100d;

    public KindaPlatformLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f157100d = new com.tencent.mm.plugin.remittance.ui.a9();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        super.onLayout(z17, i17, i18, i19, i27);
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        com.tencent.mm.plugin.remittance.ui.a9 a9Var = this.f157100d;
        a9Var.f157638b += currentTimeMillis2;
        com.tencent.mars.xlog.Log.i("KindaPlatformLayout", "testandroid root layout out %s %s", java.lang.Long.valueOf(currentTimeMillis2), a9Var.a());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        super.onMeasure(i17, i18);
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        com.tencent.mm.plugin.remittance.ui.a9 a9Var = this.f157100d;
        a9Var.f157637a += currentTimeMillis2;
        com.tencent.mars.xlog.Log.i("KindaPlatformLayout", "testandroid root measure out %s %s", java.lang.Long.valueOf(currentTimeMillis2), a9Var.a());
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
    }

    public KindaPlatformLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f157100d = new com.tencent.mm.plugin.remittance.ui.a9();
    }
}
