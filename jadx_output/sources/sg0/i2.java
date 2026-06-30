package sg0;

/* loaded from: classes8.dex */
public final class i2 {

    /* renamed from: a, reason: collision with root package name */
    public final sg0.j2 f407723a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f407724b;

    public i2(sg0.j2 plugins, android.content.Context context) {
        kotlin.jvm.internal.o.g(plugins, "plugins");
        this.f407723a = plugins;
        this.f407724b = context;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sg0.i2)) {
            return false;
        }
        sg0.i2 i2Var = (sg0.i2) obj;
        return kotlin.jvm.internal.o.b(this.f407723a, i2Var.f407723a) && kotlin.jvm.internal.o.b(this.f407724b, i2Var.f407724b);
    }

    public int hashCode() {
        int hashCode = this.f407723a.hashCode() * 31;
        android.content.Context context = this.f407724b;
        return hashCode + (context == null ? 0 : context.hashCode());
    }

    public java.lang.String toString() {
        return "SearchResultFlutterInstance(plugins=" + this.f407723a + ", context=" + this.f407724b + ')';
    }
}
