package ir2;

/* loaded from: classes2.dex */
public abstract class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f294129a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f294130b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f294131c;

    public e1(java.util.List feeds, boolean z17) {
        kotlin.jvm.internal.o.g(feeds, "feeds");
        this.f294129a = feeds;
        this.f294130b = z17;
        this.f294131c = jz5.h.b(new ir2.d1(this));
    }

    public abstract ym5.s3 a();

    public abstract void b(java.util.List list);

    public int c() {
        return 2;
    }
}
