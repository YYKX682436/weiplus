package sc3;

/* loaded from: classes7.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f406546d;

    public w(sc3.k1 k1Var) {
        this.f406546d = k1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f406546d.S) {
            sc3.k1 k1Var = this.f406546d;
            if (!k1Var.f406474J) {
                long j17 = k1Var.T + 1;
                k1Var.T = j17;
                bf3.g0.f19627a.b(k1Var.f406476e, new sc3.v(k1Var, j17));
                if (this.f406546d.S) {
                    sc3.k1 k1Var2 = this.f406546d;
                    if (!k1Var2.f406474J) {
                        ((com.tencent.mm.sdk.platformtools.n3) ((jz5.n) k1Var2.R).getValue()).postDelayed(this, this.f406546d.U);
                        return;
                    }
                }
                com.tencent.mars.xlog.Log.i(this.f406546d.Q, "heartbeat tick#" + j17 + " not reschedule: started=" + this.f406546d.S + ", destroying=" + this.f406546d.f406474J);
                return;
            }
        }
        com.tencent.mars.xlog.Log.i(this.f406546d.Q, "heartbeat tick skip: started=" + this.f406546d.S + ", destroying=" + this.f406546d.f406474J);
    }
}
