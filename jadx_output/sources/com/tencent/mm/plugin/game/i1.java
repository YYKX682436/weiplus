package com.tencent.mm.plugin.game;

/* loaded from: classes8.dex */
public final class i1 implements vz4.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139459a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139460b;

    public i1(java.lang.String str, java.lang.String str2) {
        this.f139459a = str;
        this.f139460b = str2;
    }

    @Override // vz4.j
    public void a(java.lang.String errorMsg) {
        kotlin.jvm.internal.o.g(errorMsg, "errorMsg");
        com.tencent.mm.opensdk.utils.Log.e("MicroMsg.GameLiteAppStoreService", "fetchLastLitePkg failed. errorMsg:" + errorMsg + " LiteApp pkgid:" + this.f139459a + ", AppId:" + this.f139460b);
    }

    @Override // vz4.j
    public void onSuccess(java.lang.String str) {
        com.tencent.mm.opensdk.utils.Log.e("MicroMsg.GameLiteAppStoreService", "fetchLastLitePkg success. LiteAppAppId:" + str);
        r53.f.H(this.f139459a, this.f139460b, null);
    }
}
