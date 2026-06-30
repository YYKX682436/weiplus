package k54;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final k54.i f304432a = new k54.i();

    public final k54.h a(int i17, java.util.Map map, fe0.z3 z3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("convertToWebViewData", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewDataConvertor");
        if (map == null) {
            k54.h hVar = new k54.h(i17, "", "", "", z3Var, false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertToWebViewData", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewDataConvertor");
            return hVar;
        }
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) h54.i.f279096a.a(map);
        java.lang.Object obj = linkedHashMap.get("url");
        java.lang.String obj2 = obj != null ? obj.toString() : null;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str = obj2 == null ? "" : obj2;
        java.lang.Object obj3 = linkedHashMap.get("canvasKey");
        java.lang.String obj4 = obj3 != null ? obj3.toString() : null;
        java.lang.String str2 = obj4 == null ? "" : obj4;
        java.lang.Object obj5 = linkedHashMap.get("componentId");
        java.lang.String obj6 = obj5 != null ? obj5.toString() : null;
        java.lang.String str3 = obj6 == null ? "" : obj6;
        java.lang.Object obj7 = linkedHashMap.get("bgTransparent");
        k54.h hVar2 = new k54.h(i17, str, str2, str3, z3Var, com.tencent.mm.sdk.platformtools.t8.n1(obj7 instanceof java.lang.Boolean ? (java.lang.Boolean) obj7 : null));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertToWebViewData", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewDataConvertor");
        return hVar2;
    }
}
