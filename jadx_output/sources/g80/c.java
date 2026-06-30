package g80;

/* loaded from: classes12.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s70.e f269413d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(s70.e eVar) {
        super(0);
        this.f269413d = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        s70.b bVar;
        s70.e eVar = this.f269413d;
        java.lang.ref.WeakReference weakReference = eVar.f403933a.f403954k;
        if (weakReference != null && (bVar = (s70.b) weakReference.get()) != null) {
            ((e80.l) bVar).a(eVar);
        }
        java.util.Iterator it = ((java.util.HashSet) ((jz5.n) ((v70.w) i95.n0.c(v70.w.class)).f433626n).getValue()).iterator();
        while (it.hasNext()) {
            ((e80.l) ((s70.b) it.next())).a(eVar);
        }
        return jz5.f0.f302826a;
    }
}
