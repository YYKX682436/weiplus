package dk2;

/* loaded from: classes.dex */
public final class q1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.r f233933a;

    public q1(yz5.r rVar) {
        this.f233933a = rVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        yz5.r rVar = this.f233933a;
        if (rVar == null) {
            return null;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(fVar.f70615a);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(fVar.f70616b);
        java.lang.String str = fVar.f70617c;
        com.tencent.mm.protobuf.f resp = fVar.f70618d;
        kotlin.jvm.internal.o.f(resp, "resp");
        rVar.C(valueOf, valueOf2, str, resp);
        return jz5.f0.f302826a;
    }
}
