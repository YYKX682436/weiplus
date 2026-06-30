package sk4;

/* loaded from: classes15.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jm4.y0 f408970d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sk4.p f408971e;

    public d(jm4.y0 y0Var, sk4.p pVar) {
        this.f408970d = y0Var;
        this.f408971e = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addListener ");
        jm4.y0 y0Var = this.f408970d;
        sb6.append(y0Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioRecorderImpl", sb6.toString());
        com.tencent.unit_rc.WeakPtr weakPtr = new com.tencent.unit_rc.WeakPtr(y0Var);
        sk4.p pVar = this.f408971e;
        pVar.f408996n.add(weakPtr);
        if (!pVar.f408994i || y0Var == null) {
            return;
        }
        y0Var.n1();
    }
}
