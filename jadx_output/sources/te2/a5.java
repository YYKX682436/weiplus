package te2;

/* loaded from: classes.dex */
public final class a5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f417876a;

    public a5(kotlin.coroutines.Continuation continuation) {
        this.f417876a = continuation;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        boolean e17 = xg2.g.e(fVar);
        kotlin.coroutines.Continuation continuation = this.f417876a;
        if (e17) {
            java.util.Iterator it = ((r45.m02) fVar.f70618d).getList(1).iterator();
            while (true) {
                if (!it.hasNext()) {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
                    break;
                }
                r45.ix0 ix0Var = (r45.ix0) it.next();
                if (ix0Var.getInteger(0) == 14) {
                    if (ix0Var.getInteger(1) == 0) {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
                    } else {
                        kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                        continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
                    }
                }
            }
        } else {
            kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
        }
        return jz5.f0.f302826a;
    }
}
