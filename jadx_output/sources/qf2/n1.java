package qf2;

/* loaded from: classes.dex */
public final class n1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f362487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.y1 f362488e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.m f362489f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f362490g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f362491h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(qf2.y1 y1Var, dk2.m mVar, int i17, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f362488e = y1Var;
        this.f362489f = mVar;
        this.f362490g = i17;
        this.f362491h = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.n1(this.f362488e, this.f362489f, this.f362490g, this.f362491h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qf2.n1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f362487d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            qf2.y1 y1Var = this.f362488e;
            dk2.m mVar = this.f362489f;
            int i18 = this.f362490g;
            yz5.l lVar = this.f362491h;
            this.f362487d = 1;
            if (qf2.y1.b7(y1Var, mVar, i18, true, lVar, this) == aVar) {
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
