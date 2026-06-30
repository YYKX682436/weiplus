package wb5;

/* loaded from: classes.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wb5.i f444440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.n0 f444441e;

    public e(wb5.i iVar, wi5.n0 n0Var) {
        this.f444440d = iVar;
        this.f444441e = n0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/uic/SelectSendCardUIC$onCreate$1$2$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.sdk.platformtools.f9 f9Var = com.tencent.mm.sdk.platformtools.f9.ContactWeCom;
        wb5.i iVar = this.f444440d;
        if (f9Var.k(iVar.getActivity(), null)) {
            android.content.Intent intent = new android.content.Intent(iVar.getActivity().getIntent());
            intent.setClass(iVar.getActivity(), com.tencent.mm.ui.contact.OpenIMSelectContactUI.class);
            intent.removeExtra("titile");
            intent.putExtra("openim_appid", "3552365301");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = this.f444441e.f446319o.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (com.tencent.mm.storage.z3.m4(str)) {
                    arrayList2.add(str);
                }
            }
            intent.putExtra("already_select_contact", kz5.n0.g0(arrayList2, ",", null, null, 0, null, null, 62, null));
            iVar.getActivity().startActivityForResult(intent, 5);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/uic/SelectSendCardUIC$onCreate$1$2$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
