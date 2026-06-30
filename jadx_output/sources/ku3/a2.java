package ku3;

/* loaded from: classes3.dex */
public final class a2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.n2 f312163d;

    public a2(ku3.n2 n2Var) {
        this.f312163d = n2Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        ku3.n0 n0Var = (ku3.n0) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hintText change >> ");
        sb6.append(n0Var.f312332a);
        sb6.append(", ");
        java.lang.String str = n0Var.f312334c;
        sb6.append(str);
        sb6.append(", ");
        int i17 = n0Var.f312333b;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordHintPlugin", sb6.toString());
        ku3.n2 n2Var = this.f312163d;
        int i18 = n0Var.f312332a;
        if (i18 == 1) {
            if (i17 == 1) {
                n2Var.b().setVisibility(4);
                kotlinx.coroutines.r2 r2Var = n2Var.f312342m;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                    return;
                }
                return;
            }
            if (i17 != 2) {
                if (i17 != 3) {
                    n2Var.getClass();
                    return;
                } else {
                    n2Var.c(str);
                    return;
                }
            }
            if (n2Var.a().getVisibility() != 0) {
                n2Var.b().setText(str);
                n2Var.b().setVisibility(0);
                return;
            }
            return;
        }
        if (i18 != 2) {
            return;
        }
        if (i17 != 1) {
            n2Var.getClass();
            return;
        }
        kotlinx.coroutines.r2 r2Var2 = n2Var.f312341i;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
        kotlinx.coroutines.r2 r2Var3 = n2Var.f312341i;
        if (r2Var3 != null) {
            kotlinx.coroutines.p2.a(r2Var3, null, 1, null);
        }
        android.view.View a17 = n2Var.a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordHintPlugin", "dismissPermissionHint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        a17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(a17, "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordHintPlugin", "dismissPermissionHint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
