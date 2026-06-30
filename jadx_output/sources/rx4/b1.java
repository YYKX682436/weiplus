package rx4;

/* loaded from: classes.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.h2 f401105d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(rx4.h2 h2Var) {
        super(0);
        this.f401105d = h2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById;
        android.view.View findViewById2;
        rx4.h2 h2Var = this.f401105d;
        int color = h2Var.getActivity().getResources().getColor(com.tencent.mm.R.color.f478491c);
        float f17 = h2Var.getActivity().getResources().getDisplayMetrics().density;
        android.widget.ScrollView scrollView = h2Var.f401174p;
        if (scrollView != null) {
            scrollView.setBackgroundColor(color);
        }
        android.widget.ScrollView scrollView2 = h2Var.f401174p;
        android.view.View childAt = scrollView2 != null ? scrollView2.getChildAt(0) : null;
        android.view.ViewGroup viewGroup = childAt instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt : null;
        if (viewGroup != null) {
            viewGroup.setBackgroundColor(color);
            viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), (int) (40 * f17));
        }
        android.view.View findViewById3 = h2Var.getActivity().findViewById(com.tencent.mm.R.id.che);
        if (findViewById3 != null) {
            findViewById3.setBackgroundColor(color);
        }
        android.view.View findViewById4 = h2Var.getActivity().findViewById(com.tencent.mm.R.id.f487337oc1);
        if (findViewById4 != null) {
            findViewById4.setBackgroundColor(color);
        }
        android.view.View findViewById5 = h2Var.getActivity().findViewById(com.tencent.mm.R.id.ggf);
        if (findViewById5 != null) {
            findViewById5.setBackgroundColor(color);
        }
        android.view.View findViewById6 = h2Var.getActivity().findViewById(com.tencent.mm.R.id.phj);
        if (findViewById6 != null) {
            findViewById6.setBackgroundColor(color);
        }
        int i17 = (int) (56 * f17);
        android.view.View findViewById7 = h2Var.getActivity().findViewById(com.tencent.mm.R.id.che);
        if (findViewById7 == null) {
            findViewById7 = h2Var.getActivity().findViewById(com.tencent.mm.R.id.ggf);
        }
        if (findViewById7 != null && (findViewById2 = findViewById7.findViewById(com.tencent.mm.R.id.f487336oc0)) != null && findViewById2.getLayoutParams().height != i17) {
            android.view.ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
            layoutParams.height = i17;
            findViewById2.setLayoutParams(layoutParams);
        }
        if (findViewById7 != null && (findViewById = findViewById7.findViewById(com.tencent.mm.R.id.pil)) != null) {
            android.view.ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams != null && marginLayoutParams.topMargin != i17) {
                marginLayoutParams.topMargin = i17;
                findViewById.setLayoutParams(marginLayoutParams);
            }
        }
        return jz5.f0.f302826a;
    }
}
