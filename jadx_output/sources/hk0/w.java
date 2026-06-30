package hk0;

/* loaded from: classes10.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hk0.y f281834d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(hk0.y yVar, xk0.d dVar) {
        super(0);
        this.f281834d = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        hk0.f fVar = this.f281834d.f281844d;
        if (fVar != null) {
            dl.u uVar = ((dl.u$$a) fVar).f235143a;
            if (uVar.l() != null) {
                uVar.l().Y6();
            }
            uVar.E(true);
            uVar.r();
        }
        return jz5.f0.f302826a;
    }
}
