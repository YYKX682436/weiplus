package rv0;

/* loaded from: classes5.dex */
public final class b2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ex0.r f399933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.d f399934e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(ex0.r rVar, rv0.d dVar) {
        super(0);
        this.f399933d = rVar;
        this.f399934e = dVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ex0.r rVar = this.f399933d;
        ex0.o oVar = rVar instanceof ex0.o ? (ex0.o) rVar : null;
        if (oVar != null) {
            float C = oVar.C() * 100;
            if (C < 0.0f) {
                C = 0.0f;
            }
            if (C > 100.0f) {
                C = 100.0f;
            }
            this.f399934e.setVolume(C);
        }
        return jz5.f0.f302826a;
    }
}
