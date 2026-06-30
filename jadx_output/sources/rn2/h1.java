package rn2;

/* loaded from: classes15.dex */
public final class h1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.t2 f397756d;

    public h1(rn2.t2 t2Var) {
        this.f397756d = t2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initGiftPrizeUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rn2.w wVar = this.f397756d.W;
        if (wVar != null) {
            v65.i.c(wVar.f397904c, null, new rn2.v(wVar, null), 1, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initGiftPrizeUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
