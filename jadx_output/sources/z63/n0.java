package z63;

/* loaded from: classes5.dex */
public class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI f470433d;

    public n0(com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI groupSolitatireEditUI) {
        this.f470433d = groupSolitatireEditUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireEditUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI.U;
        com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI groupSolitatireEditUI = this.f470433d;
        groupSolitatireEditUI.d7();
        android.view.View view2 = groupSolitatireEditUI.f142233v;
        if ((view2 instanceof com.tencent.mm.ui.widget.MMEditText) && (view2.getParent() instanceof android.widget.RelativeLayout)) {
            ((android.widget.RelativeLayout) groupSolitatireEditUI.f142233v.getParent()).setTag(1);
        }
        z63.g gVar = new z63.g(groupSolitatireEditUI);
        gVar.f470411g = new z63.m0(this, gVar);
        groupSolitatireEditUI.R = gVar;
        gVar.a();
        groupSolitatireEditUI.Y6(4);
        yj0.a.h(this, "com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireEditUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
