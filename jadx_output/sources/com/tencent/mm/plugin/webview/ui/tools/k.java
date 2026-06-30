package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes5.dex */
public class k implements android.content.DialogInterface.OnCancelListener {
    public k(com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI createAvatarUI) {
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        try {
            dialogInterface.dismiss();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CreateAvatarUI", "showProgressDlg onCancel exp: %s ", e17.getLocalizedMessage());
        }
    }
}
