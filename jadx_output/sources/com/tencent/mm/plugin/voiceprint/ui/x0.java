package com.tencent.mm.plugin.voiceprint.ui;

/* loaded from: classes15.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voiceprint.ui.VoiceTipInfoView f176283d;

    public x0(com.tencent.mm.plugin.voiceprint.ui.VoiceTipInfoView voiceTipInfoView) {
        this.f176283d = voiceTipInfoView;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f176283d.f176227g.setVisibility(0);
    }
}
