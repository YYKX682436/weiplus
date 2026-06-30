package u06;

/* loaded from: classes16.dex */
public final class i0 extends u06.k0 implements e16.s {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f423508a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Collection f423509b;

    public i0(java.lang.Class reflectType) {
        kotlin.jvm.internal.o.g(reflectType, "reflectType");
        this.f423508a = reflectType;
        this.f423509b = kz5.p0.f313996d;
    }

    @Override // e16.d
    public boolean b() {
        return false;
    }

    @Override // u06.k0
    public java.lang.reflect.Type c() {
        return this.f423508a;
    }

    @Override // e16.d
    public java.util.Collection getAnnotations() {
        return this.f423509b;
    }
}
