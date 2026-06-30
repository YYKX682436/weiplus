package e60;

/* loaded from: classes11.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public long f249725a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f249726b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f249727c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f249728d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f249729e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f249730f;

    public s0(long j17, java.lang.String cdnFileId, java.lang.String cdnAesKey, java.lang.String cdnAuthKey, java.lang.String cdnDownloadUrl, java.lang.String cdnFileMD5, int i17, kotlin.jvm.internal.i iVar) {
        j17 = (i17 & 1) != 0 ? 0L : j17;
        cdnFileId = (i17 & 2) != 0 ? "" : cdnFileId;
        cdnAesKey = (i17 & 4) != 0 ? "" : cdnAesKey;
        cdnAuthKey = (i17 & 8) != 0 ? "" : cdnAuthKey;
        cdnDownloadUrl = (i17 & 16) != 0 ? "" : cdnDownloadUrl;
        cdnFileMD5 = (i17 & 32) != 0 ? "" : cdnFileMD5;
        kotlin.jvm.internal.o.g(cdnFileId, "cdnFileId");
        kotlin.jvm.internal.o.g(cdnAesKey, "cdnAesKey");
        kotlin.jvm.internal.o.g(cdnAuthKey, "cdnAuthKey");
        kotlin.jvm.internal.o.g(cdnDownloadUrl, "cdnDownloadUrl");
        kotlin.jvm.internal.o.g(cdnFileMD5, "cdnFileMD5");
        this.f249725a = j17;
        this.f249726b = cdnFileId;
        this.f249727c = cdnAesKey;
        this.f249728d = cdnAuthKey;
        this.f249729e = cdnDownloadUrl;
        this.f249730f = cdnFileMD5;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e60.s0)) {
            return false;
        }
        e60.s0 s0Var = (e60.s0) obj;
        return this.f249725a == s0Var.f249725a && kotlin.jvm.internal.o.b(this.f249726b, s0Var.f249726b) && kotlin.jvm.internal.o.b(this.f249727c, s0Var.f249727c) && kotlin.jvm.internal.o.b(this.f249728d, s0Var.f249728d) && kotlin.jvm.internal.o.b(this.f249729e, s0Var.f249729e) && kotlin.jvm.internal.o.b(this.f249730f, s0Var.f249730f);
    }

    public int hashCode() {
        return (((((((((java.lang.Long.hashCode(this.f249725a) * 31) + this.f249726b.hashCode()) * 31) + this.f249727c.hashCode()) * 31) + this.f249728d.hashCode()) * 31) + this.f249729e.hashCode()) * 31) + this.f249730f.hashCode();
    }

    public java.lang.String toString() {
        return "GalleryCDNInfo(cdnTotalLen=" + this.f249725a + ", cdnFileId=" + this.f249726b + ", cdnAesKey=" + this.f249727c + ", cdnAuthKey=" + this.f249728d + ", cdnDownloadUrl=" + this.f249729e + ", cdnFileMD5=" + this.f249730f + ')';
    }
}
