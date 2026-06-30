package pk2;

/* loaded from: classes3.dex */
public final class n3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.t62 f356028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f356029e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f356030f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f356031g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pk2.q3 f356032h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f356033i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.t62 f356034m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(r45.t62 t62Var, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, int i17, pk2.q3 q3Var, android.view.View view, r45.t62 t62Var2) {
        super(0);
        this.f356028d = t62Var;
        this.f356029e = arrayList;
        this.f356030f = arrayList2;
        this.f356031g = i17;
        this.f356032h = q3Var;
        this.f356033i = view;
        this.f356034m = t62Var2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.t62 t62Var = this.f356028d;
        t62Var.getList(4).clear();
        java.util.LinkedList list = t62Var.getList(4);
        java.util.ArrayList arrayList = this.f356029e;
        list.addAll(arrayList);
        t62Var.getList(2).clear();
        t62Var.getList(2).addAll(this.f356030f);
        t62Var.set(1, java.lang.Boolean.TRUE);
        int i17 = this.f356031g;
        t62Var.set(5, java.lang.Integer.valueOf(i17 > 0 ? i17 : arrayList.size()));
        com.tencent.mars.xlog.Log.i("AnchorRecommendOption", "onDispatch: refreshCityRangeUI, cityNameList=" + kz5.n0.g0(this.f356029e, "、", null, null, 0, null, null, 62, null) + ", cityCount=" + i17);
        android.view.View rootView = this.f356033i;
        kotlin.jvm.internal.o.f(rootView, "$rootView");
        pk2.q3 q3Var = this.f356032h;
        q3Var.w(rootView, t62Var);
        q3Var.x(rootView, this.f356034m, t62Var);
        return jz5.f0.f302826a;
    }
}
