package com.tencent.mm.ui.chatting;

/* loaded from: classes12.dex */
public class a0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.AppAttachNewDownloadUI f198356d;

    public a0(com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI) {
        this.f198356d = appAttachNewDownloadUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI = this.f198356d;
        jk3.v vVar = appAttachNewDownloadUI.f198121x1;
        if (vVar != null && vVar.U(1, false)) {
            return true;
        }
        appAttachNewDownloadUI.finish();
        return true;
    }
}
