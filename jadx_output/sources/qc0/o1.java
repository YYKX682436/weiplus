package qc0;

/* loaded from: classes7.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f361424a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f361425b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Long f361426c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f361427d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f361428e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f361429f;

    public o1(java.lang.String str, java.lang.String str2, java.lang.Long l17, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.f361424a = str;
        this.f361425b = str2;
        this.f361426c = l17;
        this.f361427d = str3;
        this.f361428e = str4;
        this.f361429f = str5;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc0.o1)) {
            return false;
        }
        qc0.o1 o1Var = (qc0.o1) obj;
        return kotlin.jvm.internal.o.b(this.f361424a, o1Var.f361424a) && kotlin.jvm.internal.o.b(this.f361425b, o1Var.f361425b) && kotlin.jvm.internal.o.b(this.f361426c, o1Var.f361426c) && kotlin.jvm.internal.o.b(this.f361427d, o1Var.f361427d) && kotlin.jvm.internal.o.b(this.f361428e, o1Var.f361428e) && kotlin.jvm.internal.o.b(this.f361429f, o1Var.f361429f);
    }

    public int hashCode() {
        java.lang.String str = this.f361424a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f361425b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Long l17 = this.f361426c;
        int hashCode3 = (hashCode2 + (l17 == null ? 0 : l17.hashCode())) * 31;
        java.lang.String str3 = this.f361427d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f361428e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.f361429f;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "MediaTextCoverInfo(aiPicId=" + this.f361424a + ", aiPicPrompt=" + this.f361425b + ", aiPicSource=" + this.f361426c + ", aiPicTemplateId=" + this.f361427d + ", aiPicDataBuf=" + this.f361428e + ", aiPicStyle=" + this.f361429f + ')';
    }
}
