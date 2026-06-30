package dm3;

/* loaded from: classes2.dex */
public final class z implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm3.e0 f241751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f241752e;

    public z(dm3.e0 e0Var, yz5.l lVar) {
        this.f241751d = e0Var;
        this.f241752e = lVar;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o rr6, com.tencent.mm.modelbase.m1 m1Var) {
        kotlin.jvm.internal.o.g(rr6, "rr");
        com.tencent.mm.modelbase.n nVar = rr6.f70711b;
        kotlin.jvm.internal.o.g(m1Var, "<anonymous parameter 4>");
        dm3.e0 e0Var = this.f241751d;
        com.tencent.mars.xlog.Log.i(e0Var.o(), "getMMListenItem callback " + i17 + ", " + i18);
        e0Var.f241682n = false;
        if (i17 == 0 && i18 == 0) {
            try {
                if (!(nVar.f70700a instanceof qk.t9)) {
                    return 0;
                }
                bw5.o70 o70Var = new bw5.o70();
                com.tencent.mm.protobuf.f fVar = nVar.f70700a;
                kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.api.ResponseProtoBufDelegate");
                bw5.o70 parseFrom = o70Var.parseFrom(((qk.t9) fVar).f364338d);
                if (parseFrom.f31007d.isEmpty()) {
                    return 0;
                }
                java.util.LinkedList linkedList = parseFrom.f31007d;
                kotlin.jvm.internal.o.f(linkedList, "getItems(...)");
                bw5.n70 n70Var = (bw5.n70) kz5.n0.X(linkedList);
                if (e0Var.f241692x && n70Var != null) {
                    this.f241752e.invoke(n70Var.f30536i[3] ? n70Var.f30532e : "");
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e(e0Var.o(), "callback ex " + e17.getMessage());
            }
        }
        return 0;
    }
}
