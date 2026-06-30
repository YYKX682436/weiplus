package com.tencent.mm.pluginsdk.res.downloader.checkresupdate;

/* loaded from: classes12.dex */
public class a implements com.tencent.mm.pluginsdk.res.downloader.model.k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f189532a;

    /* renamed from: b, reason: collision with root package name */
    public final int f189533b;

    /* renamed from: c, reason: collision with root package name */
    public final int f189534c;

    /* renamed from: d, reason: collision with root package name */
    public final int f189535d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f189536e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f189537f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f189538g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f189539h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f189540i;

    /* renamed from: j, reason: collision with root package name */
    public final int f189541j;

    /* renamed from: k, reason: collision with root package name */
    public final byte[] f189542k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f189543l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f189544m;

    /* renamed from: n, reason: collision with root package name */
    public final long f189545n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f189546o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f189547p;

    /* renamed from: q, reason: collision with root package name */
    public final int f189548q;

    /* renamed from: r, reason: collision with root package name */
    public final int f189549r;

    public a(java.lang.String str, int i17, int i18, int i19, boolean z17, java.lang.String str2, boolean z18, boolean z19, java.lang.String str3, int i27, byte[] bArr, java.lang.String str4, boolean z27, long j17, java.lang.String str5, java.lang.String str6, int i28, int i29) {
        this.f189532a = str;
        this.f189533b = i17;
        this.f189534c = i18;
        this.f189535d = i19;
        this.f189536e = z17;
        this.f189537f = str2;
        this.f189538g = z18;
        this.f189539h = z19;
        this.f189540i = str3;
        this.f189541j = i27;
        this.f189542k = bArr;
        this.f189543l = str4;
        this.f189544m = z27;
        this.f189545n = j17;
        this.f189546o = str5;
        this.f189547p = str6;
        this.f189548q = i28;
        this.f189549r = i29;
    }

    public static com.tencent.mm.pluginsdk.res.downloader.checkresupdate.a b(com.tencent.mm.pluginsdk.res.downloader.model.n0 n0Var) {
        java.lang.String str = n0Var.field_urlKey;
        int i17 = n0Var.field_resType;
        int i18 = n0Var.field_subType;
        int P = com.tencent.mm.sdk.platformtools.t8.P(n0Var.field_fileVersion, 0);
        boolean z17 = n0Var.field_fileUpdated;
        java.lang.String str2 = n0Var.field_filePath;
        boolean z18 = n0Var.field_fileEncrypt;
        boolean z19 = n0Var.field_fileCompress;
        java.lang.String str3 = n0Var.field_encryptKey;
        int i19 = n0Var.field_keyVersion;
        byte[] bArr = n0Var.field_eccSignature;
        java.lang.String str4 = n0Var.field_originalMd5;
        java.lang.String str5 = n0Var.field_groupId2;
        if (str5 == null) {
            str5 = "";
        }
        return new com.tencent.mm.pluginsdk.res.downloader.checkresupdate.a(str, i17, i18, P, z17, str2, z18, z19, str3, i19, bArr, str4, str5.equals("NewXml"), n0Var.field_reportId, n0Var.field_sampleId, n0Var.field_url, n0Var.field_maxRetryTimes, n0Var.field_retryTimes);
    }

    @Override // com.tencent.mm.pluginsdk.res.downloader.model.k
    public java.lang.String a() {
        return this.f189532a;
    }
}
