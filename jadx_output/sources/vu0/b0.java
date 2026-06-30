package vu0;

/* loaded from: classes5.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f440056d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vu0.o0 f440057e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.segments.ClipSegment f440058f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(vu0.o0 o0Var, com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f440057e = o0Var;
        this.f440058f = clipSegment;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vu0.b0(this.f440057e, this.f440058f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vu0.b0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f440056d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f440056d = 1;
            obj = vu0.o0.a(this.f440057e, this.f440058f, this);
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
