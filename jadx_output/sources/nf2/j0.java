package nf2;

/* loaded from: classes10.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nf2.d1 f336759d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(nf2.d1 d1Var) {
        super(0);
        this.f336759d = d1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nf2.d1 d1Var = this.f336759d;
        d1Var.f336700u = false;
        android.view.View view = d1Var.f336696q;
        if (view != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams ? (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = 0;
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin = 0;
                layoutParams2.f10906q = -1;
                layoutParams2.f10893h = -1;
                layoutParams2.f10908s = -1;
                layoutParams2.f10899k = -1;
                int ordinal = d1Var.f336682c.f336732n.ordinal();
                if (ordinal == 0) {
                    layoutParams2.f10908s = com.tencent.mm.R.id.tkv;
                    layoutParams2.f10899k = com.tencent.mm.R.id.tkv;
                } else if (ordinal == 1) {
                    layoutParams2.f10906q = com.tencent.mm.R.id.tkv;
                    layoutParams2.f10908s = com.tencent.mm.R.id.tkv;
                    layoutParams2.f10899k = com.tencent.mm.R.id.tkv;
                }
                view.setLayoutParams(layoutParams2);
                com.tencent.mars.xlog.Log.i("FinderLiveLyricsView", "restoreCollapsedButtonConstraints: restored to menu container, mode=" + d1Var.f336682c.f336732n);
            }
        }
        com.tencent.mars.xlog.Log.i("FinderLiveLyricsView", "expand: animation completed, alignment: " + d1Var.E);
        return jz5.f0.f302826a;
    }
}
