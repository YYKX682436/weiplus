package ge1;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final he1.h f270924a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f270925b;

    /* renamed from: c, reason: collision with root package name */
    public final long f270926c;

    public a(he1.h command, yz5.l callback, long j17, int i17, kotlin.jvm.internal.i iVar) {
        j17 = (i17 & 4) != 0 ? java.lang.System.currentTimeMillis() : j17;
        kotlin.jvm.internal.o.g(command, "command");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f270924a = command;
        this.f270925b = callback;
        this.f270926c = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge1.a)) {
            return false;
        }
        ge1.a aVar = (ge1.a) obj;
        return kotlin.jvm.internal.o.b(this.f270924a, aVar.f270924a) && kotlin.jvm.internal.o.b(this.f270925b, aVar.f270925b) && this.f270926c == aVar.f270926c;
    }

    public int hashCode() {
        return (((this.f270924a.hashCode() * 31) + this.f270925b.hashCode()) * 31) + java.lang.Long.hashCode(this.f270926c);
    }

    public java.lang.String toString() {
        return "PendingTask(command=" + this.f270924a + ", callback=" + this.f270925b + ", enqueuedAt=" + this.f270926c + ')';
    }
}
