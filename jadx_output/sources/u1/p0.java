package u1;

/* loaded from: classes14.dex */
public abstract class p0 {

    /* renamed from: d, reason: collision with root package name */
    public final u1.c1 f423654d;

    /* renamed from: e, reason: collision with root package name */
    public final z0.t f423655e;

    /* renamed from: f, reason: collision with root package name */
    public u1.p0 f423656f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f423657g;

    public p0(u1.c1 layoutNodeWrapper, z0.t modifier) {
        kotlin.jvm.internal.o.g(layoutNodeWrapper, "layoutNodeWrapper");
        kotlin.jvm.internal.o.g(modifier, "modifier");
        this.f423654d = layoutNodeWrapper;
        this.f423655e = modifier;
    }

    public void a() {
        this.f423657g = true;
    }

    public void b() {
        this.f423657g = false;
    }
}
