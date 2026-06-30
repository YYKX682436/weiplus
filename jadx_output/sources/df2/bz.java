package df2;

/* loaded from: classes3.dex */
public final class bz implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lz f229833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.aq4 f229834e;

    public bz(df2.lz lzVar, r45.aq4 aq4Var) {
        this.f229833d = lzVar;
        this.f229834e = aq4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/ShareDiscountBubbleController$onMoneyOffInfoUpdated$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f229833d.d7(this.f229834e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/ShareDiscountBubbleController$onMoneyOffInfoUpdated$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
