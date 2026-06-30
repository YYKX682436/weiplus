package ct0;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f222204a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f222205b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f222206c;

    /* renamed from: d, reason: collision with root package name */
    public int f222207d;

    /* renamed from: e, reason: collision with root package name */
    public int f222208e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f222209f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f222210g;

    /* renamed from: h, reason: collision with root package name */
    public int f222211h;

    /* renamed from: i, reason: collision with root package name */
    public int f222212i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f222213j;

    /* renamed from: k, reason: collision with root package name */
    public java.util.ArrayList f222214k;

    /* renamed from: l, reason: collision with root package name */
    public java.util.ArrayList f222215l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f222216m;

    /* renamed from: n, reason: collision with root package name */
    public android.os.Bundle f222217n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Rect f222218o;

    /* renamed from: p, reason: collision with root package name */
    public int f222219p;

    public b(java.lang.String str, java.lang.String str2, boolean z17, int i17, int i18, java.lang.String str3, java.lang.String str4, int i19, int i27, java.lang.String str5, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, boolean z18, android.os.Bundle bundle, android.graphics.Rect rect, int i28, int i29, kotlin.jvm.internal.i iVar) {
        java.lang.String sourceVideoPath = (i29 & 1) != 0 ? "" : str;
        java.lang.String sourceThumb = (i29 & 2) != 0 ? "" : str2;
        boolean z19 = (i29 & 4) != 0 ? false : z17;
        int i37 = (i29 & 8) != 0 ? 0 : i17;
        int i38 = (i29 & 16) != 0 ? 0 : i18;
        java.lang.String daemonVideoPath = (i29 & 32) != 0 ? "" : str3;
        java.lang.String daemonSourceThumb = (i29 & 64) != 0 ? "" : str4;
        int i39 = (i29 & 128) != 0 ? 0 : i19;
        int i47 = (i29 & 256) != 0 ? 0 : i27;
        java.lang.String photoPath = (i29 & 512) == 0 ? str5 : "";
        java.util.ArrayList photoList = (i29 & 1024) != 0 ? new java.util.ArrayList() : arrayList;
        java.util.ArrayList videoList = (i29 & 2048) != 0 ? new java.util.ArrayList() : arrayList2;
        boolean z27 = (i29 & 4096) != 0 ? false : z18;
        android.os.Bundle bundle2 = (i29 & 8192) != 0 ? null : bundle;
        android.graphics.Rect rect2 = (i29 & 16384) != 0 ? new android.graphics.Rect() : rect;
        int i48 = (i29 & 32768) != 0 ? 0 : i28;
        kotlin.jvm.internal.o.g(sourceVideoPath, "sourceVideoPath");
        kotlin.jvm.internal.o.g(sourceThumb, "sourceThumb");
        kotlin.jvm.internal.o.g(daemonVideoPath, "daemonVideoPath");
        kotlin.jvm.internal.o.g(daemonSourceThumb, "daemonSourceThumb");
        kotlin.jvm.internal.o.g(photoPath, "photoPath");
        kotlin.jvm.internal.o.g(photoList, "photoList");
        kotlin.jvm.internal.o.g(videoList, "videoList");
        kotlin.jvm.internal.o.g(rect2, "rect");
        this.f222204a = sourceVideoPath;
        this.f222205b = sourceThumb;
        this.f222206c = z19;
        this.f222207d = i37;
        this.f222208e = i38;
        this.f222209f = daemonVideoPath;
        this.f222210g = daemonSourceThumb;
        this.f222211h = i39;
        this.f222212i = i47;
        this.f222213j = photoPath;
        this.f222214k = photoList;
        this.f222215l = videoList;
        this.f222216m = z27;
        this.f222217n = bundle2;
        this.f222218o = rect2;
        this.f222219p = i48;
    }

    public final boolean a() {
        return !android.text.TextUtils.isEmpty(this.f222204a) && com.tencent.mm.vfs.w6.j(this.f222204a);
    }

    public final boolean b() {
        return !android.text.TextUtils.isEmpty(this.f222209f) && com.tencent.mm.vfs.w6.j(this.f222209f);
    }

    public final java.util.ArrayList c() {
        return this.f222214k;
    }

    public final java.lang.String d() {
        return a() ? this.f222204a : this.f222209f;
    }

    public final void e() {
        if (this.f222214k.size() == 0 && this.f222215l.size() == 1) {
            java.lang.String str = (java.lang.String) kz5.n0.X(this.f222215l);
            this.f222204a = str;
            com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(str, true);
            if (d17 != null) {
                this.f222208e = d17.f162382a;
            }
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ct0.b)) {
            return false;
        }
        ct0.b bVar = (ct0.b) obj;
        return kotlin.jvm.internal.o.b(this.f222204a, bVar.f222204a) && kotlin.jvm.internal.o.b(this.f222205b, bVar.f222205b) && this.f222206c == bVar.f222206c && this.f222207d == bVar.f222207d && this.f222208e == bVar.f222208e && kotlin.jvm.internal.o.b(this.f222209f, bVar.f222209f) && kotlin.jvm.internal.o.b(this.f222210g, bVar.f222210g) && this.f222211h == bVar.f222211h && this.f222212i == bVar.f222212i && kotlin.jvm.internal.o.b(this.f222213j, bVar.f222213j) && kotlin.jvm.internal.o.b(this.f222214k, bVar.f222214k) && kotlin.jvm.internal.o.b(this.f222215l, bVar.f222215l) && this.f222216m == bVar.f222216m && kotlin.jvm.internal.o.b(this.f222217n, bVar.f222217n) && kotlin.jvm.internal.o.b(this.f222218o, bVar.f222218o) && this.f222219p == bVar.f222219p;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((this.f222204a.hashCode() * 31) + this.f222205b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f222206c)) * 31) + java.lang.Integer.hashCode(this.f222207d)) * 31) + java.lang.Integer.hashCode(this.f222208e)) * 31) + this.f222209f.hashCode()) * 31) + this.f222210g.hashCode()) * 31) + java.lang.Integer.hashCode(this.f222211h)) * 31) + java.lang.Integer.hashCode(this.f222212i)) * 31) + this.f222213j.hashCode()) * 31) + this.f222214k.hashCode()) * 31) + this.f222215l.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f222216m)) * 31;
        android.os.Bundle bundle = this.f222217n;
        return ((((hashCode + (bundle == null ? 0 : bundle.hashCode())) * 31) + this.f222218o.hashCode()) * 31) + java.lang.Integer.hashCode(this.f222219p);
    }

    public java.lang.String toString() {
        return "MediaCaptureInfo(sourceVideoPath=" + this.f222204a + ", sourceThumb=" + this.f222205b + ", isCaptureVideo=" + this.f222206c + ", startTime=" + this.f222207d + ", endTime=" + this.f222208e + ", daemonVideoPath=" + this.f222209f + ", daemonSourceThumb=" + this.f222210g + ", daemonStartTime=" + this.f222211h + ", daemonEndTime=" + this.f222212i + ", photoPath=" + this.f222213j + ", photoList=" + this.f222214k + ", videoList=" + this.f222215l + ", isLandscape=" + this.f222216m + ", extInfo=" + this.f222217n + ", rect=" + this.f222218o + ", backgroundColor=" + this.f222219p + ')';
    }
}
