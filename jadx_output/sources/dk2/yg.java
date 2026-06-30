package dk2;

/* loaded from: classes10.dex */
public final class yg {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f234393a;

    /* renamed from: b, reason: collision with root package name */
    public long f234394b;

    /* renamed from: c, reason: collision with root package name */
    public int f234395c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f234396d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f234397e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f234398f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f234399g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f234400h;

    /* renamed from: i, reason: collision with root package name */
    public final int f234401i;

    public yg(java.lang.String songName, long j17, int i17, boolean z17, boolean z18, boolean z19, boolean z27, java.lang.String str, int i18) {
        kotlin.jvm.internal.o.g(songName, "songName");
        this.f234393a = songName;
        this.f234394b = j17;
        this.f234395c = i17;
        this.f234396d = z17;
        this.f234397e = z18;
        this.f234398f = z19;
        this.f234399g = z27;
        this.f234400h = str;
        this.f234401i = i18;
    }

    public final boolean a() {
        return this.f234401i == 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk2.yg)) {
            return false;
        }
        dk2.yg ygVar = (dk2.yg) obj;
        return kotlin.jvm.internal.o.b(this.f234393a, ygVar.f234393a) && this.f234394b == ygVar.f234394b && this.f234395c == ygVar.f234395c && this.f234396d == ygVar.f234396d && this.f234397e == ygVar.f234397e && this.f234398f == ygVar.f234398f && this.f234399g == ygVar.f234399g && kotlin.jvm.internal.o.b(this.f234400h, ygVar.f234400h) && this.f234401i == ygVar.f234401i;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.f234393a.hashCode() * 31) + java.lang.Long.hashCode(this.f234394b)) * 31) + java.lang.Integer.hashCode(this.f234395c)) * 31) + java.lang.Boolean.hashCode(this.f234396d)) * 31) + java.lang.Boolean.hashCode(this.f234397e)) * 31) + java.lang.Boolean.hashCode(this.f234398f)) * 31) + java.lang.Boolean.hashCode(this.f234399g)) * 31;
        java.lang.String str = this.f234400h;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f234401i);
    }

    public java.lang.String toString() {
        return "songName :" + this.f234393a + ", heat: " + this.f234394b + ", select:" + this.f234396d;
    }

    public /* synthetic */ yg(java.lang.String str, long j17, int i17, boolean z17, boolean z18, boolean z19, boolean z27, java.lang.String str2, int i18, int i19, kotlin.jvm.internal.i iVar) {
        this(str, j17, (i19 & 4) != 0 ? 3 : i17, (i19 & 8) != 0 ? false : z17, (i19 & 16) != 0 ? true : z18, (i19 & 32) != 0 ? false : z19, (i19 & 64) != 0 ? false : z27, (i19 & 128) != 0 ? null : str2, (i19 & 256) != 0 ? 0 : i18);
    }
}
