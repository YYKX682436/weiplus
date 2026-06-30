package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public final class f3 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.j3 f184411a;

    public f3(com.tencent.mm.plugin.webview.ui.tools.fts.j3 j3Var) {
        this.f184411a = j3Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        if (msg.what == 1) {
            removeMessages(1);
            com.tencent.mm.plugin.webview.ui.tools.fts.j3 j3Var = this.f184411a;
            z21.e eVar = j3Var.A;
            if (eVar != null) {
                eVar.cancel(true);
            }
            if (msg.arg1 == 99 && com.tencent.mm.plugin.webview.ui.tools.fts.w2.f184709f == j3Var.f184453c) {
                com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI baseSearchWebViewUI = (com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI) j3Var.f184452b.get();
                java.lang.String K9 = baseSearchWebViewUI != null ? baseSearchWebViewUI.K9() : null;
                if (K9 == null) {
                    K9 = "";
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(K9)) {
                    if (com.tencent.mars.comm.NetStatusUtil.isConnected(j3Var.f184451a)) {
                        android.content.Context context = j3Var.f184451a;
                        db5.t7.i(context, context.getResources().getString(com.tencent.mm.R.string.azu), com.tencent.mm.R.raw.voice_to_short);
                        com.tencent.mm.transvoice.ui.SoundWaveView soundWaveView = j3Var.f184464n;
                        kotlin.jvm.internal.o.d(soundWaveView);
                        soundWaveView.setVisibility(8);
                        return;
                    }
                    android.content.Context context2 = j3Var.f184451a;
                    db5.t7.i(context2, context2.getResources().getString(com.tencent.mm.R.string.h8t), com.tencent.mm.R.raw.voice_to_short);
                    com.tencent.mm.transvoice.ui.SoundWaveView soundWaveView2 = j3Var.f184464n;
                    kotlin.jvm.internal.o.d(soundWaveView2);
                    soundWaveView2.setVisibility(8);
                }
            }
        }
    }
}
