package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public final class la implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShareToStatusUI f210553d;

    public la(com.tencent.mm.ui.tools.ShareToStatusUI shareToStatusUI) {
        this.f210553d = shareToStatusUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        this.f210553d.finish();
    }
}
