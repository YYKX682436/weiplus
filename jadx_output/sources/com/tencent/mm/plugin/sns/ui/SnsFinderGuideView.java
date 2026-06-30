package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes3.dex */
public class SnsFinderGuideView extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f167151d = 0;

    public SnsFinderGuideView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsFinderGuideView");
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.crk, this);
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.n8f)).setOnClickListener(new com.tencent.mm.plugin.sns.ui.fi(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsFinderGuideView");
    }

    public void setOnFinishDialogViewCallback(com.tencent.mm.plugin.sns.ui.gi giVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnFinishDialogViewCallback", "com.tencent.mm.plugin.sns.ui.SnsFinderGuideView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnFinishDialogViewCallback", "com.tencent.mm.plugin.sns.ui.SnsFinderGuideView");
    }

    public SnsFinderGuideView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a();
    }
}
