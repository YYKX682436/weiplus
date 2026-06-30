package dz4;

/* loaded from: classes11.dex */
public final class f extends dz4.i {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f245232m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f245233n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f245234o;

    /* renamed from: p, reason: collision with root package name */
    public final int f245235p;

    /* renamed from: q, reason: collision with root package name */
    public final long f245236q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f245237r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.lang.String msgId, java.lang.String conversationName, java.lang.String xml, int i17, long j17, boolean z17) {
        super(i17, false, xml, j17, 0, 0, false, 0, null, null, null, null, 4080, null);
        kotlin.jvm.internal.o.g(msgId, "msgId");
        kotlin.jvm.internal.o.g(conversationName, "conversationName");
        kotlin.jvm.internal.o.g(xml, "xml");
        this.f245232m = msgId;
        this.f245233n = conversationName;
        this.f245234o = xml;
        this.f245235p = i17;
        this.f245236q = j17;
        this.f245237r = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz4.f)) {
            return false;
        }
        dz4.f fVar = (dz4.f) obj;
        return kotlin.jvm.internal.o.b(this.f245232m, fVar.f245232m) && kotlin.jvm.internal.o.b(this.f245233n, fVar.f245233n) && kotlin.jvm.internal.o.b(this.f245234o, fVar.f245234o) && this.f245235p == fVar.f245235p && this.f245236q == fVar.f245236q && this.f245237r == fVar.f245237r;
    }

    public int hashCode() {
        return (((((((((this.f245232m.hashCode() * 31) + this.f245233n.hashCode()) * 31) + this.f245234o.hashCode()) * 31) + java.lang.Integer.hashCode(this.f245235p)) * 31) + java.lang.Long.hashCode(this.f245236q)) * 31) + java.lang.Boolean.hashCode(this.f245237r);
    }

    public java.lang.String toString() {
        return "Chat(msgId=" + this.f245232m + ", conversationName=" + this.f245233n + ", xml=" + this.f245234o + ", scene=" + this.f245235p + ", noteLocalId=" + this.f245236q + ", isFromGroupChat=" + this.f245237r + ')';
    }
}
