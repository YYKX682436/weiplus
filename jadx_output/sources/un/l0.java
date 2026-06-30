package un;

/* loaded from: classes.dex */
public final class l0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.p0 f429306d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.n0 f429307e;

    public l0(un.p0 p0Var, wi5.n0 n0Var) {
        this.f429306d = p0Var;
        this.f429307e = n0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/uic/SelectOpenImChatRoomAddMemberHeaderUIC$onCreate$1$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.sdk.platformtools.f9 f9Var = com.tencent.mm.sdk.platformtools.f9.ContactWeCom;
        un.p0 p0Var = this.f429306d;
        if (f9Var.k(p0Var.getActivity(), null)) {
            android.content.Intent intent = new android.content.Intent(p0Var.getActivity().getIntent());
            intent.removeExtra("titile");
            intent.putExtra("openim_appid", "3552365301");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = this.f429307e.f446319o.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (com.tencent.mm.storage.z3.m4(str)) {
                    arrayList2.add(str);
                }
            }
            intent.putExtra("already_select_contact", kz5.n0.g0(arrayList2, ",", null, null, 0, null, null, 62, null));
            j45.l.v(p0Var.getActivity(), ".ui.contact.OpenIMSelectContactUI", intent, 5);
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/uic/SelectOpenImChatRoomAddMemberHeaderUIC$onCreate$1$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
