package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes9.dex */
public class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vr4.b1 f155209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recharge.ui.q f155210e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recharge.ui.r f155211f;

    public o(com.tencent.mm.plugin.recharge.ui.r rVar, vr4.b1 b1Var, com.tencent.mm.plugin.recharge.ui.q qVar) {
        this.f155211f = rVar;
        this.f155209d = b1Var;
        this.f155210e = qVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recharge/ui/PhoneRechargeAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.recharge.ui.r rVar = this.f155211f;
        if (rVar.f155220e != null) {
            java.util.List list = rVar.f155221f;
            vr4.b1 b1Var = this.f155209d;
            if (!((java.util.ArrayList) list).contains(b1Var.f439704u)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PhoneRechargeAdapter", "mark recommendid: %s", b1Var.f439704u);
                java.lang.String str = b1Var.f439704u;
                if (str != null) {
                    ((java.util.ArrayList) rVar.f155221f).add(str);
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_PHONE_RECHARGE_RECOMMENDED_LIST_STRING_SYNC, com.tencent.mm.sdk.platformtools.t8.c1(rVar.f155221f, ","));
                    this.f155210e.f155217d.setVisibility(8);
                }
            }
            rVar.f155220e.a(b1Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recharge/ui/PhoneRechargeAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
