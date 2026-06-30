package fy;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f267158a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f267159b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f267160c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f267161d;

    /* renamed from: e, reason: collision with root package name */
    public final long f267162e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f267163f;

    public a(java.lang.String chatId, java.lang.String nickname, java.lang.String remark, java.lang.String desc, long j17, java.lang.String matchedKeyword) {
        kotlin.jvm.internal.o.g(chatId, "chatId");
        kotlin.jvm.internal.o.g(nickname, "nickname");
        kotlin.jvm.internal.o.g(remark, "remark");
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(matchedKeyword, "matchedKeyword");
        this.f267158a = chatId;
        this.f267159b = nickname;
        this.f267160c = remark;
        this.f267161d = desc;
        this.f267162e = j17;
        this.f267163f = matchedKeyword;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fy.a)) {
            return false;
        }
        fy.a aVar = (fy.a) obj;
        return kotlin.jvm.internal.o.b(this.f267158a, aVar.f267158a) && kotlin.jvm.internal.o.b(this.f267159b, aVar.f267159b) && kotlin.jvm.internal.o.b(this.f267160c, aVar.f267160c) && kotlin.jvm.internal.o.b(this.f267161d, aVar.f267161d) && this.f267162e == aVar.f267162e && kotlin.jvm.internal.o.b(this.f267163f, aVar.f267163f);
    }

    public int hashCode() {
        return (((((((((this.f267158a.hashCode() * 31) + this.f267159b.hashCode()) * 31) + this.f267160c.hashCode()) * 31) + this.f267161d.hashCode()) * 31) + java.lang.Long.hashCode(this.f267162e)) * 31) + this.f267163f.hashCode();
    }

    public java.lang.String toString() {
        return "ContactResult(chatId=" + this.f267158a + ", nickname=" + this.f267159b + ", remark=" + this.f267160c + ", desc=" + this.f267161d + ", recentChatTime=" + this.f267162e + ", matchedKeyword=" + this.f267163f + ')';
    }
}
