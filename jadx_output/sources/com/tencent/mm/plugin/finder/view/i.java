package com.tencent.mm.plugin.finder.view;

/* loaded from: classes8.dex */
public final class i implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.m f132273d;

    public i(com.tencent.mm.plugin.finder.view.m mVar) {
        this.f132273d = mVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.finder.view.m mVar = this.f132273d;
        mVar.getClass();
        com.tencent.mars.xlog.Log.i("Finder.AnnounceWebViewDialogWrapper", "onDismiss");
        com.tencent.mm.ui.widget.MMWebView mMWebView = mVar.f132622g.f132193c;
        if (mMWebView != null) {
            mMWebView.setWebViewCallbackClient(null);
        }
        android.content.DialogInterface.OnDismissListener onDismissListener = mVar.f132621f;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(mVar.f132616a);
        }
        mVar.f132619d = false;
        mVar.f132623h.release();
    }
}
