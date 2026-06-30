package eg4;

/* loaded from: classes4.dex */
public class z1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI f252836d;

    public z1(com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI fMessageConversationUI) {
        this.f252836d = fMessageConversationUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI fMessageConversationUI = this.f252836d;
        android.content.Intent intent = new android.content.Intent(fMessageConversationUI, (java.lang.Class<?>) com.tencent.mm.plugin.subapp.ui.pluginapp.AddMoreFriendsUI.class);
        intent.putExtra("invite_friend_scene", 3);
        com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI fMessageConversationUI2 = this.f252836d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(fMessageConversationUI2, arrayList.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI$6", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        fMessageConversationUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(fMessageConversationUI2, "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI$6", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        tf5.j.O6(fMessageConversationUI, "friends_add_button_addressbook");
        return true;
    }
}
