package y91;

/* loaded from: classes16.dex */
public class b implements p56.i {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w91.d f460259d;

    public b(y91.d dVar, w91.d dVar2) {
        this.f460259d = dVar2;
    }

    @Override // r56.b
    public void call(java.lang.Object obj) {
        p56.r rVar = (p56.r) obj;
        try {
            if (y91.k0.f460296d == null) {
                synchronized (y91.d.class) {
                    if (y91.k0.f460296d == null) {
                        y91.k0.f460296d = new y91.k0(true);
                    }
                }
            }
            y91.k0.f460296d.b(this.f460259d);
            rVar.onCompleted();
        } catch (java.io.IOException e17) {
            rVar.onError(e17.getCause());
            v91.b.c("DlnaRepositoryImpl", e17, "");
        }
    }
}
