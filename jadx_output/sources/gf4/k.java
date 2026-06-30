package gf4;

/* loaded from: classes4.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f271353d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(kotlin.jvm.internal.h0 h0Var) {
        super(0);
        this.f271353d = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Iterator it = gf4.l.f271363p.iterator();
        while (it.hasNext()) {
            yz5.r rVar = (yz5.r) it.next();
            kotlin.jvm.internal.h0 h0Var = this.f271353d;
            java.lang.Long valueOf = java.lang.Long.valueOf(((nf4.b) h0Var.f310123d).field_storyId);
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            nf4.b bVar = (nf4.b) h0Var.f310123d;
            rVar.C(valueOf, bool, bVar.f336840x, bVar.f336841y);
        }
        return jz5.f0.f302826a;
    }
}
