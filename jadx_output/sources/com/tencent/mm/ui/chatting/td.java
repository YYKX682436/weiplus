package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class td implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.TextPreviewUI f202718d;

    public td(com.tencent.mm.ui.chatting.TextPreviewUI textPreviewUI) {
        this.f202718d = textPreviewUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f202718d.finish();
        return true;
    }
}
