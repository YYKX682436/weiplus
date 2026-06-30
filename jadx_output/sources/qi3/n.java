package qi3;

/* loaded from: classes12.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f363748a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f363749b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f363750c;

    /* renamed from: d, reason: collision with root package name */
    public final int f363751d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f363752e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f363753f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f363754g;

    public n(java.lang.String fromUserName, java.lang.String toUserName, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18, kotlin.jvm.internal.i iVar) {
        i17 = (i18 & 8) != 0 ? 0 : i17;
        str4 = (i18 & 64) != 0 ? null : str4;
        kotlin.jvm.internal.o.g(fromUserName, "fromUserName");
        kotlin.jvm.internal.o.g(toUserName, "toUserName");
        this.f363748a = fromUserName;
        this.f363749b = toUserName;
        this.f363750c = str;
        this.f363751d = i17;
        this.f363752e = str2;
        this.f363753f = str3;
        this.f363754g = str4;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qi3.n)) {
            return false;
        }
        qi3.n nVar = (qi3.n) obj;
        return kotlin.jvm.internal.o.b(this.f363748a, nVar.f363748a) && kotlin.jvm.internal.o.b(this.f363749b, nVar.f363749b) && kotlin.jvm.internal.o.b(this.f363750c, nVar.f363750c) && this.f363751d == nVar.f363751d && kotlin.jvm.internal.o.b(this.f363752e, nVar.f363752e) && kotlin.jvm.internal.o.b(this.f363753f, nVar.f363753f) && kotlin.jvm.internal.o.b(this.f363754g, nVar.f363754g);
    }

    public int hashCode() {
        int hashCode = ((this.f363748a.hashCode() * 31) + this.f363749b.hashCode()) * 31;
        java.lang.String str = this.f363750c;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f363751d)) * 31;
        java.lang.String str2 = this.f363752e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f363753f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f363754g;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "BypSendParams(fromUserName=" + this.f363748a + ", toUserName=" + this.f363749b + ", sessionId=" + this.f363750c + ", bizType=" + this.f363751d + ", msgSource=" + this.f363752e + ", cliMsgId=" + this.f363753f + ", fileName=" + this.f363754g + ')';
    }
}
