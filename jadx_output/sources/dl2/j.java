package dl2;

/* loaded from: classes3.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dl2.f0 f235229d;

    public j(dl2.f0 f0Var) {
        this.f235229d = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftPkgChooseView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dl2.f0 f0Var = this.f235229d;
        if (f0Var.f235207k.f235221b > f0Var.f235208l) {
            db5.t7.m(f0Var.f235197a.getContext(), f0Var.f235197a.getContext().getString(com.tencent.mm.R.string.dif, ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).Zi(f0Var.f235208l)));
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftPkgChooseView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (f0Var.f235219w > f0Var.f235209m) {
            db5.t7.m(f0Var.f235197a.getContext(), f0Var.f235197a.getContext().getString(com.tencent.mm.R.string.dij, java.lang.Long.valueOf(f0Var.f235209m)));
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftPkgChooseView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        f0Var.a(false);
        yz5.l lVar = f0Var.f235205i;
        if (lVar != null) {
            lVar.invoke(f0Var.f235207k);
        }
        com.tencent.mars.xlog.Log.i(f0Var.f235198b, "chosenData = " + f0Var.f235207k);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftPkgChooseView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
