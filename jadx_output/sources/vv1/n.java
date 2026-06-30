package vv1;

/* loaded from: classes3.dex */
public class n extends vv1.d {

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.storage.f9 f440424m;

    /* renamed from: n, reason: collision with root package name */
    public t21.v2 f440425n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f440426o;

    @Override // vv1.d
    public boolean d() {
        wv1.a aVar = this.f440405d;
        if (aVar.a().f457389c) {
            t21.j3 d17 = t21.j3.f414800h.d(this.f440425n.g());
            if (d17 != null && !com.tencent.mm.sdk.platformtools.t8.K0(d17.f414806d)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MsgFileWorker_Video", "no origin video cdn url");
                java.lang.String str = this.f440425n.S;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    this.f440426o = true;
                    return false;
                }
                ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).getClass();
                t21.v2 h17 = t21.d3.h(str);
                if (h17 == null) {
                    this.f440426o = true;
                    return false;
                }
                java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(this.f440424m, bm5.f0.f22570r, str, false);
                if (!com.tencent.mm.vfs.w6.j(rj6)) {
                    this.f440426o = true;
                    return false;
                }
                if (com.tencent.mm.vfs.w6.k(rj6) != h17.f415008f) {
                    this.f440426o = true;
                    return false;
                }
                l(h17, rj6);
                this.f440426o = true;
                return true;
            }
            this.f440426o = false;
            com.tencent.mars.xlog.Log.w("MicroMsg.MsgFileWorker_Video", "%s no origin video cdn url", aVar);
        } else {
            this.f440426o = false;
        }
        if (this.f440425n.i()) {
            tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
            com.tencent.mm.storage.f9 f9Var = this.f440424m;
            java.lang.String rj7 = ((k90.b) u0Var).rj(f9Var, bm5.f0.f22571s, f9Var.z0(), false);
            if (com.tencent.mm.vfs.w6.j(rj7)) {
                l(this.f440425n, rj7);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgFileWorker_Video", "mMsgInfo is null, return");
            return false;
        }
        this.f440424m = f9Var;
        if (f9Var.z2()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgFileWorker_Video", "mMsgInfo:%s is clean, return", this.f440424m);
            return false;
        }
        lo.o oVar = (lo.o) i95.n0.c(lo.o.class);
        com.tencent.mm.storage.f9 f9Var2 = this.f440424m;
        ((qb5.g) oVar).getClass();
        if (!com.tencent.mm.ui.chatting.gallery.k1.N(f9Var2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgFileWorker_Video", "mMsgInfo:%s is not video, return", this.f440424m);
            return false;
        }
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        java.lang.String z07 = this.f440424m.z0();
        ((vf0.y1) x1Var).getClass();
        t21.v2 h17 = t21.d3.h(z07);
        this.f440425n = h17;
        if (h17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgFileWorker_Video", "mMsgInfo:%s videoInfo is null, return", this.f440424m);
            return false;
        }
        if (h17.f415011i != 198) {
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MsgFileWorker_Video", "mMsgInfo:%s videoInfo is invalid, return", this.f440424m);
        return false;
    }

    @Override // vv1.d
    public void k() {
        t21.v2 h17;
        if (!this.f440426o) {
            ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
            t21.o2.Ui().b(new vv1.m(this), android.os.Looper.getMainLooper());
            if (this.f440425n.j()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MsgFileWorker_Video", "start complete online video");
                wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
                java.lang.String z07 = this.f440424m.z0();
                ((vf0.y1) x1Var).getClass();
                t21.d3.K(z07);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgFileWorker_Video", "start complete offline video");
            wf0.x1 x1Var2 = (wf0.x1) i95.n0.c(wf0.x1.class);
            java.lang.String z08 = this.f440424m.z0();
            ((vf0.y1) x1Var2).getClass();
            t21.d3.E(z08, 10);
            wf0.x1 x1Var3 = (wf0.x1) i95.n0.c(wf0.x1.class);
            java.lang.String z09 = this.f440424m.z0();
            ((vf0.y1) x1Var3).getClass();
            t21.d3.L(z09);
            return;
        }
        lo.o oVar = (lo.o) i95.n0.c(lo.o.class);
        com.tencent.mm.storage.f9 f9Var = this.f440424m;
        vv1.l lVar = new vv1.l(this);
        qb5.g gVar = (qb5.g) oVar;
        gVar.getClass();
        if (com.tencent.mm.ui.chatting.gallery.k1.N(f9Var)) {
            wf0.x1 x1Var4 = (wf0.x1) i95.n0.c(wf0.x1.class);
            java.lang.String z010 = f9Var.z0();
            ((vf0.y1) x1Var4).getClass();
            h17 = t21.d3.h(z010);
        } else {
            h17 = null;
        }
        if (h17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileCompat", "no video info for download origin video");
            return;
        }
        t21.j3 d17 = t21.j3.f414800h.d(h17.g());
        if (d17 == null || com.tencent.mm.sdk.platformtools.t8.K0(d17.f414806d)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileCompat", "no origin video cdn url");
            return;
        }
        com.tencent.mm.ui.chatting.gallery.g gVar2 = new com.tencent.mm.ui.chatting.gallery.g(f9Var, h17, new ok4.c(java.lang.System.currentTimeMillis()), d17);
        com.tencent.mm.ui.chatting.gallery.f fVar = new com.tencent.mm.ui.chatting.gallery.f(f9Var, h17.d(), true);
        fk4.k kVar = new fk4.k(gVar2);
        kVar.b(fVar);
        kVar.f263624l = new qb5.f(gVar, f9Var, lVar);
        boolean o17 = kVar.o();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileCompat", "downloadRawVideo msgId:%d start:%b", java.lang.Long.valueOf(f9Var.getMsgId()), java.lang.Boolean.valueOf(o17));
        if (!o17) {
            lVar.a(-1, "", "");
            return;
        }
        com.tencent.mm.ui.chatting.gallery.l.f201163a.c(f9Var, kVar);
        new yd5.p(f9Var, h17.d(), false, 4).f461134f = java.lang.System.currentTimeMillis();
    }

    public final void l(t21.v2 v2Var, java.lang.String str) {
        int lastIndexOf;
        com.tencent.mm.choosemsgfile.compat.MsgFile msgFile = new com.tencent.mm.choosemsgfile.compat.MsgFile();
        msgFile.f64761d = (int) com.tencent.mm.vfs.w6.k(str);
        msgFile.f64762e = str;
        if (this.f440405d.a().f457389c) {
            ((c35.m) i95.n0.c(c35.m.class)).getClass();
            msgFile.f64766i = "mp4";
        } else {
            java.lang.String str2 = msgFile.f64762e;
            com.tencent.mm.sdk.platformtools.r2 r2Var = xv1.d.f457391a;
            java.lang.String str3 = "";
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && (lastIndexOf = str2.lastIndexOf(".")) >= 0) {
                str3 = str2.substring(lastIndexOf + 1);
            }
            msgFile.f64766i = str3;
        }
        msgFile.f64765h = "video";
        msgFile.f64763f = v2Var.d() + "." + msgFile.f64766i;
        msgFile.f64764g = v2Var.f415012j;
        c(msgFile);
    }
}
