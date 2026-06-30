package e0;

/* loaded from: classes5.dex */
public final class r1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f245694d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e0.f1 f245695e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f245696f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(e0.f1 f1Var, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f245695e = f1Var;
        this.f245696f = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new e0.r1(this.f245695e, this.f245696f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((e0.r1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f245694d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            e0.f1 f1Var = this.f245695e;
            int i18 = this.f245696f;
            this.f245694d = 1;
            if (e0.f1.g(f1Var, i18, 0, this, 2, null) == aVar) {
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
