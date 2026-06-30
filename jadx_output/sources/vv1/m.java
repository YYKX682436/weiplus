package vv1;

/* loaded from: classes3.dex */
public class m implements wf0.u1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vv1.n f440423d;

    public m(vv1.n nVar) {
        this.f440423d = nVar;
    }

    @Override // wf0.u1
    public void h(wf0.r1 r1Var) {
        java.lang.String str = r1Var.f445529a;
        vv1.n nVar = this.f440423d;
        if (str.equals(nVar.f440425n.d())) {
            ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).getClass();
            java.lang.String str2 = r1Var.f445529a;
            t21.v2 h17 = t21.d3.h(str2);
            if (h17 != null) {
                nVar.b(h17.f415007e, h17.f415008f);
                if (h17.i()) {
                    tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
                    com.tencent.mm.storage.f9 f9Var = nVar.f440424m;
                    java.lang.String rj6 = ((k90.b) u0Var).rj(f9Var, bm5.f0.f22571s, f9Var.z0(), false);
                    if (com.tencent.mm.vfs.w6.j(rj6)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MsgFileWorker_Video", "notifyChanged notifyInfo:%s", str2);
                        nVar.l(h17, rj6);
                        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
                        t21.o2.Ui().A(this);
                        return;
                    }
                    com.tencent.mars.xlog.Log.e("MicroMsg.MsgFileWorker_Video", "video fullPath:%s isn't exist, return", rj6);
                    nVar.a();
                    ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
                    t21.o2.Ui().A(this);
                }
            }
        }
    }
}
