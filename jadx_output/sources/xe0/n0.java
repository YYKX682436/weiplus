package xe0;

/* loaded from: classes9.dex */
public final class n0 implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f453758d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f453759e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f453760f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f453761g;

    public n0(java.lang.String username, java.lang.String chatName, java.lang.String enterSessionId, java.lang.String uniqueId) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(chatName, "chatName");
        kotlin.jvm.internal.o.g(enterSessionId, "enterSessionId");
        kotlin.jvm.internal.o.g(uniqueId, "uniqueId");
        this.f453758d = username;
        this.f453759e = chatName;
        this.f453760f = enterSessionId;
        this.f453761g = uniqueId;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe0.n0)) {
            return false;
        }
        xe0.n0 n0Var = (xe0.n0) obj;
        return kotlin.jvm.internal.o.b(this.f453758d, n0Var.f453758d) && kotlin.jvm.internal.o.b(this.f453759e, n0Var.f453759e) && kotlin.jvm.internal.o.b(this.f453760f, n0Var.f453760f) && kotlin.jvm.internal.o.b(this.f453761g, n0Var.f453761g);
    }

    public int hashCode() {
        return (((((this.f453758d.hashCode() * 31) + this.f453759e.hashCode()) * 31) + this.f453760f.hashCode()) * 31) + this.f453761g.hashCode();
    }

    public java.lang.String toString() {
        return "StatusIconReportChatParams(username=" + this.f453758d + ", chatName=" + this.f453759e + ", enterSessionId=" + this.f453760f + ", uniqueId=" + this.f453761g + ')';
    }
}
