package e22;

/* loaded from: classes14.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f246629d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e22.d1 f246630e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(e22.d1 d1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f246630e = d1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new e22.c1(this.f246630e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((e22.c1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f246629d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            e22.g gVar = new e22.g(0, null, null, 0, 0, 28, null);
            this.f246629d = 1;
            obj = rm0.h.b(gVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        boolean b17 = fVar.b();
        e22.d1 d1Var = this.f246630e;
        if (b17) {
            d1Var.f246634e = ((r45.nw0) fVar.f70618d).getByteString(1);
            d1Var.f246637h.clear();
            x0.i0 i0Var = d1Var.f246637h;
            java.util.LinkedList list = ((r45.nw0) fVar.f70618d).getList(3);
            kotlin.jvm.internal.o.f(list, "getObject(...)");
            i0Var.addAll(e22.d1.N6(d1Var, list));
            ((n0.q4) d1Var.f246635f).setValue(java.lang.Boolean.valueOf(((r45.nw0) fVar.f70618d).getInteger(2) == 0));
            ot5.g.c("MicroMsg.FindersFeedViewModel", "refresh, isEnded: " + d1Var.f246635f);
        } else {
            ((n0.q4) d1Var.f246638i).setValue(java.lang.Boolean.TRUE);
        }
        ((n0.q4) d1Var.f246636g).setValue(java.lang.Boolean.FALSE);
        return jz5.f0.f302826a;
    }
}
