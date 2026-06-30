package q43;

/* loaded from: classes8.dex */
public final class e implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.m f360088d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f360089e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f360090f;

    public e(com.tencent.mm.pluginsdk.model.app.m mVar, kotlin.jvm.internal.h0 h0Var, long j17) {
        this.f360088d = mVar;
        this.f360089e = h0Var;
        this.f360090f = j17;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameResourceDownloadManager", "gamelog.download, downloadGameRes , tryDownload, errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 != 0 || i18 != 0) {
            return 0;
        }
        ((ku5.t0) ku5.t0.f312615d).h(new q43.d(this.f360088d, this.f360089e, oVar, this.f360090f), "GameResourceDownloadRequest_callback");
        return 0;
    }
}
