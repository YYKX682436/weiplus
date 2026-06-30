package com.tencent.mm.ui.contact;

/* loaded from: classes4.dex */
public class u0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.ChatroomContactUI f207202d;

    public u0(com.tencent.mm.ui.contact.ChatroomContactUI chatroomContactUI) {
        this.f207202d = chatroomContactUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f207202d.finish();
        return false;
    }
}
