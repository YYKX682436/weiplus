package vh1;

/* loaded from: classes7.dex */
public class b extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vh1.f f437010e;

    public b(vh1.f fVar) {
        this.f437010e = fVar;
    }

    @Override // wu5.g
    public java.lang.String getKey() {
        return "AppBrandDownloadWorker#TimerTask";
    }

    @Override // java.lang.Runnable
    public void run() {
        vh1.f fVar = this.f437010e;
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandDownloadWorker", "call cronet time out taskid:%s,timeout:%d,url:%s", fVar.f437033v, java.lang.Integer.valueOf(fVar.f437028q), this.f437010e.f437023i);
        if (this.f437010e.f437022h) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandDownloadWorker", "call cronet time out already callback");
        } else {
            this.f437010e.f437022h = true;
            vh1.f fVar2 = this.f437010e;
            fVar2.f437020f.d(fVar2.f437024m, fVar2.f437023i, "fail:time out", 5);
        }
        uh1.j0.E(1197L, 6L, 1L);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f437010e.f437035x)) {
            return;
        }
        com.tencent.mars.cdn.CronetLogic.cancelCronetTask(this.f437010e.f437035x);
    }
}
