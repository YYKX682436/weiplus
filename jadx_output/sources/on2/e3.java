package on2;

/* loaded from: classes3.dex */
public final class e3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.c1 f346894d;

    public e3(com.tencent.mm.plugin.finder.view.c1 c1Var) {
        this.f346894d = c1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/LotteryUtil$claimByCustomize$1$rootView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f346894d.q();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/LotteryUtil$claimByCustomize$1$rootView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
