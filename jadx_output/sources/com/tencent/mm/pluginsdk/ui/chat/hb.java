package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes15.dex */
public class hb implements com.tencent.mm.sdk.platformtools.h5 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.VoiceInputLayout f190382a;

    public hb(com.tencent.mm.pluginsdk.ui.VoiceInputLayout voiceInputLayout) {
        this.f190382a = voiceInputLayout;
    }

    @Override // com.tencent.mm.sdk.platformtools.h5
    public void a(final int i17) {
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable(i17) { // from class: com.tencent.mm.pluginsdk.ui.chat.hb$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.pluginsdk.ui.chat.hb hbVar = com.tencent.mm.pluginsdk.ui.chat.hb.this;
                com.tencent.mm.pluginsdk.ui.VoiceInputLayout voiceInputLayout = hbVar.f190382a;
                if (voiceInputLayout != null) {
                    voiceInputLayout.getCurrentState();
                    hbVar.f190382a.a();
                }
            }
        });
    }
}
