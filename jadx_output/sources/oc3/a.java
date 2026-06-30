package oc3;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final oc3.a f344326c = new oc3.a(new java.util.HashMap(), new java.util.HashMap());

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f344327a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f344328b;

    public a(java.util.Map plugins, java.util.Map publicServices) {
        kotlin.jvm.internal.o.g(plugins, "plugins");
        kotlin.jvm.internal.o.g(publicServices, "publicServices");
        this.f344327a = plugins;
        this.f344328b = publicServices;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc3.a)) {
            return false;
        }
        oc3.a aVar = (oc3.a) obj;
        return kotlin.jvm.internal.o.b(this.f344327a, aVar.f344327a) && kotlin.jvm.internal.o.b(this.f344328b, aVar.f344328b);
    }

    public int hashCode() {
        return (this.f344327a.hashCode() * 31) + this.f344328b.hashCode();
    }

    public java.lang.String toString() {
        return "MBBizConfigInfo(plugins=" + this.f344327a + ", publicServices=" + this.f344328b + ')';
    }
}
