package rn2;

/* loaded from: classes.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f397687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v65.n f397688e;

    public d0(com.tencent.mm.ui.widget.dialog.k0 k0Var, v65.n nVar) {
        this.f397687d = k0Var;
        this.f397688e = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateGiftUtil$showBuyConfirmDialog$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f397687d.u();
        this.f397688e.a(new jz5.l("custom cancel", null));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateGiftUtil$showBuyConfirmDialog$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
