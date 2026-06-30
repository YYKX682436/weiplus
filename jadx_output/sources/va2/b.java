package va2;

/* loaded from: classes3.dex */
public final class b extends x92.l {

    /* renamed from: q, reason: collision with root package name */
    public final int f434232q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f434232q = i65.a.b(activity, 260);
    }

    @Override // x92.l
    public void W6(boolean z17) {
        com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout;
        super.W6(z17);
        android.view.View findViewById = getActivity().findViewById(com.tencent.mm.R.id.f482534h0);
        java.lang.Object layoutParams = findViewById != null ? findViewById.getLayoutParams() : null;
        android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.gravity = 17;
            layoutParams2.setMarginStart(0);
            layoutParams2.leftMargin = 0;
            findViewById.setLayoutParams(layoutParams2);
        }
        if (!a2() || (roundCornerRelativeLayout = (com.tencent.mm.ui.widget.RoundCornerRelativeLayout) getContext().findViewById(com.tencent.mm.R.id.cje)) == null) {
            return;
        }
        float dimension = getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479672c9);
        roundCornerRelativeLayout.c(dimension, dimension, 0.0f, 0.0f);
        roundCornerRelativeLayout.setBackgroundResource(com.tencent.mm.R.color.aaw);
        int dimensionPixelSize = getActivity().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479623ay) + com.tencent.mm.ui.bl.h(getActivity());
        android.view.ViewGroup.LayoutParams layoutParams3 = roundCornerRelativeLayout.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams3)).topMargin = (this.f434232q - dimensionPixelSize) - ((int) dimension);
        android.view.ViewGroup viewGroup = this.f452705i;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    @Override // x92.l
    public int X6(int i17) {
        return this.f434232q;
    }
}
