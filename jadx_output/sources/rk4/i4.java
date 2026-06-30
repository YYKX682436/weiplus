package rk4;

/* loaded from: classes2.dex */
public final class i4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f396717a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f396718b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396719c;

    public i4(kotlin.jvm.internal.c0 c0Var, kotlinx.coroutines.q qVar, java.lang.String str) {
        this.f396717a = c0Var;
        this.f396718b = qVar;
        this.f396719c = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        kotlin.jvm.internal.c0 c0Var = this.f396717a;
        if (!c0Var.f310112d) {
            c0Var.f310112d = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.TingCoroutineCGIService", "fetchTingItem callback errType: " + fVar.f70615a + ", errCode: " + fVar.f70616b);
            int i17 = fVar.f70615a;
            kotlinx.coroutines.q qVar = this.f396718b;
            if (i17 == 0 && fVar.f70616b == 0) {
                try {
                    bw5.z70 parseFrom = new bw5.z70().parseFrom(((qk.t9) fVar.f70618d).f364338d);
                    java.lang.String str = this.f396719c;
                    if (parseFrom.f35849d.size() > 0) {
                        bw5.y70 y70Var = (bw5.y70) parseFrom.f35849d.get(0);
                        bw5.v70 v70Var = y70Var.f35395g[2] ? y70Var.f35393e : new bw5.v70();
                        com.tencent.mars.xlog.Log.i("MicroMsg.TingCoroutineCGIService", "fetchTingItem callback type: " + v70Var.f34189e + ", name: " + v70Var.getTitle());
                        bw5.lp0 lp0Var = new bw5.lp0();
                        lp0Var.j(v70Var);
                        lp0Var.g(str + '_' + lp0Var.d().getListenId());
                        ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(lp0Var));
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.TingCoroutineCGIService", "fetchTingItem failed itemsCount == 0");
                        ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(null));
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TingCoroutineCGIService", th6, "fetchTingItem callback exception", new java.lang.Object[0]);
                    ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(null));
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.TingCoroutineCGIService", "getCategoryItem failed");
                ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(null));
            }
        }
        return jz5.f0.f302826a;
    }
}
