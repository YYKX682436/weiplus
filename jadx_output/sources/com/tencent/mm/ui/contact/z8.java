package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class z8 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SayHiEditUI f207275d;

    public z8(com.tencent.mm.ui.contact.SayHiEditUI sayHiEditUI) {
        this.f207275d = sayHiEditUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f207275d.finish();
        return true;
    }
}
