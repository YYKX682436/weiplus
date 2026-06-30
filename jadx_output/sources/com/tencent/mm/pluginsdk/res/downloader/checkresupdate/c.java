package com.tencent.mm.pluginsdk.res.downloader.checkresupdate;

/* loaded from: classes12.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f189554d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f189555e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f189556f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f189557g;

    public c(com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p pVar, int i17, int i18, int i19, boolean z17) {
        this.f189554d = i17;
        this.f189555e = i18;
        this.f189556f = i19;
        this.f189557g = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.res.downloader.model.l0 l0Var = com.tencent.mm.pluginsdk.res.downloader.model.j0.f189679a;
        com.tencent.mm.pluginsdk.res.downloader.model.n0 e17 = l0Var.e(com.tencent.mm.pluginsdk.res.downloader.checkresupdate.c0.c(this.f189554d, this.f189555e));
        if (e17 != null) {
            int i17 = this.f189556f;
            if (-1 == i17 || java.lang.String.valueOf(i17).equals(e17.field_fileVersion)) {
                e17.field_needRetry = !this.f189557g;
                l0Var.g(e17, true);
            }
        }
    }
}
