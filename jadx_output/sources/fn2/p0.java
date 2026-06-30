package fn2;

/* loaded from: classes5.dex */
public final class p0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f264347d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f264348e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sf2.d3 f264349f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fn2.s0 f264350g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(sf2.d3 d3Var, fn2.s0 s0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f264349f = d3Var;
        this.f264350g = s0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        fn2.p0 p0Var = new fn2.p0(this.f264349f, this.f264350g, continuation);
        p0Var.f264348e = obj;
        return p0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fn2.p0) create((com.tencent.mm.protobuf.g) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f264347d;
        fn2.s0 s0Var = this.f264350g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.protobuf.g gVar = (com.tencent.mm.protobuf.g) this.f264348e;
            java.lang.Integer num = new java.lang.Integer(s0Var.f264396r.f377156d);
            r45.ch6 ch6Var = s0Var.f264394p;
            java.lang.Integer num2 = ch6Var != null ? new java.lang.Integer(ch6Var.f371555d) : null;
            this.f264347d = 1;
            obj = this.f264349f.m7(num, num2, gVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        r45.zw1 zw1Var = (r45.zw1) obj;
        bm2.o6 o6Var = s0Var.f264388g;
        if (o6Var == null) {
            kotlin.jvm.internal.o.o("rvAdapter");
            throw null;
        }
        java.util.List list = zw1Var != null ? zw1Var.f392415d : null;
        java.util.List list2 = kz5.p0.f313996d;
        if (list == null) {
            list = list2;
        }
        java.util.LinkedList linkedList = zw1Var != null ? zw1Var.f392419h : null;
        if (linkedList != null) {
            list2 = linkedList;
        }
        o6Var.E(list, list2, "");
        com.tencent.mm.plugin.finder.live.widget.dv dvVar = s0Var.f264391m;
        if (dvVar != null) {
            dvVar.d();
        }
        return new jz5.l(zw1Var != null ? zw1Var.f392416e : null, new java.lang.Integer(zw1Var != null ? zw1Var.f392417f : 0));
    }
}
