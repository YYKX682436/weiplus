package so2;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f410317a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f410318b;

    /* renamed from: c, reason: collision with root package name */
    public final int f410319c;

    /* renamed from: d, reason: collision with root package name */
    public final so2.f f410320d;

    public e(boolean z17, boolean z18, int i17, so2.f loadParams) {
        kotlin.jvm.internal.o.g(loadParams, "loadParams");
        this.f410317a = z17;
        this.f410318b = z18;
        this.f410319c = i17;
        this.f410320d = loadParams;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so2.e)) {
            return false;
        }
        so2.e eVar = (so2.e) obj;
        return this.f410317a == eVar.f410317a && this.f410318b == eVar.f410318b && this.f410319c == eVar.f410319c && kotlin.jvm.internal.o.b(this.f410320d, eVar.f410320d);
    }

    public int hashCode() {
        return (((((java.lang.Boolean.hashCode(this.f410317a) * 31) + java.lang.Boolean.hashCode(this.f410318b)) * 31) + java.lang.Integer.hashCode(this.f410319c)) * 31) + this.f410320d.hashCode();
    }

    public java.lang.String toString() {
        return "LoadLife(hitPreloadStart=" + this.f410317a + ", hitPreloadComplete=" + this.f410318b + ", loadFailReason=" + this.f410319c + ", loadParams=" + this.f410320d + ')';
    }
}
