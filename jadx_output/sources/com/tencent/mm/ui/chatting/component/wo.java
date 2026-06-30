package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class wo implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f200186d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.VoiceComponent$3 f200187e;

    public wo(com.tencent.mm.ui.chatting.component.VoiceComponent$3 voiceComponent$3, boolean z17) {
        this.f200187e = voiceComponent$3;
        this.f200186d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.component.VoiceComponent$3 voiceComponent$3 = this.f200187e;
        voiceComponent$3.f198577d.f198580d.J();
        if (this.f200186d) {
            ((android.view.View) voiceComponent$3.f198577d.f199870m.get()).performClick();
        }
    }
}
