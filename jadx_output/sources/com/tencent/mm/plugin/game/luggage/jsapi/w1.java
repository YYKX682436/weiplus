package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class w1 implements com.tencent.mm.ipcinvoker.j {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f139767d;

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.game.luggage.jsapi.JsApiOpenBusinessView$OpenWxAppData jsApiOpenBusinessView$OpenWxAppData = (com.tencent.mm.plugin.game.luggage.jsapi.JsApiOpenBusinessView$OpenWxAppData) obj;
        com.tencent.mm.plugin.appbrand.service.h6 h6Var = (com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String string = jsApiOpenBusinessView$OpenWxAppData.f139575d.getString("referrerUrl");
        android.os.Bundle bundle = jsApiOpenBusinessView$OpenWxAppData.f139575d;
        ((com.tencent.mm.plugin.appbrand.launching.xc) h6Var).fj(context, string, bundle.getString("referrerAppId"), bundle.getString("businessType"), bundle.getString("queryString"), bundle.getInt("versionType"), 32);
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.NavigateBackH5Event> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.NavigateBackH5Event>(a0Var) { // from class: com.tencent.mm.plugin.game.luggage.jsapi.JsApiOpenBusinessView$OpenWxAppTask$1
            {
                this.__eventId = 123962501;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.NavigateBackH5Event navigateBackH5Event) {
                com.tencent.mm.autogen.events.NavigateBackH5Event navigateBackH5Event2 = navigateBackH5Event;
                com.tencent.mm.plugin.game.luggage.jsapi.w1.this.f139767d.dead();
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenBusinessView", "doOpenBusinessView errCode %d", java.lang.Integer.valueOf(navigateBackH5Event2.f54515g.f7352a));
                android.os.Bundle bundle2 = new android.os.Bundle();
                am.mk mkVar = navigateBackH5Event2.f54515g;
                bundle2.putInt("err_code", mkVar.f7352a);
                if (mkVar.f7352a != 0) {
                    return false;
                }
                bundle2.putString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, mkVar.f7353b);
                return false;
            }
        };
        this.f139767d = iListener;
        iListener.alive();
    }
}
