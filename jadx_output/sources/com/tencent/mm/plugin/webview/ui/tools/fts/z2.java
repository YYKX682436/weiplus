package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes15.dex */
public final class z2 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.j3 f184739d;

    public z2(com.tencent.mm.plugin.webview.ui.tools.fts.j3 j3Var) {
        this.f184739d = j3Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        com.tencent.mm.plugin.webview.ui.tools.fts.j3 j3Var = this.f184739d;
        z21.e eVar = j3Var.A;
        if (eVar == null) {
            return true;
        }
        int maxAmplitudeRate = eVar != null ? eVar.getMaxAmplitudeRate() : 0;
        com.tencent.mm.transvoice.ui.SoundWaveView soundWaveView = j3Var.f184464n;
        if (soundWaveView != null) {
            kotlin.jvm.internal.o.d(soundWaveView);
            if (soundWaveView.getVisibility() == 0) {
                com.tencent.mm.transvoice.ui.SoundWaveView soundWaveView2 = j3Var.f184464n;
                kotlin.jvm.internal.o.d(soundWaveView2);
                soundWaveView2.i(maxAmplitudeRate);
            }
        }
        return true;
    }
}
