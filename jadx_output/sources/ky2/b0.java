package ky2;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f313511a;

    /* renamed from: b, reason: collision with root package name */
    public final int f313512b;

    public b0(java.lang.String choiceName, int i17) {
        kotlin.jvm.internal.o.g(choiceName, "choiceName");
        this.f313511a = choiceName;
        this.f313512b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky2.b0)) {
            return false;
        }
        ky2.b0 b0Var = (ky2.b0) obj;
        return kotlin.jvm.internal.o.b(this.f313511a, b0Var.f313511a) && this.f313512b == b0Var.f313512b;
    }

    public int hashCode() {
        return (this.f313511a.hashCode() * 31) + java.lang.Integer.hashCode(this.f313512b);
    }

    public java.lang.String toString() {
        return "VoteChoiceItem(choiceName=" + this.f313511a + ", choiceCount=" + this.f313512b + ')';
    }
}
