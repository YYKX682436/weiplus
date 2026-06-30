package hr3;

/* loaded from: classes.dex */
public final class ke implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.pf f283724d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f283725e;

    public ke(hr3.pf pfVar, android.widget.TextView textView) {
        this.f283724d = pfVar;
        this.f283725e = textView;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/SayHiPictureUIC$initCommonSayHi$1$1$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        hr3.pf pfVar = this.f283724d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) pfVar.getActivity(), 1, true);
        k0Var.q(pfVar.getActivity().getString(com.tencent.mm.R.string.hns), 17);
        k0Var.f211872n = new hr3.ie(pfVar);
        k0Var.f211881s = new hr3.je(pfVar, this.f283725e);
        k0Var.v();
        yj0.a.i(false, this, "com/tencent/mm/plugin/profile/ui/SayHiPictureUIC$initCommonSayHi$1$1$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
