package qq;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f365860a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f365861b;

    public c(java.lang.String title, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(title, "title");
        this.f365860a = title;
        this.f365861b = obj;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq.c)) {
            return false;
        }
        qq.c cVar = (qq.c) obj;
        return kotlin.jvm.internal.o.b(this.f365860a, cVar.f365860a) && kotlin.jvm.internal.o.b(this.f365861b, cVar.f365861b);
    }

    public int hashCode() {
        int hashCode = this.f365860a.hashCode() * 31;
        java.lang.Object obj = this.f365861b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public java.lang.String toString() {
        return "ConfigOption(title=" + this.f365860a + ", value=" + this.f365861b + ')';
    }
}
