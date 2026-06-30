package u1;

/* loaded from: classes14.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final u1.b f423547d = new u1.b();

    public b() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        u1.g gVar = (u1.g) obj;
        p2.s it = (p2.s) obj2;
        kotlin.jvm.internal.o.g(gVar, "$this$null");
        kotlin.jvm.internal.o.g(it, "it");
        u1.w wVar = (u1.w) gVar;
        if (wVar.f423700x != it) {
            wVar.f423700x = it;
            wVar.I(false);
            u1.w p17 = wVar.p();
            if (p17 != null) {
                p17.u();
            }
            wVar.v();
        }
        return jz5.f0.f302826a;
    }
}
