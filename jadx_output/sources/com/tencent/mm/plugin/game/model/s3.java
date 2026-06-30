package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class s3 implements k60.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f140438a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.game.report.api.GameWebPerformanceInfo f140439b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f140440c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f140441d;

    public s3(java.lang.String str, com.tencent.mm.game.report.api.GameWebPerformanceInfo gameWebPerformanceInfo, com.tencent.mm.ipcinvoker.r rVar, android.os.Bundle bundle) {
        this.f140438a = str;
        this.f140439b = gameWebPerformanceInfo;
        this.f140440c = rVar;
        this.f140441d = bundle;
    }

    @Override // k60.e
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "preLoadWePkgAndWebCore end, time = %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.tencent.mm.ipcinvoker.w0.c(true, new com.tencent.mm.plugin.game.model.r3(this));
    }
}
