package com.tencent.mm.plugin.voiceprint.ui;

/* loaded from: classes15.dex */
public class b implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI f176233d;

    public b(com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI baseVoicePrintUI) {
        this.f176233d = baseVoicePrintUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        int i17;
        com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI baseVoicePrintUI = this.f176233d;
        fq4.d0 d0Var = baseVoicePrintUI.f176169i;
        if (d0Var == null) {
            return true;
        }
        w21.k0 k0Var = d0Var.f265580a;
        if (k0Var != null) {
            int d17 = k0Var.d();
            if (d17 > fq4.d0.f265579h) {
                fq4.d0.f265579h = d17;
            }
            i17 = (d17 * 100) / fq4.d0.f265579h;
        } else {
            i17 = 0;
        }
        float f17 = i17;
        baseVoicePrintUI.getClass();
        if (f17 < 10.0f) {
            f17 = 10.0f;
        }
        if (f17 > 100.0f) {
            f17 = 100.0f;
        }
        baseVoicePrintUI.f176167g.setVolume(f17 / 100.0f);
        return true;
    }
}
