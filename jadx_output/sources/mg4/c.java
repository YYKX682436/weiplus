package mg4;

/* loaded from: classes7.dex */
public final class c extends com.tencent.mm.plugin.appbrand.jsapi.a1 {
    public static final int CTRL_INDEX = 79;
    public static final java.lang.String NAME = "operateWXData";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public java.lang.String z(com.tencent.mm.plugin.appbrand.jsapi.l component, org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(component, "component");
        kotlin.jvm.internal.o.g(data, "data");
        r45.m24 m24Var = new r45.m24();
        m24Var.f380089d = component.getAppId();
        java.lang.String optString = data.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        byte[] bytes = optString.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        m24Var.f380090e = new com.tencent.mm.protobuf.g(bytes, 0, bytes.length);
        m24Var.f380093h = 0;
        m24Var.f380092g = 0;
        m24Var.f380091f = "";
        m24Var.f380095m = 0;
        r45.nd7 nd7Var = new r45.nd7();
        nd7Var.f381296e = wc1.a.CTRL_INDEX;
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader = (com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader) component.q(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader.class);
        if (iCommLibReader != null) {
            r45.pe7 pe7Var = new r45.pe7();
            pe7Var.f382990d = iCommLibReader.i();
            pe7Var.f382991e = iCommLibReader.W0();
            nd7Var.f381299h = pe7Var;
        }
        m24Var.f380094i = nd7Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = m24Var;
        lVar.f70665b = new r45.n24();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/js-operatewxdata";
        lVar.f70667d = 1133;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        pm0.v.K(null, new mg4.b(lVar.a()));
        java.lang.Object[] objArr = new java.lang.Object[0];
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String format = objArr.length > 0 ? java.lang.String.format("ok", objArr) : "ok";
        hashMap.putAll(new java.util.HashMap());
        java.lang.String p17 = p(format, hashMap);
        kotlin.jvm.internal.o.f(p17, "makeReturnJson(...)");
        return p17;
    }
}
