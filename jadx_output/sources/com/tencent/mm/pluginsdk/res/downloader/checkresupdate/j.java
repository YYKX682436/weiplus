package com.tencent.mm.pluginsdk.res.downloader.checkresupdate;

/* loaded from: classes12.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f189614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f189615e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f189616f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f189617g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f189618h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f189619i;

    public j(com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p pVar, int i17, int i18, java.lang.String str, int i19, boolean z17, java.lang.String str2) {
        this.f189614d = i17;
        this.f189615e = i18;
        this.f189616f = str;
        this.f189617g = i19;
        this.f189618h = z17;
        this.f189619i = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = new com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent();
        int i17 = this.f189614d;
        am.r2 r2Var = checkResUpdateCacheFileEvent.f54053g;
        r2Var.f7759a = i17;
        r2Var.f7760b = this.f189615e;
        r2Var.f7761c = this.f189616f;
        r2Var.f7762d = this.f189617g;
        r2Var.f7763e = this.f189618h;
        r2Var.f7764f = this.f189619i;
        checkResUpdateCacheFileEvent.e();
    }
}
