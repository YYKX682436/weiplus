package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView f151992d;

    public y0(com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView musicMVCardChooseView) {
        this.f151992d = musicMVCardChooseView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.app.ProgressDialog progressDialog;
        if (com.tencent.mm.plugin.mv.ui.view.c0.f151788e == this.f151992d.f151643y0 || (progressDialog = this.f151992d.f151630p0) == null) {
            return;
        }
        progressDialog.show();
    }
}
