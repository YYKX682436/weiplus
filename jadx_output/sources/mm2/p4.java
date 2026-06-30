package mm2;

/* loaded from: classes.dex */
public final class p4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f329346a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f329347b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f329348c;

    public p4(kotlin.coroutines.Continuation continuation, java.lang.Class cls, java.lang.String str) {
        this.f329346a = continuation;
        this.f329347b = cls;
        this.f329348c = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        jz5.f0 f0Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        boolean e17 = xg2.g.e(fVar);
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        kotlin.coroutines.Continuation continuation = this.f329346a;
        if (e17) {
            java.util.LinkedList list = ((r45.fs1) fVar.f70618d).getList(1);
            kotlin.jvm.internal.o.f(list, "getGet_resp_list(...)");
            r45.mn3 mn3Var = (r45.mn3) kz5.n0.Z(list);
            if (mn3Var != null) {
                java.lang.Class cls = this.f329347b;
                com.tencent.mm.protobuf.f fVar2 = (com.tencent.mm.protobuf.f) cls.getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                com.tencent.mm.protobuf.g byteString = mn3Var.getByteString(2);
                byte[] g17 = byteString != null ? byteString.g() : null;
                if (g17 != null) {
                    try {
                        fVar2.parseFrom(g17);
                    } catch (java.lang.Exception e18) {
                        com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e18);
                    }
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("queryLotteryClaimInfo result(");
                sb6.append(cls.getCanonicalName());
                sb6.append(") = ");
                kotlin.jvm.internal.o.d(fVar2);
                sb6.append(pm0.b0.b(fVar2));
                com.tencent.mars.xlog.Log.i(this.f329348c, sb6.toString());
                continuation.resumeWith(kotlin.Result.m521constructorimpl(fVar2));
                f0Var = f0Var2;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                continuation.resumeWith(kotlin.Result.m521constructorimpl(null));
            }
        } else {
            continuation.resumeWith(kotlin.Result.m521constructorimpl(null));
        }
        return f0Var2;
    }
}
