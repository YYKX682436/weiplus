package l31;

/* loaded from: classes9.dex */
public abstract class b implements l31.u {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f315313a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f315314b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f315315c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f315316d;

    public b(java.lang.String bizUsername) {
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        this.f315313a = bizUsername;
    }

    public void a() {
        this.f315316d = true;
    }

    public java.lang.String b() {
        return java.lang.String.valueOf(hashCode());
    }

    public final void c(f31.f netScene) {
        kotlin.jvm.internal.o.g(netScene, "netScene");
        netScene.f259277f = new l31.a(this, netScene.f259277f, netScene);
        netScene.a(f31.b.f259269a);
    }
}
