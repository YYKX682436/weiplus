package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class v0 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSBaseUI f138199a;

    public v0(com.tencent.mm.plugin.fts.ui.FTSBaseUI fTSBaseUI) {
        this.f138199a = fTSBaseUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        if (message.what == 1) {
            com.tencent.mm.plugin.fts.ui.FTSBaseUI fTSBaseUI = this.f138199a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(fTSBaseUI.f137910n)) {
                return;
            }
            fTSBaseUI.d7();
        }
    }
}
