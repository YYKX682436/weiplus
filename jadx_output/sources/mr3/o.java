package mr3;

/* loaded from: classes5.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f330887d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMRoundCornerImageView f330888e;

    public o(in5.s0 s0Var, com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView) {
        this.f330887d = s0Var;
        this.f330888e = mMRoundCornerImageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in5.s0 s0Var = this.f330887d;
        kotlin.jvm.internal.o.f(s0Var.f293121e, "getContext(...)");
        kotlin.jvm.internal.o.f(s0Var.o(), "getRecyclerView(...)");
        int width = (int) ((r0.getWidth() - (6 * ((float) java.lang.Math.rint(i65.a.g(r1) * 4)))) / 3);
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = this.f330888e;
        android.view.ViewGroup.LayoutParams layoutParams = mMRoundCornerImageView.getLayoutParams();
        layoutParams.width = width;
        layoutParams.height = width;
        mMRoundCornerImageView.setLayoutParams(layoutParams);
        mMRoundCornerImageView.setVisibility(0);
    }
}
