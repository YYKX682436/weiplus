package dn2;

/* loaded from: classes3.dex */
public final class q0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dn2.s0 f241963d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.pj1 f241964e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.k0 f241965f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.f1 f241966g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f241967h;

    public q0(dn2.s0 s0Var, r45.pj1 pj1Var, com.tencent.mm.plugin.finder.live.view.k0 k0Var, kotlinx.coroutines.f1 f1Var, android.view.View view) {
        this.f241963d = s0Var;
        this.f241964e = pj1Var;
        this.f241965f = k0Var;
        this.f241966g = f1Var;
        this.f241967h = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        yg2.b viewScope;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/ShoppingHotSaleNotificationItem$getView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f241963d.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on notification clicked, product = ");
        r45.y23 y23Var = (r45.y23) this.f241964e.getCustom(0);
        sb6.append(y23Var != null ? java.lang.Long.valueOf(y23Var.getLong(0)) : null);
        sb6.append(", curlayout = ");
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = this.f241965f;
        sb6.append(k0Var);
        com.tencent.mars.xlog.Log.i("ShoppingHotSaleNotificationItem", sb6.toString());
        if (k0Var != null && (viewScope = k0Var.getViewScope()) != null) {
            kotlinx.coroutines.l.d(viewScope, null, null, new dn2.p0(this.f241966g, this.f241967h, this.f241965f, this.f241963d, this.f241964e, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/ShoppingHotSaleNotificationItem$getView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
