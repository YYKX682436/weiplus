package vn2;

/* loaded from: classes2.dex */
public final class p0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f438347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f438348e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f438349f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f438350g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f438351h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f438352i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.p f438353m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.p f438354n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(android.content.Context context, long j17, java.lang.String str, boolean z17, r45.qt2 qt2Var, yz5.p pVar, yz5.p pVar2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f438348e = context;
        this.f438349f = j17;
        this.f438350g = str;
        this.f438351h = z17;
        this.f438352i = qt2Var;
        this.f438353m = pVar;
        this.f438354n = pVar2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vn2.p0(this.f438348e, this.f438349f, this.f438350g, this.f438351h, this.f438352i, this.f438353m, this.f438354n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vn2.p0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f438347d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            vn2.u0 u0Var = vn2.u0.f438387a;
            android.content.Context context = this.f438348e;
            long j17 = this.f438349f;
            java.lang.String str = this.f438350g;
            boolean z17 = this.f438351h;
            r45.qt2 qt2Var = this.f438352i;
            yz5.p pVar = this.f438353m;
            yz5.p pVar2 = this.f438354n;
            this.f438347d = 1;
            if (u0Var.o(context, j17, str, z17, qt2Var, pVar, pVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
