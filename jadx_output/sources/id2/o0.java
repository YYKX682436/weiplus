package id2;

/* loaded from: classes.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f290698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f290699e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(xg2.h hVar, kotlin.coroutines.Continuation continuation, id2.v1 v1Var) {
        super(2, continuation);
        this.f290698d = hVar;
        this.f290699e = v1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new id2.o0(this.f290698d, continuation, this.f290699e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        id2.o0 o0Var = (id2.o0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        o0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.qp1 qp1Var;
        com.tencent.mm.protobuf.f fVar;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f290698d).f454381b;
        id2.v1 v1Var = this.f290699e;
        java.lang.String str = v1Var.f290834d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[FinderMakePackageOrderRequest] failed, pb = ");
        rm0.j jVar = aVar2.f454379a;
        sb6.append((jVar == null || (fVar = jVar.f397427h) == null) ? null : pm0.b0.g(fVar));
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        rm0.j jVar2 = aVar2.f454379a;
        if (jVar2 != null) {
            com.tencent.mm.protobuf.f fVar2 = jVar2.f397427h;
            r45.mf2 mf2Var = fVar2 instanceof r45.mf2 ? (r45.mf2) fVar2 : null;
            if (mf2Var != null && (qp1Var = (r45.qp1) mf2Var.getCustom(3)) != null) {
                hz2.d dVar = hz2.d.f286313a;
                kotlin.jvm.internal.o.d(jVar2);
                kotlin.jvm.internal.o.d(jVar2);
                dVar.j(jVar2.f397424e, jVar2.f397425f, qp1Var);
                return jz5.f0.f302826a;
            }
        }
        pm0.v.X(new id2.s0(v1Var));
        return jz5.f0.f302826a;
    }
}
