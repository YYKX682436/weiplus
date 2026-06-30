package ui1;

/* loaded from: classes7.dex */
public final class c implements com.tencent.mm.plugin.appbrand.utils.a {

    /* renamed from: d, reason: collision with root package name */
    public final ui1.a0 f428037d;

    /* renamed from: e, reason: collision with root package name */
    public final ui1.r f428038e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f428039f;

    public c(ui1.a0 context, ui1.r rVar, java.lang.String key) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(key, "key");
        this.f428037d = context;
        this.f428038e = rVar;
        this.f428039f = key;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ui1.c)) {
            return false;
        }
        ui1.c cVar = (ui1.c) obj;
        return kotlin.jvm.internal.o.b(this.f428037d, cVar.f428037d) && kotlin.jvm.internal.o.b(this.f428038e, cVar.f428038e) && kotlin.jvm.internal.o.b(this.f428039f, cVar.f428039f);
    }

    public int hashCode() {
        int hashCode = this.f428037d.hashCode() * 31;
        ui1.r rVar = this.f428038e;
        return ((hashCode + (rVar == null ? 0 : rVar.hashCode())) * 31) + this.f428039f.hashCode();
    }

    public java.lang.String toString() {
        return "Task(context=" + this.f428037d + ", callback=" + this.f428038e + ", key=" + this.f428039f + ')';
    }
}
