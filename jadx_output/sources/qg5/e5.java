package qg5;

/* loaded from: classes8.dex */
public final class e5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qg5.n5 f362966d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f362967e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f362968f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f362969g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362970h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(qg5.n5 n5Var, android.content.Context context, com.tencent.mm.storage.z3 z3Var, com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        super(0);
        this.f362966d = n5Var;
        this.f362967e = context;
        this.f362968f = z3Var;
        this.f362969g = f9Var;
        this.f362970h = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qg5.n5 n5Var = this.f362966d;
        ct.q2 T6 = qg5.n5.T6(n5Var);
        ac5.f fVar = ac5.f.f3090a;
        com.tencent.mm.storage.z3 z3Var = this.f362968f;
        if (z3Var == null) {
            z3Var = new com.tencent.mm.storage.z3();
        }
        android.content.Context context = this.f362967e;
        ((qg5.l0) T6).oj(context, fVar.b(context, z3Var), this.f362968f, kz5.b0.c(this.f362969g), true);
        ct.q2 T62 = qg5.n5.T6(n5Var);
        kotlin.jvm.internal.o.f(T62, "access$getChatRecordsStagingService(...)");
        ct.q2.k5(T62, false, 2, false, false, false, 28, null);
        qg5.n5.V6(n5Var, context, "com.tencent.mm.intent.extra.FROM_SUMMARIZE_URL", this.f362970h);
        return jz5.f0.f302826a;
    }
}
