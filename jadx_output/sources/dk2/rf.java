package dk2;

/* loaded from: classes10.dex */
public final class rf implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f234039d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f234040e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f234041f;

    /* renamed from: g, reason: collision with root package name */
    public final float f234042g;

    /* renamed from: h, reason: collision with root package name */
    public final float f234043h;

    /* renamed from: i, reason: collision with root package name */
    public final long f234044i;

    /* renamed from: m, reason: collision with root package name */
    public final int f234045m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Long f234046n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Long f234047o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f234048p;

    /* renamed from: q, reason: collision with root package name */
    public final int f234049q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f234050r;

    public rf(r45.gl4 micReplayInfo) {
        kotlin.jvm.internal.o.g(micReplayInfo, "micReplayInfo");
        this.f234039d = null;
        this.f234040e = null;
        this.f234041f = null;
        this.f234042g = 0.0f;
        this.f234043h = 0.0f;
        this.f234044i = 0L;
        this.f234045m = 0;
        this.f234046n = null;
        this.f234047o = null;
        this.f234048p = null;
        this.f234049q = 0;
        this.f234050r = null;
        this.f234039d = micReplayInfo.getString(0);
        this.f234040e = micReplayInfo.getString(1);
        this.f234041f = micReplayInfo.getString(11);
        this.f234042g = micReplayInfo.getFloat(6);
        this.f234043h = micReplayInfo.getFloat(12);
        this.f234044i = micReplayInfo.getLong(14);
        this.f234045m = (int) micReplayInfo.getLong(2);
        this.f234046n = java.lang.Long.valueOf(micReplayInfo.getLong(10));
        this.f234047o = java.lang.Long.valueOf(micReplayInfo.getLong(9));
        r45.c54 c54Var = (r45.c54) micReplayInfo.getCustom(15);
        this.f234048p = c54Var != null ? c54Var.getString(0) : null;
        r45.c54 c54Var2 = (r45.c54) micReplayInfo.getCustom(15);
        this.f234049q = c54Var2 != null ? c54Var2.getInteger(1) : 0;
        r45.c54 c54Var3 = (r45.c54) micReplayInfo.getCustom(15);
        this.f234050r = c54Var3 != null ? c54Var3.getString(2) : null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk2.rf)) {
            return false;
        }
        dk2.rf rfVar = (dk2.rf) obj;
        return kotlin.jvm.internal.o.b(this.f234039d, rfVar.f234039d) && kotlin.jvm.internal.o.b(this.f234040e, rfVar.f234040e) && kotlin.jvm.internal.o.b(this.f234041f, rfVar.f234041f) && java.lang.Float.compare(this.f234042g, rfVar.f234042g) == 0 && java.lang.Float.compare(this.f234043h, rfVar.f234043h) == 0 && this.f234044i == rfVar.f234044i && this.f234045m == rfVar.f234045m && kotlin.jvm.internal.o.b(this.f234046n, rfVar.f234046n) && kotlin.jvm.internal.o.b(this.f234047o, rfVar.f234047o) && kotlin.jvm.internal.o.b(this.f234048p, rfVar.f234048p) && this.f234049q == rfVar.f234049q && kotlin.jvm.internal.o.b(this.f234050r, rfVar.f234050r);
    }

    public int hashCode() {
        java.lang.String str = this.f234039d;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f234040e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f234041f;
        int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + java.lang.Float.hashCode(this.f234042g)) * 31) + java.lang.Float.hashCode(this.f234043h)) * 31) + java.lang.Long.hashCode(this.f234044i)) * 31) + java.lang.Integer.hashCode(this.f234045m)) * 31;
        java.lang.Long l17 = this.f234046n;
        int hashCode4 = (hashCode3 + (l17 == null ? 0 : l17.hashCode())) * 31;
        java.lang.Long l18 = this.f234047o;
        int hashCode5 = (hashCode4 + (l18 == null ? 0 : l18.hashCode())) * 31;
        java.lang.String str4 = this.f234048p;
        int hashCode6 = (((hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31) + java.lang.Integer.hashCode(this.f234049q)) * 31;
        java.lang.String str5 = this.f234050r;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "FinderLiveVisitorMicReplayInfo(micReplayId=" + this.f234039d + ", micReplayUrl=" + this.f234040e + ", coverImageUrl=" + this.f234041f + ", replayDuration=" + this.f234042g + ", progress=" + this.f234043h + ", expiredTs=" + this.f234044i + ", status=" + this.f234045m + ", liveId=" + this.f234046n + ", objectId=" + this.f234047o + ", songName=" + this.f234048p + ", songScore=" + this.f234049q + ", songLevel=" + this.f234050r + ')';
    }
}
