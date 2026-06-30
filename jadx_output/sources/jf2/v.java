package jf2;

/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f299405a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f299406b;

    public v(java.util.List priorityList, java.util.List exclusiveButtons) {
        kotlin.jvm.internal.o.g(priorityList, "priorityList");
        kotlin.jvm.internal.o.g(exclusiveButtons, "exclusiveButtons");
        this.f299405a = priorityList;
        this.f299406b = exclusiveButtons;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf2.v)) {
            return false;
        }
        jf2.v vVar = (jf2.v) obj;
        return kotlin.jvm.internal.o.b(this.f299405a, vVar.f299405a) && kotlin.jvm.internal.o.b(this.f299406b, vVar.f299406b);
    }

    public int hashCode() {
        return (this.f299405a.hashCode() * 31) + this.f299406b.hashCode();
    }

    public java.lang.String toString() {
        return "ModePriorityConfig(priorityList=" + this.f299405a + ", exclusiveButtons=" + this.f299406b + ')';
    }

    public /* synthetic */ v(java.util.List list, java.util.List list2, int i17, kotlin.jvm.internal.i iVar) {
        this(list, (i17 & 2) != 0 ? kz5.p0.f313996d : list2);
    }
}
