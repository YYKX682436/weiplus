package d04;

/* loaded from: classes5.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final sz3.w0 f225412a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f225413b;

    public f0(sz3.w0 data, boolean z17) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f225412a = data;
        this.f225413b = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d04.f0)) {
            return false;
        }
        d04.f0 f0Var = (d04.f0) obj;
        return kotlin.jvm.internal.o.b(this.f225412a, f0Var.f225412a) && this.f225413b == f0Var.f225413b;
    }

    public int hashCode() {
        return (this.f225412a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f225413b);
    }

    public java.lang.String toString() {
        return "ScanMergeSuccessDataWrapper(data=" + this.f225412a + ", needSuccessMarkAnimation=" + this.f225413b + ')';
    }
}
