package yw;

/* loaded from: classes11.dex */
public final class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f466391d;

    public l1(java.lang.String str) {
        this.f466391d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.mm.biz.g0 c17;
        if (yw.w1.f466488b) {
            yw.w1.f466488b = false;
            yw.w1.f466489c = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterInstantsHelper", "killFlutterInstants from = " + this.f466391d);
            vw.m2 m2Var = (vw.m2) ((rv.k3) i95.n0.c(rv.k3.class));
            kotlinx.coroutines.l.d(m2Var.f440685e, null, null, new vw.k1(m2Var, null), 3, null);
            if (!yw.h1.f466332a.n() || (c17 = yw.q3.f466437a.c()) == null) {
                return;
            }
            c17.M(false, yw.k1.f466379a);
        }
    }
}
