package z63;

/* loaded from: classes5.dex */
public class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z63.g f470374d;

    public d(z63.g gVar) {
        this.f470374d = gVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireContactsPhoneNumPicker$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        z63.g gVar = this.f470374d;
        z63.f fVar = gVar.f470411g;
        if (fVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TiemDatePicker", "[getPhoneNum] :%s", gVar.f470412h);
            java.lang.String str = gVar.f470412h;
            z63.m0 m0Var = (z63.m0) fVar;
            y9.i iVar = m0Var.f470430a.f470405a;
            if (iVar != null) {
                iVar.dismiss();
            }
            z63.n0 n0Var = m0Var.f470431b;
            com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI groupSolitatireEditUI = n0Var.f470433d;
            int i17 = com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI.U;
            groupSolitatireEditUI.U6(str);
            n0Var.f470433d.Y6(5);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireContactsPhoneNumPicker$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
