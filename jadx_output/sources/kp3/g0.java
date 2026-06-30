package kp3;

/* loaded from: classes14.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kp3.p0 f310991d;

    public g0(kp3.p0 p0Var) {
        this.f310991d = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kp3.p0 p0Var = this.f310991d;
        int circlePagWidth = (int) p0Var.R6().getCirclePagWidth();
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ((jz5.n) p0Var.f311022e).getValue();
        if (relativeLayout != null) {
            android.view.ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            layoutParams.width = circlePagWidth;
            layoutParams.height = circlePagWidth;
            relativeLayout.setLayoutParams(layoutParams);
            relativeLayout.setY(p0Var.R6().getCircleY() - ((int) (circlePagWidth * 0.5d)));
            com.tencent.mars.xlog.Log.i("MicroMsg.PalmPrintPreviewUIC", "[setCircleStyle] circle pag y:" + relativeLayout.getY() + ", pagSize:" + circlePagWidth);
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = p0Var.Q6().getLayoutParams();
        int i17 = (int) (circlePagWidth * 0.4f);
        layoutParams2.width = i17;
        layoutParams2.height = i17;
        p0Var.Q6().setLayoutParams(layoutParams2);
        android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) ((jz5.n) p0Var.f311021d).getValue();
        if (relativeLayout2 != null) {
            relativeLayout2.postDelayed(new kp3.h0(relativeLayout2, p0Var), 30L);
        }
    }
}
