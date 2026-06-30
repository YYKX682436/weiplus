package k91;

/* loaded from: classes7.dex */
public class d6 extends java.util.HashMap {
    public d6(com.tencent.mm.plugin.appbrand.config.WxaProfileAttributes wxaProfileAttributes, com.tencent.mm.plugin.appbrand.e9 e9Var) {
        put("nickName", wxaProfileAttributes.f77500f);
        put("iconUrl", wxaProfileAttributes.f77502h);
        put("appId", wxaProfileAttributes.f77499e);
        put(dm.i4.COL_USERNAME, wxaProfileAttributes.f77498d);
        put("debugMode", java.lang.Integer.valueOf(e9Var.t3().u0().f77281g));
        put("weappVersion", java.lang.Integer.valueOf(wxaProfileAttributes.f77516y));
        put("signature", wxaProfileAttributes.f77501g);
        put("appBrandInfo", new k91.c6(wxaProfileAttributes));
    }
}
