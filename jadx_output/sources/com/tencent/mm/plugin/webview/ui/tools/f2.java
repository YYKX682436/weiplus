package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class f2 implements android.content.DialogInterface.OnCancelListener {
    public f2(com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI sDKOAuthUI) {
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        try {
            dialogInterface.dismiss();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SdkOAuthUI", "showProgressDlg onCancel exp: %s ", e17.getLocalizedMessage());
        }
    }
}
