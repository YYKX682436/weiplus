package com.tencent.mm.ui.tools;

/* loaded from: classes11.dex */
public class q9 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShareImgUI f210658a;

    public q9(com.tencent.mm.ui.tools.ShareImgUI shareImgUI) {
        this.f210658a = shareImgUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        com.tencent.mm.ui.tools.ShareImgUI shareImgUI = this.f210658a;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(shareImgUI.f210157i)) {
            com.tencent.mm.ui.tools.ShareImgUI.a7(shareImgUI, message.what == shareImgUI.f210164s);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ShareImgUI", "launch : fail, filePath is null");
        shareImgUI.e7(shareImgUI.f210156h);
        shareImgUI.finish();
    }
}
