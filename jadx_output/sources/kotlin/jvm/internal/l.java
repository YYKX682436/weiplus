package kotlin.jvm.internal;

/* loaded from: classes16.dex */
public abstract class l extends kotlin.jvm.internal.e implements kotlin.jvm.internal.k, f06.g {
    private final int arity;
    private final int flags;

    public l(int i17) {
        this(i17, kotlin.jvm.internal.e.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.e
    public f06.c computeReflected() {
        return kotlin.jvm.internal.i0.f310124a.a(this);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kotlin.jvm.internal.l) {
            kotlin.jvm.internal.l lVar = (kotlin.jvm.internal.l) obj;
            return getName().equals(lVar.getName()) && getSignature().equals(lVar.getSignature()) && this.flags == lVar.flags && this.arity == lVar.arity && kotlin.jvm.internal.o.b(getBoundReceiver(), lVar.getBoundReceiver()) && kotlin.jvm.internal.o.b(getOwner(), lVar.getOwner());
        }
        if (obj instanceof f06.g) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.k
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // f06.g
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // f06.g
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // f06.g
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // f06.g
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // f06.c
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public java.lang.String toString() {
        f06.c compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public l(int i17, java.lang.Object obj) {
        this(i17, obj, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.e
    public f06.g getReflected() {
        f06.c compute = compute();
        if (compute != this) {
            return (f06.g) compute;
        }
        throw new xz5.b();
    }

    public l(int i17, java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i18) {
        super(obj, cls, str, str2, (i18 & 1) == 1);
        this.arity = i17;
        this.flags = i18 >> 1;
    }
}
