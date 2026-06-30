package rx4;

/* loaded from: classes.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.h2 f401092d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(rx4.h2 h2Var) {
        super(0);
        this.f401092d = h2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById;
        android.view.View findViewById2;
        rx4.h2 h2Var = this.f401092d;
        float f17 = h2Var.getActivity().getResources().getDisplayMetrics().density;
        int color = h2Var.getActivity().getResources().getColor(com.tencent.mm.R.color.aac);
        android.view.View findViewById3 = h2Var.getActivity().findViewById(com.tencent.mm.R.id.che);
        if (findViewById3 != null) {
            findViewById3.setBackgroundColor(color);
        }
        android.view.View findViewById4 = h2Var.getActivity().findViewById(com.tencent.mm.R.id.f487337oc1);
        if (findViewById4 != null) {
            findViewById4.setBackgroundColor(color);
        }
        int i17 = (int) (48 * f17);
        android.view.View findViewById5 = h2Var.getActivity().findViewById(com.tencent.mm.R.id.che);
        if (findViewById5 == null) {
            findViewById5 = h2Var.getActivity().findViewById(com.tencent.mm.R.id.ggf);
        }
        if (findViewById5 != null && (findViewById2 = findViewById5.findViewById(com.tencent.mm.R.id.f487336oc0)) != null && findViewById2.getLayoutParams().height != i17) {
            android.view.ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
            layoutParams.height = i17;
            findViewById2.setLayoutParams(layoutParams);
        }
        if (findViewById5 != null && (findViewById = findViewById5.findViewById(com.tencent.mm.R.id.pil)) != null) {
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
