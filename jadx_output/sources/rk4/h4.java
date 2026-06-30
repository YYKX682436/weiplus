package rk4;

/* loaded from: classes2.dex */
public final class h4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f396687a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f396688b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396689c;

    public h4(kotlin.jvm.internal.c0 c0Var, kotlinx.coroutines.q qVar, java.lang.String str) {
        this.f396687a = c0Var;
        this.f396688b = qVar;
        this.f396689c = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        kotlin.jvm.internal.c0 c0Var = this.f396687a;
        if (!c0Var.f310112d) {
            c0Var.f310112d = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.TingCoroutineCGIService", "getCategoryItem callback errType: " + fVar.f70615a + ", errCode: " + fVar.f70616b);
            int i17 = fVar.f70615a;
            kotlinx.coroutines.q qVar = this.f396688b;
            if (i17 == 0 && fVar.f70616b == 0) {
                try {
                    bw5.e50 parseFrom = new bw5.e50().parseFrom(((qk.t9) fVar.f70618d).f364338d);
                    java.lang.String str = this.f396689c;
                    if (parseFrom.f26732d.size() <= 0) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.TingCoroutineCGIService", "getCategoryItem failed itemsCount == 0");
                        ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(null));
                    } else {
                        bw5.o50 o50Var = (bw5.o50) parseFrom.f26732d.get(0);
                        if (kotlin.jvm.internal.o.b(o50Var.c(), str)) {
                            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(o50Var));
                        } else {
                            com.tencent.mars.xlog.Log.e("MicroMsg.TingCoroutineCGIService", "getCategoryItem categoryId not equal");
                            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(null));
                        }
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TingCoroutineCGIService", th6, "getCategoryItem callback exception", new java.lang.Object[0]);
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
