package com.tencent.mm.plugin.sns.ui.widget.ad;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/widget/ad/AdLandingPageRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class AdLandingPageRecyclerView extends androidx.recyclerview.widget.RecyclerView {

    /* renamed from: b2, reason: collision with root package name */
    public int f170925b2;

    /* renamed from: c2, reason: collision with root package name */
    public boolean f170926c2;

    /* renamed from: d2, reason: collision with root package name */
    public boolean f170927d2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdLandingPageRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.d(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchDraw", "com.tencent.mm.plugin.sns.ui.widget.ad.AdLandingPageRecyclerView");
        kotlin.jvm.internal.o.g(canvas, "canvas");
        try {
            super.dispatchDraw(canvas);
        } catch (java.lang.Exception e17) {
            if (this.f170925b2 < 10) {
                if (!this.f170926c2) {
                    this.f170926c2 = true;
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2023, 18);
                }
                com.tencent.mars.xlog.Log.w("AdLandingPageRecyclerView", "dispatchDraw, exp=" + android.util.Log.getStackTraceString(e17) + ", crashNum=" + this.f170925b2);
            } else if (!this.f170927d2) {
                com.tencent.mars.xlog.Log.e("AdLandingPageRecyclerView", "dispatchDraw, exp=" + e17 + ", crashNum=" + this.f170925b2);
                this.f170927d2 = true;
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2023, 19);
            }
            this.f170925b2++;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchDraw", "com.tencent.mm.plugin.sns.ui.widget.ad.AdLandingPageRecyclerView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdLandingPageRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.d(context);
    }
}
