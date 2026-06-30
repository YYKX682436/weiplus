package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class d30 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.i30 f112226d;

    public d30(com.tencent.mm.plugin.finder.live.plugin.i30 i30Var) {
        this.f112226d = i30Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.String str;
        mm2.y0 y0Var = (mm2.y0) obj;
        com.tencent.mm.plugin.finder.live.plugin.i30 i30Var = this.f112226d;
        com.tencent.mars.xlog.Log.i(i30Var.f112903q, "user send gift, dimiss, scene = " + y0Var.f329549b);
        int ordinal = y0Var.f329548a.ordinal();
        if (ordinal == 0) {
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.c30(i30Var));
            return;
        }
        if ((ordinal == 1 || ordinal == 2) && i30Var.w0() == 0) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            android.view.View v17 = i30Var.v1();
            jz5.l[] lVarArr = new jz5.l[3];
            lVarArr[0] = new jz5.l(i30Var.A, 1);
            ce2.i iVar = i30Var.f112910x;
            if (iVar == null || (str = iVar.field_rewardProductId) == null) {
                str = "";
            }
            lVarArr[1] = new jz5.l(i30Var.f112911y, str);
            java.lang.Object text = ((android.widget.TextView) ((jz5.n) i30Var.f112904r).getValue()).getText();
            lVarArr[2] = new jz5.l(i30Var.f112912z, text != null ? text : "");
            ((cy1.a) rVar).Cj("view_clk", v17, kz5.c1.k(lVarArr), 25561);
        }
    }
}
