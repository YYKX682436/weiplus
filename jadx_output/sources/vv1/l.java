package vv1;

/* loaded from: classes3.dex */
public class l implements lo.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vv1.n f440422a;

    public l(vv1.n nVar) {
        this.f440422a = nVar;
    }

    public void a(int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgFileWorker_Video", "onDownloadCallback errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), str);
        vv1.n nVar = this.f440422a;
        if (i17 == 0) {
            nVar.l(nVar.f440425n, str2);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgFileWorker_Video", "download fail");
            nVar.a();
        }
    }
}
