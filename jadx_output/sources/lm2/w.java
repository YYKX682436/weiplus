package lm2;

/* loaded from: classes3.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f319456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.vr1 f319457e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lm2.h0 f319458f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.i f319459g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(r45.vr1 vr1Var, lm2.h0 h0Var, com.tencent.mm.modelbase.i iVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f319457e = vr1Var;
        this.f319458f = h0Var;
        this.f319459g = iVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new lm2.w(this.f319457e, this.f319458f, this.f319459g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((lm2.w) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f319456d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            lm2.v vVar = new lm2.v(this.f319457e, this.f319458f, this.f319459g, null);
            this.f319456d = 1;
            if (kotlinx.coroutines.l.g(g3Var, vVar, this) == aVar) {
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
