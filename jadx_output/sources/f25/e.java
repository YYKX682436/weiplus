package f25;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f259092a;

    /* renamed from: b, reason: collision with root package name */
    public volatile f25.m0 f259093b;

    public e(boolean z17, f25.m0 m0Var) {
        this.f259092a = z17;
        this.f259093b = m0Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f25.e)) {
            return false;
        }
        f25.e eVar = (f25.e) obj;
        return this.f259092a == eVar.f259092a && kotlin.jvm.internal.o.b(this.f259093b, eVar.f259093b);
    }

    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.f259092a) * 31) + (this.f259093b == null ? 0 : this.f259093b.hashCode());
    }

    public java.lang.String toString() {
        return "CurrentFocusState(hasFocus:" + this.f259092a + ",focusSession:" + this.f259093b + ')';
    }
}
