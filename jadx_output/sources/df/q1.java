package df;

/* loaded from: classes7.dex */
public final class q1 implements wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df.w1 f229540d;

    public q1(df.w1 w1Var) {
        this.f229540d = w1Var;
    }

    @Override // wu5.f
    public boolean a() {
        return false;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "";
    }

    @Override // java.lang.Runnable
    public void run() {
        df.w1 w1Var = this.f229540d;
        com.tencent.skyline.SkylineRuntime skylineRuntime = w1Var.f229582f;
        if (skylineRuntime != null) {
            skylineRuntime.destroyWindow(w1Var.f229580d);
        }
    }
}
