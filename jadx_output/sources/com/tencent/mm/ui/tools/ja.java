package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public final class ja implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShareToStatusUI f210518d;

    public ja(com.tencent.mm.ui.tools.ShareToStatusUI shareToStatusUI) {
        this.f210518d = shareToStatusUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        com.tencent.mm.ui.tools.ShareToStatusUI shareToStatusUI = this.f210518d;
        androidx.appcompat.app.AppCompatActivity context = shareToStatusUI.getContext();
        ((sb0.f) jVar).getClass();
        j35.u.g(context);
        shareToStatusUI.finish();
    }
}
