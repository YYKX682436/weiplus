package com.tencent.mm.ui.chatting;

/* loaded from: classes5.dex */
public class jc implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ResourcesExceedUI f201874d;

    public jc(com.tencent.mm.ui.chatting.ResourcesExceedUI resourcesExceedUI) {
        this.f201874d = resourcesExceedUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f201874d.finish();
        return true;
    }
}
