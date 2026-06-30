package com.tencent.mm.pluginsdk.res.downloader.checkresupdate;

/* loaded from: classes12.dex */
public final class z extends com.tencent.mm.pluginsdk.res.downloader.model.a {
    public final boolean A;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f189639m;

    /* renamed from: n, reason: collision with root package name */
    public final int f189640n;

    /* renamed from: o, reason: collision with root package name */
    public final int f189641o;

    /* renamed from: p, reason: collision with root package name */
    public final long f189642p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f189643q;

    /* renamed from: r, reason: collision with root package name */
    public final byte[] f189644r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f189645s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f189646t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f189647u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f189648v;

    /* renamed from: w, reason: collision with root package name */
    public final int f189649w;

    /* renamed from: x, reason: collision with root package name */
    public final int f189650x;

    /* renamed from: y, reason: collision with root package name */
    public final byte[] f189651y;

    /* renamed from: z, reason: collision with root package name */
    public final long f189652z;

    public z(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, long j17, java.lang.String str3, int i27, int i28, long j18, java.lang.String str4, byte[] bArr, java.lang.String str5, boolean z17, boolean z18, java.lang.String str6, int i29, int i37, byte[] bArr2, long j19, boolean z19, boolean z27, int i38) {
        super(str, str2, java.lang.String.valueOf(i17), i18, i19, com.tencent.mm.pluginsdk.res.downloader.checkresupdate.c0.b(str2), j17, str3, "CheckResUpdate", z19 ? "NewXml" : "CGI", i38);
        this.f189640n = i27;
        this.f189641o = i28;
        this.f189642p = j18;
        this.f189643q = str4;
        this.f189644r = bArr;
        this.f189645s = str5;
        this.f189646t = z17;
        this.f189647u = z18;
        this.f189648v = str6;
        this.f189649w = i29;
        this.f189650x = i37;
        this.f189651y = bArr2;
        this.f189652z = j19;
        this.A = z19;
        this.f189639m = z27;
    }

    public com.tencent.mm.pluginsdk.res.downloader.model.n0 a() {
        com.tencent.mm.pluginsdk.res.downloader.model.n0 n0Var = new com.tencent.mm.pluginsdk.res.downloader.model.n0();
        n0Var.field_url = this.f189653a;
        n0Var.field_urlKey = this.f189654b;
        n0Var.field_fileVersion = this.f189655c;
        n0Var.field_networkType = this.f189656d;
        n0Var.field_maxRetryTimes = this.f189657e;
        n0Var.field_retryTimes = this.f189664l;
        n0Var.field_filePath = this.f189658f;
        n0Var.field_status = 0;
        n0Var.field_expireTime = this.f189659g;
        n0Var.field_groupId1 = this.f189661i;
        n0Var.field_groupId2 = this.f189662j;
        n0Var.field_md5 = this.f189660h;
        n0Var.field_priority = this.f189663k;
        n0Var.field_fileUpdated = this.f189639m;
        n0Var.field_resType = this.f189640n;
        n0Var.field_subType = this.f189641o;
        n0Var.field_reportId = this.f189642p;
        n0Var.field_sampleId = this.f189643q;
        n0Var.field_eccSignature = this.f189644r;
        n0Var.field_originalMd5 = this.f189645s;
        n0Var.field_fileCompress = this.f189646t;
        n0Var.field_fileEncrypt = this.f189647u;
        n0Var.field_encryptKey = this.f189648v;
        n0Var.field_keyVersion = this.f189649w;
        n0Var.field_fileSize = this.f189652z;
        n0Var.field_EID = this.f189650x;
        return n0Var;
    }

    @Override // com.tencent.mm.pluginsdk.res.downloader.model.a
    public java.lang.String toString() {
        return "CheckResUpdateRequest | fileUpdated=" + this.f189639m + ", resType=" + this.f189640n + ", subType=" + this.f189641o + ", reportId=" + this.f189642p + ", sampleId='" + this.f189643q + "', originalMd5='" + this.f189645s + "', fileCompress=" + this.f189646t + ", fileEncrypt=" + this.f189647u + ", encryptKey='" + this.f189648v + "', keyVersion=" + this.f189649w + ", EID=" + this.f189650x + ", fileSize=" + this.f189652z + ", fromNewXml=" + this.A + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LOG + super.toString();
    }
}
