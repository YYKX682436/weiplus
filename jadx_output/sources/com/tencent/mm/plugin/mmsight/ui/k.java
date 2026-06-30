package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.ImproveMMSightRecordButton f149352d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f149353e;

    public k(com.tencent.mm.plugin.mmsight.ui.ImproveMMSightRecordButton improveMMSightRecordButton, int i17) {
        this.f149352d = improveMMSightRecordButton;
        this.f149353e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.mmsight.ui.ImproveMMSightRecordButton improveMMSightRecordButton = this.f149352d;
        android.view.View view = improveMMSightRecordButton.f149148d;
        android.graphics.drawable.GradientDrawable gradientDrawable = (android.graphics.drawable.GradientDrawable) (view != null ? view.getBackground() : null);
        if (gradientDrawable != null) {
            android.view.View view2 = improveMMSightRecordButton.f149148d;
            gradientDrawable.setColor(i65.a.d(view2 != null ? view2.getContext() : null, this.f149353e));
        }
    }
}
