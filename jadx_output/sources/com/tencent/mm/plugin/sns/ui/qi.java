package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class qi implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f170343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsHeader f170344e;

    public qi(com.tencent.mm.plugin.sns.ui.SnsHeader snsHeader, android.content.Context context) {
        this.f170344e = snsHeader;
        this.f170343d = context;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.SnsHeader$10");
        com.tencent.mm.plugin.sns.ui.SnsHeader snsHeader = this.f170344e;
        snsHeader.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (pc4.d.f353410a.y()) {
            int width = snsHeader.f167165d.f168189f.getWidth();
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) snsHeader.f167165d.f168184a.getLayoutParams();
            android.content.Context context = this.f170343d;
            int i17 = (int) (width * (ca4.z0.l0(context) ? 0.17f : 0.12f));
            float f17 = i17;
            float b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 40);
            float f18 = 1.5f * b17;
            if (f17 < f18) {
                i17 = (int) java.lang.Math.ceil(f18);
            }
            float f19 = b17 * 1.8f;
            if (i17 > f19) {
                i17 = (int) java.lang.Math.floor(f19);
            }
            layoutParams.width = i17;
            layoutParams.height = i17;
            layoutParams.topMargin = (int) (-((i17 * 2.0f) / 3.0f));
            snsHeader.f167165d.f168184a.setLayoutParams(layoutParams);
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) snsHeader.f167165d.f168187d.getLayoutParams();
            com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout snsCoverContainerLayout = snsHeader.f167165d.f168192i;
            snsCoverContainerLayout.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("foldHeight", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
            int i18 = snsCoverContainerLayout.f164009r;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("foldHeight", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
            layoutParams2.topMargin = i18 + i65.a.b(context, 4);
            snsHeader.f167165d.f168187d.setLayoutParams(layoutParams2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.SnsHeader$10");
    }
}
