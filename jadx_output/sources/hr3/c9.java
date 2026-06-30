package hr3;

/* loaded from: classes5.dex */
public abstract class c9 {
    public static y35.r[] a(android.content.Context context, com.tencent.mm.storage.z3 z3Var, int i17) {
        java.lang.String stringExtra = ((android.app.Activity) context).getIntent().getStringExtra("Verify_ticket");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (z3Var.r2() || com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            return null;
        }
        y35.r[] i18 = i17 == 18 ? y35.r.i(context, r21.w.Bi().J0(z3Var.d1(), 3)) : c01.w9.y(i17) ? y35.r.h(context, r21.w.Di().J0(z3Var.d1(), 3)) : y35.r.g(context, r21.w.Ai().L0(z3Var.d1(), 3));
        if (i18 == null || i18.length == 0) {
            return null;
        }
        return i18;
    }

    public static java.lang.String b(android.content.Context context, com.tencent.mm.storage.z3 z3Var, int i17) {
        java.lang.String stringExtra = ((android.app.Activity) context).getIntent().getStringExtra("Verify_ticket");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (z3Var.r2() || com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            return null;
        }
        if (i17 == 18) {
            com.tencent.mm.storage.t8[] J0 = r21.w.Bi().J0(z3Var.d1(), 3);
            if (J0.length < 1) {
                return "";
            }
            return J0[0].field_svrid + "";
        }
        if (c01.w9.y(i17)) {
            com.tencent.mm.storage.pa[] J02 = r21.w.Di().J0(z3Var.d1(), 3);
            if (J02.length < 1) {
                return "";
            }
            return J02[0].field_svrid + "";
        }
        com.tencent.mm.storage.p7[] L0 = r21.w.Ai().L0(z3Var.d1(), 3);
        if (L0.length < 1) {
            return "";
        }
        return L0[0].field_svrId + "";
    }
}
