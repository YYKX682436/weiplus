package el2;

/* loaded from: classes3.dex */
public final class y0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i1 f253949d;

    public y0(el2.i1 i1Var) {
        this.f253949d = i1Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        mm2.y0 y0Var = (mm2.y0) obj;
        if (y0Var.f329549b == 9) {
            el2.i1 i1Var = this.f253949d;
            com.tencent.mars.xlog.Log.i(i1Var.f253815g, "[onGiftSendInstantClick]");
            boolean z17 = y0Var.f329548a == qs5.m.f366438d;
            android.view.ViewGroup viewGroup = i1Var.f253812d;
            if (z17) {
                if (!(viewGroup.getScaleX() == 1.4f)) {
                    viewGroup.postDelayed(new el2.d1(viewGroup, i1Var, 1.4f), 0L);
                }
            } else {
                i1Var.f253821p = false;
                i1Var.f253822q = false;
                i1Var.o(false);
                if (!(viewGroup.getScaleX() == 1.0f)) {
                    viewGroup.postDelayed(new el2.d1(viewGroup, i1Var, 1.0f), 0L);
                }
            }
            i1Var.o(false);
        }
    }
}
