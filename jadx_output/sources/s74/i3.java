package s74;

/* loaded from: classes3.dex */
public final class i3 extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final int f404346a;

    public i3(int i17) {
        this.f404346a = i17;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOutline", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$RoundCornerOutlineProvider");
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, view != null ? view.getMeasuredWidth() : 0, view != null ? view.getMeasuredHeight() : 0);
        if (outline != null) {
            outline.setRoundRect(rect, this.f404346a);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOutline", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$RoundCornerOutlineProvider");
    }
}
