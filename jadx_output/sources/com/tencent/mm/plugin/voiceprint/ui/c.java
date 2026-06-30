package com.tencent.mm.plugin.voiceprint.ui;

/* loaded from: classes15.dex */
public class c implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI f176238d;

    public c(com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI baseVoicePrintUI) {
        this.f176238d = baseVoicePrintUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.voiceprint.ui.VoiceTipInfoView voiceTipInfoView = this.f176238d.f176168h;
        if (voiceTipInfoView.f176226f.getAnimation() == null) {
            android.widget.TextView textView = voiceTipInfoView.f176226f;
            android.content.Context context = voiceTipInfoView.getContext();
            com.tencent.mm.plugin.voiceprint.ui.u0 u0Var = new com.tencent.mm.plugin.voiceprint.ui.u0(voiceTipInfoView);
            textView.getWidth();
            textView.getLocationInWindow(new int[2]);
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(context, com.tencent.mm.R.anim.f477901ep);
            loadAnimation.setDuration(200L);
            loadAnimation.setStartOffset(0L);
            loadAnimation.setRepeatCount(0);
            loadAnimation.setFillAfter(true);
            loadAnimation.setAnimationListener(new com.tencent.mm.plugin.voiceprint.ui.z0(u0Var));
            textView.startAnimation(loadAnimation);
        }
        return false;
    }
}
