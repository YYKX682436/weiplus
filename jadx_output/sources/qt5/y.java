package qt5;

/* loaded from: classes14.dex */
public class y extends st5.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qt5.f f366706d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qt5.h f366707e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qt5.f0 f366708f;

    public y(qt5.f0 f0Var, qt5.f fVar, qt5.h hVar) {
        this.f366708f = f0Var;
        this.f366706d = fVar;
        this.f366707e = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        qt5.h hVar = this.f366707e;
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            qt5.f fVar = this.f366706d;
            if (fVar != null) {
                fVar.b(currentTimeMillis);
            }
            ((qt5.s) hVar).call();
            if (fVar != null) {
                fVar.c(hVar.f366688d);
            }
            if (fVar != null) {
                this.f366708f.f366687b.post(new qt5.x(this));
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
