package g16;

/* loaded from: classes15.dex */
public final class b extends g16.c implements g16.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g16.d f267592d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g16.d dVar, g16.u0 signature) {
        super(dVar, signature);
        kotlin.jvm.internal.o.g(signature, "signature");
        this.f267592d = dVar;
    }

    public g16.m0 c(int i17, n16.b classId, o06.x1 source) {
        kotlin.jvm.internal.o.g(classId, "classId");
        kotlin.jvm.internal.o.g(source, "source");
        g16.u0 signature = this.f267596a;
        kotlin.jvm.internal.o.g(signature, "signature");
        g16.u0 u0Var = new g16.u0(signature.f267667a + '@' + i17, null);
        g16.d dVar = this.f267592d;
        java.util.List list = (java.util.List) dVar.f267602b.get(u0Var);
        if (list == null) {
            list = new java.util.ArrayList();
            dVar.f267602b.put(u0Var, list);
        }
        return dVar.f267601a.r(classId, source, list);
    }
}
