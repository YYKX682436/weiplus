package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public final class fa implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShareToBizPhotoAccountUI f210420d;

    public fa(com.tencent.mm.ui.tools.ShareToBizPhotoAccountUI shareToBizPhotoAccountUI) {
        this.f210420d = shareToBizPhotoAccountUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        com.tencent.mm.ui.tools.ShareToBizPhotoAccountUI shareToBizPhotoAccountUI = this.f210420d;
        androidx.appcompat.app.AppCompatActivity context = shareToBizPhotoAccountUI.getContext();
        ((sb0.f) jVar).getClass();
        j35.u.g(context);
        shareToBizPhotoAccountUI.finish();
    }
}
