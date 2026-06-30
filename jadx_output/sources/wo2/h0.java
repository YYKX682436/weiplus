package wo2;

/* loaded from: classes2.dex */
public final class h0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo2.m0 f448076d;

    public h0(wo2.m0 m0Var) {
        this.f448076d = m0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Object obj2;
        r45.f03 f03Var;
        r45.f03 f03Var2;
        com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var = (com.tencent.mm.plugin.finder.extension.reddot.z9) obj;
        wo2.m0 m0Var = this.f448076d;
        com.google.android.material.tabs.TabLayout R6 = m0Var.R6();
        kotlin.jvm.internal.o.f(R6, "access$getTabLayout(...)");
        oa.i O6 = wo2.m0.O6(m0Var, R6, 1003);
        if (O6 == null || (obj2 = O6.f343778a) == null) {
            return;
        }
        wo2.q qVar = (wo2.q) obj2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[registerRedDot] TAB_NEARBY_TYPE_PERSON isShow=");
        java.lang.Integer num = null;
        sb6.append(z9Var != null ? java.lang.Boolean.valueOf(z9Var.f105327a) : null);
        sb6.append(" show_type=");
        if (z9Var != null && (f03Var2 = z9Var.f105328b) != null) {
            num = java.lang.Integer.valueOf(f03Var2.f373887d);
        }
        sb6.append(num);
        com.tencent.mars.xlog.Log.i("NearbyActionBarUIC", sb6.toString());
        boolean z17 = z9Var != null && z9Var.f105327a;
        android.widget.ImageView imageView = qVar.f448119e;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = qVar.f448118d;
        if (!z17) {
            if ((z9Var == null || (f03Var = z9Var.f105328b) == null || f03Var.f373887d != 101) ? false : true) {
                if (weImageView == null) {
                    return;
                }
                weImageView.setVisibility(4);
                return;
            } else {
                if (imageView != null) {
                    imageView.setVisibility(4);
                }
                if (weImageView == null) {
                    return;
                }
                weImageView.setVisibility(((pa0.e) ((qa0.e) i95.n0.c(qa0.e.class))).wi() ? 4 : 0);
                return;
            }
        }
        r45.f03 f03Var3 = z9Var.f105328b;
        if (f03Var3 != null && f03Var3.f373887d == 101) {
            if (imageView != null) {
                imageView.setVisibility(4);
            }
            if (weImageView == null) {
                return;
            }
            weImageView.setVisibility(0);
            return;
        }
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        if (weImageView == null) {
            return;
        }
        weImageView.setVisibility(4);
    }
}
