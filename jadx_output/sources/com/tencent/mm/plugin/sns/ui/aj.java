package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class aj implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsHeader f167759d;

    public aj(com.tencent.mm.plugin.sns.ui.SnsHeader snsHeader) {
        this.f167759d = snsHeader;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.SnsHeader$9");
        com.tencent.mm.plugin.sns.ui.SnsHeader snsHeader = this.f167759d;
        snsHeader.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (snsHeader.f167165d.f168192i.getHeight() > snsHeader.f167165d.f168192i.getWidth()) {
            android.view.ViewGroup.LayoutParams layoutParams = snsHeader.f167165d.f168192i.getLayoutParams();
            layoutParams.height = snsHeader.f167165d.f168192i.getWidth();
            snsHeader.f167165d.f168192i.setLayoutParams(layoutParams);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.SnsHeader$9");
    }
}
