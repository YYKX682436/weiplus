package um5;

/* loaded from: classes10.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f429228a;

    /* renamed from: b, reason: collision with root package name */
    public final um5.a0 f429229b;

    /* renamed from: c, reason: collision with root package name */
    public final um5.b0 f429230c;

    public z(java.lang.String key, um5.a0 data, um5.b0 b0Var) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(data, "data");
        this.f429228a = key;
        this.f429229b = data;
        this.f429230c = b0Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um5.z)) {
            return false;
        }
        um5.z zVar = (um5.z) obj;
        return kotlin.jvm.internal.o.b(this.f429228a, zVar.f429228a) && kotlin.jvm.internal.o.b(this.f429229b, zVar.f429229b) && kotlin.jvm.internal.o.b(this.f429230c, zVar.f429230c);
    }

    public int hashCode() {
        int hashCode = ((this.f429228a.hashCode() * 31) + this.f429229b.hashCode()) * 31;
        um5.b0 b0Var = this.f429230c;
        return hashCode + (b0Var == null ? 0 : b0Var.hashCode());
    }

    public java.lang.String toString() {
        return "EffectInputTexture(key=" + this.f429228a + ", data=" + this.f429229b + ", animate=" + this.f429230c + ')';
    }
}
