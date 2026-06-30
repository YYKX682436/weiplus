package qt5;

/* loaded from: classes14.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qt5.i f366682d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qt5.k f366683e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qt5.f0 f366684f;

    public e0(qt5.f0 f0Var, qt5.i iVar, qt5.k kVar) {
        this.f366684f = f0Var;
        this.f366682d = iVar;
        this.f366683e = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        qt5.k kVar = this.f366683e;
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            qt5.i iVar = this.f366682d;
            if (iVar != null) {
                iVar.b(currentTimeMillis);
            }
            ((qt5.u) kVar).call();
            if (iVar != null) {
                iVar.c(kVar.f366695d);
            }
            if (iVar != null) {
                this.f366684f.f366687b.post(new qt5.d0(this));
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
