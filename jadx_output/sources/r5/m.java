package r5;

/* loaded from: classes14.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f392539d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y5.g f392540e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c6.j f392541f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(y5.g gVar, c6.j jVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f392540e = gVar;
        this.f392541f = jVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new r5.m(this.f392540e, this.f392541f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((r5.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f392539d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f392539d = 1;
            obj = this.f392540e.b(this.f392541f, this);
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
