package el2;

/* loaded from: classes3.dex */
public final class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.r2 f253883d;

    public o2(el2.r2 r2Var) {
        this.f253883d = r2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f253883d.f253899d.animate().setDuration(100L).scaleX(1.0f).scaleY(1.0f).start();
    }
}
