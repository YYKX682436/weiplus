package pn2;

/* loaded from: classes3.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f356968d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f356969e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pn2.c0 f356970f;

    public b0(android.view.View view, float f17, pn2.c0 c0Var) {
        this.f356968d = view;
        this.f356969e = f17;
        this.f356970f = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f356968d;
        float f17 = this.f356969e;
        view.setScaleX(f17);
        view.setScaleY(f17);
        view.setPivotX(0.0f);
        pn2.c0 c0Var = this.f356970f;
        com.tencent.mm.view.MMPAGView mMPAGView = c0Var.f356979o;
        if (mMPAGView != null) {
            mMPAGView.setScaleX(f17);
        }
        com.tencent.mm.view.MMPAGView mMPAGView2 = c0Var.f356979o;
        if (mMPAGView2 == null) {
            return;
        }
        mMPAGView2.setScaleY(f17);
    }
}
