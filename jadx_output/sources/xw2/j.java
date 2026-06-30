package xw2;

/* loaded from: classes2.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f457698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xw2.s f457699e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f457700f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f457701g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(xw2.s sVar, int i17, int i18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f457699e = sVar;
        this.f457700f = i17;
        this.f457701g = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        xw2.j jVar = new xw2.j(this.f457699e, this.f457700f, this.f457701g, continuation);
        jVar.f457698d = obj;
        return jVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xw2.j) create((java.util.List) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        return xw2.s.b(this.f457699e, (java.util.List) this.f457698d, this.f457700f, this.f457701g);
    }
}
