package k23;

/* loaded from: classes12.dex */
public final class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k23.n1 f303614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k23.j2 f303615e;

    public l1(k23.n1 n1Var, k23.j2 j2Var) {
        this.f303614d = n1Var;
        this.f303615e = j2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k23.n1 n1Var = this.f303614d;
        if (n1Var.f303628d) {
            return;
        }
        n1Var.f303628d = true;
        n1Var.f303629e = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSStartRecognizeBtnModeSwitch", n1Var.f303625a + ": 长按触发语音输入");
        k23.k1 k1Var = this.f303615e.f303596n;
        if (k1Var != null) {
            k1Var.c();
        }
    }
}
