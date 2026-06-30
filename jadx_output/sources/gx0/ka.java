package gx0;

/* loaded from: classes5.dex */
public final class ka extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f276623d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ex0.r f276624e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka(gx0.ac acVar, ex0.r rVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276623d = acVar;
        this.f276624e = rVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.ka(this.f276623d, this.f276624e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        gx0.ka kaVar = (gx0.ka) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        kaVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ex0.a0 e86 = this.f276623d.e8();
        if (e86 != null) {
            com.tencent.maas.base.MJID segmentID = this.f276624e.f257168b;
            kotlin.jvm.internal.o.g(segmentID, "segmentID");
            e86.H.b(segmentID);
        }
        return jz5.f0.f302826a;
    }
}
