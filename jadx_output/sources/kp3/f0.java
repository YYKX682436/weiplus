package kp3;

/* loaded from: classes12.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kp3.p0 f310987d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f310988e;

    public f0(kp3.p0 p0Var, int i17) {
        this.f310987d = p0Var;
        this.f310988e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.sdk.platformtools.v5.b(this.f310987d.getContext(), this.f310988e);
    }
}
