package zy1;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f477332a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashSet f477333b;

    public h(java.lang.String key, java.util.HashSet set, int i17, kotlin.jvm.internal.i iVar) {
        set = (i17 & 2) != 0 ? new java.util.HashSet() : set;
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(set, "set");
        this.f477332a = key;
        this.f477333b = set;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy1.h)) {
            return false;
        }
        zy1.h hVar = (zy1.h) obj;
        return kotlin.jvm.internal.o.b(this.f477332a, hVar.f477332a) && kotlin.jvm.internal.o.b(this.f477333b, hVar.f477333b);
    }

    public int hashCode() {
        return (this.f477332a.hashCode() * 31) + this.f477333b.hashCode();
    }

    public java.lang.String toString() {
        return "ReportUniqueInfo(key=" + this.f477332a + ", set=" + this.f477333b + ')';
    }
}
