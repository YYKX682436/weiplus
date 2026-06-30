package dk2;

/* loaded from: classes3.dex */
public final class p2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f233892a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233893b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f233894c;

    public p2(yz5.l lVar, java.lang.String str, dk2.r4 r4Var) {
        this.f233892a = lVar;
        this.f233893b = str;
        this.f233894c = r4Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        jz5.f0 f0Var = jz5.f0.f302826a;
        yz5.l lVar = this.f233892a;
        if (i17 == 0 && fVar.f70616b == 0) {
            st2.g3 g3Var = st2.g3.f412326a;
            gk2.e eVar = this.f233894c.f234007b;
            com.tencent.mm.protobuf.f resp = fVar.f70618d;
            kotlin.jvm.internal.o.f(resp, "resp");
            if (g3Var.s(this.f233893b, eVar, (r45.dv1) resp)) {
                if (lVar != null) {
                    lVar.invoke(java.lang.Boolean.TRUE);
                    return f0Var;
                }
            } else if (lVar != null) {
                lVar.invoke(java.lang.Boolean.FALSE);
                return f0Var;
            }
        } else if (lVar != null) {
            lVar.invoke(java.lang.Boolean.FALSE);
            return f0Var;
        }
        return null;
    }
}
