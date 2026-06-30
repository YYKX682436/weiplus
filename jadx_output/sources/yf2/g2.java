package yf2;

/* loaded from: classes3.dex */
public final class g2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf2.i2 f461701d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f461702e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(yf2.i2 i2Var, int i17) {
        super(1);
        this.f461701d = i2Var;
        this.f461702e = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.live.widget.id editResult = (com.tencent.mm.plugin.finder.live.widget.id) obj;
        kotlin.jvm.internal.o.g(editResult, "editResult");
        yf2.i2 i2Var = this.f461701d;
        java.lang.String anchorFinderUsername = xy2.c.e(i2Var.O6());
        java.lang.String title = editResult.f118668b;
        kotlin.jvm.internal.o.g(title, "title");
        java.lang.String desc = editResult.f118669c;
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(anchorFinderUsername, "anchorFinderUsername");
        r45.hx0 hx0Var = new r45.hx0();
        hx0Var.set(0, 19);
        r45.in1 in1Var = new r45.in1();
        in1Var.set(0, title);
        in1Var.set(1, anchorFinderUsername);
        in1Var.set(2, desc);
        hx0Var.set(1, com.tencent.mm.protobuf.g.b(in1Var.toByteArray()));
        ek2.r1 r1Var = new ek2.r1(0L, 0L, 9, hx0Var);
        az2.j.u(r1Var, i2Var.O6(), null, 0L, 6, null);
        r1Var.l().h(new yf2.f2(i2Var, editResult, this.f461702e));
        return jz5.f0.f302826a;
    }
}
