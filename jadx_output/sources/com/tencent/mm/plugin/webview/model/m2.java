package com.tencent.mm.plugin.webview.model;

/* loaded from: classes7.dex */
public abstract class m2 {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String[] f183013a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f183014b;

    public static java.util.LinkedList a(java.util.ArrayList arrayList) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                try {
                    r45.px4 px4Var = new r45.px4();
                    px4Var.parseFrom((byte[]) arrayList.get(i17));
                    r45.jv5 jv5Var = new r45.jv5();
                    jv5Var.f378133f = px4Var.f383460f;
                    jv5Var.f378132e = px4Var.f383459e;
                    jv5Var.f378131d = px4Var.f383458d;
                    jv5Var.f378134g = px4Var.f383461g;
                    jv5Var.f378136i = px4Var.f383462h;
                    linkedList.add(jv5Var);
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.OauthAuthorizeLogic", "bytesListToBytesListScopeInfoList: i:%d, exp:%s", java.lang.Integer.valueOf(i17), e17.getLocalizedMessage());
                    linkedList.clear();
                }
            }
        }
        return linkedList;
    }

    public static java.lang.String b() {
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_native_oauth_host_for_h5, "", true);
        com.tencent.mars.xlog.Log.i("MicroMsg.OauthAuthorizeLogic", "getOauthHostPaths %s", Zi);
        return Zi;
    }
}
