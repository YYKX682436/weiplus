package com.tencent.mm.pluginsdk.res.downloader.checkresupdate;

/* loaded from: classes12.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f189587d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f189588e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f189589f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f189590g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f189591h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p f189592i;

    public i(com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p pVar, int i17, int i18, java.lang.String str, int i19, java.lang.String str2) {
        this.f189592i = pVar;
        this.f189587d = i17;
        this.f189588e = i18;
        this.f189589f = str;
        this.f189590g = i19;
        this.f189591h = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f189587d;
        int i18 = this.f189588e;
        java.lang.String str = this.f189589f;
        int i19 = this.f189590g;
        java.lang.String str2 = this.f189591h;
        com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p pVar = this.f189592i;
        pVar.getClass();
        java.lang.String c17 = com.tencent.mm.pluginsdk.res.downloader.checkresupdate.c0.c(i17, i18);
        com.tencent.mm.pluginsdk.res.downloader.model.l0 l0Var = com.tencent.mm.pluginsdk.res.downloader.model.j0.f189679a;
        com.tencent.mm.pluginsdk.res.downloader.model.n0 e17 = l0Var.e(c17);
        if (e17 == null) {
            return;
        }
        boolean z17 = e17.field_fileUpdated;
        e17.field_fileUpdated = false;
        l0Var.g(e17, true);
        if (i19 != com.tencent.mm.sdk.platformtools.t8.P(e17.field_fileVersion, 0)) {
            return;
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = l0Var.f189685d;
        if (n3Var == null) {
            com.tencent.mars.xlog.Log.f("MicroMsg.ResDownloader.CheckResUpdateHelper", "sendEventFileCached: get null eventThread ");
        } else {
            n3Var.post(new com.tencent.mm.pluginsdk.res.downloader.checkresupdate.j(pVar, i17, i18, str, i19, z17, str2));
        }
    }
}
