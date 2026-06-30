package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class y8 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SayHiEditUI f207263d;

    public y8(com.tencent.mm.ui.contact.SayHiEditUI sayHiEditUI) {
        this.f207263d = sayHiEditUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.contact.SayHiEditUI sayHiEditUI = this.f207263d;
        sayHiEditUI.hideVKB();
        com.tencent.mm.ui.contact.SayHiEditUI.T6(sayHiEditUI);
        return false;
    }
}
