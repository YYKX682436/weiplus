package lc5;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final long f318017a;

    /* renamed from: b, reason: collision with root package name */
    public final long f318018b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f318019c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f318020d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f318021e;

    public m(long j17, long j18, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f318017a = j17;
        this.f318018b = j18;
        this.f318019c = str;
        this.f318020d = str2;
        this.f318021e = str3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc5.m)) {
            return false;
        }
        lc5.m mVar = (lc5.m) obj;
        return this.f318017a == mVar.f318017a && this.f318018b == mVar.f318018b && kotlin.jvm.internal.o.b(this.f318019c, mVar.f318019c) && kotlin.jvm.internal.o.b(this.f318020d, mVar.f318020d) && kotlin.jvm.internal.o.b(this.f318021e, mVar.f318021e);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Long.hashCode(this.f318017a) * 31) + java.lang.Long.hashCode(this.f318018b)) * 31;
        java.lang.String str = this.f318019c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f318020d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f318021e;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "MessageInfo(msgId=" + this.f318017a + ", msgSvrId=" + this.f318018b + ", talker=" + this.f318019c + ", chatroomName=" + this.f318020d + ", msgTalker=" + this.f318021e + ')';
    }
}
