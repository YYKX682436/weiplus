package com.tencent.mm.pluginsdk.res.downloader.checkresupdate;

/* loaded from: classes12.dex */
public final class t extends com.tencent.mm.pluginsdk.res.downloader.model.u {

    /* renamed from: l, reason: collision with root package name */
    public final long f189635l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f189636m;

    /* renamed from: n, reason: collision with root package name */
    public volatile byte[] f189637n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f189638o;

    public t(java.lang.String str, int i17, java.lang.String str2, boolean z17, long j17, java.lang.String str3, int i18, long j18, int i19, int i27) {
        super(str, com.tencent.mm.pluginsdk.res.downloader.checkresupdate.c0.b(str), java.lang.String.valueOf(i17), "CheckResUpdate", str3, "GET", i18, i19, i27);
        this.f189636m = str2;
        this.f189635l = j17;
    }

    public static com.tencent.mm.pluginsdk.res.downloader.checkresupdate.t d(com.tencent.mm.pluginsdk.res.downloader.model.n0 n0Var) {
        java.lang.String str = n0Var.field_urlKey;
        int P = com.tencent.mm.sdk.platformtools.t8.P(n0Var.field_fileVersion, 0);
        java.lang.String str2 = n0Var.field_md5;
        java.lang.String str3 = n0Var.field_groupId2;
        if (str3 == null) {
            str3 = "";
        }
        return new com.tencent.mm.pluginsdk.res.downloader.checkresupdate.t(str, P, str2, str3.equals("NewXml"), n0Var.field_reportId, n0Var.field_url, n0Var.field_maxRetryTimes, n0Var.field_fileSize, n0Var.field_networkType, n0Var.field_priority);
    }

    @Override // com.tencent.mm.pluginsdk.res.downloader.model.u
    public java.lang.String b() {
        return com.tencent.mm.pluginsdk.res.downloader.checkresupdate.c0.b(this.f189712a);
    }

    @Override // com.tencent.mm.pluginsdk.res.downloader.model.u
    public java.lang.String c() {
        return "CheckResUpdate";
    }
}
