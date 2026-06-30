package e82;

@j95.b
/* loaded from: classes8.dex */
public class e extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public volatile i82.b f250085d = null;

    /* renamed from: e, reason: collision with root package name */
    public volatile h82.i f250086e = null;

    public i82.b Ai() {
        gm0.j1.b().c();
        if (this.f250085d == null) {
            synchronized (this) {
                if (this.f250085d == null) {
                    this.f250085d = new i82.b(gm0.j1.u().f273153f);
                }
            }
        }
        return this.f250085d;
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        wi();
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        if (this.f250086e != null) {
            h82.i iVar = this.f250086e;
            iVar.getClass();
            gm0.j1.n().d(iVar.f279543e);
            this.f250086e = null;
        }
    }

    public h82.i wi() {
        gm0.j1.b().c();
        if (this.f250086e == null) {
            synchronized (this) {
                if (this.f250086e == null) {
                    this.f250086e = new h82.i();
                }
            }
        }
        return this.f250086e;
    }
}
