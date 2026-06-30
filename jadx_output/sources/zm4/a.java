package zm4;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f474176a;

    public a(java.util.List list, int i17, kotlin.jvm.internal.i iVar) {
        list = (i17 & 1) != 0 ? new java.util.ArrayList() : list;
        kotlin.jvm.internal.o.g(list, "list");
        this.f474176a = list;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zm4.a) && kotlin.jvm.internal.o.b(this.f474176a, ((zm4.a) obj).f474176a);
    }

    public int hashCode() {
        return this.f474176a.hashCode();
    }

    public java.lang.String toString() {
        return "AllTabRedDotInfo(list=" + this.f474176a + ')';
    }
}
