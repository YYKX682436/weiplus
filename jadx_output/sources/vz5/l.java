package vz5;

/* loaded from: classes7.dex */
public final class l implements q26.n {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.File f441797a;

    /* renamed from: b, reason: collision with root package name */
    public final vz5.m f441798b;

    /* renamed from: c, reason: collision with root package name */
    public final int f441799c;

    public l(java.io.File start, vz5.m direction) {
        kotlin.jvm.internal.o.g(start, "start");
        kotlin.jvm.internal.o.g(direction, "direction");
        this.f441797a = start;
        this.f441798b = direction;
        this.f441799c = Integer.MAX_VALUE;
    }

    @Override // q26.n
    public java.util.Iterator iterator() {
        return new vz5.j(this);
    }
}
