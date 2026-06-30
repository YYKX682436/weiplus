package r01;

/* loaded from: classes9.dex */
public final class b2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f368027a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f368028b;

    /* renamed from: c, reason: collision with root package name */
    public final long f368029c;

    /* renamed from: d, reason: collision with root package name */
    public final long f368030d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f368031e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f368032f;

    public b2(int i17, java.lang.String msgContent, long j17, long j18, java.lang.String username, java.lang.String str) {
        kotlin.jvm.internal.o.g(msgContent, "msgContent");
        kotlin.jvm.internal.o.g(username, "username");
        this.f368027a = i17;
        this.f368028b = msgContent;
        this.f368029c = j17;
        this.f368030d = j18;
        this.f368031e = username;
        this.f368032f = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r01.b2)) {
            return false;
        }
        r01.b2 b2Var = (r01.b2) obj;
        return this.f368027a == b2Var.f368027a && kotlin.jvm.internal.o.b(this.f368028b, b2Var.f368028b) && this.f368029c == b2Var.f368029c && this.f368030d == b2Var.f368030d && kotlin.jvm.internal.o.b(this.f368031e, b2Var.f368031e) && kotlin.jvm.internal.o.b(this.f368032f, b2Var.f368032f);
    }

    public int hashCode() {
        int hashCode = ((((((((java.lang.Integer.hashCode(this.f368027a) * 31) + this.f368028b.hashCode()) * 31) + java.lang.Long.hashCode(this.f368029c)) * 31) + java.lang.Long.hashCode(this.f368030d)) * 31) + this.f368031e.hashCode()) * 31;
        java.lang.String str = this.f368032f;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "ClickBizContentInfo(fromScene=" + this.f368027a + ", msgContent=" + this.f368028b + ", msgSvrId=" + this.f368029c + ", msgId=" + this.f368030d + ", username=" + this.f368031e + ", talkerUserName=" + this.f368032f + ')';
    }
}
