package tc2;

/* loaded from: classes2.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc2.b f417136d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(tc2.b bVar) {
        super(0);
        this.f417136d = bVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        tc2.b bVar = this.f417136d;
        java.util.Iterator it = new java.util.HashSet(bVar.f417140d.keySet()).iterator();
        while (it.hasNext()) {
            in5.s0 s0Var = (in5.s0) it.next();
            kotlin.jvm.internal.o.d(s0Var);
            bVar.b(s0Var);
        }
        bVar.f417140d.clear();
        return jz5.f0.f302826a;
    }
}
