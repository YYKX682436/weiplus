package s61;

/* loaded from: classes15.dex */
public class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI f403357d;

    public i(com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI findMContactAddUI) {
        this.f403357d = findMContactAddUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/friend/ui/FindMContactAddUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI findMContactAddUI = this.f403357d;
        findMContactAddUI.f73124p.setVisibility(0);
        findMContactAddUI.f73123o.setVisibility(8);
        findMContactAddUI.f73117f.f(false);
        findMContactAddUI.f73117f.notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/plugin/account/friend/ui/FindMContactAddUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
