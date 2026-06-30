package vv1;

/* loaded from: classes9.dex */
public class f implements lo.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dm.r f440411a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vv1.g f440412b;

    public f(vv1.g gVar, dm.r rVar) {
        this.f440412b = gVar;
        this.f440411a = rVar;
    }

    @Override // lo.l
    public void a(long j17, long j18, com.tencent.mm.modelbase.m1 m1Var) {
        this.f440412b.f440413a.b(j17, j18);
    }

    @Override // lo.l
    public void b(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgFileWorker_File", "DownloadCallback errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), str);
        if (i17 == 0) {
            com.tencent.mm.choosemsgfile.compat.MsgFile msgFile = new com.tencent.mm.choosemsgfile.compat.MsgFile();
            msgFile.f64761d = this.f440412b.f440413a.f440405d.e();
            msgFile.f64762e = this.f440411a.field_fileFullPath;
            msgFile.f64763f = this.f440412b.f440413a.f440405d.d();
            msgFile.f64765h = "file";
            msgFile.f64766i = this.f440412b.f440413a.f440405d.c();
            msgFile.f64764g = this.f440412b.f440413a.f440405d.g() / 1000;
            this.f440412b.f440413a.c(msgFile);
            return;
        }
        if (i17 != 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgFileWorker_File", "download %s fail", this.f440412b.f440413a.f440405d);
            this.f440412b.f440413a.a();
            return;
        }
        vv1.h hVar = this.f440412b.f440413a;
        synchronized (hVar) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgFileWorker_Base", "callStop");
            vv1.a aVar = hVar.f440406e;
            if (aVar != null) {
                aVar.e();
                hVar.f440406e = null;
            }
        }
    }
}
