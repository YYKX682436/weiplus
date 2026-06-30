package rx0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final rx0.b f400903a;

    /* renamed from: b, reason: collision with root package name */
    public final rx0.d f400904b;

    /* renamed from: c, reason: collision with root package name */
    public final rx0.c f400905c;

    public a(rx0.b taskType, rx0.d dVar, rx0.c cVar) {
        kotlin.jvm.internal.o.g(taskType, "taskType");
        this.f400903a = taskType;
        this.f400904b = dVar;
        this.f400905c = cVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx0.a)) {
            return false;
        }
        rx0.a aVar = (rx0.a) obj;
        return this.f400903a == aVar.f400903a && kotlin.jvm.internal.o.b(this.f400904b, aVar.f400904b) && kotlin.jvm.internal.o.b(this.f400905c, aVar.f400905c);
    }

    public int hashCode() {
        int hashCode = this.f400903a.hashCode() * 31;
        rx0.d dVar = this.f400904b;
        int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        rx0.c cVar = this.f400905c;
        return hashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "AIGCTaskInfo(taskType=" + this.f400903a + ", createTaskInfo=" + this.f400904b + ", queryTaskInfo=" + this.f400905c + ')';
    }
}
