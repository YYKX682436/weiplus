package qg5;

/* loaded from: classes8.dex */
public final class d5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qg5.n5 f362948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f362949e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f362950f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f362951g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362952h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(qg5.n5 n5Var, android.content.Context context, com.tencent.mm.storage.z3 z3Var, com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        super(0);
        this.f362948d = n5Var;
        this.f362949e = context;
        this.f362950f = z3Var;
        this.f362951g = f9Var;
        this.f362952h = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qg5.n5 n5Var = this.f362948d;
        ct.q2 T6 = qg5.n5.T6(n5Var);
        ac5.f fVar = ac5.f.f3090a;
        com.tencent.mm.storage.z3 z3Var = this.f362950f;
        if (z3Var == null) {
            z3Var = new com.tencent.mm.storage.z3();
        }
        android.content.Context context = this.f362949e;
        ((qg5.l0) T6).oj(context, fVar.b(context, z3Var), this.f362950f, kz5.b0.c(this.f362951g), true);
        ct.q2 T62 = qg5.n5.T6(n5Var);
        kotlin.jvm.internal.o.f(T62, "access$getChatRecordsStagingService(...)");
        ct.q2.k5(T62, false, 2, false, false, false, 28, null);
        ((qg5.l0) qg5.n5.T6(n5Var)).Zi(false);
        qg5.n5.V6(n5Var, context, "com.tencent.mm.intent.extra.FROM_SUMMARIZE_FILE", this.f362952h);
        return jz5.f0.f302826a;
    }
}
