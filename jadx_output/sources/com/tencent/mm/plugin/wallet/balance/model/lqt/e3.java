package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public abstract class e3 {
    public static java.lang.String a(int i17) {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        return i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? "" : context.getString(com.tencent.mm.R.string.f493560kq2) : context.getString(com.tencent.mm.R.string.f493559kq1) : context.getString(com.tencent.mm.R.string.f493562kq4) : context.getString(com.tencent.mm.R.string.f493561kq3) : context.getString(com.tencent.mm.R.string.kqg);
    }

    public static void b(android.content.Context context, r45.oa5 oa5Var) {
        if (oa5Var == null) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.f211729s = oa5Var.f382096d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(oa5Var.f382101i)) {
            aVar.f211733w = oa5Var.f382101i;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(oa5Var.f382102m)) {
            aVar.f211732v = oa5Var.f382102m;
        }
        aVar.A = false;
        aVar.E = new com.tencent.mm.plugin.wallet.balance.model.lqt.d3(oa5Var, context);
        aVar.Z = true;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        j0Var.show();
    }
}
