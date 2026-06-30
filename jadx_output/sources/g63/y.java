package g63;

/* loaded from: classes8.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g63.f0 f269183d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(g63.f0 f0Var) {
        super(2);
        this.f269183d = f0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        z53.i result = (z53.i) obj2;
        kotlin.jvm.internal.o.g(result, "result");
        if (booleanValue) {
            g63.j jVar = this.f269183d.f269107b;
            jVar.getClass();
            pm0.v.X(new g63.h(jVar, result));
        }
        return jz5.f0.f302826a;
    }
}
