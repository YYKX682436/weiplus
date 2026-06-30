package pn2;

/* loaded from: classes3.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pn2.c0 f356967d;

    public a0(pn2.c0 c0Var) {
        this.f356967d = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pn2.c0 c0Var = this.f356967d;
        android.widget.FrameLayout D = c0Var.D();
        if (D != null) {
            D.setVisibility(0);
        }
        com.tencent.mm.view.MMPAGView mMPAGView = c0Var.f356979o;
        if (mMPAGView == null) {
            return;
        }
        mMPAGView.setProgress(1.0d);
    }
}
