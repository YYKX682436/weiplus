package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class u1 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f139746d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sd.b f139747e;

    public u1(com.tencent.mm.plugin.game.luggage.jsapi.x1 x1Var, java.util.Map map, sd.b bVar) {
        this.f139746d = map;
        this.f139747e = bVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.game.luggage.jsapi.JsApiOpenBusinessView$OpenWxAppData jsApiOpenBusinessView$OpenWxAppData = (com.tencent.mm.plugin.game.luggage.jsapi.JsApiOpenBusinessView$OpenWxAppData) obj;
        int i17 = jsApiOpenBusinessView$OpenWxAppData.f139575d.getInt("errCode");
        sd.b bVar = this.f139747e;
        java.util.Map map = this.f139746d;
        if (i17 == -4) {
            bVar.b("openBusinessView:fail invalid businessType", map);
            return;
        }
        if (i17 == -3) {
            bVar.b("openBusinessView:fail cancel", map);
            return;
        }
        if (i17 == -2) {
            bVar.b("openBusinessView:fail request CGI error", map);
        } else if (i17 != 0) {
            bVar.b("openBusinessView:fail system error", map);
        } else {
            map.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, jsApiOpenBusinessView$OpenWxAppData.f139575d.get(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA));
            bVar.b("openBusinessView:ok", map);
        }
    }
}
