package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes8.dex */
public final class pe implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity f174178d;

    public pe(com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity textStatusOtherTopicFriendsActivity) {
        this.f174178d = textStatusOtherTopicFriendsActivity;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f174178d.onBackPressed();
        return true;
    }
}
