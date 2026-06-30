package e33;

/* loaded from: classes10.dex */
public class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e33.t0 f247453d;

    public s0(e33.t0 t0Var) {
        this.f247453d = t0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        e33.t0 t0Var = this.f247453d;
        t0Var.f247466b.f138538q.startAnimation(android.view.animation.AnimationUtils.loadAnimation(t0Var.f247466b.getContext(), com.tencent.mm.R.anim.f477784bd));
        t0Var.f247466b.f138538q.setVisibility(8);
    }
}
