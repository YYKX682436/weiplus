package df2;

/* loaded from: classes3.dex */
public final class w7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.s8 f231670d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(df2.s8 s8Var) {
        super(0);
        this.f231670d = s8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        android.view.ViewGroup viewGroup;
        int dimensionPixelOffset;
        int c17;
        df2.s8 s8Var = this.f231670d;
        if (s8Var.U6()) {
            android.view.View view = s8Var.f231301o;
            java.lang.Object layoutParams = view != null ? view.getLayoutParams() : null;
            marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            zl2.r4 r4Var = zl2.r4.f473950a;
            int dimensionPixelOffset2 = r4Var.y1(s8Var.getStore().getLiveRoomData()) ? j65.f.f297943g > 1.0f ? s8Var.O6().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479736dt) : s8Var.O6().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479670c7) : s8Var.O6().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479736dt);
            int dimensionPixelOffset3 = r4Var.y1(s8Var.getStore().getLiveRoomData()) ? j65.f.f297943g > 1.0f ? s8Var.O6().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479649bo) : s8Var.O6().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479688cn) : s8Var.O6().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479688cn);
            com.tencent.mm.plugin.finder.live.plugin.le0 le0Var = (com.tencent.mm.plugin.finder.live.plugin.le0) s8Var.R6(com.tencent.mm.plugin.finder.live.plugin.le0.class);
            int width = dimensionPixelOffset3 + ((le0Var == null || (viewGroup = le0Var.f365323d) == null) ? 0 : viewGroup.getWidth());
            if (marginLayoutParams != null) {
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, width, dimensionPixelOffset2);
                android.view.View view2 = s8Var.f231301o;
                if (view2 != null) {
                    view2.setLayoutParams(marginLayoutParams);
                }
            }
        } else {
            android.view.View view3 = s8Var.f231301o;
            java.lang.Object layoutParams2 = view3 != null ? view3.getLayoutParams() : null;
            marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (zl2.r4.f473950a.y1(s8Var.getStore().getLiveRoomData())) {
                dimensionPixelOffset = s8Var.O6().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479670c7);
                c17 = com.tencent.mm.ui.bl.c(s8Var.O6());
            } else {
                dimensionPixelOffset = s8Var.O6().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479736dt);
                c17 = com.tencent.mm.ui.bl.c(s8Var.O6());
            }
            int i17 = dimensionPixelOffset + c17;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, i17);
                android.view.View view4 = s8Var.f231301o;
                if (view4 != null) {
                    view4.setLayoutParams(marginLayoutParams);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
