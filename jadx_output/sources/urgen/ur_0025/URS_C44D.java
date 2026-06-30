package urgen.ur_0025;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\n"}, d2 = {"Lurgen/ur_0025/URS_C44D;", "", "", "parameter", "Lcom/tencent/unit_rc/BaseObjectDef;", "callback", "Ljz5/f0;", "UR_1C2B", "<init>", "()V", "plugin-ting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class URS_C44D {
    public static final urgen.ur_0025.URS_C44D INSTANCE = new urgen.ur_0025.URS_C44D();

    private URS_C44D() {
    }

    public static final void UR_1C2B(byte[] parameter, com.tencent.unit_rc.BaseObjectDef baseObjectDef) {
        jm4.v1 v1Var;
        kotlin.jvm.internal.o.g(parameter, "parameter");
        bw5.ep0 ep0Var = (bw5.ep0) jm4.r5.d(parameter, new bw5.ep0());
        jm4.w1 w1Var = jm4.x1.f300440r;
        jm4.k1 k1Var = (jm4.k1) baseObjectDef;
        androidx.fragment.app.FragmentActivity fragmentActivity = null;
        if (k1Var == null) {
            v1Var = null;
        } else {
            if (k1Var instanceof jm4.x1) {
            }
            v1Var = new jm4.v1(k1Var);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinServiceStatic", "startConsume called");
        java.lang.ref.WeakReference weakReference = com.tencent.mm.app.w.INSTANCE.f53886h;
        android.content.Context context = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        if (context instanceof androidx.fragment.app.FragmentActivity) {
            fragmentActivity = (androidx.fragment.app.FragmentActivity) context;
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Current activity is not a FragmentActivity: ");
            sb6.append(context != null ? context.getClass().getName() : null);
            com.tencent.mars.xlog.Log.e("MicroMsg.WeCoinServiceStatic", sb6.toString());
        }
        androidx.fragment.app.FragmentActivity fragmentActivity2 = fragmentActivity;
        if (fragmentActivity2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeCoinServiceStatic", "Failed to get current FragmentActivity");
            throw new java.lang.IllegalStateException("No current FragmentActivity available. Please call startConsume from a FragmentActivity context.");
        }
        pr4.l lVar = new pr4.l(ep0Var.f26985d, fragmentActivity2, new jm4.f6(v1Var), new jm4.g6(v1Var), new jm4.h6(v1Var));
        boolean[] zArr = ep0Var.f26993o;
        lVar.f358026g = (zArr[2] ? ep0Var.f26986e : com.tencent.mm.protobuf.g.f192155b).g();
        boolean z17 = zArr[8];
        if (z17) {
            bw5.hr0 hr0Var = z17 ? ep0Var.f26992n : bw5.hr0.TingWCCoinConsumeModeUnknown;
            kotlin.jvm.internal.o.f(hr0Var, "getConsumeMode(...)");
            int ordinal = hr0Var.ordinal();
            lVar.f358025f = ordinal != 1 ? ordinal != 2 ? pr4.k.f358016d : pr4.k.f358017e : pr4.k.f358016d;
        }
        boolean z18 = zArr[3];
        if (z18) {
            java.lang.String str = z18 ? ep0Var.f26987f : "";
            kotlin.jvm.internal.o.f(str, "getProductTitle(...)");
            lVar.f358027h = str;
        }
        boolean z19 = zArr[4];
        if (z19) {
            java.lang.String str2 = z19 ? ep0Var.f26988g : "";
            kotlin.jvm.internal.o.f(str2, "getProductTitleInsufficient(...)");
            lVar.f358028i = str2;
        }
        if (zArr[5]) {
            lVar.f358029j = ep0Var.f26989h;
        }
        boolean z27 = zArr[6];
        if (z27) {
            java.lang.String str3 = z27 ? ep0Var.f26990i : "";
            kotlin.jvm.internal.o.f(str3, "getConsumeButtonTitle(...)");
            lVar.f358032m = str3;
        }
        boolean z28 = zArr[7];
        if (z28) {
            java.lang.String str4 = z28 ? ep0Var.f26991m : "";
            kotlin.jvm.internal.o.f(str4, "getConsumeButtonTitleInsufficient(...)");
            lVar.f358033n = str4;
        }
        ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).getClass();
        new ls4.u(lVar).f();
    }
}
