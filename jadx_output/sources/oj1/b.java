package oj1;

/* loaded from: classes4.dex */
public final class b implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345750d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f345751e;

    public b(java.lang.String str, com.tencent.mm.ui.MMActivity mMActivity) {
        this.f345750d = str;
        this.f345751e = mMActivity;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String uuid = this.f345750d;
        kotlin.jvm.internal.o.g(uuid, "uuid");
        new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.c(uuid, 5, "{\"errMsg\":\"standaloneFunctionalDirectApi:ok\"}").l();
        com.tencent.mars.xlog.Log.i("MicroMsg.StandaloneFunctionalDirectApiHandler", "openFeedback: uuid(" + uuid + ") feedback finished");
        this.f345751e.finish();
    }
}
