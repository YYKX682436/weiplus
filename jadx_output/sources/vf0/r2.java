package vf0;

/* loaded from: classes12.dex */
public final class r2 {

    /* renamed from: a, reason: collision with root package name */
    public final c01.f7 f436257a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.uf6 f436258b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f436259c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.xz6 f436260d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f436261e;

    /* renamed from: f, reason: collision with root package name */
    public r45.vh4 f436262f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f436263g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f436264h;

    /* renamed from: i, reason: collision with root package name */
    public r15.d f436265i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f436266j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f436267k;

    public r2(c01.f7 f7Var, r45.uf6 uf6Var, java.lang.String str, r45.xz6 xz6Var, java.lang.String str2, r45.vh4 vh4Var, boolean z17, vf0.p2 p2Var, java.lang.String str3, r15.d dVar, boolean z18, boolean z19) {
        this.f436257a = f7Var;
        this.f436258b = uf6Var;
        this.f436259c = str;
        this.f436260d = xz6Var;
        this.f436261e = str2;
        this.f436262f = vh4Var;
        this.f436263g = z17;
        this.f436264h = str3;
        this.f436265i = dVar;
        this.f436266j = z18;
        this.f436267k = z19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf0.r2)) {
            return false;
        }
        vf0.r2 r2Var = (vf0.r2) obj;
        return kotlin.jvm.internal.o.b(this.f436257a, r2Var.f436257a) && kotlin.jvm.internal.o.b(this.f436258b, r2Var.f436258b) && kotlin.jvm.internal.o.b(this.f436259c, r2Var.f436259c) && kotlin.jvm.internal.o.b(this.f436260d, r2Var.f436260d) && kotlin.jvm.internal.o.b(this.f436261e, r2Var.f436261e) && kotlin.jvm.internal.o.b(this.f436262f, r2Var.f436262f) && this.f436263g == r2Var.f436263g && kotlin.jvm.internal.o.b(null, null) && kotlin.jvm.internal.o.b(this.f436264h, r2Var.f436264h) && kotlin.jvm.internal.o.b(this.f436265i, r2Var.f436265i) && this.f436266j == r2Var.f436266j && this.f436267k == r2Var.f436267k;
    }

    public int hashCode() {
        c01.f7 f7Var = this.f436257a;
        int hashCode = (f7Var == null ? 0 : f7Var.hashCode()) * 31;
        r45.uf6 uf6Var = this.f436258b;
        int hashCode2 = (hashCode + (uf6Var == null ? 0 : uf6Var.hashCode())) * 31;
        java.lang.String str = this.f436259c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        r45.xz6 xz6Var = this.f436260d;
        int hashCode4 = (hashCode3 + (xz6Var == null ? 0 : xz6Var.hashCode())) * 31;
        java.lang.String str2 = this.f436261e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        r45.vh4 vh4Var = this.f436262f;
        int hashCode6 = (((((hashCode5 + (vh4Var == null ? 0 : vh4Var.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f436263g)) * 31) + 0) * 31;
        java.lang.String str3 = this.f436264h;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        r15.d dVar = this.f436265i;
        return ((((hashCode7 + (dVar != null ? dVar.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f436266j)) * 31) + java.lang.Boolean.hashCode(this.f436267k);
    }

    public java.lang.String toString() {
        return "VideoSendCrossData(favDataItem=" + this.f436257a + ", streamVideo=" + this.f436258b + ", stateExtStr=" + this.f436259c + ", videoWxaInfo=" + this.f436260d + ", weAppSourceUserName=" + this.f436261e + ", mmSightExtInfo=" + this.f436262f + ", importFromTempCopyPath=" + this.f436263g + ", appInfo=null, batchRevokeId=" + this.f436264h + ", groupInfo=" + this.f436265i + ", onlySendCompressVideo=" + this.f436266j + ", forceSkipCompress=" + this.f436267k + ')';
    }

    public /* synthetic */ r2(c01.f7 f7Var, r45.uf6 uf6Var, java.lang.String str, r45.xz6 xz6Var, java.lang.String str2, r45.vh4 vh4Var, boolean z17, vf0.p2 p2Var, java.lang.String str3, r15.d dVar, boolean z18, boolean z19, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : f7Var, (i17 & 2) != 0 ? null : uf6Var, (i17 & 4) != 0 ? null : str, (i17 & 8) != 0 ? null : xz6Var, (i17 & 16) != 0 ? null : str2, (i17 & 32) != 0 ? null : vh4Var, (i17 & 64) != 0 ? false : z17, (i17 & 128) != 0 ? null : p2Var, (i17 & 256) != 0 ? null : str3, (i17 & 512) == 0 ? dVar : null, (i17 & 1024) != 0 ? false : z18, (i17 & 2048) == 0 ? z19 : false);
    }
}
