package dk2;

/* loaded from: classes3.dex */
public final class b3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f233232d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(dk2.r4 r4Var) {
        super(1);
        this.f233232d = r4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jz5.l pair = (jz5.l) obj;
        kotlin.jvm.internal.o.g(pair, "pair");
        dk2.r4 r4Var = this.f233232d;
        pm0.v.M(r4Var.f234009d, false, new dk2.a3(r4Var, pair), 2, null);
        return jz5.f0.f302826a;
    }
}
