package y91;

/* loaded from: classes16.dex */
public class c implements p56.i {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w91.f f460262d;

    public c(y91.d dVar, w91.f fVar) {
        this.f460262d = fVar;
    }

    @Override // r56.b
    public void call(java.lang.Object obj) {
        p56.r rVar = (p56.r) obj;
        try {
            rVar.a(new y91.k0(false).a(this.f460262d));
            rVar.onCompleted();
        } catch (java.io.IOException e17) {
            java.lang.Throwable cause = e17.getCause();
            if (cause == null) {
                cause = new java.lang.Throwable("Error msg: " + e17.toString());
            }
            rVar.onError(cause);
            v91.b.c("DlnaRepositoryImpl", e17, "");
        }
    }
}
