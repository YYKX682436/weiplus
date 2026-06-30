package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes11.dex */
public final class o6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.QBFileShareProxyUI f191810d;

    public o6(com.tencent.mm.pluginsdk.ui.tools.QBFileShareProxyUI qBFileShareProxyUI) {
        this.f191810d = qBFileShareProxyUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (com.tencent.mm.repairer.config.forward.RepairerConfigForwardSnackBarJumpChatting.f192214a.a()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.QBFileShareProxyUI", "EnterChattingAfterTrans config disabled, show normal toast for forward");
        com.tencent.mm.pluginsdk.ui.tools.QBFileShareProxyUI qBFileShareProxyUI = this.f191810d;
        android.widget.Toast.makeText(qBFileShareProxyUI, qBFileShareProxyUI.getString(com.tencent.mm.R.string.lch), 0).show();
    }
}
