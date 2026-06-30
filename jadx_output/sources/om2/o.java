package om2;

/* loaded from: classes10.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f346360a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.xn1 f346361b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f346362c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f346363d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f346364e;

    /* renamed from: f, reason: collision with root package name */
    public final int f346365f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f346366g;

    public o(java.lang.String userId, r45.xn1 xn1Var, java.lang.String uniQueId, java.lang.String songId, java.lang.String songName, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(userId, "userId");
        kotlin.jvm.internal.o.g(uniQueId, "uniQueId");
        kotlin.jvm.internal.o.g(songId, "songId");
        kotlin.jvm.internal.o.g(songName, "songName");
        this.f346360a = userId;
        this.f346361b = xn1Var;
        this.f346362c = uniQueId;
        this.f346363d = songId;
        this.f346364e = songName;
        this.f346365f = i17;
        this.f346366g = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om2.o)) {
            return false;
        }
        om2.o oVar = (om2.o) obj;
        return kotlin.jvm.internal.o.b(this.f346360a, oVar.f346360a) && kotlin.jvm.internal.o.b(this.f346361b, oVar.f346361b) && kotlin.jvm.internal.o.b(this.f346362c, oVar.f346362c) && kotlin.jvm.internal.o.b(this.f346363d, oVar.f346363d) && kotlin.jvm.internal.o.b(this.f346364e, oVar.f346364e) && this.f346365f == oVar.f346365f && this.f346366g == oVar.f346366g;
    }

    public int hashCode() {
        int hashCode = this.f346360a.hashCode() * 31;
        r45.xn1 xn1Var = this.f346361b;
        return ((((((((((hashCode + (xn1Var == null ? 0 : xn1Var.hashCode())) * 31) + this.f346362c.hashCode()) * 31) + this.f346363d.hashCode()) * 31) + this.f346364e.hashCode()) * 31) + java.lang.Integer.hashCode(this.f346365f)) * 31) + java.lang.Boolean.hashCode(this.f346366g);
    }

    public java.lang.String toString() {
        return "LiveSimpleSongInfo(userId=" + this.f346360a + ", singerContact=" + this.f346361b + ", uniQueId=" + this.f346362c + ", songId=" + this.f346363d + ", songName=" + this.f346364e + ", scoreSdkFlag=" + this.f346365f + ", onlySingSegment=" + this.f346366g + ')';
    }

    public /* synthetic */ o(java.lang.String str, r45.xn1 xn1Var, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, boolean z17, int i18, kotlin.jvm.internal.i iVar) {
        this(str, xn1Var, str2, str3, str4, i17, (i18 & 64) != 0 ? false : z17);
    }
}
