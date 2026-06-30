package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes8.dex */
public final class h8 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f143605d;

    public h8(yz5.l lVar) {
        this.f143605d = lVar;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        yz5.l lVar = this.f143605d;
        if (i18 == -1) {
            lVar.invoke(com.tencent.mm.plugin.lite.jsapi.comms.e8.f143568d);
            return;
        }
        com.tencent.mars.xlog.Log.i("LiteAppSendGifToConversation", "doShare, resultCode is not RESULT_OK: " + i18);
        lVar.invoke(com.tencent.mm.plugin.lite.jsapi.comms.e8.f143569e);
    }
}
