package k50;

/* loaded from: classes.dex */
public final class m0 extends k50.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final k50.h0 f304241a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(k50.h0 appItem) {
        super(null);
        kotlin.jvm.internal.o.g(appItem, "appItem");
        this.f304241a = appItem;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k50.m0) && kotlin.jvm.internal.o.b(this.f304241a, ((k50.m0) obj).f304241a);
    }

    public int hashCode() {
        return this.f304241a.hashCode();
    }

    public java.lang.String toString() {
        return "App(appItem=" + this.f304241a + ')';
    }
}
