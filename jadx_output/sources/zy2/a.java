package zy2;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f477334a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f477335b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f477336c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f477337d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f477338e;

    public a(java.lang.String sdkUserId, java.lang.String userName, boolean z17, java.lang.String nickName, java.lang.String avatarUrl) {
        kotlin.jvm.internal.o.g(sdkUserId, "sdkUserId");
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(nickName, "nickName");
        kotlin.jvm.internal.o.g(avatarUrl, "avatarUrl");
        this.f477334a = sdkUserId;
        this.f477335b = userName;
        this.f477336c = z17;
        this.f477337d = nickName;
        this.f477338e = avatarUrl;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy2.a)) {
            return false;
        }
        zy2.a aVar = (zy2.a) obj;
        return kotlin.jvm.internal.o.b(this.f477334a, aVar.f477334a) && kotlin.jvm.internal.o.b(this.f477335b, aVar.f477335b) && this.f477336c == aVar.f477336c && kotlin.jvm.internal.o.b(this.f477337d, aVar.f477337d) && kotlin.jvm.internal.o.b(this.f477338e, aVar.f477338e);
    }

    public int hashCode() {
        return (((((((this.f477334a.hashCode() * 31) + this.f477335b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f477336c)) * 31) + this.f477337d.hashCode()) * 31) + this.f477338e.hashCode();
    }

    public java.lang.String toString() {
        return "AnchorData(sdkUserId=" + this.f477334a + ", userName=" + this.f477335b + ", audioMode=" + this.f477336c + ", nickName=" + this.f477337d + ", avatarUrl=" + this.f477338e + ')';
    }

    public /* synthetic */ a(java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3, java.lang.String str4, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? "" : str, (i17 & 2) != 0 ? "" : str2, (i17 & 4) != 0 ? false : z17, (i17 & 8) != 0 ? "" : str3, (i17 & 16) != 0 ? "" : str4);
    }
}
