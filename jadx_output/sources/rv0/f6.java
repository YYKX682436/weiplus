package rv0;

/* loaded from: classes5.dex */
public final class f6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.z6 f400005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.base.MJID f400006e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(rv0.z6 z6Var, com.tencent.maas.base.MJID mjid, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f400005d = z6Var;
        this.f400006e = mjid;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rv0.f6(this.f400005d, this.f400006e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        rv0.f6 f6Var = (rv0.f6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        f6Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        dx0.g gVar;
        dx0.g gVar2;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        rv0.z6 z6Var = this.f400005d;
        ex0.a0 v76 = z6Var.v7();
        com.tencent.maas.base.MJID mjid = this.f400006e;
        if (v76 != null && (gVar2 = v76.H) != null) {
            gVar2.f(mjid);
        }
        ex0.a0 v77 = z6Var.v7();
        if (v77 != null && (gVar = v77.H) != null) {
            gVar.b(mjid);
        }
        return jz5.f0.f302826a;
    }
}
