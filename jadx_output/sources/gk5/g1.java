package gk5;

/* loaded from: classes.dex */
public final class g1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk5.k1 f272658d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.n0 f272659e;

    public g1(gk5.k1 k1Var, wi5.n0 n0Var) {
        this.f272658d = k1Var;
        this.f272659e = n0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/transmit/uic/SelectTransmitUserReturnUIC$onCreate$1$2$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.sdk.platformtools.f9 f9Var = com.tencent.mm.sdk.platformtools.f9.ContactWeCom;
        gk5.k1 k1Var = this.f272658d;
        if (f9Var.k(k1Var.getActivity(), null)) {
            android.content.Intent intent = new android.content.Intent(k1Var.getActivity().getIntent());
            intent.setClass(k1Var.getActivity(), com.tencent.mm.ui.contact.OpenIMSelectContactUI.class);
            wi5.n0 n0Var = this.f272659e;
            intent.putExtra("max_limit_num", n0Var.f446316i);
            intent.removeExtra("titile");
            intent.putExtra("openim_appid", "3552365301");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.LinkedList linkedList = n0Var.f446319o;
            kotlin.jvm.internal.o.d(linkedList);
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (com.tencent.mm.storage.z3.m4(str)) {
                    arrayList2.add(str);
                }
            }
            intent.putExtra("AlreadySelectOtherUserCount", linkedList.size() - arrayList2.size());
            intent.putExtra("already_select_contact", kz5.n0.g0(arrayList2, ",", null, null, 0, null, null, 62, null));
            k1Var.getActivity().startActivityForResult(intent, 5);
        }
        yj0.a.h(this, "com/tencent/mm/ui/transmit/uic/SelectTransmitUserReturnUIC$onCreate$1$2$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
