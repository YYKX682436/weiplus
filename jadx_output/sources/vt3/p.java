package vt3;

/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final vt3.m f440019a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f440020b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f440021c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f440022d;

    /* renamed from: e, reason: collision with root package name */
    public final long f440023e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f440024f;

    /* renamed from: g, reason: collision with root package name */
    public final r45.ol0 f440025g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f440026h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f440027i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f440028j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f440029k;

    /* renamed from: l, reason: collision with root package name */
    public final int f440030l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f440031m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f440032n;

    /* renamed from: o, reason: collision with root package name */
    public final r45.to0 f440033o;

    /* renamed from: p, reason: collision with root package name */
    public final r45.xy6 f440034p;

    /* renamed from: q, reason: collision with root package name */
    public final r45.b70 f440035q;

    /* renamed from: r, reason: collision with root package name */
    public final r45.mi0 f440036r;

    public p(vt3.m mVar, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, java.lang.String str4, r45.ol0 ol0Var, com.tencent.mm.protobuf.g gVar, boolean z17, java.lang.String authorName, java.lang.String authorImageURL, int i17, boolean z18, java.lang.String str5, r45.to0 to0Var, r45.xy6 xy6Var, r45.b70 b70Var, r45.mi0 mi0Var, int i18, kotlin.jvm.internal.i iVar) {
        vt3.m rvType = (i18 & 1) != 0 ? vt3.m.f440012f : mVar;
        java.lang.String templateId = (i18 & 2) != 0 ? "" : str;
        java.lang.String displayName = (i18 & 4) != 0 ? "" : str2;
        java.lang.String templateDescUrl = (i18 & 8) != 0 ? "" : str3;
        long j18 = (i18 & 16) != 0 ? 0L : j17;
        java.lang.String previewImageUrl = (i18 & 32) != 0 ? "" : str4;
        r45.ol0 ol0Var2 = (i18 & 64) != 0 ? null : ol0Var;
        com.tencent.mm.protobuf.g gVar2 = (i18 & 128) != 0 ? null : gVar;
        java.lang.String guideWording = (i18 & 8192) == 0 ? str5 : "";
        r45.to0 to0Var2 = (i18 & 16384) != 0 ? null : to0Var;
        r45.xy6 xy6Var2 = (i18 & 32768) != 0 ? null : xy6Var;
        r45.b70 b70Var2 = (i18 & 65536) != 0 ? null : b70Var;
        r45.mi0 mi0Var2 = (i18 & 131072) != 0 ? null : mi0Var;
        kotlin.jvm.internal.o.g(rvType, "rvType");
        kotlin.jvm.internal.o.g(templateId, "templateId");
        kotlin.jvm.internal.o.g(displayName, "displayName");
        kotlin.jvm.internal.o.g(templateDescUrl, "templateDescUrl");
        kotlin.jvm.internal.o.g(previewImageUrl, "previewImageUrl");
        kotlin.jvm.internal.o.g(authorName, "authorName");
        kotlin.jvm.internal.o.g(authorImageURL, "authorImageURL");
        kotlin.jvm.internal.o.g(guideWording, "guideWording");
        this.f440019a = rvType;
        this.f440020b = templateId;
        this.f440021c = displayName;
        this.f440022d = templateDescUrl;
        this.f440023e = j18;
        this.f440024f = previewImageUrl;
        this.f440025g = ol0Var2;
        this.f440026h = gVar2;
        this.f440027i = z17;
        this.f440028j = authorName;
        this.f440029k = authorImageURL;
        this.f440030l = i17;
        this.f440031m = z18;
        this.f440032n = guideWording;
        this.f440033o = to0Var2;
        this.f440034p = xy6Var2;
        this.f440035q = b70Var2;
        this.f440036r = mi0Var2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt3.p)) {
            return false;
        }
        vt3.p pVar = (vt3.p) obj;
        return this.f440019a == pVar.f440019a && kotlin.jvm.internal.o.b(this.f440020b, pVar.f440020b) && kotlin.jvm.internal.o.b(this.f440021c, pVar.f440021c) && kotlin.jvm.internal.o.b(this.f440022d, pVar.f440022d) && this.f440023e == pVar.f440023e && kotlin.jvm.internal.o.b(this.f440024f, pVar.f440024f) && kotlin.jvm.internal.o.b(this.f440025g, pVar.f440025g) && kotlin.jvm.internal.o.b(this.f440026h, pVar.f440026h) && this.f440027i == pVar.f440027i && kotlin.jvm.internal.o.b(this.f440028j, pVar.f440028j) && kotlin.jvm.internal.o.b(this.f440029k, pVar.f440029k) && this.f440030l == pVar.f440030l && this.f440031m == pVar.f440031m && kotlin.jvm.internal.o.b(this.f440032n, pVar.f440032n) && kotlin.jvm.internal.o.b(this.f440033o, pVar.f440033o) && kotlin.jvm.internal.o.b(this.f440034p, pVar.f440034p) && kotlin.jvm.internal.o.b(this.f440035q, pVar.f440035q) && kotlin.jvm.internal.o.b(this.f440036r, pVar.f440036r);
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f440019a.hashCode() * 31) + this.f440020b.hashCode()) * 31) + this.f440021c.hashCode()) * 31) + this.f440022d.hashCode()) * 31) + java.lang.Long.hashCode(this.f440023e)) * 31) + this.f440024f.hashCode()) * 31;
        r45.ol0 ol0Var = this.f440025g;
        int hashCode2 = (hashCode + (ol0Var == null ? 0 : ol0Var.hashCode())) * 31;
        com.tencent.mm.protobuf.g gVar = this.f440026h;
        int hashCode3 = (((((((((((((hashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f440027i)) * 31) + this.f440028j.hashCode()) * 31) + this.f440029k.hashCode()) * 31) + java.lang.Integer.hashCode(this.f440030l)) * 31) + java.lang.Boolean.hashCode(this.f440031m)) * 31) + this.f440032n.hashCode()) * 31;
        r45.to0 to0Var = this.f440033o;
        int hashCode4 = (hashCode3 + (to0Var == null ? 0 : to0Var.hashCode())) * 31;
        r45.xy6 xy6Var = this.f440034p;
        int hashCode5 = (hashCode4 + (xy6Var == null ? 0 : xy6Var.hashCode())) * 31;
        r45.b70 b70Var = this.f440035q;
        int hashCode6 = (hashCode5 + (b70Var == null ? 0 : b70Var.hashCode())) * 31;
        r45.mi0 mi0Var = this.f440036r;
        return hashCode6 + (mi0Var != null ? mi0Var.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "ImproveRecordMaasTemplateItem(rvType=" + this.f440019a + ", templateId=" + this.f440020b + ", displayName=" + this.f440021c + ", templateDescUrl=" + this.f440022d + ", templateDescVersion=" + this.f440023e + ", previewImageUrl=" + this.f440024f + ", eventInfo=" + this.f440025g + ", sessionBuffer=" + this.f440026h + ", isFavorite=" + this.f440027i + ", authorName=" + this.f440028j + ", authorImageURL=" + this.f440029k + ", cameraPosition=" + this.f440030l + ", isAIGC=" + this.f440031m + ", guideWording=" + this.f440032n + ", faceRecognitionInfo=" + this.f440033o + ", tplVersionInfo=" + this.f440034p + ", commonTplInfo=" + this.f440035q + ", effectEditInfo=" + this.f440036r + ')';
    }
}
