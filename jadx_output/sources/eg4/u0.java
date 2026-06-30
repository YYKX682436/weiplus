package eg4;

/* loaded from: classes4.dex */
public final class u0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.friend.AddFriendVerifyRecordUI f252817d;

    public u0(com.tencent.mm.plugin.subapp.ui.friend.AddFriendVerifyRecordUI addFriendVerifyRecordUI) {
        this.f252817d = addFriendVerifyRecordUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        android.content.Intent intent = new android.content.Intent(this.f252817d, (java.lang.Class<?>) com.tencent.mm.plugin.subapp.ui.pluginapp.AddMoreFriendsUI.class);
        intent.putExtra("invite_friend_scene", 3);
        com.tencent.mm.plugin.subapp.ui.friend.AddFriendVerifyRecordUI addFriendVerifyRecordUI = this.f252817d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(addFriendVerifyRecordUI, arrayList.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordUI$onCreate$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        addFriendVerifyRecordUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(addFriendVerifyRecordUI, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordUI$onCreate$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        ((ku5.t0) ku5.t0.f312615d).q(new eg4.t0(this.f252817d));
        return true;
    }
}
