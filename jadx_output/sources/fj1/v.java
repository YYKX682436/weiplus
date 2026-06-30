package fj1;

/* loaded from: classes7.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fj1.y f263140d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(fj1.y yVar) {
        super(0);
        this.f263140d = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ej1.g gVar = this.f263140d.f253278a;
        ej1.g gVar2 = ej1.g.DESTROYED;
        if (gVar.compareTo(gVar2) < 0) {
            fj1.y.a(this.f263140d, ej1.g.PAUSED);
            fj1.y.a(this.f263140d, gVar2);
        }
        return jz5.f0.f302826a;
    }
}
