package yd2;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f461029a;

    /* renamed from: b, reason: collision with root package name */
    public final long f461030b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f461031c;

    /* renamed from: d, reason: collision with root package name */
    public final long f461032d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f461033e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f461034f;

    public b(long j17, long j18, java.lang.String sessionId, long j19, java.lang.String toolCallId, java.lang.String anchorUsername) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(toolCallId, "toolCallId");
        kotlin.jvm.internal.o.g(anchorUsername, "anchorUsername");
        this.f461029a = j17;
        this.f461030b = j18;
        this.f461031c = sessionId;
        this.f461032d = j19;
        this.f461033e = toolCallId;
        this.f461034f = anchorUsername;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd2.b)) {
            return false;
        }
        yd2.b bVar = (yd2.b) obj;
        return this.f461029a == bVar.f461029a && this.f461030b == bVar.f461030b && kotlin.jvm.internal.o.b(this.f461031c, bVar.f461031c) && this.f461032d == bVar.f461032d && kotlin.jvm.internal.o.b(this.f461033e, bVar.f461033e) && kotlin.jvm.internal.o.b(this.f461034f, bVar.f461034f);
    }

    public int hashCode() {
        return (((((((((java.lang.Long.hashCode(this.f461029a) * 31) + java.lang.Long.hashCode(this.f461030b)) * 31) + this.f461031c.hashCode()) * 31) + java.lang.Long.hashCode(this.f461032d)) * 31) + this.f461033e.hashCode()) * 31) + this.f461034f.hashCode();
    }

    public java.lang.String toString() {
        return "AiAssistantToolContext(taskId=" + this.f461029a + ", objectId=" + this.f461030b + ", sessionId=" + this.f461031c + ", requestId=" + this.f461032d + ", toolCallId=" + this.f461033e + ", anchorUsername=" + this.f461034f + ')';
    }
}
