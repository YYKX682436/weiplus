package vv1;

/* loaded from: classes9.dex */
public class h extends vv1.d {

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.storage.f9 f440414m;

    /* renamed from: n, reason: collision with root package name */
    public long f440415n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f440416o;

    /* renamed from: p, reason: collision with root package name */
    public im5.a f440417p;

    @Override // vv1.d
    public boolean d() {
        lo.o oVar = (lo.o) i95.n0.c(lo.o.class);
        java.lang.String str = this.f440416o;
        long j17 = this.f440415n;
        java.lang.String Q0 = this.f440414m.Q0();
        ((qb5.g) oVar).getClass();
        com.tencent.mm.pluginsdk.model.app.d g17 = com.tencent.mm.pluginsdk.model.app.k0.g(str, j17, Q0);
        lo.o oVar2 = (lo.o) i95.n0.c(lo.o.class);
        com.tencent.mm.storage.f9 f9Var = this.f440414m;
        ((qb5.g) oVar2).getClass();
        if (!com.tencent.mm.pluginsdk.model.app.k0.u(f9Var, g17)) {
            return false;
        }
        com.tencent.mm.choosemsgfile.compat.MsgFile msgFile = new com.tencent.mm.choosemsgfile.compat.MsgFile();
        wv1.a aVar = this.f440405d;
        msgFile.f64761d = aVar.e();
        msgFile.f64762e = g17.field_fileFullPath;
        msgFile.f64763f = aVar.d();
        msgFile.f64765h = "file";
        msgFile.f64766i = aVar.c();
        msgFile.f64764g = aVar.g() / 1000;
        c(msgFile);
        return true;
    }

    @Override // vv1.d, im5.a
    public void dead() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgFileWorker_File", "dead");
        im5.a aVar = this.f440417p;
        if (aVar != null) {
            aVar.dead();
        }
    }

    @Override // vv1.d
    public boolean j() {
        com.tencent.mm.storage.f9 f9Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgFileWorker_File", "start %s", this);
        wv1.a aVar = this.f440405d;
        if (aVar == null || (f9Var = aVar.f449930b) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgFileWorker_File", "mMsgInfo is null, err");
            return false;
        }
        this.f440414m = f9Var;
        this.f440415n = f9Var.getMsgId();
        ot0.q v17 = ot0.q.v(this.f440414m.j());
        if (v17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgFileWorker_File", "parse msgContent error, %s", this.f440414m.j());
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(v17.f348694p) && !com.tencent.mm.sdk.platformtools.t8.K0(v17.L)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgFileWorker_File", "msgContent format error, %s", this.f440414m.j());
            v17.f348694p = "" + v17.L.hashCode();
        }
        java.lang.String str = v17.f348694p;
        this.f440416o = str;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MsgFileWorker_File", "MediaId is null, err return");
        return false;
    }

    @Override // vv1.d
    public void k() {
        lo.o oVar = (lo.o) i95.n0.c(lo.o.class);
        java.lang.String str = this.f440416o;
        com.tencent.mm.storage.f9 f9Var = this.f440414m;
        vv1.g gVar = new vv1.g(this);
        qb5.g gVar2 = (qb5.g) oVar;
        gVar2.getClass();
        boolean z17 = false;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || f9Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChooseMsgFileCompat", "mediaId:%s or msg is null, err", str);
        } else {
            qb5.a aVar = new qb5.a(gVar2, str, gVar);
            c01.d9.e().a(728, aVar);
            if (!(!com.tencent.mm.pluginsdk.model.app.k0.R(str, f9Var))) {
                gVar.a(0, "");
                c01.d9.e().q(728, aVar);
            }
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgFileWorker_File", "initOk:%b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgFileWorker_File", "initOk fail");
        a();
    }
}
