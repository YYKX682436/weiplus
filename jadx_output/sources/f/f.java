package f;

/* loaded from: classes14.dex */
public abstract class f {
    public static final f.r a(h.b contract, yz5.l onResult, n0.o oVar, int i17) {
        kotlin.jvm.internal.o.g(contract, "contract");
        kotlin.jvm.internal.o.g(onResult, "onResult");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.U(-1672766681);
        n0.e5 e17 = n0.s4.e(contract, y0Var, 8);
        n0.e5 e18 = n0.s4.e(onResult, y0Var, (i17 >> 3) & 14);
        java.lang.Object a17 = w0.g.a(new java.lang.Object[0], null, null, f.e.f257977d, y0Var, 8, 6);
        kotlin.jvm.internal.o.f(a17, "rememberSaveable { UUID.randomUUID().toString() }");
        java.lang.String str = (java.lang.String) a17;
        n0.h3 h3Var = f.o.f257991a;
        y0Var.U(1972133187);
        androidx.activity.result.i iVar = (androidx.activity.result.i) y0Var.i(f.o.f257991a);
        if (iVar == null) {
            java.lang.Object obj = (android.content.Context) y0Var.i(androidx.compose.ui.platform.a1.f10503b);
            while (true) {
                if (!(obj instanceof android.content.ContextWrapper)) {
                    obj = null;
                    break;
                }
                if (obj instanceof androidx.activity.result.i) {
                    break;
                }
                obj = ((android.content.ContextWrapper) obj).getBaseContext();
                kotlin.jvm.internal.o.f(obj, "innerContext.baseContext");
            }
            iVar = (androidx.activity.result.i) obj;
        }
        y0Var.o(false);
        if (iVar == null) {
            throw new java.lang.IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner".toString());
        }
        androidx.activity.result.h activityResultRegistry = iVar.getActivityResultRegistry();
        kotlin.jvm.internal.o.f(activityResultRegistry, "checkNotNull(LocalActivi… }.activityResultRegistry");
        y0Var.U(-3687241);
        java.lang.Object y17 = y0Var.y();
        int i18 = n0.o.f333629a;
        java.lang.Object obj2 = n0.n.f333620a;
        if (y17 == obj2) {
            y17 = new f.a();
            y0Var.g0(y17);
        }
        y0Var.o(false);
        f.a aVar = (f.a) y17;
        y0Var.U(-3687241);
        java.lang.Object y18 = y0Var.y();
        if (y18 == obj2) {
            y18 = new f.r(aVar, e17);
            y0Var.g0(y18);
        }
        y0Var.o(false);
        f.r rVar = (f.r) y18;
        n0.d2.a(activityResultRegistry, str, contract, new f.d(aVar, activityResultRegistry, str, contract, e18), y0Var, 520);
        y0Var.o(false);
        return rVar;
    }
}
