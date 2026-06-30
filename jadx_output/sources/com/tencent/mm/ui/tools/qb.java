package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class qb implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShowImageUI f210662d;

    public qb(com.tencent.mm.ui.tools.ShowImageUI showImageUI) {
        this.f210662d = showImageUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f210662d.finish();
        return true;
    }
}
