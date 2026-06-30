package rb2;

/* loaded from: classes.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f393843d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f393844e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f393845f;

    public z(android.view.View view, android.view.View view2, in5.s0 s0Var) {
        this.f393843d = view;
        this.f393844e = view2;
        this.f393845f = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView textView;
        android.view.View view = this.f393843d;
        if (view != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = this.f393844e.getMeasuredWidth();
            view.setLayoutParams(layoutParams);
            int dimensionPixelOffset = layoutParams.width - this.f393845f.f293121e.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479715d8);
            if (dimensionPixelOffset <= 0 || (textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483843c75)) == null) {
                return;
            }
            textView.setMaxWidth(dimensionPixelOffset);
        }
    }
}
