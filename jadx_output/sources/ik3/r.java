package ik3;

/* loaded from: classes8.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f291911a;

    /* renamed from: b, reason: collision with root package name */
    public final int f291912b;

    public r(java.lang.String multiTaskId, int i17) {
        kotlin.jvm.internal.o.g(multiTaskId, "multiTaskId");
        this.f291911a = multiTaskId;
        this.f291912b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ik3.r)) {
            return false;
        }
        ik3.r rVar = (ik3.r) obj;
        return kotlin.jvm.internal.o.b(this.f291911a, rVar.f291911a) && this.f291912b == rVar.f291912b;
    }

    public int hashCode() {
        return (this.f291911a.hashCode() * 31) + java.lang.Integer.hashCode(this.f291912b);
    }

    public java.lang.String toString() {
        return "MultiTaskKey(multiTaskId=" + this.f291911a + ", multiTaskType=" + this.f291912b + ')';
    }
}
