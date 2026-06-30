package w33;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f442705a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.l f442706b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.l f442707c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.l f442708d;

    public b(java.util.List atAllList, jz5.l recentlyMentioned, jz5.l admins, jz5.l members) {
        kotlin.jvm.internal.o.g(atAllList, "atAllList");
        kotlin.jvm.internal.o.g(recentlyMentioned, "recentlyMentioned");
        kotlin.jvm.internal.o.g(admins, "admins");
        kotlin.jvm.internal.o.g(members, "members");
        this.f442705a = atAllList;
        this.f442706b = recentlyMentioned;
        this.f442707c = admins;
        this.f442708d = members;
    }

    public static w33.b a(w33.b bVar, java.util.List atAllList, jz5.l recentlyMentioned, jz5.l admins, jz5.l members, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            atAllList = bVar.f442705a;
        }
        if ((i17 & 2) != 0) {
            recentlyMentioned = bVar.f442706b;
        }
        if ((i17 & 4) != 0) {
            admins = bVar.f442707c;
        }
        if ((i17 & 8) != 0) {
            members = bVar.f442708d;
        }
        bVar.getClass();
        kotlin.jvm.internal.o.g(atAllList, "atAllList");
        kotlin.jvm.internal.o.g(recentlyMentioned, "recentlyMentioned");
        kotlin.jvm.internal.o.g(admins, "admins");
        kotlin.jvm.internal.o.g(members, "members");
        return new w33.b(atAllList, recentlyMentioned, admins, members);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w33.b)) {
            return false;
        }
        w33.b bVar = (w33.b) obj;
        return kotlin.jvm.internal.o.b(this.f442705a, bVar.f442705a) && kotlin.jvm.internal.o.b(this.f442706b, bVar.f442706b) && kotlin.jvm.internal.o.b(this.f442707c, bVar.f442707c) && kotlin.jvm.internal.o.b(this.f442708d, bVar.f442708d);
    }

    public int hashCode() {
        return (((((this.f442705a.hashCode() * 31) + this.f442706b.hashCode()) * 31) + this.f442707c.hashCode()) * 31) + this.f442708d.hashCode();
    }

    public java.lang.String toString() {
        return "MentionUserResultWrapper(atAllList=" + this.f442705a + ", recentlyMentioned=" + this.f442706b + ", admins=" + this.f442707c + ", members=" + this.f442708d + ')';
    }
}
