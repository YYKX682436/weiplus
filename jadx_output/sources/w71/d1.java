package w71;

/* loaded from: classes11.dex */
public final class d1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w71.e1 f443395a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f443396b;

    public d1(w71.e1 e1Var, yz5.l lVar) {
        this.f443395a = e1Var;
        this.f443396b = lVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        bw5.a0 a0Var = new bw5.a0();
        a0Var.c(this.f443395a.f443398m);
        a0Var.b(fVar.f70616b);
        a0Var.f24952d = fVar.f70615a;
        boolean[] zArr = a0Var.f24957i;
        zArr[1] = true;
        a0Var.f24955g = com.tencent.mm.protobuf.g.b(((r45.js5) fVar.f70618d).toByteArray());
        zArr[4] = true;
        this.f443396b.invoke(a0Var);
        return jz5.f0.f302826a;
    }
}
