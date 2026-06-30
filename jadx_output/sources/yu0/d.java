package yu0;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f465784a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f465785b;

    public d(java.lang.String groupID, java.util.List tasks) {
        kotlin.jvm.internal.o.g(groupID, "groupID");
        kotlin.jvm.internal.o.g(tasks, "tasks");
        this.f465784a = groupID;
        this.f465785b = tasks;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu0.d)) {
            return false;
        }
        yu0.d dVar = (yu0.d) obj;
        return kotlin.jvm.internal.o.b(this.f465784a, dVar.f465784a) && kotlin.jvm.internal.o.b(this.f465785b, dVar.f465785b);
    }

    public int hashCode() {
        return (this.f465784a.hashCode() * 31) + this.f465785b.hashCode();
    }

    public java.lang.String toString() {
        return "AudioTaskGroup(groupID=" + this.f465784a + ", tasks=" + this.f465785b + ')';
    }
}
