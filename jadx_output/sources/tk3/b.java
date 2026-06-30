package tk3;

/* loaded from: classes8.dex */
public final class b implements kk3.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tk3.d f419910a;

    public b(tk3.d dVar) {
        this.f419910a = dVar;
    }

    @Override // kk3.e
    public void onOrientationChange(int i17) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        tk3.d dVar = this.f419910a;
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewFloatBallContainer", "whenOrientationChange new:%d, last:%d", valueOf, java.lang.Integer.valueOf(dVar.f419914b));
        if (dVar.f419914b == i17) {
            return;
        }
        dVar.f419914b = i17;
    }
}
