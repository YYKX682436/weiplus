package ic3;

/* loaded from: classes5.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ic3.f0 f290395d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xj.n f290396e;

    public d0(ic3.f0 f0Var, xj.n nVar) {
        this.f290395d = f0Var;
        this.f290396e = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoAdView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(xj.i.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        xj.i.y3((xj.i) c17, this.f290395d.f290401d, this.f290396e, null, 4, null);
        yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoAdView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
