package vr3;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f439630a;

    public g(java.util.List list) {
        this.f439630a = list;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vr3.g) && kotlin.jvm.internal.o.b(this.f439630a, ((vr3.g) obj).f439630a);
    }

    public int hashCode() {
        java.util.List list = this.f439630a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public java.lang.String toString() {
        return "DraftMpData(draftMessageList=" + this.f439630a + ')';
    }
}
