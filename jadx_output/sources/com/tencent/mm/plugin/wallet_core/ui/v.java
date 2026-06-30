package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class v implements com.tencent.mm.ui.base.preference.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.rl6 f180659a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.yt5 f180660b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.l f180661c;

    public v(com.tencent.mm.plugin.wallet_core.ui.l lVar, r45.rl6 rl6Var, r45.yt5 yt5Var) {
        this.f180661c = lVar;
        this.f180659a = rl6Var;
        this.f180660b = yt5Var;
    }

    @Override // com.tencent.mm.ui.base.preference.r0
    public boolean a(com.tencent.mm.ui.base.preference.Preference preference) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "text(%s) click!", ((r45.hl6) this.f180659a.f384987d.get(0)).f376273f);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("key_tiny_app_scene", com.tencent.mm.plugin.appbrand.jsapi.webview.d0.CTRL_INDEX);
        com.tencent.mm.plugin.wallet_core.utils.z1.c(this.f180661c.f180384d, this.f180660b, bundle);
        return true;
    }
}
