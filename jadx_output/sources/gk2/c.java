package gk2;

/* loaded from: classes3.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk2.e f272469d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(gk2.e eVar) {
        super(0);
        this.f272469d = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gk2.e eVar = this.f272469d;
        if (eVar.f272474h.f11605c == androidx.lifecycle.n.DESTROYED) {
            eVar.f272474h = new androidx.lifecycle.b0(eVar, true);
            eVar.f272475i = new yg2.b(eVar, "liveScope");
        }
        eVar.f272474h.i(androidx.lifecycle.n.RESUMED);
        return jz5.f0.f302826a;
    }
}
