package com.tencent.mm.ui.tools;

/* loaded from: classes11.dex */
public class aa extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShareScreenImgUI f210275a;

    public aa(com.tencent.mm.ui.tools.ShareScreenImgUI shareScreenImgUI) {
        this.f210275a = shareScreenImgUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        com.tencent.mm.ui.tools.ShareScreenImgUI shareScreenImgUI = this.f210275a;
        android.app.ProgressDialog progressDialog = shareScreenImgUI.f210170d;
        if (progressDialog != null && progressDialog.isShowing()) {
            shareScreenImgUI.f210170d.dismiss();
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(shareScreenImgUI.f210172f)) {
            shareScreenImgUI.T6();
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ShareScreenImgUI", "launch : fail, filePath is null");
        shareScreenImgUI.U6();
        shareScreenImgUI.finish();
    }
}
