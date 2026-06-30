package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes11.dex */
public final class q6 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.QBFileShareProxyUI f191854d;

    public q6(com.tencent.mm.pluginsdk.ui.tools.QBFileShareProxyUI qBFileShareProxyUI) {
        this.f191854d = qBFileShareProxyUI;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        this.f191854d.finish();
    }
}
