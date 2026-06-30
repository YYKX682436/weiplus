package ue2;

/* loaded from: classes3.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f426862d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm2.g1 f426863e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mm2.c1 f426864f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ue2.x f426865g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(mm2.g1 g1Var, mm2.c1 c1Var, ue2.x xVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f426863e = g1Var;
        this.f426864f = c1Var;
        this.f426865g = xVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ue2.w(this.f426863e, this.f426864f, this.f426865g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((ue2.w) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f426862d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.j2 j2Var = this.f426863e.f329075p;
            ue2.v vVar = new ue2.v(this.f426864f, this.f426865g);
            this.f426862d = 1;
            if (((kotlinx.coroutines.flow.h3) j2Var).a(vVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
