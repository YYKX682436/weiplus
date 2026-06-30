package sv4;

/* loaded from: classes12.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sv4.c f413392d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(sv4.c cVar) {
        super(0);
        this.f413392d = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mv4.h hVar;
        java.lang.ref.WeakReference weakReference = this.f413392d.f413393g;
        sv4.d dVar = (sv4.d) weakReference.get();
        if (dVar == null || (hVar = ((qv4.r0) dVar).f367007a) == null) {
            hVar = new mv4.h("");
        }
        return new sv4.i(weakReference, hVar);
    }
}
