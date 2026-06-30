package q71;

/* loaded from: classes.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f360329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f360330e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f360331f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String str, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f360330e = str;
        this.f360331f = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new q71.c(this.f360330e, this.f360331f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((q71.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f360329d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.n7 n7Var = new r45.n7();
            n7Var.f381114d = this.f360330e;
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70667d = 6663;
            lVar.f70666c = "/cgi-bin/micromsg-bin/analysercptinfo";
            lVar.f70664a = n7Var;
            lVar.f70665b = new r45.o7();
            com.tencent.mm.modelbase.o a17 = lVar.a();
            com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
            iVar.p(a17);
            this.f360329d = 1;
            obj = rm0.h.b(iVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (i17 == 3) {
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        boolean b17 = fVar.b();
        yz5.l lVar2 = this.f360331f;
        if (!b17) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            q71.a aVar2 = new q71.a(fVar, lVar2, null);
            this.f360329d = 2;
            return kotlinx.coroutines.l.g(g3Var, aVar2, this) == aVar ? aVar : f0Var;
        }
        r45.o7 o7Var = (r45.o7) fVar.f70618d;
        kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var2 = kotlinx.coroutines.internal.b0.f310484a;
        q71.b bVar = new q71.b(lVar2, o7Var, null);
        this.f360329d = 3;
        return kotlinx.coroutines.l.g(g3Var2, bVar, this) == aVar ? aVar : f0Var;
    }
}
