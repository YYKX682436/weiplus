package gx0;

/* loaded from: classes5.dex */
public final class j2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f276564d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.u2 f276565e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.base.MJID f276566f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(gx0.u2 u2Var, com.tencent.maas.base.MJID mjid, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276565e = u2Var;
        this.f276566f = mjid;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.j2(this.f276565e, this.f276566f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.j2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f276564d;
        gx0.u2 u2Var = this.f276565e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gx0.bf R7 = u2Var.R7();
            this.f276564d = 1;
            if (gx0.bf.t7(R7, false, this, 1, null) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.maas.base.MJID mjid = this.f276566f;
        u2Var.Z7(mjid);
        u2Var.X7(mjid);
        return jz5.f0.f302826a;
    }
}
