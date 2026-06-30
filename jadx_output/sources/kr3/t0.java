package kr3;

/* loaded from: classes8.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kr3.q1 f311487d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(kr3.q1 q1Var) {
        super(0);
        this.f311487d = q1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.contact.p pVar = (com.tencent.mm.contact.p) i95.n0.c(com.tencent.mm.contact.p.class);
        kr3.q1 q1Var = this.f311487d;
        return ((yq3.e) pVar).wi((java.lang.String) ((jz5.n) q1Var.f311452f).getValue(), q1Var.getIntent());
    }
}
