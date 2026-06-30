package yn1;

/* loaded from: classes11.dex */
public final class i2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f463702d;

    /* renamed from: e, reason: collision with root package name */
    public long f463703e;

    /* renamed from: f, reason: collision with root package name */
    public int f463704f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yn1.r2 f463705g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f463706h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(yn1.r2 r2Var, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f463705g = r2Var;
        this.f463706h = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yn1.i2(this.f463705g, this.f463706h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yn1.i2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.wechat.aff.migration.g gVar;
        long j17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f463704f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.wechat.aff.migration.g gVar2 = this.f463705g.f463810a;
            if (gVar2 == null) {
                kotlin.jvm.internal.o.o("callback");
                throw null;
            }
            bp1.d dVar = bp1.e.f23040a;
            bp1.f[] fVarArr = bp1.e.f23042c;
            this.f463702d = gVar2;
            long j18 = this.f463706h;
            this.f463703e = j18;
            this.f463704f = 1;
            java.lang.Object a17 = dVar.a(fVarArr, this);
            if (a17 == aVar) {
                return aVar;
            }
            gVar = gVar2;
            obj = a17;
            j17 = j18;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j17 = this.f463703e;
            gVar = (com.tencent.wechat.aff.migration.g) this.f463702d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        gVar.s1(j17, ((java.lang.Boolean) obj).booleanValue());
        return jz5.f0.f302826a;
    }
}
