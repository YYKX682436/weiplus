package m71;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.account.ui.w6 f324479a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f324480b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f324481c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f324482d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f324483e;

    public a(com.tencent.mm.plugin.account.ui.w6 loginData, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.o.g(loginData, "loginData");
        this.f324479a = loginData;
        this.f324480b = str;
        this.f324481c = str2;
        this.f324482d = str3;
        this.f324483e = str4;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m71.a)) {
            return false;
        }
        m71.a aVar = (m71.a) obj;
        return kotlin.jvm.internal.o.b(this.f324479a, aVar.f324479a) && kotlin.jvm.internal.o.b(this.f324480b, aVar.f324480b) && kotlin.jvm.internal.o.b(this.f324481c, aVar.f324481c) && kotlin.jvm.internal.o.b(this.f324482d, aVar.f324482d) && kotlin.jvm.internal.o.b(this.f324483e, aVar.f324483e);
    }

    public int hashCode() {
        int hashCode = this.f324479a.hashCode() * 31;
        java.lang.String str = this.f324480b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f324481c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f324482d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f324483e;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "AuthData(loginData=" + this.f324479a + ", authTicket=" + this.f324480b + ", authTargetUserName=" + this.f324481c + ", userSelfShowName=" + this.f324482d + ", extSpamCtxString=" + this.f324483e + ')';
    }
}
