package tl5;

/* loaded from: classes10.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl5.s f420379d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(tl5.s sVar) {
        super(1);
        this.f420379d = sVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int u07;
        xm3.t0 b17;
        uc5.l0 l0Var;
        android.graphics.drawable.Drawable drawable;
        android.graphics.drawable.Drawable.ConstantState constantState;
        android.graphics.drawable.Drawable newDrawable;
        long longValue = ((java.lang.Number) obj).longValue();
        cd5.a aVar = (cd5.a) this.f420379d.f420385a;
        com.tencent.mm.view.recyclerview.WxRecyclerView c17 = aVar.c();
        int childCount = c17.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = c17.getChildAt(i17);
            if (childAt != null && (u07 = c17.u0(childAt)) != -1 && (b17 = xm3.u0.b(c17)) != null && (l0Var = (uc5.l0) kz5.n0.a0(b17.getData(), u07)) != null && aVar.d(l0Var) == longValue && (l0Var instanceof uc5.h0)) {
                android.widget.ImageView imageView = (android.widget.ImageView) childAt.findViewById(com.tencent.mm.R.id.chd);
                if (imageView == null || (drawable = imageView.getDrawable()) == null) {
                    return null;
                }
                if (!(!(drawable instanceof android.graphics.drawable.ColorDrawable))) {
                    drawable = null;
                }
                if (drawable == null || (constantState = drawable.getConstantState()) == null || (newDrawable = constantState.newDrawable()) == null) {
                    return null;
                }
                return newDrawable.mutate();
            }
        }
        return null;
    }
}
