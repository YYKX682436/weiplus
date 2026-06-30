package fn2;

/* loaded from: classes10.dex */
public final class w0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f264427d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f264428e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f264429f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fn2.q1 f264430g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fn2.h1 f264431h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(int i17, fn2.q1 q1Var, fn2.h1 h1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f264429f = i17;
        this.f264430g = q1Var;
        this.f264431h = h1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        fn2.w0 w0Var = new fn2.w0(this.f264429f, this.f264430g, this.f264431h, continuation);
        w0Var.f264428e = obj;
        return w0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fn2.w0) create((com.tencent.mm.protobuf.g) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object b17;
        java.lang.Object d17;
        r45.kx1 kx1Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f264427d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.protobuf.g gVar = (com.tencent.mm.protobuf.g) this.f264428e;
            int i18 = this.f264429f;
            if (i18 == 1) {
                fn2.q1 q1Var = this.f264430g;
                java.lang.Integer num = new java.lang.Integer(0);
                this.f264427d = 1;
                b17 = fn2.q1.b(q1Var, gVar, false, num, this, 2, null);
                if (b17 == aVar) {
                    return aVar;
                }
                kx1Var = (r45.kx1) b17;
            } else if (i18 != 2) {
                kx1Var = null;
            } else {
                fn2.q1 q1Var2 = this.f264430g;
                java.lang.Integer num2 = new java.lang.Integer(0);
                this.f264427d = 2;
                d17 = fn2.q1.d(q1Var2, gVar, false, num2, this, 2, null);
                if (d17 == aVar) {
                    return aVar;
                }
                kx1Var = (r45.kx1) d17;
            }
        } else if (i17 == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            b17 = obj;
            kx1Var = (r45.kx1) b17;
        } else {
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            d17 = obj;
            kx1Var = (r45.kx1) d17;
        }
        fn2.h1 h1Var = this.f264431h;
        bm2.k7 k7Var = h1Var.f264272i;
        if (k7Var == null) {
            kotlin.jvm.internal.o.o("rvAdapter");
            throw null;
        }
        java.util.List list = kx1Var != null ? kx1Var.f379014d : null;
        if (list == null) {
            list = kz5.p0.f313996d;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) k7Var.f22045q;
        int size = arrayList.size() - 1;
        if (size < 0) {
            size = 0;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(new bm2.v6(bm2.w6.f22413f, (r45.yx1) it.next(), null, 4, null));
        }
        arrayList.addAll(size, arrayList2);
        k7Var.notifyItemRangeInserted(size, list.size());
        com.tencent.mm.plugin.finder.live.widget.dv dvVar = h1Var.f264269f;
        if (dvVar != null) {
            dvVar.d();
        }
        return new jz5.l(kx1Var != null ? kx1Var.f379015e : null, new java.lang.Integer(kx1Var != null ? kx1Var.f379016f : 0));
    }
}
