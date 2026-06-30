package vf0;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f436146a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.modelcontrol.VideoTransPara f436147b;

    /* renamed from: c, reason: collision with root package name */
    public final int f436148c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f436149d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.sight.base.ABAPrams f436150e;

    public e(boolean z17, com.tencent.mm.modelcontrol.VideoTransPara videoTransPara, int i17, java.lang.String str, com.tencent.mm.plugin.sight.base.ABAPrams aBAPrams, int i18, kotlin.jvm.internal.i iVar) {
        i17 = (i18 & 4) != 0 ? 0 : i17;
        str = (i18 & 8) != 0 ? null : str;
        aBAPrams = (i18 & 16) != 0 ? null : aBAPrams;
        this.f436146a = z17;
        this.f436147b = videoTransPara;
        this.f436148c = i17;
        this.f436149d = str;
        this.f436150e = aBAPrams;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf0.e)) {
            return false;
        }
        vf0.e eVar = (vf0.e) obj;
        return this.f436146a == eVar.f436146a && kotlin.jvm.internal.o.b(this.f436147b, eVar.f436147b) && this.f436148c == eVar.f436148c && kotlin.jvm.internal.o.b(this.f436149d, eVar.f436149d) && kotlin.jvm.internal.o.b(this.f436150e, eVar.f436150e);
    }

    public int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.f436146a) * 31;
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = this.f436147b;
        int hashCode2 = (((hashCode + (videoTransPara == null ? 0 : videoTransPara.hashCode())) * 31) + java.lang.Integer.hashCode(this.f436148c)) * 31;
        java.lang.String str = this.f436149d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        com.tencent.mm.plugin.sight.base.ABAPrams aBAPrams = this.f436150e;
        return hashCode3 + (aBAPrams != null ? aBAPrams.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "CompressCheckResult(needCompress=" + this.f436146a + ", videoTransPara=" + this.f436147b + ", errorCode=" + this.f436148c + ", errorMsg=" + this.f436149d + ", abaParams=" + this.f436150e + ')';
    }
}
