package ix3;

/* loaded from: classes.dex */
public final class y0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Set f295611d = kz5.z.D0(new java.lang.String[]{"Int", "Long", "Float", "String"});

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f295612e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f295613f = jz5.h.b(ix3.r0.f295542d);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public final java.lang.String T6(r45.dp5 dp5Var) {
        java.lang.String str = "";
        if (dp5Var.getInteger(2) == 3) {
            java.lang.String valueOf = java.lang.String.valueOf(dp5Var.getString(0));
            java.util.List f07 = r26.n0.f0(valueOf, new java.lang.String[]{"_"}, false, 0, 6, null);
            if (f07.size() >= 3 && kotlin.jvm.internal.o.b(f07.get(0), "RepairerConfig")) {
                return !f295611d.contains(f07.get(f07.size() - 1)) ? valueOf : "";
            }
            return valueOf;
        }
        if (dp5Var.getInteger(2) == 2) {
            java.lang.String valueOf2 = java.lang.String.valueOf(dp5Var.getString(0));
            return !r26.i0.y(valueOf2, "RepairerActivity_", false) ? valueOf2 : "";
        }
        if (dp5Var.getInteger(2) == 1) {
            java.lang.String valueOf3 = java.lang.String.valueOf(dp5Var.getString(0));
            if (!r26.i0.y(valueOf3, "RepairerGroup_", false)) {
                return valueOf3;
            }
            java.util.LinkedList<r45.dp5> list = dp5Var.getList(5);
            kotlin.jvm.internal.o.f(list, "getSubItemList(...)");
            for (r45.dp5 dp5Var2 : list) {
                kotlin.jvm.internal.o.d(dp5Var2);
                str = T6(dp5Var2);
                if (!r26.n0.N(str)) {
                    break;
                }
            }
        }
        return str;
    }

    public final boolean U6(r45.dp5 dp5Var) {
        java.util.Iterator it = dp5Var.getList(5).iterator();
        kotlin.jvm.internal.o.f(it, "iterator(...)");
        boolean z17 = true;
        while (it.hasNext()) {
            r45.dp5 dp5Var2 = (r45.dp5) it.next();
            if (dp5Var2.getInteger(2) == 1) {
                if (U6(dp5Var2)) {
                    it.remove();
                } else {
                    z17 = false;
                }
            } else if (dp5Var2.getInteger(7) == 1) {
                z17 = false;
            } else {
                it.remove();
            }
        }
        return z17;
    }

    public final void V6(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r45.dp5 dp5Var = (r45.dp5) it.next();
            kotlin.jvm.internal.o.f(dp5Var.getList(5), "getSubItemList(...)");
            if (!r3.isEmpty()) {
                java.util.LinkedList list2 = dp5Var.getList(5);
                kotlin.jvm.internal.o.f(list2, "getSubItemList(...)");
                V6(list2);
            }
        }
        java.util.Collections.sort(list, new ix3.x0());
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        com.tencent.mm.sdk.coroutines.LifecycleScope O6 = O6();
        if (O6 != null) {
            v65.i.b(O6, null, new ix3.v0(this, null), 1, null);
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.z3(getActivity(), ix3.w0.f295592d);
    }
}
