package eg4;

/* loaded from: classes4.dex */
public class v1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI f252822d;

    public v1(com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI fMessageConversationUI) {
        this.f252822d = fMessageConversationUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent putExtra = new android.content.Intent().putExtra("Search_Scene", 2).putExtra("MMActivity.OverrideEnterAnimation", 0).putExtra("MMActivity.OverrideExitAnimation", 0);
        com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI fMessageConversationUI = this.f252822d;
        android.os.Bundle bundle = android.app.ActivityOptions.makeSceneTransitionAnimation(fMessageConversationUI, new android.util.Pair[0]).toBundle();
        ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).Ai(fMessageConversationUI.getContext(), ".ui.FTSAddFriendUI", putExtra, bundle);
        tf5.j.O6(fMessageConversationUI, "search_account_new_friends");
        yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
