package dk2;

/* loaded from: classes.dex */
public final class m2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ek2.l0 f233747a;

    public m2(ek2.l0 l0Var) {
        this.f233747a = l0Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        java.lang.String str = fVar.f70617c;
        com.tencent.mm.protobuf.f resp = fVar.f70618d;
        kotlin.jvm.internal.o.f(resp, "resp");
        this.f233747a.a(i17, i18, str, (r45.gm1) resp);
        return jz5.f0.f302826a;
    }
}
