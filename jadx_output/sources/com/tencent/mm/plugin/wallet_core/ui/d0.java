package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class d0 implements com.tencent.mm.ui.base.preference.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.rl6 f180229a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.yt5 f180230b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.x f180231c;

    public d0(com.tencent.mm.plugin.wallet_core.ui.x xVar, r45.rl6 rl6Var, r45.yt5 yt5Var) {
        this.f180231c = xVar;
        this.f180229a = rl6Var;
        this.f180230b = yt5Var;
    }

    @Override // com.tencent.mm.ui.base.preference.r0
    public boolean a(com.tencent.mm.ui.base.preference.Preference preference) {
        r45.rl6 rl6Var = this.f180229a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayNotify", "text(%s) click!", ((r45.hl6) rl6Var.f384987d.get(0)).f376273f);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("key_tiny_app_scene", 1000);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(27779, 1, ((r45.hl6) rl6Var.f384987d.get(0)).f376273f, 0, 1);
        com.tencent.mm.plugin.wallet_core.utils.z1.c(this.f180231c.f180776d, this.f180230b, bundle);
        return true;
    }
}
