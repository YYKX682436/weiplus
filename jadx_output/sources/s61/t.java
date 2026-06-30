package s61;

/* loaded from: classes15.dex */
public class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI f403390d;

    public t(com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI findMContactInviteUI) {
        this.f403390d = findMContactInviteUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/friend/ui/FindMContactInviteUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI findMContactInviteUI = this.f403390d;
        sb6.append(findMContactInviteUI.getClass().getName());
        sb6.append(",R300_400_AddAllButton,");
        gm0.j1.b();
        sb6.append(gm0.m.f("R300_300_AddAllButton"));
        sb6.append(",3");
        n71.a.b(10645, sb6.toString());
        int i17 = findMContactInviteUI.f73145s;
        if (i17 == 2) {
            findMContactInviteUI.f73135f.f(true);
            findMContactInviteUI.f73135f.notifyDataSetChanged();
            findMContactInviteUI.f73142p.setVisibility(8);
            android.widget.TextView textView = findMContactInviteUI.f73141o;
            if (textView != null) {
                textView.setVisibility(0);
            }
        } else if (i17 == 1) {
            findMContactInviteUI.f73135f.f(true);
            findMContactInviteUI.f73135f.notifyDataSetChanged();
            com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI.Z6(findMContactInviteUI);
        } else {
            findMContactInviteUI.f73135f.f(true);
            findMContactInviteUI.f73135f.notifyDataSetChanged();
            findMContactInviteUI.f73142p.setVisibility(8);
            android.widget.TextView textView2 = findMContactInviteUI.f73141o;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/friend/ui/FindMContactInviteUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
