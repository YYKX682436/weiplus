package ee5;

/* loaded from: classes9.dex */
public final class u0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f252060d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f252061e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ee5.v0 f252062f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f252063g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(ee5.v0 v0Var, java.util.ArrayList arrayList, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f252062f = v0Var;
        this.f252063g = arrayList;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ee5.u0 u0Var = new ee5.u0(this.f252062f, this.f252063g, continuation);
        u0Var.f252061e = obj;
        return u0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ee5.u0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.Iterator it;
        ot0.q v17;
        long j17;
        java.lang.String s17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f252060d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f252061e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemFileUIC", "fileSearchJob start >> " + java.lang.Thread.currentThread().getName());
            ee5.v0 v0Var = this.f252062f;
            com.tencent.mm.storage.a3 z07 = com.tencent.mm.storage.z3.R4(v0Var.f252056o) ? ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(v0Var.f252056o) : null;
            java.util.Iterator it6 = this.f252063g.iterator();
            long j18 = 0;
            while (it6.hasNext()) {
                com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) it6.next();
                if (!kotlinx.coroutines.z0.h(y0Var)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemFileUIC", "is no active");
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
                    boolean R4 = com.tencent.mm.storage.z3.R4(v0Var.f252056o);
                    java.lang.String str = "";
                    if (f9Var.A0() == 1) {
                        s17 = c01.z1.r();
                    } else {
                        s17 = R4 ? c01.w9.s(f9Var.j()) : "";
                        if (com.tencent.mm.sdk.platformtools.t8.K0(s17)) {
                            s17 = f9Var.Q0();
                        }
                    }
                    com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(s17, true);
                    if (z07 != null) {
                        if (!(s17 == null || s17.length() == 0)) {
                            str = z07.z0(s17);
                        }
                    }
                    java.lang.String str2 = str;
                    java.lang.String str3 = v17.f348690o;
                    kk.j jVar = com.tencent.mm.plugin.fav.ui.u1.f101464a;
                    int a18 = o25.y.a(str3);
                    ae5.c cVar = new ae5.c(f9Var.getCreateTime(), v17.f348666i, v17.n(), f9Var.getMsgId(), n17 != null ? n17.d1() : null, n17 != null ? n17.f2() : null, n17 != null ? n17.w0() : null, str2, f9Var.Q0());
                    if (te5.h.f418649a.c()) {
                        cVar.f4389l = te5.j.f418686a.a(f9Var, v17.f348690o, v0Var.getContext());
                    }
                    cVar.f4387j = a18;
                    cVar.f4388k = com.tencent.mm.sdk.platformtools.t8.f0(v17.f348682m);
                    arrayList.add(cVar);
                    j18 = j17;
                }
                it6 = it;
            }
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            ee5.t0 t0Var = new ee5.t0(v0Var, arrayList, null);
            this.f252060d = 1;
            if (kotlinx.coroutines.l.g(g3Var, t0Var, this) == aVar) {
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
