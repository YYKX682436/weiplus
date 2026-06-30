package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class xi implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.SingleChatInfoUI f212564d;

    public xi(com.tencent.mm.ui.SingleChatInfoUI singleChatInfoUI) {
        this.f212564d = singleChatInfoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f212564d.finish();
        return true;
    }
}
