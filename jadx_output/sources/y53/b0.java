package y53;

/* loaded from: classes8.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f459471d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f459472e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f459473f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c01.o8 f459474g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(java.util.Map map, java.lang.String str, kotlin.jvm.internal.h0 h0Var, c01.o8 o8Var) {
        super(0);
        this.f459471d = map;
        this.f459472e = str;
        this.f459473f = h0Var;
        this.f459474g = o8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        u53.u uVar = (u53.u) kz5.n0.Y(this.f459471d.values());
        boolean z17 = uVar != null ? ((y53.m) uVar).B : false;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getContact] callback! succ=");
        sb6.append(z17);
        sb6.append(", username=");
        java.lang.String str = this.f459472e;
        sb6.append(str);
        sb6.append(" talker=");
        sb6.append((java.lang.String) this.f459473f.f310123d);
        com.tencent.mars.xlog.Log.i("GameLife.GetContactInterceptor", sb6.toString());
        c01.o8 o8Var = this.f459474g;
        if (o8Var != null) {
            o8Var.a(str, z17);
        }
        return jz5.f0.f302826a;
    }
}
