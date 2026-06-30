package gg4;

/* loaded from: classes4.dex */
public class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.pluginapp.AddMoreFriendsUI f271763d;

    public m(com.tencent.mm.plugin.subapp.ui.pluginapp.AddMoreFriendsUI addMoreFriendsUI) {
        this.f271763d = addMoreFriendsUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/subapp/ui/pluginapp/AddMoreFriendsUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent putExtra = new android.content.Intent().putExtra("Search_Scene", 2).putExtra("MMActivity.OverrideEnterAnimation", 0).putExtra("MMActivity.OverrideExitAnimation", 0);
        com.tencent.mm.plugin.subapp.ui.pluginapp.AddMoreFriendsUI addMoreFriendsUI = this.f271763d;
        ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).Ai(addMoreFriendsUI.getContext(), ".ui.FTSAddFriendUI", putExtra.putExtra("report_add_friends_sessionid", ((gg4.i) addMoreFriendsUI.component(gg4.i.class)).O6()), (com.tencent.mm.ui.bk.C() || addMoreFriendsUI.isVASValid()) ? null : android.app.ActivityOptions.makeSceneTransitionAnimation(addMoreFriendsUI, new android.util.Pair[0]).toBundle());
        gg4.i iVar = (gg4.i) addMoreFriendsUI.component(gg4.i.class);
        iVar.getClass();
        pm0.v.K(null, new gg4.g(iVar));
        yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/pluginapp/AddMoreFriendsUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
