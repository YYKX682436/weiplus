package ey2;

/* loaded from: classes2.dex */
public final class n2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f257437a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f257438b;

    /* renamed from: c, reason: collision with root package name */
    public r45.r03 f257439c;

    public n2(java.lang.String keyWord) {
        kotlin.jvm.internal.o.g(keyWord, "keyWord");
        this.f257437a = keyWord;
        this.f257438b = new java.util.LinkedList();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ey2.n2) && kotlin.jvm.internal.o.b(this.f257437a, ((ey2.n2) obj).f257437a);
    }

    public int hashCode() {
        return this.f257437a.hashCode();
    }

    public java.lang.String toString() {
        return "Cache(keyWord=" + this.f257437a + ')';
    }
}
