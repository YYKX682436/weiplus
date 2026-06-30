package w41;

/* loaded from: classes15.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w41.j f442856d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(w41.j jVar) {
        super(0);
        this.f442856d = jVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        w41.j jVar = this.f442856d;
        ah5.a aVar = jVar.f442861g;
        if (aVar != null) {
            aVar.b(0, jVar.f442866o);
        }
        if (aVar == null) {
            return null;
        }
        aVar.d();
        return jz5.f0.f302826a;
    }
}
