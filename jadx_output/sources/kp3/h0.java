package kp3;

/* loaded from: classes14.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.RelativeLayout f310995d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kp3.p0 f310996e;

    public h0(android.widget.RelativeLayout relativeLayout, kp3.p0 p0Var) {
        this.f310995d = relativeLayout;
        this.f310996e = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float tipsLayoutY = this.f310996e.R6().getTipsLayoutY();
        this.f310995d.setY(tipsLayoutY - (r1.getHeight() * 0.5f));
    }
}
