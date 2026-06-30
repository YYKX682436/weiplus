package j93;

/* loaded from: classes.dex */
public final class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.r0 f298425d;

    public k0(j93.r0 r0Var) {
        this.f298425d = r0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/uic/PlusMenuLabelUIC$onCreate$1$1$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        j93.r0 r0Var = this.f298425d;
        r0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.PlusMenuLabelUIC", "onImportContactFromLabelClick() called");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("titile", r0Var.getActivity().getString(com.tencent.mm.R.string.mbk));
        intent.putExtra("list_attr", 64);
        intent.putExtra("showLabelWhenSearch", false);
        intent.putExtra("showContactScrollbar", false);
        intent.putExtra("KEY_NEED_SEAR_HEADER", false);
        intent.putExtra("Intent_KEY_SHOW_IV_MORE", true);
        pf5.j0.a(intent, ij5.d0.class);
        pf5.j0.a(intent, g93.l.class);
        pf5.j0.a(intent, cj5.n3.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        pf5.j0.a(intent, hj5.e.class);
        bh5.c cVar = new bh5.c();
        cVar.f20922a.f20924a = r0Var.getContext();
        cVar.d(intent);
        cVar.a("com.tencent.mm.ui.mvvm.MvvmContactListUI");
        cVar.i(new j93.p0(r0Var));
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/uic/PlusMenuLabelUIC$onCreate$1$1$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
