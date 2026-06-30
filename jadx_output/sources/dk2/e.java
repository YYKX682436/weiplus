package dk2;

/* loaded from: classes3.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f233333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.f f233334e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(dk2.f fVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f233334e = fVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dk2.e(this.f233334e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dk2.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f233333d;
        if (i17 != 0 && i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        do {
            dk2.f fVar = this.f233334e;
            fVar.b();
            fVar.getClass();
            this.f233333d = 1;
        } while (kotlinx.coroutines.k1.b(u04.d.f423477c, this) != aVar);
        return aVar;
    }
}
