package x06;

/* loaded from: classes16.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x06.n0 f451276d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(x06.n0 n0Var) {
        super(0);
        this.f451276d = n0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.List b17 = kz5.b0.b();
        x06.n0 n0Var = this.f451276d;
        lz5.e eVar = (lz5.e) b17;
        eVar.add(n0Var.f451278a.f451334d);
        x06.w0 w0Var = n0Var.f451279b;
        if (w0Var != null) {
            eVar.add("under-migration:" + w0Var.f451334d);
        }
        for (java.util.Map.Entry entry : n0Var.f451280c.entrySet()) {
            eVar.add("@" + entry.getKey() + ':' + ((x06.w0) entry.getValue()).f451334d);
        }
        return (java.lang.String[]) ((lz5.e) kz5.b0.a(b17)).toArray(new java.lang.String[0]);
    }
}
