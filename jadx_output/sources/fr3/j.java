package fr3;

/* loaded from: classes10.dex */
public final class j extends fr3.m {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f265798a;

    public j(java.util.List list) {
        super(null);
        this.f265798a = list;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fr3.j) && kotlin.jvm.internal.o.b(this.f265798a, ((fr3.j) obj).f265798a);
    }

    public int hashCode() {
        java.util.List list = this.f265798a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public java.lang.String toString() {
        return "deleteContactStates(deletedUserNameList=" + this.f265798a + ')';
    }
}
