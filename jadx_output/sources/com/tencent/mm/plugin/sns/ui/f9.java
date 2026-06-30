package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class f9 implements android.media.AudioManager.OnAudioFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView f168319d;

    public f9(com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView sightVideoFullScreenView) {
        this.f168319d = sightVideoFullScreenView;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAudioFocusChange", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$AudioFocusChangeListener");
        int i18 = com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.f166649x0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        this.f168319d.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAudioFocusChanged", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        com.tencent.mars.xlog.Log.i("SightVideoFullScreenView", "onAudioFocusChanged is called, focusChange is " + i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAudioFocusChanged", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAudioFocusChange", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$AudioFocusChangeListener");
    }
}
