package df2;

/* loaded from: classes10.dex */
public final class pn implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.un f231102d;

    public pn(df2.un unVar) {
        this.f231102d = unVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveMilestoneLotteryMainController$showMainPage$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f231102d.Z6();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveMilestoneLotteryMainController$showMainPage$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
