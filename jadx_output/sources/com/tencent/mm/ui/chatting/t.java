package com.tencent.mm.ui.chatting;

/* loaded from: classes8.dex */
public class t implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.AppAttachNewDownloadUI f202687d;

    public t(com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI) {
        this.f202687d = appAttachNewDownloadUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI = this.f202687d;
        com.tencent.mm.sdk.platformtools.b0.d(com.tencent.mm.sdk.platformtools.x2.f193071a, null, appAttachNewDownloadUI.C.equals("") ? appAttachNewDownloadUI.getString(com.tencent.mm.R.string.f492674hf5) : appAttachNewDownloadUI.C, null);
        db5.e1.T(appAttachNewDownloadUI, appAttachNewDownloadUI.getString(com.tencent.mm.R.string.f490361st));
    }
}
