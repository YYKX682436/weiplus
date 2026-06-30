package yq3;

/* loaded from: classes11.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f464527d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f464528e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.content.Context context, com.tencent.mm.modelbase.f fVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f464527d = context;
        this.f464528e = fVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yq3.u(this.f464527d, this.f464528e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yq3.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        en.k kVar = (en.k) i95.n0.c(en.k.class);
        com.tencent.mm.modelbase.f fVar = this.f464528e;
        return ((en.a) kVar).Zi(this.f464527d, fVar.f70615a, fVar.f70616b, fVar.f70617c) ? com.tencent.mm.contact.n.f64866e : com.tencent.mm.contact.n.f64867f;
    }
}
