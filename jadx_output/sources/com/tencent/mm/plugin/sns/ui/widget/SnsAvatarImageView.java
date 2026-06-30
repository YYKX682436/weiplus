package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public class SnsAvatarImageView extends com.tencent.mm.ui.tools.MaskImageButton {

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.patmsg.ui.PatPopupWindow f170841q;

    public SnsAvatarImageView(android.content.Context context) {
        super(context);
        getContext();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView");
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView");
        super.onDetachedFromWindow();
        r();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView");
    }

    public void r() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hidePatTipView", "com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView");
        com.tencent.mm.plugin.patmsg.ui.PatPopupWindow patPopupWindow = this.f170841q;
        if (patPopupWindow != null) {
            patPopupWindow.dismiss();
            this.f170841q = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hidePatTipView", "com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView");
    }

    public void s(java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUserNameAndPageNumber", "com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUserNameAndPageNumber", "com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView");
    }

    public void setWeakContext(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setWeakContext", "com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView");
        if (!(context instanceof android.app.Activity)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsAvatarImageView", "weakContext is not activity");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setWeakContext", "com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView");
    }

    public SnsAvatarImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView");
    }
}
