package mx0;

/* loaded from: classes5.dex */
public final class h3 extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public int f332022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mx0.j3 f332023e;

    public h3(mx0.j3 j3Var) {
        this.f332023e = j3Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        mx0.j3 j3Var = this.f332023e;
        int i17 = (int) (currentTimeMillis - j3Var.f332065g);
        if (i17 - this.f332022d >= 500) {
            j3Var.c(i17);
            this.f332022d = i17;
        }
    }
}
