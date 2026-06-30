package o13;

/* loaded from: classes12.dex */
public abstract class b implements o13.w {

    /* renamed from: d, reason: collision with root package name */
    public boolean f342207d;

    public b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.BaseFTS5SearchLogic", "Create %s", getName());
    }

    @Override // o13.w
    public void a() {
    }

    @Override // o13.w
    public void c(java.lang.String str, java.lang.String str2) {
    }

    @Override // o13.w
    public void d(java.lang.String str, p13.y yVar, int i17, java.util.HashMap hashMap) {
    }

    @Override // o13.w
    public void e(java.lang.String str) {
    }

    public synchronized void f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.BaseFTS5SearchLogic", "OnCreate %s | isCreated =%b", getName(), java.lang.Boolean.valueOf(this.f342207d));
        if (!this.f342207d && h()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.BaseFTS5SearchLogic", "SetCreated");
            this.f342207d = true;
        }
    }

    public void g() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.BaseFTS5SearchLogic", "OnDestroy %s | isCreated %b", getName(), java.lang.Boolean.valueOf(this.f342207d));
        if (this.f342207d && i()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.BaseFTS5SearchLogic", "SetDestroyed");
            this.f342207d = false;
        }
    }

    public abstract boolean h();

    public abstract boolean i();
}
