package com.tencent.mm.pluginsdk.res.downloader.checkresupdate;

/* loaded from: classes12.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f189579d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f189580e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f189581f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f189582g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f189583h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f189584i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f189585m;

    public h(com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p pVar, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, java.lang.String str4, boolean z17) {
        this.f189579d = str;
        this.f189580e = str2;
        this.f189581f = str3;
        this.f189582g = i17;
        this.f189583h = i18;
        this.f189584i = str4;
        this.f189585m = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.res.downloader.model.l0 l0Var = com.tencent.mm.pluginsdk.res.downloader.model.j0.f189679a;
        com.tencent.mm.pluginsdk.res.downloader.model.n0 e17 = l0Var.e(this.f189579d);
        java.lang.String str = this.f189580e;
        java.lang.String str2 = this.f189581f;
        int i17 = this.f189582g;
        int i18 = this.f189583h;
        java.lang.String str3 = this.f189584i;
        if (e17 == null) {
            com.tencent.mm.pluginsdk.res.downloader.model.n0 n0Var = new com.tencent.mm.pluginsdk.res.downloader.model.n0();
            n0Var.field_keyVersion = i17;
            n0Var.field_encryptKey = str2;
            long j17 = i18;
            n0Var.field_reportId = j17;
            n0Var.field_sampleId = str3;
            n0Var.field_originalMd5 = str;
            l0Var.g(n0Var, true);
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(j17, 51L);
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(j17, 45L);
            return;
        }
        int i19 = e17.field_keyVersion;
        boolean z17 = this.f189585m;
        if (i19 >= i17) {
            if (z17 && i19 == i17) {
                com.tencent.mm.pluginsdk.res.downloader.checkresupdate.x.a(e17, true, true);
                return;
            }
            return;
        }
        e17.field_keyVersion = i17;
        e17.field_encryptKey = str2;
        e17.field_reportId = i18;
        e17.field_sampleId = str3;
        if (com.tencent.mm.sdk.platformtools.t8.K0(e17.field_originalMd5)) {
            e17.field_originalMd5 = str;
        }
        l0Var.g(e17, true);
        com.tencent.mm.pluginsdk.res.downloader.checkresupdate.x.a(e17, true, z17);
    }
}
