package com.tencent.mm.ui.tools;

/* loaded from: classes11.dex */
public class ma implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShareToTimeLineUI f210582d;

    public ma(com.tencent.mm.ui.tools.ShareToTimeLineUI shareToTimeLineUI) {
        this.f210582d = shareToTimeLineUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f210582d.finish();
    }
}
