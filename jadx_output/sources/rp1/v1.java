package rp1;

/* loaded from: classes14.dex */
public class v1 implements rp1.i2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.FloatMenuView f398542a;

    public v1(com.tencent.mm.plugin.ball.view.FloatMenuView floatMenuView) {
        this.f398542a = floatMenuView;
    }

    public boolean a(androidx.recyclerview.widget.k3 k3Var, android.animation.Animator.AnimatorListener animatorListener) {
        android.view.View view;
        if (k3Var == null || (view = k3Var.itemView) == null) {
            return false;
        }
        float measuredWidth = view.getMeasuredWidth();
        com.tencent.mm.plugin.ball.view.FloatMenuView floatMenuView = this.f398542a;
        if (measuredWidth <= 0.0f) {
            measuredWidth = floatMenuView.getMeasuredWidth();
        }
        if (floatMenuView.f93594y) {
            measuredWidth = -measuredWidth;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatMenuView", "animateRemove tranX: %f", java.lang.Float.valueOf(measuredWidth));
        k3Var.itemView.animate().alpha(0.0f).translationX(measuredWidth).setListener(new rp1.u1(this, animatorListener, k3Var)).start();
        return true;
    }
}
