package df2;

/* loaded from: classes3.dex */
public final class j8 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.s8 f230455d;

    public j8(df2.s8 s8Var) {
        this.f230455d = s8Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.util.LinkedList list;
        r45.nz3 nz3Var;
        r45.e84 e84Var = (r45.e84) obj;
        if (e84Var == null || e84Var.getBoolean(8)) {
            return;
        }
        df2.s8 s8Var = this.f230455d;
        if (s8Var.h7(e84Var)) {
            return;
        }
        java.util.LinkedList list2 = e84Var.getList(2);
        kotlin.jvm.internal.o.f(list2, "getItem_list(...)");
        r45.nz3 nz3Var2 = (r45.nz3) kz5.n0.Z(list2);
        if (nz3Var2 != null) {
            com.tencent.mars.xlog.Log.i(s8Var.f231299m, "update progress from svr, cur:" + nz3Var2.getInteger(2) + ", target:" + nz3Var2.getInteger(1));
            android.widget.TextView textView = s8Var.F;
            if (textView != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(nz3Var2.getInteger(2));
                sb6.append(' ');
                textView.setText(sb6.toString());
            }
            android.widget.TextView textView2 = s8Var.G;
            if (textView2 != null) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(nz3Var2.getInteger(1));
                sb7.append(' ');
                textView2.setText(sb7.toString());
            }
            r45.e84 e84Var2 = s8Var.f231307s;
            if (e84Var2 == null || (list = e84Var2.getList(2)) == null || (nz3Var = (r45.nz3) kz5.n0.Z(list)) == null) {
                return;
            }
            nz3Var.set(2, java.lang.Integer.valueOf(nz3Var2.getInteger(2)));
            nz3Var.set(1, java.lang.Integer.valueOf(nz3Var2.getInteger(1)));
            df2.s8.Z6(s8Var, "taskProgressInfo");
        }
    }
}
