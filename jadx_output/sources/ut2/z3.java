package ut2;

/* loaded from: classes3.dex */
public final class z3 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.a4 f431174d;

    public z3(ut2.a4 a4Var) {
        this.f431174d = a4Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int i17;
        ut2.a4 a4Var = this.f431174d;
        a4Var.f430820b.h().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        java.lang.Object parent = a4Var.f430821c.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
        int height = ((android.view.View) parent).getHeight();
        a4Var.f430821c.getLayoutParams().width = -1;
        a4Var.f430821c.getLayoutParams().height = height;
        int childCount = a4Var.f430820b.q().getChildCount();
        int i18 = 0;
        while (true) {
            if (i18 >= childCount) {
                i17 = 0;
                break;
            }
            androidx.recyclerview.widget.k3 w07 = a4Var.f430820b.q().w0(a4Var.f430820b.q().getChildAt(i18));
            if ((w07 instanceof ut2.t0) && ((ut2.t0) w07).f431099i == ut2.p0.f431047e) {
                i17 = w07.itemView.getBottom();
                break;
            }
            i18++;
        }
        int f17 = i65.a.f(a4Var.f430819a.getContext(), com.tencent.mm.R.dimen.f479667c4);
        android.view.ViewGroup.LayoutParams layoutParams = a4Var.f430822d.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMargins(0, i17 + (((height - i17) - f17) / 3), 0, 0);
            a4Var.f430822d.setLayoutParams(marginLayoutParams);
        }
    }
}
