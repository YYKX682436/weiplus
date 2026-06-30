package p61;

/* loaded from: classes11.dex */
public class u4 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.MobileFriendUI f352391d;

    public u4(com.tencent.mm.plugin.account.bind.ui.MobileFriendUI mobileFriendUI) {
        this.f352391d = mobileFriendUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/MobileFriendUI$8", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.account.bind.ui.MobileFriendUI mobileFriendUI = this.f352391d;
        if (i17 < mobileFriendUI.f73083d.getHeaderViewsCount()) {
            yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI$8", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        r61.a aVar = (r61.a) mobileFriendUI.f73084e.getItem(i17 - mobileFriendUI.f73083d.getHeaderViewsCount());
        int i18 = aVar.f392799o;
        if (i18 == 1 || i18 == 2) {
            mobileFriendUI.V6(aVar);
        }
        if (aVar.f392799o == 0) {
            android.content.Intent intent = new android.content.Intent(mobileFriendUI, (java.lang.Class<?>) com.tencent.mm.plugin.account.friend.ui.InviteFriendUI.class);
            intent.putExtra("friend_type", 1);
            intent.putExtra("friend_user_name", aVar.i());
            intent.putExtra("friend_num", aVar.f() + "");
            intent.putExtra("friend_nick", aVar.h());
            intent.putExtra("friend_weixin_nick", aVar.g());
            intent.putExtra("friend_scene", 13);
            com.tencent.mm.plugin.account.bind.ui.MobileFriendUI mobileFriendUI2 = this.f352391d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(mobileFriendUI2, arrayList2.toArray(), "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI$8", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mobileFriendUI2.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(mobileFriendUI2, "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI$8", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI$8", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
