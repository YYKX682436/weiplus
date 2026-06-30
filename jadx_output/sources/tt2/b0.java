package tt2;

/* loaded from: classes3.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f421836d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(tt2.e1 e1Var) {
        super(0);
        this.f421836d = e1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        tt2.e1 e1Var = this.f421836d;
        e1Var.notifyDataSetChanged();
        pm0.v.V(1000L, new tt2.a0(e1Var));
        return jz5.f0.f302826a;
    }
}
