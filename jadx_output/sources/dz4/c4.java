package dz4;

/* loaded from: classes11.dex */
public final class c4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f245186d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dz4.h4 f245187e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f245188f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f245189g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(dz4.h4 h4Var, long j17, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f245187e = h4Var;
        this.f245188f = j17;
        this.f245189g = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dz4.c4(this.f245187e, this.f245188f, this.f245189g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dz4.c4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f245186d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f245186d = 1;
            obj = dz4.h4.b(this.f245187e, this.f245188f, this.f245189g, this);
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
