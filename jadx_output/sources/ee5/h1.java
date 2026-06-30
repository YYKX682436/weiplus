package ee5;

/* loaded from: classes9.dex */
public final class h1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f251915d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f251916e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ee5.i1 f251917f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f251918g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(ee5.i1 i1Var, java.util.ArrayList arrayList, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f251917f = i1Var;
        this.f251918g = arrayList;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ee5.h1 h1Var = new ee5.h1(this.f251917f, this.f251918g, continuation);
        h1Var.f251916e = obj;
        return h1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ee5.h1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.Iterator it;
        long j17;
        java.lang.String s17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f251915d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f251916e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemLocationUIC", "Shop&Product SearchJob start >> " + java.lang.Thread.currentThread().getName());
            ee5.i1 i1Var = this.f251917f;
            com.tencent.mm.storage.a3 z07 = com.tencent.mm.storage.z3.R4(i1Var.f252056o) ? ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(i1Var.f252056o) : null;
            java.util.Iterator it6 = this.f251918g.iterator();
            long j18 = 0;
            while (it6.hasNext()) {
                com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) it6.next();
                if (!kotlinx.coroutines.z0.h(y0Var)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemLocationUIC", "is no active");
                    return f0Var;
                }
                java.lang.String j19 = f9Var.j();
                if (j19 != null) {
                    o15.b bVar = new o15.b();
                    bVar.fromXml(j19);
                    it = it6;
                    long a17 = com.tencent.mm.ui.gridviewheaders.a.e().a(new java.util.Date(f9Var.getCreateTime()));
                    if (j18 != a17) {
                        j17 = a17;
                        arrayList.add(new ae5.b(f9Var.getCreateTime()));
                    } else {
                        j17 = a17;
                    }
                    boolean R4 = com.tencent.mm.storage.z3.R4(i1Var.f252056o);
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
                    o15.a j27 = bVar.j();
                    if (j27 != null) {
                        ae5.e eVar = new ae5.e(f9Var.getCreateTime(), 48, j27.s(), f9Var.getMsgId(), n17 != null ? n17.d1() : null, n17 != null ? n17.f2() : null, n17 != null ? n17.w0() : null, str2, f9Var.Q0());
                        eVar.f4393k = com.tencent.mm.R.drawable.f481475bi4;
                        eVar.f4399c = j27.s();
                        eVar.f4392j = j27.l();
                        arrayList.add(eVar);
                        j18 = j17;
                    }
                } else {
                    it = it6;
                }
                it6 = it;
            }
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            ee5.g1 g1Var = new ee5.g1(i1Var, arrayList, null);
            this.f251915d = 1;
            if (kotlinx.coroutines.l.g(g3Var, g1Var, this) == aVar) {
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
