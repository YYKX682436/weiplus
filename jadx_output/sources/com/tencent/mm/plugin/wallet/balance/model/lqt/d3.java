package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public class d3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.oa5 f177625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f177626e;

    public d3(r45.oa5 oa5Var, android.content.Context context) {
        this.f177625d = oa5Var;
        this.f177626e = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        r45.oa5 oa5Var = this.f177625d;
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtUtil", "click item, type: %s", java.lang.Integer.valueOf(oa5Var.f382097e));
        int i18 = oa5Var.f382097e;
        if (i18 == 1) {
            return;
        }
        if (i18 == 2) {
            com.tencent.mm.wallet_core.ui.r1.V(this.f177626e, oa5Var.f382098f, true);
        } else if (i18 == 3) {
            com.tencent.mm.wallet_core.ui.r1.b0(oa5Var.f382099g, oa5Var.f382100h, 0, 1061);
        }
    }
}
