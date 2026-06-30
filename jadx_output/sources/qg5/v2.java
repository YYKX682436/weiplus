package qg5;

/* loaded from: classes5.dex */
public final class v2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qg5.z2 f363219d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f363220e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f363221f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f363222g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(qg5.z2 z2Var, android.content.Context context, java.util.List list, yz5.a aVar) {
        super(1);
        this.f363219d = z2Var;
        this.f363220e = context;
        this.f363221f = list;
        this.f363222g = aVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        xj.m mVar = (xj.m) obj;
        qg5.z2 service = this.f363219d;
        kotlin.jvm.internal.o.g(service, "service");
        if (!jm0.g.class.isAssignableFrom(qg5.q4.class)) {
            throw new java.lang.IllegalArgumentException(qg5.z2.class.getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(service.getViewModel(), new jm0.e(service)).a(qg5.q4.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ((qg5.q4) ((jm0.g) a17)).X6(this.f363220e, this.f363221f, mVar, this.f363222g);
        return jz5.f0.f302826a;
    }
}
