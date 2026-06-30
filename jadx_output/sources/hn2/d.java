package hn2;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: o, reason: collision with root package name */
    public static final hn2.c f282504o = new hn2.c(null);

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f282505a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f282506b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f282507c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f282508d;

    /* renamed from: e, reason: collision with root package name */
    public int f282509e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f282510f;

    /* renamed from: g, reason: collision with root package name */
    public int f282511g;

    /* renamed from: h, reason: collision with root package name */
    public int f282512h;

    /* renamed from: i, reason: collision with root package name */
    public int f282513i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f282514j;

    /* renamed from: k, reason: collision with root package name */
    public int f282515k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f282516l;

    /* renamed from: m, reason: collision with root package name */
    public hn2.e f282517m;

    /* renamed from: n, reason: collision with root package name */
    public r45.cy1 f282518n;

    public d(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, java.lang.String str5, int i18, int i19, int i27, boolean z17, int i28, boolean z18, hn2.e eVar, r45.cy1 cy1Var, int i29, kotlin.jvm.internal.i iVar) {
        java.lang.String str6 = (i29 & 1) != 0 ? null : str;
        java.lang.String str7 = (i29 & 2) != 0 ? null : str2;
        java.lang.String str8 = (i29 & 4) != 0 ? null : str3;
        java.lang.String str9 = (i29 & 8) != 0 ? null : str4;
        int i37 = (i29 & 16) != 0 ? 0 : i17;
        java.lang.String str10 = (i29 & 32) != 0 ? null : str5;
        int i38 = (i29 & 64) != 0 ? 0 : i18;
        int i39 = (i29 & 128) != 0 ? 0 : i19;
        int i47 = (i29 & 256) != 0 ? 0 : i27;
        boolean z19 = (i29 & 512) != 0 ? false : z17;
        int i48 = (i29 & 1024) != 0 ? 0 : i28;
        boolean z27 = (i29 & 2048) == 0 ? z18 : false;
        hn2.e eVar2 = (i29 & 4096) != 0 ? null : eVar;
        r45.cy1 cy1Var2 = (i29 & 8192) == 0 ? cy1Var : null;
        this.f282505a = str6;
        this.f282506b = str7;
        this.f282507c = str8;
        this.f282508d = str9;
        this.f282509e = i37;
        this.f282510f = str10;
        this.f282511g = i38;
        this.f282512h = i39;
        this.f282513i = i47;
        this.f282514j = z19;
        this.f282515k = i48;
        this.f282516l = z27;
        this.f282517m = eVar2;
        this.f282518n = cy1Var2;
    }

    public final int a() {
        hn2.e eVar;
        int i17;
        if (this.f282516l && (eVar = this.f282517m) != null) {
            int i18 = eVar.f282521c;
            return (i18 <= 0 || (i17 = eVar.f282520b) < 0 || i18 <= i17) ? this.f282509e : (int) ((i18 - i17) / 1000.0d);
        }
        return this.f282509e;
    }

    public final r45.zr5 b() {
        boolean z17;
        r45.cy1 cy1Var = this.f282518n;
        if (cy1Var == null) {
            return null;
        }
        java.util.LinkedList linkedList = cy1Var.f371920d;
        boolean z18 = true;
        boolean z19 = false;
        if (linkedList != null && !linkedList.isEmpty()) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                if (((r45.ec6) it.next()).f373272d == 3) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        if (linkedList != null) {
            if (!linkedList.isEmpty()) {
                java.util.Iterator it6 = linkedList.iterator();
                while (it6.hasNext()) {
                    if (((r45.ec6) it6.next()).f373272d == 4) {
                        break;
                    }
                }
            }
            z18 = false;
            z19 = z18;
        }
        if (z17) {
            return r45.zr5.ResourceInfoType_SongPlayURL;
        }
        if (z19) {
            return r45.zr5.ResourceInfoType_AccPlayURL;
        }
        return null;
    }

    public final boolean c() {
        return this.f282513i == 1;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hn2.d)) {
            return false;
        }
        hn2.d dVar = (hn2.d) obj;
        return kotlin.jvm.internal.o.b(this.f282505a, dVar.f282505a) && kotlin.jvm.internal.o.b(this.f282506b, dVar.f282506b) && kotlin.jvm.internal.o.b(this.f282507c, dVar.f282507c) && kotlin.jvm.internal.o.b(this.f282508d, dVar.f282508d) && this.f282509e == dVar.f282509e && kotlin.jvm.internal.o.b(this.f282510f, dVar.f282510f) && this.f282511g == dVar.f282511g && this.f282512h == dVar.f282512h && this.f282513i == dVar.f282513i && this.f282514j == dVar.f282514j && this.f282515k == dVar.f282515k && this.f282516l == dVar.f282516l && kotlin.jvm.internal.o.b(this.f282517m, dVar.f282517m) && kotlin.jvm.internal.o.b(this.f282518n, dVar.f282518n);
    }

    public int hashCode() {
        java.lang.String str = this.f282505a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f282506b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f282507c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f282508d;
        int hashCode4 = (((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + java.lang.Integer.hashCode(this.f282509e)) * 31;
        java.lang.String str5 = this.f282510f;
        int hashCode5 = (((((((((((((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + java.lang.Integer.hashCode(this.f282511g)) * 31) + java.lang.Integer.hashCode(this.f282512h)) * 31) + java.lang.Integer.hashCode(this.f282513i)) * 31) + java.lang.Boolean.hashCode(this.f282514j)) * 31) + java.lang.Integer.hashCode(this.f282515k)) * 31) + java.lang.Boolean.hashCode(this.f282516l)) * 31;
        hn2.e eVar = this.f282517m;
        int hashCode6 = (hashCode5 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        r45.cy1 cy1Var = this.f282518n;
        return hashCode6 + (cy1Var != null ? cy1Var.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "FinderLiveKtvSongBasicInfo(song_mid=" + this.f282505a + ", song_name=" + this.f282506b + ", singer_mid=" + this.f282507c + ", singer_name=" + this.f282508d + ", duration=" + this.f282509e + ", cover=" + this.f282510f + ", has_note=" + this.f282511g + ", has_song_fileid=" + this.f282512h + ", has_added=" + this.f282513i + ", isDownloading=" + this.f282514j + ", downloadProgress=" + this.f282515k + ", onlySingSegment=" + this.f282516l + ", segmentInfo=" + this.f282517m + ", resourceInfo=" + this.f282518n + ')';
    }
}
