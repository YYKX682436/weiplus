package gt4;

/* loaded from: classes14.dex */
public final class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gt4.s0 f275512d;

    public r0(gt4.s0 s0Var) {
        this.f275512d = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update maxBottomSheetHeight to ");
        gt4.s0 s0Var = this.f275512d;
        android.view.View view = s0Var.f275535e;
        if (view == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        sb6.append(view.getHeight());
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletComplexDatePicker", sb6.toString());
        android.view.View view2 = s0Var.f275535e;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        s0Var.M = view2.getHeight();
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = s0Var.f275536f;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.C(s0Var.M);
        } else {
            kotlin.jvm.internal.o.o("behavior");
            throw null;
        }
    }
}
