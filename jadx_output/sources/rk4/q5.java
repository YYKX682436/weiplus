package rk4;

/* loaded from: classes14.dex */
public final class q5 implements android.content.DialogInterface.OnShowListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.TingPlayerHalfProfileDialogFragment f396935d;

    public q5(com.tencent.mm.plugin.ting.TingPlayerHalfProfileDialogFragment tingPlayerHalfProfileDialogFragment) {
        this.f396935d = tingPlayerHalfProfileDialogFragment;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(android.content.DialogInterface dialogInterface) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new rk4.p5(this.f396935d));
        ofFloat.start();
    }
}
