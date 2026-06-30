package sj0;

/* loaded from: classes13.dex */
public enum g {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f408357d = null;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f408358e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public boolean f408359f = false;

    /* renamed from: g, reason: collision with root package name */
    public wu5.b f408360g = null;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Object f408361h = new java.lang.Object();

    g() {
    }

    public void h() {
        synchronized (this.f408361h) {
            if (this.f408359f) {
                wu5.b bVar = this.f408360g;
                if (bVar != null) {
                    bVar.b();
                }
                this.f408359f = false;
                java.util.HashMap hashMap = this.f408358e;
                if (hashMap != null) {
                    hashMap.clear();
                }
            }
        }
    }
}
