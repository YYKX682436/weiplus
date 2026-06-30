package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class StoryTouchImageView extends com.tencent.mm.plugin.sns.ui.TouchImageView {
    public StoryTouchImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.StoryTouchImageView");
        setLayerType(1, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.StoryTouchImageView");
    }
}
