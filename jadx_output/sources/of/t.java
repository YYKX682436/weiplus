package of;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f344858a;

    /* renamed from: b, reason: collision with root package name */
    public final long f344859b;

    /* renamed from: c, reason: collision with root package name */
    public final long f344860c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f344861d;

    public t(java.lang.String name, long j17, long j18, java.lang.String permission) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(permission, "permission");
        this.f344858a = name;
        this.f344859b = j17;
        this.f344860c = j18;
        this.f344861d = permission;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f344858a);
        sb6.append(":[0x");
        r26.a.a(16);
        java.lang.String l17 = java.lang.Long.toString(this.f344859b, 16);
        kotlin.jvm.internal.o.f(l17, "toString(...)");
        sb6.append(l17);
        sb6.append(", 0x");
        r26.a.a(16);
        java.lang.String l18 = java.lang.Long.toString(this.f344860c, 16);
        kotlin.jvm.internal.o.f(l18, "toString(...)");
        sb6.append(l18);
        sb6.append("), ");
        sb6.append(this.f344861d);
        return sb6.toString();
    }
}
