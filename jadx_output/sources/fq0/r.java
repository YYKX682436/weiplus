package fq0;

/* loaded from: classes7.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f265463a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f265464b;

    public r(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f265463a = appId;
        int hashCode = hashCode();
        r26.a.a(16);
        this.f265464b = jz5.h0.b(hashCode & io.flutter.embedding.android.KeyboardMap.kValueMask, 16);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fq0.r) && kotlin.jvm.internal.o.b(this.f265463a, ((fq0.r) obj).f265463a);
    }

    public int hashCode() {
        return this.f265463a.hashCode();
    }

    public java.lang.String toString() {
        return "MagicSclAppContext(appId=" + this.f265463a + ')';
    }
}
