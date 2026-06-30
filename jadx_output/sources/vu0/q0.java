package vu0;

/* loaded from: classes5.dex */
public final class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vu0.r0 f440142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float[] f440143e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f440144f;

    public q0(vu0.r0 r0Var, float[] fArr, float f17) {
        this.f440142d = r0Var;
        this.f440143e = fArr;
        this.f440144f = f17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f440142d.f440146a.J4(this.f440143e, this.f440144f);
    }
}
