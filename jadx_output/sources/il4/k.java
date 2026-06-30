package il4;

/* loaded from: classes2.dex */
public final class k implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f292140d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f292141e;

    public k(kotlin.jvm.internal.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        this.f292140d = c0Var;
        this.f292141e = continuation;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o rr6, com.tencent.mm.modelbase.m1 m1Var) {
        kotlin.jvm.internal.o.g(rr6, "rr");
        kotlin.jvm.internal.o.g(m1Var, "<anonymous parameter 4>");
        com.tencent.mars.xlog.Log.i("MicroMsg.TingMusicUtils", "getCategoryItem callback " + i17 + ", " + i18);
        kotlin.jvm.internal.c0 c0Var = this.f292140d;
        if (c0Var.f310112d) {
            return 0;
        }
        c0Var.f310112d = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.TingMusicUtils", "getCategoryItem callback errType: " + i17 + ", errCode: " + i18);
        kotlin.coroutines.Continuation continuation = this.f292141e;
        if (i17 == 0 && i18 == 0) {
            try {
                com.tencent.mm.protobuf.f fVar = rr6.f70711b.f70700a;
                if (!(fVar instanceof qk.t9)) {
                    continuation.resumeWith(kotlin.Result.m521constructorimpl(null));
                    return 0;
                }
                bw5.e50 parseFrom = new bw5.e50().parseFrom(((qk.t9) fVar).f364338d);
                kotlin.jvm.internal.o.f(parseFrom.f26732d, "getItems(...)");
                if (!r6.isEmpty()) {
                    bw5.o50 o50Var = (bw5.o50) parseFrom.f26732d.get(0);
                    com.tencent.mars.xlog.Log.i("MicroMsg.TingMusicUtils", "getCategoryItem callback type: " + o50Var.f30964n + ", name: " + o50Var.getName());
                    continuation.resumeWith(kotlin.Result.m521constructorimpl(o50Var));
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.TingMusicUtils", "getCategoryItem failed itemsCount == 0");
                    continuation.resumeWith(kotlin.Result.m521constructorimpl(null));
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TingMusicUtils", th6, "getCategoryItem callback exception", new java.lang.Object[0]);
                continuation.resumeWith(kotlin.Result.m521constructorimpl(null));
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.TingMusicUtils", "getCategoryItem failed");
            continuation.resumeWith(kotlin.Result.m521constructorimpl(null));
        }
        return 0;
    }
}
