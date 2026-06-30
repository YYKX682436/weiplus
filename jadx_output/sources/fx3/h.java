package fx3;

/* loaded from: classes10.dex */
public final class h extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f267137d;

    /* renamed from: e, reason: collision with root package name */
    public final int f267138e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f267139f;

    public h(java.lang.String id6, int i17, java.lang.String log) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(log, "log");
        this.f267137d = id6;
        this.f267138e = i17;
        this.f267139f = log;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        fx3.h other = (fx3.h) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.b(this.f267139f, other.f267139f);
    }

    @Override // xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        fx3.h other = (fx3.h) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.i(this.f267138e, other.f267138e);
    }

    @Override // xm3.d
    public java.lang.String v() {
        return this.f267137d;
    }
}
