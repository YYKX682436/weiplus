package mr3;

/* loaded from: classes5.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f330857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f330858e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f330859f;

    public e(in5.s0 s0Var, android.widget.LinearLayout linearLayout, android.widget.LinearLayout linearLayout2) {
        this.f330857d = s0Var;
        this.f330858e = linearLayout;
        this.f330859f = linearLayout2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in5.s0 s0Var = this.f330857d;
        kotlin.jvm.internal.o.f(s0Var.f293121e, "getContext(...)");
        kotlin.jvm.internal.o.f(s0Var.o(), "getRecyclerView(...)");
        int width = (int) ((r0.getWidth() - (6 * ((float) java.lang.Math.rint(i65.a.g(r1) * 4)))) / 3);
        android.widget.LinearLayout linearLayout = this.f330858e;
        android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        layoutParams.width = width;
        layoutParams.height = width;
        linearLayout.setLayoutParams(layoutParams);
        this.f330859f.setLayoutParams(layoutParams);
        linearLayout.setVisibility(0);
    }
}
