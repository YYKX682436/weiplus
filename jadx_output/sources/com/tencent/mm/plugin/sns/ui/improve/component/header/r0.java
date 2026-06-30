package com.tencent.mm.plugin.sns.ui.improve.component.header;

/* loaded from: classes4.dex */
public final class r0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC f168866d;

    public r0(com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC improveHeaderUIC) {
        this.f168866d = improveHeaderUIC;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$onCreate$7");
        com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC improveHeaderUIC = this.f168866d;
        com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.access$getHeadLayout(improveHeaderUIC).getViewTreeObserver().removeOnGlobalLayoutListener(this);
        int width = com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.access$getHeadLayout(improveHeaderUIC).getWidth();
        android.view.ViewGroup.LayoutParams layoutParams = com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.access$getAvatarImg(improveHeaderUIC).getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        int rint = (int) java.lang.Math.rint(width * (ca4.z0.l0(improveHeaderUIC.getContext()) ? 0.17f : 0.12f));
        int b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 40);
        if (rint < 1.5f * b17) {
            rint = (int) java.lang.Math.ceil(r8);
        }
        if (rint > b17 * 1.8d) {
            rint = (int) java.lang.Math.floor(r7 * 1.8f);
        }
        layoutParams2.width = rint;
        layoutParams2.height = rint;
        layoutParams2.topMargin = -((rint * 2) / 3);
        com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.access$getAvatarImg(improveHeaderUIC).setLayoutParams(layoutParams2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$onCreate$7");
    }
}
