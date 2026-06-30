package te2;

/* loaded from: classes10.dex */
public final class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.i0 f417968d;

    public e0(te2.i0 i0Var) {
        this.f417968d = i0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorLuckyMoneyBubbleViewCallback$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        te2.w3 w3Var = this.f417968d.f418092i;
        if (w3Var != null) {
            ((te2.c4) w3Var).g();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorLuckyMoneyBubbleViewCallback$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
