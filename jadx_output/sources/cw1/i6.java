package cw1;

/* loaded from: classes12.dex */
public final class i6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f223002d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw1.l6 f223003e;

    public i6(boolean z17, cw1.l6 l6Var) {
        this.f223002d = z17;
        this.f223003e = l6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f223002d) {
            return;
        }
        cw1.l6.b(this.f223003e);
    }
}
