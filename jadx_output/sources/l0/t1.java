package l0;

/* loaded from: classes14.dex */
public abstract class t1 {
    public static final java.lang.String a(int i17, n0.o oVar, int i18) {
        java.lang.String str;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.U(-726638443);
        y0Var.i(androidx.compose.ui.platform.a1.f10502a);
        android.content.res.Resources resources = ((android.content.Context) y0Var.i(androidx.compose.ui.platform.a1.f10503b)).getResources();
        if (i17 == 0) {
            str = resources.getString(com.tencent.mm.R.string.oal);
            kotlin.jvm.internal.o.f(str, "resources.getString(R.string.navigation_menu)");
        } else {
            if (i17 == 1) {
                str = resources.getString(com.tencent.mm.R.string.n_q);
                kotlin.jvm.internal.o.f(str, "resources.getString(R.string.close_drawer)");
            } else {
                if (i17 == 2) {
                    str = resources.getString(com.tencent.mm.R.string.ldb);
                    kotlin.jvm.internal.o.f(str, "resources.getString(R.string.close_sheet)");
                } else {
                    if (i17 == 3) {
                        str = resources.getString(com.tencent.mm.R.string.nde);
                        kotlin.jvm.internal.o.f(str, "resources.getString(R.st…ng.default_error_message)");
                    } else {
                        if (i17 == 4) {
                            str = resources.getString(com.tencent.mm.R.string.neb);
                            kotlin.jvm.internal.o.f(str, "resources.getString(R.string.dropdown_menu)");
                        } else {
                            if (i17 == 5) {
                                str = resources.getString(com.tencent.mm.R.string.ocn);
                                kotlin.jvm.internal.o.f(str, "resources.getString(R.string.range_start)");
                            } else {
                                if (i17 == 6) {
                                    str = resources.getString(com.tencent.mm.R.string.ocm);
                                    kotlin.jvm.internal.o.f(str, "resources.getString(R.string.range_end)");
                                } else {
                                    str = "";
                                }
                            }
                        }
                    }
                }
            }
        }
        y0Var.o(false);
        return str;
    }
}
