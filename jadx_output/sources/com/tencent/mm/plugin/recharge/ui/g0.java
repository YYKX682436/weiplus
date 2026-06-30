package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes9.dex */
public class g0 implements db5.z0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f155183a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f155184b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI f155185c;

    public g0(com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI phoneRechargeUI, java.util.List list, java.lang.String str) {
        this.f155185c = phoneRechargeUI;
        this.f155183a = list;
        this.f155184b = str;
    }

    @Override // db5.z0
    public void a(int i17) {
        com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI phoneRechargeUI = this.f155185c;
        phoneRechargeUI.f155100J.b(new vs3.a((java.lang.String) this.f155183a.get(i17), this.f155184b, 1));
        gm0.j1.d().g(new vs3.g(phoneRechargeUI.f155104g.getText(), 0));
    }
}
