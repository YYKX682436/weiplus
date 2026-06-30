package lp4;

/* loaded from: classes10.dex */
public final class x0 implements kp4.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lp4.a1 f320439a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f320440b;

    public x0(lp4.a1 a1Var, ju3.d0 d0Var) {
        this.f320439a = a1Var;
        this.f320440b = d0Var;
    }

    @Override // kp4.t0
    public void a(long j17, long j18) {
        lp4.a1 a1Var = this.f320439a;
        a1Var.f320323s = j17;
        a1Var.f320324t = j18;
        a1Var.z();
    }

    @Override // kp4.t0
    public void b(long j17, long j18) {
        lp4.a1 a1Var = this.f320439a;
        com.tencent.mars.xlog.Log.i(a1Var.f320314g, "onScrollStateChanged: " + j17 + ", " + j18);
        android.os.Bundle bundle = new android.os.Bundle();
        a1Var.f320323s = j17;
        a1Var.f320324t = j18;
        a1Var.z();
        bundle.putLong("EDIT_VLOG_TRACK_CROP_START", j17);
        bundle.putLong("EDIT_VLOG_TRAKC_CROP_END", j18);
        this.f320440b.w(ju3.c0.f301876f2, bundle);
    }

    @Override // kp4.t0
    public void pause() {
        ju3.d0.k(this.f320440b, ju3.c0.f301895p1, null, 2, null);
    }

    @Override // kp4.t0
    public void seekTo(long j17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        lp4.a1 a1Var = this.f320439a;
        if (currentTimeMillis - a1Var.f320325u > 15) {
            a1Var.f320325u = java.lang.System.currentTimeMillis();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("PARAM_1_LONG", j17);
            this.f320440b.w(ju3.c0.H, bundle);
        }
    }
}
