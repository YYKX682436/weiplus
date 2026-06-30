package vd2;

/* loaded from: classes8.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vd2.u0 f435899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435900e;

    public s0(vd2.u0 u0Var, java.lang.String str) {
        this.f435899d = u0Var;
        this.f435900e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i(this.f435899d.f435926d, "tryGetTipsBarStorage chatroomId:" + this.f435900e);
        rl2.v wi6 = this.f435899d.wi();
        if ((wi6 != null ? wi6.D0(this.f435900e) : 0) != 0) {
            ((ku5.t0) ku5.t0.f312615d).A(this.f435899d.f435928f);
            rl2.v wi7 = this.f435899d.wi();
            if (wi7 != null) {
                wi7.J0(this.f435900e);
            }
        }
    }
}
