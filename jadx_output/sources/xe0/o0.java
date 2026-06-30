package xe0;

/* loaded from: classes4.dex */
public final class o0 implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f453762d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f453763e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f453764f;

    public o0(java.lang.String username, java.lang.String snsFeedId, java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(snsFeedId, "snsFeedId");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        this.f453762d = username;
        this.f453763e = snsFeedId;
        this.f453764f = sessionId;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe0.o0)) {
            return false;
        }
        xe0.o0 o0Var = (xe0.o0) obj;
        return kotlin.jvm.internal.o.b(this.f453762d, o0Var.f453762d) && kotlin.jvm.internal.o.b(this.f453763e, o0Var.f453763e) && kotlin.jvm.internal.o.b(this.f453764f, o0Var.f453764f);
    }

    public int hashCode() {
        return (((this.f453762d.hashCode() * 31) + this.f453763e.hashCode()) * 31) + this.f453764f.hashCode();
    }

    public java.lang.String toString() {
        return "StatusIconReportSnsParams(username=" + this.f453762d + ", snsFeedId=" + this.f453763e + ", sessionId=" + this.f453764f + ')';
    }

    public /* synthetic */ o0(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, kotlin.jvm.internal.i iVar) {
        this(str, (i17 & 2) != 0 ? "" : str2, (i17 & 4) != 0 ? "" : str3);
    }
}
