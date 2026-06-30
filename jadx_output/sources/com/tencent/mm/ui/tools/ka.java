package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public final class ka implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShareToStatusUI f210533d;

    public ka(com.tencent.mm.ui.tools.ShareToStatusUI shareToStatusUI) {
        this.f210533d = shareToStatusUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f210533d.finish();
    }
}
