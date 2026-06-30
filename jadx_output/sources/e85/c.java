package e85;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f250298a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f250299b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f250300c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f250301d;

    /* renamed from: e, reason: collision with root package name */
    public final long f250302e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f250303f;

    /* renamed from: g, reason: collision with root package name */
    public d85.f0 f250304g;

    public c(java.lang.String action, java.lang.String pageName, java.lang.String pageRef, java.lang.String process, long j17) {
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(pageName, "pageName");
        kotlin.jvm.internal.o.g(pageRef, "pageRef");
        kotlin.jvm.internal.o.g(process, "process");
        this.f250298a = action;
        this.f250299b = pageName;
        this.f250300c = pageRef;
        this.f250301d = process;
        this.f250302e = j17;
        this.f250303f = "";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj != null && (obj instanceof e85.c)) {
            e85.c cVar = (e85.c) obj;
            if (kotlin.jvm.internal.o.b(this.f250299b, cVar.f250299b) && kotlin.jvm.internal.o.b(this.f250301d, cVar.f250301d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.f250298a.hashCode() * 31) + this.f250299b.hashCode()) * 31) + this.f250300c.hashCode()) * 31) + this.f250301d.hashCode()) * 31) + java.lang.Long.hashCode(this.f250302e);
    }

    public java.lang.String toString() {
        return "page:" + this.f250299b + ", action:" + this.f250298a + ", process:" + this.f250301d + ", time:" + this.f250302e;
    }
}
