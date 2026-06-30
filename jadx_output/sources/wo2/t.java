package wo2;

/* loaded from: classes2.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo2.m0 f448126d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f448127e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f448128f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(wo2.m0 m0Var, java.lang.String str, java.lang.String str2) {
        super(0);
        this.f448126d = m0Var;
        this.f448127e = str;
        this.f448128f = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        wo2.m0 m0Var = this.f448126d;
        m0Var.getClass();
        java.lang.String title = this.f448127e;
        kotlin.jvm.internal.o.g(title, "title");
        com.tencent.mars.xlog.Log.i("NearbyActionBarUIC", "setNearbyVideoTabTitle title:".concat(title));
        android.view.View findViewById = m0Var.getActivity().findViewById(com.tencent.mm.R.id.f487199nv3);
        if (findViewById != null) {
            findViewById.post(new wo2.j0(title, m0Var, findViewById));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setNearbyLiveTabTitle title:");
        java.lang.String str = this.f448128f;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("NearbyActionBarUIC", sb6.toString());
        pm0.v.X(new wo2.i0(str, m0Var));
        return jz5.f0.f302826a;
    }
}
