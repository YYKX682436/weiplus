package fr3;

/* loaded from: classes10.dex */
public final class k extends fr3.m {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f265799a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.util.List dataList) {
        super(null);
        kotlin.jvm.internal.o.g(dataList, "dataList");
        this.f265799a = dataList;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fr3.k) && kotlin.jvm.internal.o.b(this.f265799a, ((fr3.k) obj).f265799a);
    }

    public int hashCode() {
        return this.f265799a.hashCode();
    }

    public java.lang.String toString() {
        return "getContactStates(dataList=" + this.f265799a + ')';
    }
}
