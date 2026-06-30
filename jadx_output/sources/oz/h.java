package oz;

/* loaded from: classes11.dex */
public final class h implements i40.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f350151a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ oz.g f350152b;

    public h(com.tencent.mm.storage.f9 f9Var, oz.g gVar) {
        this.f350151a = f9Var;
        this.f350152b = gVar;
    }

    @Override // i40.a
    public void a(long j17, long j18) {
    }

    @Override // i40.a
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScheduledDownloadExecutor", "downloadFile: done, msgId=" + this.f350151a.getMsgId());
        this.f350152b.onResult(0);
    }

    @Override // i40.a
    public void d(int i17, int i18, java.lang.String errMsg, boolean z17) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        com.tencent.mars.xlog.Log.e("MicroMsg.ScheduledDownloadExecutor", "downloadFile: failed, msgId=" + this.f350151a.getMsgId() + ", errorType=" + i17 + ", errorCode=" + i18 + ", errMsg=" + errMsg);
        this.f350152b.onResult(i18);
    }

    @Override // i40.a
    public void e() {
        com.tencent.mars.xlog.Log.w("MicroMsg.ScheduledDownloadExecutor", "downloadFile: canceled, msgId=" + this.f350151a.getMsgId());
        this.f350152b.onResult(-1);
    }
}
