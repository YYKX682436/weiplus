package mn2;

/* loaded from: classes10.dex */
public final class n2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn2.g3 f330073d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(mn2.g3 g3Var) {
        super(0);
        this.f330073d = g3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yo0.f fVar = new yo0.f();
        fVar.f464078b = true;
        fVar.f464077a = true;
        mn2.g3 g3Var = this.f330073d;
        fVar.f464082f = ((java.lang.Number) ((jz5.n) g3Var.f329983l1).getValue()).intValue();
        fVar.f464081e = ((java.lang.Number) ((jz5.n) g3Var.f330000y0).getValue()).intValue();
        return fVar.a();
    }
}
