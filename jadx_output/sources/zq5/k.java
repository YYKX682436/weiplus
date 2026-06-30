package zq5;

/* loaded from: classes11.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f475074a;

    /* renamed from: b, reason: collision with root package name */
    public final zq5.j f475075b;

    /* renamed from: c, reason: collision with root package name */
    public final zq5.i f475076c;

    public k(java.lang.String tag, zq5.i level, zq5.j pipeline, int i17, kotlin.jvm.internal.i iVar) {
        level = (i17 & 2) != 0 ? zq5.i.f475070f : level;
        pipeline = (i17 & 4) != 0 ? zq5.a.f475055a : pipeline;
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(level, "level");
        kotlin.jvm.internal.o.g(pipeline, "pipeline");
        this.f475074a = tag;
        this.f475075b = pipeline;
        this.f475076c = level;
    }

    public final void a(yz5.a lazyMsg) {
        kotlin.jvm.internal.o.g(lazyMsg, "lazyMsg");
        c(zq5.i.f475069e, lazyMsg);
    }

    public final void b(zq5.i level, java.lang.String msg) {
        kotlin.jvm.internal.o.g(level, "level");
        kotlin.jvm.internal.o.g(msg, "msg");
        if (level.compareTo(this.f475076c) >= 0) {
            ((zq5.a) this.f475075b).a(level, this.f475074a, msg, null);
        }
    }

    public final void c(zq5.i level, yz5.a lazyMsg) {
        kotlin.jvm.internal.o.g(level, "level");
        kotlin.jvm.internal.o.g(lazyMsg, "lazyMsg");
        if (level.compareTo(this.f475076c) >= 0) {
            ((zq5.a) this.f475075b).a(level, this.f475074a, (java.lang.String) lazyMsg.invoke(), null);
        }
    }

    public final void d(yz5.a lazyMsg) {
        kotlin.jvm.internal.o.g(lazyMsg, "lazyMsg");
        c(zq5.i.f475068d, lazyMsg);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zq5.k.class != obj.getClass()) {
            return false;
        }
        return kotlin.jvm.internal.o.b(this.f475074a, ((zq5.k) obj).f475074a);
    }

    public int hashCode() {
        return this.f475074a.hashCode();
    }

    public java.lang.String toString() {
        return "Logger(tag='" + this.f475074a + "', level=" + this.f475076c + ", pipeline=" + this.f475075b + ')';
    }
}
