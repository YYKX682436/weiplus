package vv1;

/* loaded from: classes3.dex */
public class i implements lo.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vv1.k f440418a;

    public i(vv1.k kVar) {
        this.f440418a = kVar;
    }

    @Override // lo.l
    public void a(long j17, long j18, com.tencent.mm.modelbase.m1 m1Var) {
        this.f440418a.b(j17, j18);
    }

    @Override // lo.l
    public void b(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgFileWorker_Image", "DownloadCallback errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), str);
        vv1.k kVar = this.f440418a;
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgFileWorker_Image", "download fail");
            kVar.a();
        } else if (!(kVar.f440405d instanceof wv1.b)) {
            kVar.a();
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgFileWorker_Image", "mMsgItem isn't AppMsgImageMsgItem, err");
            kVar.l((wv1.b) kVar.f440405d);
        }
    }
}
