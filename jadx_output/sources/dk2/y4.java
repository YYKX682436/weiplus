package dk2;

/* loaded from: classes3.dex */
public final class y4 implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final r45.vm1 f234368d;

    /* renamed from: e, reason: collision with root package name */
    public final long f234369e;

    public y4(r45.vm1 info) {
        kotlin.jvm.internal.o.g(info, "info");
        this.f234368d = info;
        this.f234369e = (info.getInteger(3) * 1000) + c01.id.c();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        dk2.y4 other = (dk2.y4) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.j(this.f234369e, other.f234369e);
    }
}
