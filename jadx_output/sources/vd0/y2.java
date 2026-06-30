package vd0;

/* loaded from: classes8.dex */
public final class y2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f435541a;

    /* renamed from: b, reason: collision with root package name */
    public final vd0.c3 f435542b;

    /* renamed from: c, reason: collision with root package name */
    public final int f435543c;

    public y2(java.lang.ref.WeakReference activityRef, vd0.c3 searchIndex, int i17) {
        kotlin.jvm.internal.o.g(activityRef, "activityRef");
        kotlin.jvm.internal.o.g(searchIndex, "searchIndex");
        this.f435541a = activityRef;
        this.f435542b = searchIndex;
        this.f435543c = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd0.y2)) {
            return false;
        }
        vd0.y2 y2Var = (vd0.y2) obj;
        return kotlin.jvm.internal.o.b(this.f435541a, y2Var.f435541a) && kotlin.jvm.internal.o.b(this.f435542b, y2Var.f435542b) && this.f435543c == y2Var.f435543c;
    }

    public int hashCode() {
        return (((this.f435541a.hashCode() * 31) + this.f435542b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f435543c);
    }

    public java.lang.String toString() {
        return "ActivityIndexHolder(activityRef=" + this.f435541a + ", searchIndex=" + this.f435542b + ", activityId=" + this.f435543c + ')';
    }
}
