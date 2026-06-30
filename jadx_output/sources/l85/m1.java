package l85;

/* loaded from: classes5.dex */
public abstract class m1 extends i95.w implements i95.x, androidx.lifecycle.m1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f317196d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Boolean[] f317197e;

    /* renamed from: f, reason: collision with root package name */
    public final pf5.q f317198f;

    public m1(java.lang.String uicClassName) {
        kotlin.jvm.internal.o.g(uicClassName, "uicClassName");
        this.f317196d = uicClassName;
        this.f317197e = new java.lang.Boolean[]{java.lang.Boolean.FALSE};
        this.f317198f = new pf5.q();
    }

    @Override // androidx.lifecycle.m1
    public androidx.lifecycle.l1 getViewModelStore() {
        return this.f317198f.f353930f;
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (this.f317197e[0].booleanValue()) {
            synchronized (this.f317197e) {
                if (this.f317197e[0].booleanValue()) {
                    this.f317198f.c();
                    this.f317197e[0] = java.lang.Boolean.FALSE;
                }
            }
        }
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        wi();
    }

    public final void wi() {
        if (this.f317197e[0].booleanValue()) {
            return;
        }
        synchronized (this.f317197e) {
            if (!this.f317197e[0].booleanValue()) {
                this.f317198f.b(this.f317196d);
                this.f317197e[0] = java.lang.Boolean.TRUE;
            }
        }
    }
}
