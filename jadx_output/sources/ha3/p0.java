package ha3;

/* loaded from: classes15.dex */
public final class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ha3.q0 f279918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f279919e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mars.cdn.CdnManager.C2CDownloadResult f279920f;

    public p0(ha3.q0 q0Var, java.lang.String str, com.tencent.mars.cdn.CdnManager.C2CDownloadResult c2CDownloadResult) {
        this.f279918d = q0Var;
        this.f279919e = str;
        this.f279920f = c2CDownloadResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ha3.q0 q0Var = this.f279918d;
        if (com.tencent.mm.vfs.w6.j(q0Var.f279924e)) {
            com.tencent.mm.vfs.w6.x(q0Var.f279924e, q0Var.f279925f, true);
            java.lang.String str = q0Var.f279926g;
            q0Var.f279923d.onC2CDownloadCompleted(this.f279919e, this.f279920f);
        }
    }
}
