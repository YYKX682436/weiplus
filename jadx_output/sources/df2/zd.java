package df2;

/* loaded from: classes3.dex */
public final class zd extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.de f231957d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd(df2.de deVar) {
        super(0);
        this.f231957d = deVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        int dimensionPixelOffset;
        int c17;
        df2.de deVar = this.f231957d;
        if (deVar.U6()) {
            android.view.View view = deVar.f229970m;
            java.lang.Object layoutParams = view != null ? view.getLayoutParams() : null;
            marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, com.tencent.mm.ui.zk.a(deVar.O6(), 28), 0);
                android.view.View view2 = deVar.f229970m;
                if (view2 != null) {
                    view2.setLayoutParams(marginLayoutParams);
                }
            }
        } else {
            android.view.View view3 = deVar.f229970m;
            java.lang.Object layoutParams2 = view3 != null ? view3.getLayoutParams() : null;
            marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (zl2.r4.f473950a.y1(deVar.getStore().getLiveRoomData())) {
                dimensionPixelOffset = deVar.O6().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479670c7);
                c17 = com.tencent.mm.ui.bl.c(deVar.O6());
            } else {
                dimensionPixelOffset = deVar.O6().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479733dq);
                c17 = com.tencent.mm.ui.bl.c(deVar.O6());
            }
            int i17 = dimensionPixelOffset + c17;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, i17);
                android.view.View view4 = deVar.f229970m;
                if (view4 != null) {
                    view4.setLayoutParams(marginLayoutParams);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
