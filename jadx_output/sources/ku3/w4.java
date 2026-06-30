package ku3;

/* loaded from: classes3.dex */
public final class w4 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.i5 f312449d;

    public w4(ku3.i5 i5Var) {
        this.f312449d = i5Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        ku3.i5 i5Var = this.f312449d;
        int i17 = i5Var.f312278w;
        if (i17 == 1) {
            i5Var.c().s(com.tencent.mm.R.raw.icons_menu_ratio_1_1, com.tencent.mm.R.color.f478773gt);
        } else if (i17 == 2) {
            i5Var.c().s(com.tencent.mm.R.raw.icons_menu_ratio_4_3, com.tencent.mm.R.color.f478773gt);
        } else {
            if (i17 != 3) {
                return;
            }
            i5Var.c().s(com.tencent.mm.R.raw.icons_menu_ratio_16_9, com.tencent.mm.R.color.f478773gt);
        }
    }
}
