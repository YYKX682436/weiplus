package ym5;

/* loaded from: classes10.dex */
public final class w5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.y5 f463565d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f463566e;

    public w5(ym5.y5 y5Var, int i17) {
        this.f463565d = y5Var;
        this.f463566e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ym5.y5 y5Var = this.f463565d;
        android.view.View findViewById = y5Var.findViewById(com.tencent.mm.R.id.auj);
        int i17 = this.f463566e;
        findViewById.setPadding(0, 0, 0, i17);
        c01.r2 r2Var = y5Var.G;
        int i18 = r2Var != null ? 0 + r2Var.f37414d : 0;
        android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = i18;
        findViewById.setLayoutParams(layoutParams2);
        com.tencent.mars.xlog.Log.i(y5Var.f463581x, "onKeyBoardChanged: keyboard height=" + i17 + ", extraMarginBottom=" + i18);
    }
}
