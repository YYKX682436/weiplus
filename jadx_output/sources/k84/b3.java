package k84;

/* loaded from: classes3.dex */
public final class b3 extends android.view.ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOutline", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$setLikedAttitudeView$1");
        float a17 = a84.d0.a(4);
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, view != null ? view.getMeasuredWidth() : 0.0f, (view != null ? view.getMeasuredHeight() : 0.0f) + a17);
        if (outline != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            rectF.roundOut(rect);
            outline.setRoundRect(rect, a17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOutline", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$setLikedAttitudeView$1");
    }
}
