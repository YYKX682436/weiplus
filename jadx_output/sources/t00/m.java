package t00;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f414313a;

    /* renamed from: b, reason: collision with root package name */
    public final int f414314b;

    public m(java.lang.String actionName, int i17) {
        kotlin.jvm.internal.o.g(actionName, "actionName");
        this.f414313a = actionName;
        this.f414314b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t00.m)) {
            return false;
        }
        t00.m mVar = (t00.m) obj;
        return kotlin.jvm.internal.o.b(this.f414313a, mVar.f414313a) && this.f414314b == mVar.f414314b;
    }

    public int hashCode() {
        return (this.f414313a.hashCode() * 31) + java.lang.Integer.hashCode(this.f414314b);
    }

    public java.lang.String toString() {
        return "EcsActionInfo(actionName=" + this.f414313a + ", supportVersion=" + this.f414314b + ')';
    }
}
