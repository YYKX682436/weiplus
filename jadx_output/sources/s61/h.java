package s61;

/* loaded from: classes15.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI f403354d;

    public h(com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI findMContactAddUI) {
        this.f403354d = findMContactAddUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/friend/ui/FindMContactAddUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI findMContactAddUI = this.f403354d;
        sb6.append(findMContactAddUI.getClass().getName());
        sb6.append(",R300_300_AddAllButton,");
        gm0.j1.b();
        sb6.append(gm0.m.f("R300_300_AddAllButton"));
        sb6.append(",3");
        n71.a.b(10645, sb6.toString());
        int i17 = findMContactAddUI.f73128t;
        if (i17 == 2) {
            findMContactAddUI.f73117f.f(true);
            findMContactAddUI.f73117f.notifyDataSetChanged();
            findMContactAddUI.f73124p.setVisibility(8);
            android.widget.TextView textView = findMContactAddUI.f73123o;
            if (textView != null) {
                textView.setVisibility(0);
            }
        } else if (i17 == 1) {
            findMContactAddUI.f73117f.f(true);
            findMContactAddUI.f73117f.notifyDataSetChanged();
            com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI.Z6(findMContactAddUI);
        } else {
            findMContactAddUI.f73117f.f(true);
            findMContactAddUI.f73117f.notifyDataSetChanged();
            findMContactAddUI.f73124p.setVisibility(8);
            android.widget.TextView textView2 = findMContactAddUI.f73123o;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/friend/ui/FindMContactAddUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
