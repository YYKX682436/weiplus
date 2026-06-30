package kotlin.jvm.internal;

/* loaded from: classes16.dex */
public abstract class b0 extends kotlin.jvm.internal.e implements f06.v {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f310111d;

    public b0(java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i17) {
        super(obj, cls, str, str2, (i17 & 1) == 1);
        this.f310111d = (i17 & 2) == 2;
    }

    @Override // kotlin.jvm.internal.e
    public f06.c compute() {
        return this.f310111d ? this : super.compute();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kotlin.jvm.internal.b0) {
            kotlin.jvm.internal.b0 b0Var = (kotlin.jvm.internal.b0) obj;
            return getOwner().equals(b0Var.getOwner()) && getName().equals(b0Var.getName()) && getSignature().equals(b0Var.getSignature()) && kotlin.jvm.internal.o.b(getBoundReceiver(), b0Var.getBoundReceiver());
        }
        if (obj instanceof f06.v) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.e
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public f06.v getReflected() {
        if (this.f310111d) {
            throw new java.lang.UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        f06.c compute = compute();
        if (compute != this) {
            return (f06.v) compute;
        }
        throw new xz5.b();
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public java.lang.String toString() {
        f06.c compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public b0() {
        super(kotlin.jvm.internal.e.NO_RECEIVER, null, null, null, false);
        this.f310111d = false;
    }
}
