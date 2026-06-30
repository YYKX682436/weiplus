package id2;

/* loaded from: classes2.dex */
public final class s2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f290792d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f290793e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(com.tencent.mm.modelbase.f fVar, id2.u3 u3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f290792d = fVar;
        this.f290793e = u3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new id2.s2(this.f290792d, this.f290793e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        id2.s2 s2Var = (id2.s2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        s2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#loadDataWithCgi cgi end. errType=");
        com.tencent.mm.modelbase.f fVar = this.f290792d;
        sb6.append(fVar.f70615a);
        sb6.append(" errCode=");
        sb6.append(fVar.f70616b);
        com.tencent.mars.xlog.Log.i("FinderLivePersonalCente", sb6.toString());
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            r45.lk2 lk2Var = (r45.lk2) fVar.f70618d;
            id2.u3.f290818p = lk2Var;
            dk2.ef efVar = dk2.ef.f233372a;
            r45.v32 v32Var = (r45.v32) lk2Var.getCustom(31);
            dk2.ef.C = v32Var != null && v32Var.getBoolean(6);
            r45.v32 v32Var2 = (r45.v32) ((r45.lk2) fVar.f70618d).getCustom(31);
            dk2.ef.D = v32Var2 != null && v32Var2.getBoolean(7);
            id2.u3 u3Var = this.f290793e;
            ((im2.p4) ((zy2.m8) ((jz5.n) u3Var.f290821f).getValue())).S6((r45.lk2) fVar.f70618d);
            com.tencent.mm.protobuf.f resp = fVar.f70618d;
            kotlin.jvm.internal.o.f(resp, "resp");
            u3Var.T6((r45.lk2) resp);
        }
        return jz5.f0.f302826a;
    }
}
