package yu0;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f465781a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f465782b;

    /* renamed from: c, reason: collision with root package name */
    public final yu0.r f465783c;

    public c(java.lang.String groupID, java.lang.String taskID, yu0.r data) {
        kotlin.jvm.internal.o.g(groupID, "groupID");
        kotlin.jvm.internal.o.g(taskID, "taskID");
        kotlin.jvm.internal.o.g(data, "data");
        this.f465781a = groupID;
        this.f465782b = taskID;
        this.f465783c = data;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu0.c)) {
            return false;
        }
        yu0.c cVar = (yu0.c) obj;
        return kotlin.jvm.internal.o.b(this.f465781a, cVar.f465781a) && kotlin.jvm.internal.o.b(this.f465782b, cVar.f465782b) && kotlin.jvm.internal.o.b(this.f465783c, cVar.f465783c);
    }

    public int hashCode() {
        return (((this.f465781a.hashCode() * 31) + this.f465782b.hashCode()) * 31) + this.f465783c.hashCode();
    }

    public java.lang.String toString() {
        return "AudioTask(groupID=" + this.f465781a + ", taskID=" + this.f465782b + ", data=" + this.f465783c + ')';
    }
}
