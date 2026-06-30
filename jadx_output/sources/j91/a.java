package j91;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f298343a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f298344b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f298345c;

    /* renamed from: d, reason: collision with root package name */
    public final int f298346d;

    public a(java.lang.String userName, java.lang.String openGid, java.lang.String openSingleRoomId, int i17, int i18, kotlin.jvm.internal.i iVar) {
        userName = (i18 & 1) != 0 ? "" : userName;
        openGid = (i18 & 2) != 0 ? "" : openGid;
        openSingleRoomId = (i18 & 4) != 0 ? "" : openSingleRoomId;
        i17 = (i18 & 8) != 0 ? -1 : i17;
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(openGid, "openGid");
        kotlin.jvm.internal.o.g(openSingleRoomId, "openSingleRoomId");
        this.f298343a = userName;
        this.f298344b = openGid;
        this.f298345c = openSingleRoomId;
        this.f298346d = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j91.a)) {
            return false;
        }
        j91.a aVar = (j91.a) obj;
        return kotlin.jvm.internal.o.b(this.f298343a, aVar.f298343a) && kotlin.jvm.internal.o.b(this.f298344b, aVar.f298344b) && kotlin.jvm.internal.o.b(this.f298345c, aVar.f298345c) && this.f298346d == aVar.f298346d;
    }

    public int hashCode() {
        return (((((this.f298343a.hashCode() * 31) + this.f298344b.hashCode()) * 31) + this.f298345c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f298346d);
    }

    public java.lang.String toString() {
        return "ChatToolAllPageRoom(userName=" + this.f298343a + ", openGid=" + this.f298344b + ", openSingleRoomId=" + this.f298345c + ", chatType=" + this.f298346d + ')';
    }
}
