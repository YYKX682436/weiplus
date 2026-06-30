package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class c30 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.i30 f112101d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c30(com.tencent.mm.plugin.finder.live.plugin.i30 i30Var) {
        super(0);
        this.f112101d = i30Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        com.tencent.mm.plugin.finder.live.plugin.i30 i30Var = this.f112101d;
        if (i30Var.w0() == 0) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            android.view.View v17 = i30Var.v1();
            jz5.l[] lVarArr = new jz5.l[3];
            lVarArr[0] = new jz5.l(i30Var.A, 2);
            ce2.i iVar = i30Var.f112910x;
            if (iVar == null || (str = iVar.field_rewardProductId) == null) {
                str = "";
            }
            lVarArr[1] = new jz5.l(i30Var.f112911y, str);
            java.lang.Object text = ((android.widget.TextView) ((jz5.n) i30Var.f112904r).getValue()).getText();
            lVarArr[2] = new jz5.l(i30Var.f112912z, text != null ? text : "");
            ((cy1.a) rVar).Cj("view_clk", v17, kz5.c1.k(lVarArr), 25561);
            i30Var.u1();
        }
        return jz5.f0.f302826a;
    }
}
