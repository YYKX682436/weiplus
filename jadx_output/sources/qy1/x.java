package qy1;

/* loaded from: classes13.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f367769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qy1.b0 f367770e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f367771f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qy1.i f367772g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(qy1.b0 b0Var, com.tencent.mm.modelbase.m1 m1Var, qy1.i iVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f367770e = b0Var;
        this.f367771f = m1Var;
        this.f367772g = iVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qy1.x(this.f367770e, this.f367771f, this.f367772g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qy1.x) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f367769d;
        qy1.b0 b0Var = this.f367770e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f367769d = 1;
            if (qy1.b0.a(b0Var, this.f367771f, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        qy1.i iVar = this.f367772g;
        int i18 = iVar.f367732a;
        qy1.m mVar = b0Var.f367713l;
        this.f367769d = 2;
        if (mVar.a(iVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
