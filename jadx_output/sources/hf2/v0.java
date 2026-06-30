package hf2;

/* loaded from: classes10.dex */
public final class v0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f281175d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hf2.y0 f281176e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(hf2.y0 y0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f281176e = y0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hf2.v0(this.f281176e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hf2.v0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.LinkedList linkedList;
        r45.ji0 ji0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f281175d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            hf2.y0 y0Var = this.f281176e;
            hf2.l2 l76 = y0Var.f281200a.l7();
            r45.ei0 ei0Var = y0Var.f281200a.f281185q;
            java.lang.String str = (ei0Var == null || (linkedList = ei0Var.f373529d) == null || (ji0Var = (r45.ji0) kz5.n0.Z(linkedList)) == null) ? null : ji0Var.f377829n;
            l76.b("MaasInputBlankClick", !(str == null || str.length() == 0));
            hf2.b2 h76 = y0Var.f281200a.h7();
            this.f281175d = 1;
            if (h76.g("MaasInputBlankClick", this) == aVar) {
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
