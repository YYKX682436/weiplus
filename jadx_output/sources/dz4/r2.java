package dz4;

/* loaded from: classes11.dex */
public final class r2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f245389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dz4.u2 f245390e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f245391f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f245392g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(dz4.u2 u2Var, long j17, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f245390e = u2Var;
        this.f245391f = j17;
        this.f245392g = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dz4.r2(this.f245390e, this.f245391f, this.f245392g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dz4.r2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f245389d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f245389d = 1;
            obj = dz4.u2.b(this.f245390e, this.f245391f, this.f245392g, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
