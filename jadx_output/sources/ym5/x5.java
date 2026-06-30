package ym5;

/* loaded from: classes10.dex */
public final class x5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.y5 f463573d;

    public x5(ym5.y5 y5Var) {
        this.f463573d = y5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ym5.y5 y5Var = this.f463573d;
        boolean z17 = y5Var.getTextEditView().getVisibility() == 0 && (y5Var.getTextEditView().getAnimation() == null || (y5Var.getTextEditView().getAnimation().hasStarted() && y5Var.getTextEditView().getAnimation().hasEnded()));
        if (z17) {
            android.content.Context context = y5Var.getContext();
            com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
            if (mMActivity != null) {
                mMActivity.showVKB();
            }
        }
        com.tencent.mars.xlog.Log.i(y5Var.f463581x, "requestEditTextShowVKB: enable=" + z17);
    }
}
