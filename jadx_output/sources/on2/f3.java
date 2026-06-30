package on2;

/* loaded from: classes3.dex */
public final class f3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.c1 f346908d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f346909e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f346910f;

    public f3(com.tencent.mm.plugin.finder.view.c1 c1Var, yz5.l lVar, kotlin.jvm.internal.h0 h0Var) {
        this.f346908d = c1Var;
        this.f346909e = lVar;
        this.f346910f = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/LotteryUtil$claimByCustomize$1$rootView$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f346908d.q();
        this.f346909e.invoke(this.f346910f.f310123d);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/LotteryUtil$claimByCustomize$1$rootView$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
