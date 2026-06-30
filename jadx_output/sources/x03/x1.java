package x03;

/* loaded from: classes15.dex */
public final class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x03.y1 f451166d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451167e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mars.cdn.CdnManager.C2CDownloadResult f451168f;

    public x1(x03.y1 y1Var, java.lang.String str, com.tencent.mars.cdn.CdnManager.C2CDownloadResult c2CDownloadResult) {
        this.f451166d = y1Var;
        this.f451167e = str;
        this.f451168f = c2CDownloadResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x03.y1 y1Var = this.f451166d;
        if (com.tencent.mm.vfs.w6.j(y1Var.f451171e)) {
            com.tencent.mm.vfs.w6.x(y1Var.f451171e, y1Var.f451172f, true);
            java.lang.String str = y1Var.f451173g;
            y1Var.f451170d.onC2CDownloadCompleted(this.f451167e, this.f451168f);
        }
    }
}
