package com.tencent.mm.pluginsdk.res.downloader.checkresupdate;

/* loaded from: classes5.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f189550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f189551e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f189552f;

    public b(com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p pVar, int i17, int i18, int i19, boolean z17) {
        this.f189550d = i17;
        this.f189551e = i18;
        this.f189552f = i19;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.CheckResUpdatePreOperationEvent checkResUpdatePreOperationEvent = new com.tencent.mm.autogen.events.CheckResUpdatePreOperationEvent();
        int i17 = this.f189550d;
        am.t2 t2Var = checkResUpdatePreOperationEvent.f54055g;
        t2Var.f7968c = i17;
        t2Var.f7966a = this.f189551e;
        t2Var.f7967b = this.f189552f;
        t2Var.getClass();
        checkResUpdatePreOperationEvent.e();
    }
}
