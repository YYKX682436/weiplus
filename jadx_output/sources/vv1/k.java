package vv1;

/* loaded from: classes3.dex */
public class k extends vv1.d {

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.storage.f9 f440420m;

    /* renamed from: n, reason: collision with root package name */
    public m11.b0 f440421n;

    @Override // vv1.d
    public boolean d() {
        if (this.f440420m.getType() == 268435505) {
            lo.o oVar = (lo.o) i95.n0.c(lo.o.class);
            com.tencent.mm.storage.f9 f9Var = this.f440420m;
            ((qb5.g) oVar).getClass();
            if (com.tencent.mm.vfs.w6.j(com.tencent.mm.ui.chatting.gallery.k1.s(f9Var))) {
                wv1.a aVar = this.f440405d;
                if (aVar instanceof wv1.b) {
                    l((wv1.b) aVar);
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MsgFileWorker_Image", "mMsgItem isn't AppMsgImageMsgItem, err");
                    a();
                }
                return true;
            }
        } else if (this.f440421n.k()) {
            lo.o oVar2 = (lo.o) i95.n0.c(lo.o.class);
            com.tencent.mm.storage.f9 f9Var2 = this.f440420m;
            m11.b0 b0Var = this.f440421n;
            ((qb5.g) oVar2).getClass();
            java.lang.String x17 = com.tencent.mm.ui.chatting.gallery.t2.x(f9Var2, b0Var, false);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(x17)) {
                p(x17);
                return true;
            }
        }
        return false;
    }

    @Override // vv1.d
    public boolean j() {
        com.tencent.mm.storage.f9 f9Var;
        wv1.a aVar = this.f440405d;
        if (aVar == null || (f9Var = aVar.f449930b) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgFileWorker_Image", "mMsgInfo is null, return");
            a();
            return false;
        }
        this.f440420m = f9Var;
        if (f9Var.z2()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgFileWorker_Image", "mMsgInfo:%s is clean, return", this.f440420m);
            return false;
        }
        lo.o oVar = (lo.o) i95.n0.c(lo.o.class);
        com.tencent.mm.storage.f9 f9Var2 = this.f440420m;
        ((qb5.g) oVar).getClass();
        if (!com.tencent.mm.ui.chatting.gallery.k1.J(f9Var2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgFileWorker_Image", "mMsgInfo is not img msg, return");
            return false;
        }
        if (this.f440420m.getType() == 268435505) {
            return true;
        }
        lo.o oVar2 = (lo.o) i95.n0.c(lo.o.class);
        com.tencent.mm.storage.f9 f9Var3 = this.f440420m;
        ((qb5.g) oVar2).getClass();
        m11.b0 v17 = com.tencent.mm.ui.chatting.gallery.t2.v(f9Var3);
        this.f440421n = v17;
        if (v17 != null) {
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MsgFileWorker_Image", "mImgInfo is null, return");
        return false;
    }

    @Override // vv1.d
    public void k() {
        if (this.f440420m.getType() != 268435505) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgFileWorker_Image", "isOk:%b", java.lang.Boolean.valueOf(((m11.j) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di()).c(this.f440421n.f322633a, tg3.l1.a(this.f440420m), 0, java.lang.Long.valueOf(this.f440420m.getMsgId()), com.tencent.mm.R.drawable.bzt, new vv1.j(this))));
        } else {
            lo.o oVar = (lo.o) i95.n0.c(lo.o.class);
            com.tencent.mm.storage.f9 f9Var = this.f440420m;
            vv1.i iVar = new vv1.i(this);
            qb5.g gVar = (qb5.g) oVar;
            gVar.getClass();
            com.tencent.mm.pluginsdk.model.app.k0.d(f9Var, new qb5.e(gVar, iVar));
        }
    }

    public final void l(wv1.b bVar) {
        com.tencent.mm.choosemsgfile.compat.MsgFile msgFile = new com.tencent.mm.choosemsgfile.compat.MsgFile();
        msgFile.f64761d = bVar.e();
        lo.o oVar = (lo.o) i95.n0.c(lo.o.class);
        com.tencent.mm.storage.f9 f9Var = this.f440420m;
        ((qb5.g) oVar).getClass();
        msgFile.f64762e = com.tencent.mm.ui.chatting.gallery.k1.s(f9Var);
        msgFile.f64763f = bVar.d() + "." + msgFile.f64766i;
        msgFile.f64765h = "image";
        msgFile.f64766i = bVar.c();
        msgFile.f64764g = bVar.g();
        c(msgFile);
    }

    public final void p(java.lang.String str) {
        int lastIndexOf;
        if (com.tencent.mm.sdk.platformtools.y1.g(str)) {
            str = ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).Ai(str, 1);
        }
        com.tencent.mm.choosemsgfile.compat.MsgFile msgFile = new com.tencent.mm.choosemsgfile.compat.MsgFile();
        msgFile.f64761d = (int) com.tencent.mm.vfs.w6.k(str);
        msgFile.f64762e = str;
        java.lang.String str2 = this.f440421n.f322637e;
        msgFile.f64763f = str2;
        msgFile.f64765h = "image";
        com.tencent.mm.sdk.platformtools.r2 r2Var = xv1.d.f457391a;
        java.lang.String str3 = "";
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && (lastIndexOf = str2.lastIndexOf(".")) >= 0) {
            str3 = str2.substring(lastIndexOf + 1);
        }
        msgFile.f64766i = str3;
        msgFile.f64764g = this.f440421n.f322646n;
        c(msgFile);
    }
}
