package ku3;

/* loaded from: classes3.dex */
public final class f3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.y3 f312229d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f312230e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f312231f;

    public f3(ku3.y3 y3Var, int i17, int i18) {
        this.f312229d = y3Var;
        this.f312230e = i17;
        this.f312231f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ku3.y3 y3Var = this.f312229d;
        android.view.ViewGroup.LayoutParams layoutParams = y3Var.g().getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        int i17 = y3Var.f312472g;
        int i18 = this.f312231f;
        int i19 = this.f312230e;
        if (i17 == 1) {
            layoutParams2.removeRule(13);
            layoutParams2.addRule(14);
            layoutParams2.addRule(10);
            layoutParams2.topMargin = i19 + ((i18 - y3Var.g().getHeight()) / 2);
            y3Var.g().setLayoutParams(layoutParams2);
            return;
        }
        if (i17 == 2) {
            layoutParams2.addRule(13);
            layoutParams2.removeRule(14);
            layoutParams2.removeRule(10);
            y3Var.g().setLayoutParams(layoutParams2);
            return;
        }
        if (i17 != 3) {
            return;
        }
        layoutParams2.removeRule(13);
        layoutParams2.removeRule(14);
        layoutParams2.addRule(12);
        layoutParams2.topMargin = i19 + ((i18 - y3Var.g().getHeight()) / 2);
        y3Var.g().setLayoutParams(layoutParams2);
    }
}
