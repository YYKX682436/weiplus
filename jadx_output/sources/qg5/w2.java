package qg5;

/* loaded from: classes5.dex */
public final class w2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qg5.z2 f363237d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f363238e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f363239f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f363240g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f363241h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f363242i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.a f363243m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(qg5.z2 z2Var, android.content.Context context, java.util.List list, com.tencent.mm.storage.z3 z3Var, boolean z17, boolean z18, yz5.a aVar) {
        super(1);
        this.f363237d = z2Var;
        this.f363238e = context;
        this.f363239f = list;
        this.f363240g = z3Var;
        this.f363241h = z17;
        this.f363242i = z18;
        this.f363243m = aVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        xj.m mVar = (xj.m) obj;
        qg5.z2 service = this.f363237d;
        kotlin.jvm.internal.o.g(service, "service");
        if (!jm0.g.class.isAssignableFrom(qg5.u3.class)) {
            throw new java.lang.IllegalArgumentException(qg5.z2.class.getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(service.getViewModel(), new jm0.e(service)).a(qg5.u3.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ((qg5.u3) ((jm0.g) a17)).V6(this.f363238e, this.f363239f, this.f363240g, mVar, this.f363241h, this.f363242i, this.f363243m);
        return jz5.f0.f302826a;
    }
}
