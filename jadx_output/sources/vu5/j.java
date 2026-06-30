package vu5;

/* loaded from: classes12.dex */
public class j extends vu5.b implements android.os.Handler.Callback {

    /* renamed from: e, reason: collision with root package name */
    public final vu5.i f440357e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Handler f440358f = ru5.d.a("HotPoolLeader", this);

    public j(int i17) {
        this.f440357e = new vu5.i(this, i17);
    }

    @Override // vu5.k
    public void a(wu5.l lVar) {
        this.f440358f.removeCallbacksAndMessages(lVar);
        this.f440357e.remove(lVar);
    }

    @Override // vu5.b
    public vu5.a b() {
        return this.f440357e;
    }

    public void d() {
        this.f440357e.shutdownNow();
    }

    @Override // vu5.k
    public java.lang.String getName() {
        return "HotPool";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        java.lang.Object obj = message.obj;
        if (!(obj instanceof wu5.l)) {
            return false;
        }
        this.f440357e.execute((wu5.l) obj);
        return true;
    }
}
