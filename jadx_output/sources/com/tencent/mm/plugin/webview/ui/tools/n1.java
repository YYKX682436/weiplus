package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes15.dex */
public class n1 implements android.content.DialogInterface.OnCancelListener {
    public n1(com.tencent.mm.plugin.webview.ui.tools.SDKOAuthFriendUI sDKOAuthFriendUI) {
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        try {
            dialogInterface.dismiss();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SDKOAuthFriendUI", "showProgressDlg onCancel exp: %s ", e17.getLocalizedMessage());
        }
    }
}
