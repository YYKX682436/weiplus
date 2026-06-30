package oc3;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f344331a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f344332b;

    public c(java.lang.String instanceName, java.lang.String callerProcessName, int i17, kotlin.jvm.internal.i iVar) {
        callerProcessName = (i17 & 2) != 0 ? "" : callerProcessName;
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        kotlin.jvm.internal.o.g(callerProcessName, "callerProcessName");
        this.f344331a = instanceName;
        this.f344332b = callerProcessName;
    }

    public final java.lang.String a() {
        return this.f344331a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc3.c)) {
            return false;
        }
        oc3.c cVar = (oc3.c) obj;
        return kotlin.jvm.internal.o.b(this.f344331a, cVar.f344331a) && kotlin.jvm.internal.o.b(this.f344332b, cVar.f344332b);
    }

    public int hashCode() {
        return (this.f344331a.hashCode() * 31) + this.f344332b.hashCode();
    }

    public java.lang.String toString() {
        return "MBJsApiMetaInfo(instanceName=" + this.f344331a + ", callerProcessName=" + this.f344332b + ')';
    }
}
