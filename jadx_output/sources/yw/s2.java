package yw;

/* loaded from: classes7.dex */
public final class s2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f466455a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Integer f466456b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f466457c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f466458d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f466459e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Integer f466460f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Long f466461g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Long f466462h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Integer f466463i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f466464j;

    public s2(long j17, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.util.List list, java.lang.Integer num4, java.lang.Long l17, java.lang.Long l18, java.lang.Integer num5, java.lang.String str) {
        this.f466455a = j17;
        this.f466456b = num;
        this.f466457c = num2;
        this.f466458d = num3;
        this.f466459e = list;
        this.f466460f = num4;
        this.f466461g = l17;
        this.f466462h = l18;
        this.f466463i = num5;
        this.f466464j = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yw.s2)) {
            return false;
        }
        yw.s2 s2Var = (yw.s2) obj;
        return this.f466455a == s2Var.f466455a && kotlin.jvm.internal.o.b(this.f466456b, s2Var.f466456b) && kotlin.jvm.internal.o.b(this.f466457c, s2Var.f466457c) && kotlin.jvm.internal.o.b(this.f466458d, s2Var.f466458d) && kotlin.jvm.internal.o.b(this.f466459e, s2Var.f466459e) && kotlin.jvm.internal.o.b(this.f466460f, s2Var.f466460f) && kotlin.jvm.internal.o.b(this.f466461g, s2Var.f466461g) && kotlin.jvm.internal.o.b(this.f466462h, s2Var.f466462h) && kotlin.jvm.internal.o.b(this.f466463i, s2Var.f466463i) && kotlin.jvm.internal.o.b(this.f466464j, s2Var.f466464j);
    }

    public int hashCode() {
        int hashCode = java.lang.Long.hashCode(this.f466455a) * 31;
        java.lang.Integer num = this.f466456b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.Integer num2 = this.f466457c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.Integer num3 = this.f466458d;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        java.util.List list = this.f466459e;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        java.lang.Integer num4 = this.f466460f;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        java.lang.Long l17 = this.f466461g;
        int hashCode7 = (hashCode6 + (l17 == null ? 0 : l17.hashCode())) * 31;
        java.lang.Long l18 = this.f466462h;
        int hashCode8 = (hashCode7 + (l18 == null ? 0 : l18.hashCode())) * 31;
        java.lang.Integer num5 = this.f466463i;
        int hashCode9 = (hashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        java.lang.String str = this.f466464j;
        return hashCode9 + (str != null ? str.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "BizTLResortEventInfo(sessionId=" + this.f466455a + ", unreadMsgCount=" + this.f466456b + ", unExposeMsgCount=" + this.f466457c + ", unValidExposeMsgCount=" + this.f466458d + ", unreadMsgTimeStampList=" + this.f466459e + ", covBoxIndex=" + this.f466460f + ", digestMsgBizUin=" + this.f466461g + ", digestMsgId=" + this.f466462h + ", digestMsgIdx=" + this.f466463i + ", digestWording=" + this.f466464j + ')';
    }

    public /* synthetic */ s2(long j17, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.util.List list, java.lang.Integer num4, java.lang.Long l17, java.lang.Long l18, java.lang.Integer num5, java.lang.String str, int i17, kotlin.jvm.internal.i iVar) {
        this(j17, (i17 & 2) != 0 ? -1 : num, (i17 & 4) != 0 ? -1 : num2, (i17 & 8) != 0 ? -1 : num3, (i17 & 16) != 0 ? null : list, (i17 & 32) != 0 ? -1 : num4, (i17 & 64) != 0 ? 0L : l17, (i17 & 128) != 0 ? 0L : l18, (i17 & 256) != 0 ? -1 : num5, (i17 & 512) != 0 ? null : str);
    }
}
