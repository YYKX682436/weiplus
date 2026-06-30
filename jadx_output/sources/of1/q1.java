package of1;

/* loaded from: classes7.dex */
public final class q1 extends com.tencent.xweb.internal.ProxyWebViewClientExtension {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ of1.w1 f344994a;

    public q1(of1.w1 w1Var) {
        this.f344994a = w1Var;
    }

    @Override // com.tencent.xweb.internal.ProxyWebViewClientExtension
    public java.lang.Object onMiscCallBack(java.lang.String str, android.os.Bundle bundle) {
        com.tencent.mm.plugin.appbrand.jsapi.l eventContext;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || bundle == null || kotlin.jvm.internal.o.b("getCustomHeaders", str)) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.HTMLWebViewWithBWC", "method = %s", str);
        if (kotlin.jvm.internal.o.b("getMenuList", str)) {
            java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
            arrayList.add(1);
            bundle.putIntegerArrayList("menuIds", arrayList);
            java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>();
            arrayList2.add("搜一搜");
            bundle.putStringArrayList("menuLabels", arrayList2);
            return bundle;
        }
        if (!kotlin.jvm.internal.o.b("processMenu", str)) {
            if (kotlin.jvm.internal.o.b("onJavascriptCloseWindow", str)) {
                return java.lang.Boolean.TRUE;
            }
            return null;
        }
        java.lang.String string = bundle.getString("query");
        int i17 = bundle.getInt("menuId");
        bundle.getString("menuLabel");
        if (1 == i17) {
            eventContext = this.f344994a.getEventContext();
            android.content.Context f147807d = eventContext.getF147807d();
            if (f147807d == null) {
                f147807d = com.tencent.mm.sdk.platformtools.x2.f193071a;
            }
            if (string == null) {
                string = "";
            }
            com.tencent.mm.plugin.appbrand.jsapi.webview.bwc.HTMLWebViewWithBWC$OpenSearchRequest hTMLWebViewWithBWC$OpenSearchRequest = new com.tencent.mm.plugin.appbrand.jsapi.webview.bwc.HTMLWebViewWithBWC$OpenSearchRequest(string);
            of1.p1 p1Var = of1.p1.f344988a;
            java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
            com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(f147807d, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, hTMLWebViewWithBWC$OpenSearchRequest, p1Var, null);
        }
        return null;
    }
}
