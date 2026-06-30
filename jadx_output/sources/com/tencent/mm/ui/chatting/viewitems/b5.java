package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public abstract class b5 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f203455a;

    public static void a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        if (f203455a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgC2CNewYear", "handleHKHongbaoRouteInfo: usecase is running, ignore click");
            return;
        }
        byte[] parseHKHongbaoRouteInfoData = ((h45.q) i95.n0.c(h45.q.class)).parseHKHongbaoRouteInfoData(str, str2);
        if (parseHKHongbaoRouteInfoData != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgC2CNewYear", "handleHKHongbaoRouteInfo routeInfoData size:%s", java.lang.Integer.valueOf(parseHKHongbaoRouteInfoData.length));
            f203455a = true;
            com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
            create.putBinary("route_info", parseHKHongbaoRouteInfoData);
            ((h45.q) i95.n0.c(h45.q.class)).startUseCase("commonRoute", create, new com.tencent.mm.ui.chatting.viewitems.x4());
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgC2CNewYear", "handleHKHongbaoRouteInfo routeInfoData is null, use content.url");
        f203455a = false;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
