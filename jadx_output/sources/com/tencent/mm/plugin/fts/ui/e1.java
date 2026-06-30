package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class e1 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI f138042a;

    public e1(com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI fTSBaseVoiceSearchUI) {
        this.f138042a = fTSBaseVoiceSearchUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        if (message.what == 1) {
            com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI fTSBaseVoiceSearchUI = this.f138042a;
            fTSBaseVoiceSearchUI.X.removeMessages(1);
            z21.e eVar = fTSBaseVoiceSearchUI.S;
            if (eVar != null) {
                eVar.cancel(true);
            }
            if (message.arg1 == 99 && com.tencent.mm.plugin.fts.ui.n1.MODE_TRANS == fTSBaseVoiceSearchUI.Z && com.tencent.mm.sdk.platformtools.t8.K0(fTSBaseVoiceSearchUI.f137937y0.g())) {
                if (com.tencent.mars.comm.NetStatusUtil.isConnected(fTSBaseVoiceSearchUI.getContext())) {
                    db5.t7.i(fTSBaseVoiceSearchUI.getContext(), fTSBaseVoiceSearchUI.getContext().getResources().getString(com.tencent.mm.R.string.azu), com.tencent.mm.R.raw.voice_to_short);
                    fTSBaseVoiceSearchUI.f137922o.setVisibility(8);
                } else {
                    db5.t7.i(fTSBaseVoiceSearchUI.getContext(), fTSBaseVoiceSearchUI.getContext().getResources().getString(com.tencent.mm.R.string.h8t), com.tencent.mm.R.raw.voice_to_short);
                    fTSBaseVoiceSearchUI.f137922o.setVisibility(8);
                }
            }
        }
    }
}
