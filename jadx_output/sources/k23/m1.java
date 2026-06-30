package k23;

/* loaded from: classes12.dex */
public final class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k23.n1 f303619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f303620e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k23.j2 f303621f;

    public m1(k23.n1 n1Var, boolean z17, k23.j2 j2Var) {
        this.f303619d = n1Var;
        this.f303620e = z17;
        this.f303621f = j2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        k23.n1 n1Var = this.f303619d;
        sb6.append(n1Var.f303625a);
        sb6.append(": 长按延迟结束，isCanceling=");
        boolean z17 = this.f303620e;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSStartRecognizeBtnModeSwitch", sb6.toString());
        k23.k1 k1Var = this.f303621f.f303596n;
        if (k1Var != null) {
            k1Var.g(z17);
        }
        n1Var.f303631g = null;
    }
}
