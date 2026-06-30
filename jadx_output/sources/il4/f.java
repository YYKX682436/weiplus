package il4;

/* loaded from: classes11.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public boolean f292129a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f292130b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f292131c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f292132d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f292133e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f292134f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f292135g;

    public f(boolean z17, boolean z18, boolean z19, java.util.Map extInfo, java.util.Map activeSessionExtInfo, java.util.Map activeSessionExtInfo2, java.lang.String str, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 1) != 0 ? false : z17;
        z18 = (i17 & 2) != 0 ? false : z18;
        z19 = (i17 & 4) != 0 ? false : z19;
        extInfo = (i17 & 8) != 0 ? new java.util.LinkedHashMap() : extInfo;
        activeSessionExtInfo = (i17 & 16) != 0 ? new java.util.LinkedHashMap() : activeSessionExtInfo;
        activeSessionExtInfo2 = (i17 & 32) != 0 ? new java.util.LinkedHashMap() : activeSessionExtInfo2;
        str = (i17 & 64) != 0 ? null : str;
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        kotlin.jvm.internal.o.g(activeSessionExtInfo, "activeSessionExtInfo");
        kotlin.jvm.internal.o.g(activeSessionExtInfo2, "activeSessionExtInfo2");
        this.f292129a = z17;
        this.f292130b = z18;
        this.f292131c = z19;
        this.f292132d = extInfo;
        this.f292133e = activeSessionExtInfo;
        this.f292134f = activeSessionExtInfo2;
        this.f292135g = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il4.f)) {
            return false;
        }
        il4.f fVar = (il4.f) obj;
        return this.f292129a == fVar.f292129a && this.f292130b == fVar.f292130b && this.f292131c == fVar.f292131c && kotlin.jvm.internal.o.b(this.f292132d, fVar.f292132d) && kotlin.jvm.internal.o.b(this.f292133e, fVar.f292133e) && kotlin.jvm.internal.o.b(this.f292134f, fVar.f292134f) && kotlin.jvm.internal.o.b(this.f292135g, fVar.f292135g);
    }

    public int hashCode() {
        int hashCode = ((((((((((java.lang.Boolean.hashCode(this.f292129a) * 31) + java.lang.Boolean.hashCode(this.f292130b)) * 31) + java.lang.Boolean.hashCode(this.f292131c)) * 31) + this.f292132d.hashCode()) * 31) + this.f292133e.hashCode()) * 31) + this.f292134f.hashCode()) * 31;
        java.lang.String str = this.f292135g;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "TingItemSessionExt(consumed=" + this.f292129a + ", enter=" + this.f292130b + ", isHalfScreen=" + this.f292131c + ", extInfo=" + this.f292132d + ", activeSessionExtInfo=" + this.f292133e + ", activeSessionExtInfo2=" + this.f292134f + ", listenId=" + this.f292135g + ')';
    }
}
