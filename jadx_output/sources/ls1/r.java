package ls1;

/* loaded from: classes8.dex */
public final class r implements nw4.o2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ls1.e0 f321008a;

    public r(ls1.e0 e0Var) {
        this.f321008a = e0Var;
    }

    @Override // nw4.o2
    public final boolean a(nw4.y2 y2Var, com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper) {
        boolean b17 = kotlin.jvm.internal.o.b(y2Var.f341019i, "notifyPageInfo");
        ls1.e0 e0Var = this.f321008a;
        if (b17) {
            e0Var.B1();
            e0Var.getClass();
            try {
                e0Var.F1(ls1.e0.G1(y2Var));
                e0Var.g0().e(y2Var.f341013c, "notifyPageInfo:ok", null);
                ax4.a.a(90);
                kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, null, null, new ls1.s(e0Var, null), 3, null);
                return true;
            } catch (android.os.RemoteException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(e0Var.B1(), e17, "", new java.lang.Object[0]);
                e0Var.g0().e(y2Var.f341013c, "notifyPageInfo:fail", null);
                ax4.a.a(91);
                return true;
            } catch (org.json.JSONException e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace(e0Var.B1(), e18, "", new java.lang.Object[0]);
                e0Var.g0().e(y2Var.f341013c, "notifyPageInfo:fail", null);
                ax4.a.a(91);
                return true;
            }
        }
        if (!kotlin.jvm.internal.o.b(y2Var.f341019i, "updatePageAuth")) {
            return false;
        }
        e0Var.B1();
        e0Var.getClass();
        ax4.a.a(80);
        java.lang.String i17 = e0Var.i();
        java.util.HashSet hashSet = e0Var.f320979e2;
        if (!hashSet.contains(i17)) {
            hashSet.add(i17);
            e0Var.O().r(i17, 8, new ls1.d0(e0Var, i17, y2Var));
            return true;
        }
        com.tencent.mars.xlog.Log.e(e0Var.B1(), "updatePageAuth fail, url:%s already run");
        nw4.n g07 = e0Var.g0();
        if (g07 != null) {
            g07.e(y2Var.f341013c, y2Var.f341019i + ":fail updating", null);
        }
        ax4.a.a(82);
        return true;
    }
}
