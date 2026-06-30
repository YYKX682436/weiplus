package g4;

/* loaded from: classes5.dex */
public final class e3 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g4.d3 f268272d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(g4.d3 d3Var) {
        super(3);
        this.f268272d = d3Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        g4.a1 type = (g4.a1) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        g4.y0 state = (g4.y0) obj3;
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(state, "state");
        ((g4.p3) this.f268272d).d(type, booleanValue, state);
        return jz5.f0.f302826a;
    }
}
