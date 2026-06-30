package fn2;

/* loaded from: classes5.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f264258d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f264259e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fn2.s f264260f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(fn2.s sVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f264260f = sVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        fn2.g gVar = new fn2.g(this.f264260f, continuation);
        gVar.f264259e = obj;
        return gVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fn2.g) create((com.tencent.mm.protobuf.g) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f264258d;
        fn2.s sVar = this.f264260f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.protobuf.g gVar = (com.tencent.mm.protobuf.g) this.f264259e;
            if (sVar.f264383v.length() == 0) {
                return new jz5.l(null, new java.lang.Integer(0));
            }
            sf2.d3 d3Var = sVar.f264370f;
            java.lang.String str = sVar.f264383v;
            this.f264258d = 1;
            obj = d3Var.t7(str, gVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        r45.ux1 ux1Var = (r45.ux1) obj;
        bm2.o6 o6Var = sVar.f264377p;
        java.util.List list = ux1Var != null ? ux1Var.f387713d : null;
        java.util.List list2 = kz5.p0.f313996d;
        if (list == null) {
            list = list2;
        }
        java.util.LinkedList linkedList = ux1Var != null ? ux1Var.f387716g : null;
        if (linkedList != null) {
            list2 = linkedList;
        }
        o6Var.E(list, list2, sVar.f264383v);
        com.tencent.mm.plugin.finder.live.widget.dv dvVar = sVar.f264380s;
        if (dvVar != null) {
            dvVar.d();
        }
        return new jz5.l(ux1Var != null ? ux1Var.f387714e : null, new java.lang.Integer(ux1Var != null ? ux1Var.f387715f : 0));
    }
}
