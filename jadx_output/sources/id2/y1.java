package id2;

/* loaded from: classes2.dex */
public final class y1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f290886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ id2.b2 f290887e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(com.tencent.mm.modelbase.f fVar, id2.b2 b2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f290886d = fVar;
        this.f290887e = b2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new id2.y1(this.f290886d, this.f290887e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        id2.y1 y1Var = (id2.y1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        y1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#loadDataWithCgi cgi end. errType=");
        com.tencent.mm.modelbase.f fVar = this.f290886d;
        sb6.append(fVar.f70615a);
        sb6.append(" errCode=");
        sb6.append(fVar.f70616b);
        com.tencent.mars.xlog.Log.i("FinderLiveMoreOptionSettingUIC", sb6.toString());
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            com.tencent.mm.protobuf.f fVar2 = fVar.f70618d;
            id2.b2.f290490g = (r45.lk2) fVar2;
            dk2.ef efVar = dk2.ef.f233372a;
            r45.v32 v32Var = (r45.v32) ((r45.lk2) fVar2).getCustom(31);
            boolean z17 = false;
            if (v32Var != null && v32Var.getBoolean(6)) {
                z17 = true;
            }
            dk2.ef.C = z17;
            id2.b2 b2Var = this.f290887e;
            ((im2.p4) ((zy2.m8) ((jz5.n) b2Var.f290493f).getValue())).S6((r45.lk2) fVar.f70618d);
            com.tencent.mm.protobuf.f resp = fVar.f70618d;
            kotlin.jvm.internal.o.f(resp, "resp");
            b2Var.P6((r45.lk2) resp);
        }
        return jz5.f0.f302826a;
    }
}
