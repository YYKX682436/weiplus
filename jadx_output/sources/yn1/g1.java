package yn1;

/* loaded from: classes9.dex */
public final class g1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.r2 f463672d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f463673e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f463674f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(yn1.r2 r2Var, long j17, byte[] bArr, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f463672d = r2Var;
        this.f463673e = j17;
        this.f463674f = bArr;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yn1.g1(this.f463672d, this.f463673e, this.f463674f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yn1.g1 g1Var = (yn1.g1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        g1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.wechat.aff.migration.g gVar = this.f463672d.f463810a;
        if (gVar != null) {
            gVar.a1(this.f463673e, this.f463674f);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("callback");
        throw null;
    }
}
