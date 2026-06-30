package xe2;

/* loaded from: classes3.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yg2.b f453930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ug2.a f453931e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xe2.b0 f453932f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f453933g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(yg2.b bVar, ug2.a aVar, xe2.b0 b0Var, java.lang.Integer num, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f453930d = bVar;
        this.f453931e = aVar;
        this.f453932f = b0Var;
        this.f453933g = num;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xe2.z(this.f453930d, this.f453931e, this.f453932f, this.f453933g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        xe2.z zVar = (xe2.z) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        zVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.l.c(this.f453930d, kotlinx.coroutines.q1.f310570c, kotlinx.coroutines.a1.UNDISPATCHED, new xe2.y(this.f453931e, this.f453932f, this.f453933g, null));
        return jz5.f0.f302826a;
    }
}
