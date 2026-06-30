package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public final class ga implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShareToBizPhotoAccountUI f210443d;

    public ga(com.tencent.mm.ui.tools.ShareToBizPhotoAccountUI shareToBizPhotoAccountUI) {
        this.f210443d = shareToBizPhotoAccountUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f210443d.finish();
    }
}
