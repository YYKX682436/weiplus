package x70;

/* loaded from: classes12.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l70.b f452414d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l70.b bVar) {
        super(0);
        this.f452414d = bVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        l70.b bVar = this.f452414d;
        l70.a aVar = bVar.f316794a.f316812m;
        if (aVar != null) {
            aVar.a(bVar);
        }
        bVar.f316794a.getClass();
        java.util.Iterator it = kz5.n0.S0((java.util.HashSet) ((jz5.n) ((v70.w) i95.n0.c(v70.w.class)).f433628p).getValue()).iterator();
        while (it.hasNext()) {
            ((l70.a) it.next()).a(bVar);
        }
        java.util.Iterator it6 = kz5.n0.S0((java.util.HashSet) ((jz5.n) ((v70.w) i95.n0.c(v70.w.class)).f433629q).getValue()).iterator();
        while (it6.hasNext()) {
            l70.a aVar2 = (l70.a) ((java.lang.ref.WeakReference) it6.next()).get();
            if (aVar2 != null) {
                aVar2.a(bVar);
            }
        }
        return jz5.f0.f302826a;
    }
}
