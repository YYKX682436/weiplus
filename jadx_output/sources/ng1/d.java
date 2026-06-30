package ng1;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f336917a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.launching.v8 f336918b;

    public d(boolean z17, com.tencent.mm.plugin.appbrand.launching.v8 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        this.f336917a = z17;
        this.f336918b = reason;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng1.d)) {
            return false;
        }
        ng1.d dVar = (ng1.d) obj;
        return this.f336917a == dVar.f336917a && this.f336918b == dVar.f336918b;
    }

    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.f336917a) * 31) + this.f336918b.hashCode();
    }

    public java.lang.String toString() {
        return "AwaitCgiSyncCondition(await=" + this.f336917a + ", reason=" + this.f336918b + ')';
    }
}
