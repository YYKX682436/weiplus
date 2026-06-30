package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes15.dex */
public class f1 implements android.content.DialogInterface.OnCancelListener {
    public f1(com.tencent.mm.plugin.webview.ui.tools.SDKOAuthAppDataUI sDKOAuthAppDataUI) {
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        try {
            dialogInterface.dismiss();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SDKOAuthAppDataUI", "showProgressDlg onCancel exp: %s ", e17.getLocalizedMessage());
        }
    }
}
