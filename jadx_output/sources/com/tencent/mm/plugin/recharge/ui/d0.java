package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes9.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vs3.a f155150d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recharge.ui.e0 f155151e;

    public d0(com.tencent.mm.plugin.recharge.ui.e0 e0Var, vs3.a aVar) {
        this.f155151e = e0Var;
        this.f155150d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.recharge.ui.e0 e0Var = this.f155151e;
        e0Var.f155155e.f155189a.f155100J.b(this.f155150d);
        com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI phoneRechargeUI = e0Var.f155155e.f155189a;
        java.lang.String str = e0Var.f155154d;
        phoneRechargeUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.PhoneRechargeUI", "do scene: %s", str);
        gm0.j1.d().g(new vs3.g(str, 0));
    }
}
