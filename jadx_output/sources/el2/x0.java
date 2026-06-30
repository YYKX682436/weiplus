package el2;

/* loaded from: classes3.dex */
public final class x0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i1 f253941d;

    public x0(el2.i1 i1Var) {
        this.f253941d = i1Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.String str;
        jz5.l lVar = (jz5.l) obj;
        android.os.Bundle bundle = (android.os.Bundle) lVar.f302834e;
        boolean z17 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_GIFT_SEND_BY_OUTER", false) : false;
        el2.i1 i1Var = this.f253941d;
        if (!z17) {
            i1Var.f253821p = false;
            i1Var.f253822q = false;
            i1Var.o(false);
            return;
        }
        boolean booleanValue = ((java.lang.Boolean) lVar.f302833d).booleanValue();
        i1Var.f253821p = booleanValue;
        if (booleanValue) {
            return;
        }
        i1Var.f253822q = false;
        i1Var.o(true);
        android.os.Bundle bundle2 = (android.os.Bundle) lVar.f302834e;
        if (bundle2 == null || (str = bundle2.getString("PARAM_FINDER_LIVE_GIFT_ID")) == null) {
            str = "";
        }
        i1Var.p(22, str, bundle2 != null ? bundle2.getInt("PARAM_FINDER_LIVE_GIFT_SEND_TOTAL_CNT", -1) : -1);
    }
}
