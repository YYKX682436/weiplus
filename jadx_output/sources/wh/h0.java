package wh;

/* loaded from: classes12.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wh.a0 f445795d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(wh.a0 a0Var) {
        super(1);
        this.f445795d = a0Var;
    }

    public final void a(wh.z node) {
        kotlin.jvm.internal.o.g(node, "node");
        wh.d0 d0Var = node.f445904c;
        boolean z17 = d0Var instanceof wh.b0;
        wh.a0 a0Var = this.f445795d;
        if (z17) {
            a0Var.a("at " + d0Var);
        } else {
            a0Var.a("#00 " + d0Var);
        }
        wh.z zVar = node.f445905d;
        if (zVar != null) {
            a(zVar);
        }
    }

    @Override // yz5.l
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        a((wh.z) obj);
        return jz5.f0.f302826a;
    }
}
