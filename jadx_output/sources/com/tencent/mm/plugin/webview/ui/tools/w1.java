package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes15.dex */
public class w1 implements android.content.DialogInterface.OnCancelListener {
    public w1(com.tencent.mm.plugin.webview.ui.tools.SDKOAuthOtherUI sDKOAuthOtherUI) {
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        try {
            dialogInterface.dismiss();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SDKOAuthOtherUI", "showProgressDlg onCancel exp: %s ", e17.getLocalizedMessage());
        }
    }
}
