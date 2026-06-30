package fj4;

/* loaded from: classes11.dex */
public final class a implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final pj4.n1 f263223d;

    /* renamed from: e, reason: collision with root package name */
    public final mj4.h f263224e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f263225f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f263226g;

    public a(pj4.n1 history) {
        kotlin.jvm.internal.o.g(history, "history");
        this.f263223d = history;
        this.f263224e = fj4.b.a(history);
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
