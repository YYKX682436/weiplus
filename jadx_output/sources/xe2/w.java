package xe2;

/* loaded from: classes3.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yg2.b f453916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ug2.g f453917e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xe2.b0 f453918f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(yg2.b bVar, ug2.g gVar, xe2.b0 b0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f453916d = bVar;
        this.f453917e = gVar;
        this.f453918f = b0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xe2.w(this.f453916d, this.f453917e, this.f453918f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        xe2.w wVar = (xe2.w) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        wVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.l.c(this.f453916d, kotlinx.coroutines.q1.f310570c, kotlinx.coroutines.a1.UNDISPATCHED, new xe2.v(this.f453917e, this.f453918f, null));
        return jz5.f0.f302826a;
    }
}
