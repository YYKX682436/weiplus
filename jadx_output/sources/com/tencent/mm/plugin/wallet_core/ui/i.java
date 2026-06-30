package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class i implements com.tencent.mm.ui.base.preference.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.rl6 f180323a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.yt5 f180324b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.k f180325c;

    public i(com.tencent.mm.plugin.wallet_core.ui.k kVar, r45.rl6 rl6Var, r45.yt5 yt5Var) {
        this.f180325c = kVar;
        this.f180323a = rl6Var;
        this.f180324b = yt5Var;
    }

    @Override // com.tencent.mm.ui.base.preference.r0
    public boolean a(com.tencent.mm.ui.base.preference.Preference preference) {
        r45.rl6 rl6Var = this.f180323a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "text(%s) click!", ((r45.hl6) rl6Var.f384987d.get(0)).f376273f);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("key_tiny_app_scene", com.tencent.mm.plugin.appbrand.jsapi.webview.d0.CTRL_INDEX);
        com.tencent.mm.plugin.wallet_core.utils.z1.c(this.f180325c.f180364d, this.f180324b, bundle);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19541, 1, ((r45.hl6) rl6Var.f384987d.get(0)).f376273f);
        return true;
    }
}
