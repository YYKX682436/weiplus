package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class u1 implements android.content.DialogInterface.OnCancelListener {
    public u1(com.tencent.mm.plugin.webview.ui.tools.SDKOAuthGetA8KeyUI sDKOAuthGetA8KeyUI) {
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        try {
            dialogInterface.dismiss();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SDKOAuthGetA8KeyUI", "showProgressDlg, onCancel, msg = %s ", e17.getLocalizedMessage());
        }
    }
}
