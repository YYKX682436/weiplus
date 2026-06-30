package com.tencent.mm.ui.chatting;

/* loaded from: classes8.dex */
public class hb implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ImageDownloadUI f201668d;

    public hb(com.tencent.mm.ui.chatting.ImageDownloadUI imageDownloadUI) {
        this.f201668d = imageDownloadUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.modelbase.r1 e17 = c01.d9.e();
        com.tencent.mm.ui.chatting.ImageDownloadUI imageDownloadUI = this.f201668d;
        e17.d(imageDownloadUI.f198291m);
        imageDownloadUI.finish();
        return true;
    }
}
