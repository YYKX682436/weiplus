package wx0;

/* loaded from: classes5.dex */
public final class j0 extends android.os.CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wx0.k0 f450500a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(long j17, long j18, wx0.k0 k0Var) {
        super(j17, j18);
        this.f450500a = k0Var;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        androidx.constraintlayout.widget.ConstraintLayout rootView;
        if (this.f450500a.f450505m) {
            return;
        }
        this.f450500a.f450504i = null;
        wx0.g0 g0Var = this.f450500a.f450506n;
        if (g0Var != null) {
            mx0.p4 p4Var = (mx0.p4) g0Var;
            com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = p4Var.f332212c;
            rootView = shootComposingPluginLayout.getRootView();
            rootView.removeView(p4Var.f332211b);
            shootComposingPluginLayout.a1();
        }
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j17) {
        wx0.g0 g0Var;
        if (this.f450500a.f450505m || (g0Var = this.f450500a.f450506n) == null) {
            return;
        }
        mx0.p4 p4Var = (mx0.p4) g0Var;
        android.animation.AnimatorSet animatorSet = p4Var.f332210a;
        animatorSet.cancel();
        animatorSet.start();
        p4Var.f332211b.setText(java.lang.String.valueOf(a06.d.b(((float) j17) / 1000.0f)));
    }
}
