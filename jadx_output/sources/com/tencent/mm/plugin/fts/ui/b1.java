package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class b1 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI f138021a;

    public b1(com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI fTSBaseVoiceSearchUI) {
        this.f138021a = fTSBaseVoiceSearchUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        if (message.what == 1) {
            com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI fTSBaseVoiceSearchUI = this.f138021a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(fTSBaseVoiceSearchUI.B1)) {
                return;
            }
            fTSBaseVoiceSearchUI.s7();
        }
    }
}
