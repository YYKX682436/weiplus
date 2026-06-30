package qg5;

/* loaded from: classes5.dex */
public final class u2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qg5.z2 f363204d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f363205e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f363206f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f363207g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f363208h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f363209i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(qg5.z2 z2Var, android.content.Context context, java.util.List list, com.tencent.mm.storage.z3 z3Var, boolean z17, yz5.a aVar) {
        super(1);
        this.f363204d = z2Var;
        this.f363205e = context;
        this.f363206f = list;
        this.f363207g = z3Var;
        this.f363208h = z17;
        this.f363209i = aVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        xj.m mVar = (xj.m) obj;
        qg5.z2 service = this.f363204d;
        kotlin.jvm.internal.o.g(service, "service");
        if (!jm0.g.class.isAssignableFrom(qg5.q4.class)) {
            throw new java.lang.IllegalArgumentException(qg5.z2.class.getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(service.getViewModel(), new jm0.e(service)).a(qg5.q4.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ((qg5.q4) ((jm0.g) a17)).W6(this.f363205e, this.f363206f, this.f363207g, this.f363208h, mVar, this.f363209i);
        return jz5.f0.f302826a;
    }
}
