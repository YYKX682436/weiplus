package qt5;

/* loaded from: classes14.dex */
public class a0 extends st5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qt5.l f366651d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qt5.n f366652e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qt5.f0 f366653f;

    public a0(qt5.f0 f0Var, qt5.l lVar, qt5.n nVar) {
        this.f366653f = f0Var;
        this.f366651d = lVar;
        this.f366652e = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        qt5.n nVar = this.f366652e;
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            qt5.l lVar = this.f366651d;
            if (lVar != null) {
                lVar.b(currentTimeMillis);
            }
            ((qt5.v) nVar).call();
            if (lVar != null) {
                lVar.c(nVar.f366696d);
            }
            if (lVar != null) {
                this.f366653f.f366687b.post(new qt5.z(this));
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
