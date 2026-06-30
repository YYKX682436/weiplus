package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public final class ha implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShareToBizPhotoAccountUI f210468d;

    public ha(com.tencent.mm.ui.tools.ShareToBizPhotoAccountUI shareToBizPhotoAccountUI) {
        this.f210468d = shareToBizPhotoAccountUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        this.f210468d.finish();
    }
}
