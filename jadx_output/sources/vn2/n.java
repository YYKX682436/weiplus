package vn2;

/* loaded from: classes2.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f438332d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f438333e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.ev f438334f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bw5.c40 f438335g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vn2.p f438336h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f438337i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.p f438338m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(bw5.ev evVar, bw5.c40 c40Var, vn2.p pVar, yz5.l lVar, yz5.p pVar2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f438334f = evVar;
        this.f438335g = c40Var;
        this.f438336h = pVar;
        this.f438337i = lVar;
        this.f438338m = pVar2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        vn2.n nVar = new vn2.n(this.f438334f, this.f438335g, this.f438336h, this.f438337i, this.f438338m, continuation);
        nVar.f438333e = obj;
        return nVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vn2.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar;
        com.tencent.mm.protobuf.g gVar;
        r45.hn6 hn6Var;
        java.lang.Object k17;
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f438332d;
        vn2.p pVar = this.f438336h;
        bw5.ev evVar = this.f438334f;
        bw5.ju juVar = null;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f438333e;
            if (evVar != null) {
                r45.vs2 vs2Var = new r45.vs2();
                vs2Var.parseFrom(evVar.toByteArray());
                com.tencent.mm.plugin.finder.extension.reddot.jb jbVar3 = new com.tencent.mm.plugin.finder.extension.reddot.jb();
                jbVar3.t0(vs2Var);
                jbVar = jbVar3;
            } else {
                jbVar = null;
            }
            bw5.c40 c40Var = this.f438335g;
            if (c40Var == null || c40Var.f25917f != 1) {
                gVar = null;
                hn6Var = null;
            } else {
                com.tencent.mm.protobuf.g gVar2 = c40Var.f25923o[4] ? c40Var.f25918g : com.tencent.mm.protobuf.g.f192155b;
                bw5.d40 d40Var = new bw5.d40();
                d40Var.parseFrom(gVar2.g());
                boolean[] zArr = d40Var.f26311f;
                bw5.wy wyVar = zArr[1] ? d40Var.f26309d : new bw5.wy();
                com.tencent.mm.protobuf.g gVar3 = wyVar.f34877n[3] ? wyVar.f34871e : com.tencent.mm.protobuf.g.f192155b;
                if (!(zArr[2] ? d40Var.f26310e : new bw5.wy()).f34877n[3]) {
                    com.tencent.mm.protobuf.g gVar4 = com.tencent.mm.protobuf.g.f192155b;
                }
                r45.hn6 a17 = vn2.p.a(pVar, zArr[1] ? d40Var.f26309d : new bw5.wy(), 23);
                vn2.p.a(pVar, zArr[2] ? d40Var.f26310e : new bw5.wy(), 24);
                gVar = gVar3;
                hn6Var = a17;
            }
            vn2.k kVar = vn2.l.f438315a;
            kotlinx.coroutines.f1 b17 = kotlinx.coroutines.l.b(y0Var, kotlinx.coroutines.q1.f310570c, null, new vn2.m(kVar.c(jbVar, null, gVar, 23, kVar.a(9), hn6Var), null), 2, null);
            this.f438333e = jbVar;
            this.f438332d = 1;
            k17 = ((kotlinx.coroutines.g1) b17).k(this);
            if (k17 == aVar) {
                return aVar;
            }
            jbVar2 = jbVar;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jbVar2 = (com.tencent.mm.plugin.finder.extension.reddot.jb) this.f438333e;
            kotlin.ResultKt.throwOnFailure(obj);
            k17 = obj;
        }
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.c cVar = (com.tencent.mm.plugin.finder.megavideo.topstory.flow.c) k17;
        if (cVar.getErrType() == 0 && cVar.getErrCode() == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mainFlowResp: ");
            r45.m03 m03Var = cVar.f120906b;
            sb6.append(m03Var.getList(1).size());
            com.tencent.mars.xlog.Log.i("MicroMsg.LongVideoMainFeedsDataFetchModel", sb6.toString());
            r45.pq2 pq2Var = (r45.pq2) m03Var.getCustom(7);
            bw5.c40 c40Var2 = new bw5.c40();
            bw5.d40 d40Var2 = new bw5.d40();
            d40Var2.f26309d = new bw5.wy().parseFrom(m03Var.toByteArray());
            d40Var2.f26311f[1] = true;
            c40Var2.f25918g = hc2.b.a(d40Var2);
            boolean[] zArr2 = c40Var2.f25923o;
            zArr2[4] = true;
            c40Var2.f25917f = 1;
            zArr2[3] = true;
            c40Var2.f25916e = evVar;
            zArr2[2] = true;
            int i18 = vn2.p.f438345e;
            pVar.getClass();
            boolean z17 = false;
            if (pq2Var != null && pq2Var.getInteger(0) > 0 && pq2Var.getInteger(1) > 0) {
                z17 = true;
            }
            if (z17) {
                bw5.ju juVar2 = new bw5.ju();
                kotlin.jvm.internal.o.d(pq2Var);
                juVar = juVar2.parseFrom(pq2Var.toByteArray());
            }
            c40Var2.f25919h = juVar;
            zArr2[5] = true;
            com.tencent.mm.plugin.finder.extension.reddot.h3.f105549a.d("preloadLongVideoImpl", jbVar2);
            this.f438337i.invoke(c40Var2);
        } else {
            this.f438338m.invoke(new java.lang.Integer(-1), "");
        }
        return jz5.f0.f302826a;
    }
}
