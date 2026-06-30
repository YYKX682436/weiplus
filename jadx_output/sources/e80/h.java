package e80;

/* loaded from: classes12.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r70.c f250020d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r70.c cVar) {
        super(0);
        this.f250020d = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r70.c cVar = this.f250020d;
        cVar.f393074a.getClass();
        java.util.Iterator it = ((java.util.HashSet) ((jz5.n) ((v70.w) i95.n0.c(v70.w.class)).f433625m).getValue()).iterator();
        while (it.hasNext()) {
            ((r70.b) it.next()).K3(cVar);
        }
        return jz5.f0.f302826a;
    }
}
