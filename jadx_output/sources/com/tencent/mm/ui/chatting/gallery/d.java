package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes9.dex */
public class d implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.AppBrandHistoryListUI f200847d;

    public d(com.tencent.mm.ui.chatting.gallery.AppBrandHistoryListUI appBrandHistoryListUI) {
        this.f200847d = appBrandHistoryListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f200847d.finish();
        return true;
    }
}
