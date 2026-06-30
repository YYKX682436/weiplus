package ee5;

/* loaded from: classes9.dex */
public final class m1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f251969d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f251970e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ee5.n1 f251971f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f251972g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(ee5.n1 n1Var, java.util.ArrayList arrayList, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f251971f = n1Var;
        this.f251972g = arrayList;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ee5.m1 m1Var = new ee5.m1(this.f251971f, this.f251972g, continuation);
        m1Var.f251970e = obj;
        return m1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ee5.m1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.Iterator it;
        ot0.q v17;
        long j17;
        java.lang.String s17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f251969d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        boolean z17 = true;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f251970e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemMusicUIC", "SearchJob start >> " + java.lang.Thread.currentThread().getName());
            ee5.n1 n1Var = this.f251971f;
            com.tencent.mm.storage.a3 z07 = com.tencent.mm.storage.z3.R4(n1Var.f252056o) ? ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(n1Var.f252056o) : null;
            java.util.Iterator it6 = this.f251972g.iterator();
            long j18 = 0;
            while (it6.hasNext()) {
                com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) it6.next();
                if (!kotlinx.coroutines.z0.h(y0Var)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemMusicUIC", "is no active");
                    return f0Var;
                }
                java.lang.String j19 = f9Var.j();
                if (j19 == null || (v17 = ot0.q.v(j19)) == null) {
                    it = it6;
                } else {
                    it = it6;
                    long a17 = com.tencent.mm.ui.gridviewheaders.a.e().a(new java.util.Date(f9Var.getCreateTime()));
                    if (j18 != a17) {
                        j17 = a17;
                        arrayList.add(new ae5.b(f9Var.getCreateTime()));
                    } else {
                        j17 = a17;
                    }
                    boolean R4 = com.tencent.mm.storage.z3.R4(n1Var.f252056o);
                    java.lang.String str = "";
                    if (f9Var.A0() == z17) {
                        s17 = c01.z1.r();
                    } else {
                        s17 = R4 ? c01.w9.s(f9Var.j()) : "";
                        if (com.tencent.mm.sdk.platformtools.t8.K0(s17)) {
                            s17 = f9Var.Q0();
                        }
                    }
                    com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(s17, z17);
                    if (z07 != null) {
                        if (!((s17 == null || s17.length() == 0) ? z17 : false)) {
                            str = z07.z0(s17);
                        }
                    }
                    java.lang.String str2 = str;
                    java.lang.String str3 = v17.f348690o;
                    kk.j jVar = com.tencent.mm.plugin.fav.ui.u1.f101464a;
                    o25.y.a(str3);
                    java.lang.String v18 = o72.x1.v(n1Var.getActivity(), v17.f348722w);
                    com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(v17.f348722w, z17);
                    if (n18 == null || !kotlin.jvm.internal.o.b(n18.d1(), v17.f348722w)) {
                        ((c01.k7) c01.n8.a()).b(v17.f348722w, 14, null);
                    } else {
                        v18 = n18.g2();
                    }
                    ae5.f fVar = new ae5.f(f9Var.getCreateTime(), v17.f348666i, v17.f348654f, f9Var.getMsgId(), n17 != null ? n17.d1() : null, n17 != null ? n17.f2() : null, n17 != null ? n17.w0() : null, str2, f9Var.Q0());
                    if (com.tencent.mm.sdk.platformtools.t8.K0(v18)) {
                        v18 = v17.f348658g;
                    }
                    fVar.f4395k = v18;
                    fVar.f4394j = v17.f348646d;
                    fVar.f4396l = f9Var.z0();
                    arrayList.add(fVar);
                    j18 = j17;
                }
                it6 = it;
                z17 = true;
            }
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            ee5.l1 l1Var = new ee5.l1(n1Var, arrayList, null);
            this.f251969d = 1;
            if (kotlinx.coroutines.l.g(g3Var, l1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
