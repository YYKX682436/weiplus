package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class a3 implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f184904d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184905e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f184906f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f184907g;

    public a3(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, java.util.Map map, java.lang.String str, nw4.y2 y2Var) {
        this.f184907g = c1Var;
        this.f184904d = map;
        this.f184905e = str;
        this.f184906f = y2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        nw4.y2 y2Var;
        java.lang.String str;
        cl0.d dVar;
        nw4.y2 y2Var2;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var;
        r45.dl2 dl2Var;
        java.lang.String str2 = this;
        java.lang.Integer num = (java.lang.Integer) obj;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var2 = (java.lang.Integer) obj2;
        r45.ov0 ov0Var = (r45.ov0) obj4;
        nw4.y2 y2Var3 = str2.f184906f;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var3 = str2.f184907g;
        java.util.Map map = str2.f184904d;
        try {
            y2Var = num.intValue();
            java.lang.String str3 = str2.f184905e;
            try {
                if (y2Var != 0 || c1Var2.intValue() != 0 || ov0Var == null || ov0Var.getList(1).isEmpty()) {
                    java.lang.String str4 = "onGetFinderLivePreviewMicCover:ok";
                    nw4.y2 y2Var4 = y2Var3;
                    com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var4 = c1Var3;
                    map.put("ret", -1);
                    map.put("err_msg", "Invalid input parameters:$errType, $errCode");
                    map.put("requestId", str3);
                    c1Var4.i5(y2Var4, str4, map);
                    str2 = str4;
                    y2Var = y2Var4;
                    c1Var2 = c1Var4;
                } else {
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    r45.dl2 dl2Var2 = (r45.dl2) ov0Var.getList(1).get(0);
                    if (com.tencent.mm.sdk.platformtools.t8.L0(((r45.wz1) ((r45.nw1) dl2Var2.getCustom(1)).getCustom(30)).getList(6)) && ((r45.yz1) ((r45.wz1) ((r45.nw1) dl2Var2.getCustom(1)).getCustom(30)).getCustom(7)) == null) {
                        map.put("ret", 0);
                        map.put("err_msg", "live mic info is empty!");
                        map.put("requestId", str3);
                        str = "onGetFinderLivePreviewMicCover:ok";
                        y2Var2 = y2Var3;
                    } else {
                        try {
                            if (com.tencent.mm.sdk.platformtools.t8.L0(((r45.wz1) ((r45.nw1) dl2Var2.getCustom(1)).getCustom(30)).getList(6))) {
                                try {
                                    dVar = new cl0.d();
                                    str = "onGetFinderLivePreviewMicCover:ok";
                                } catch (java.lang.Exception unused) {
                                    str = "onGetFinderLivePreviewMicCover:ok";
                                }
                                try {
                                    y2Var2 = y2Var3;
                                    dVar.e("headurl", ((com.tencent.mm.protocal.protobuf.FinderContact) ((r45.xn1) ((r45.yz1) ((r45.wz1) ((r45.nw1) dl2Var2.getCustom(1)).getCustom(30)).getCustom(7)).getCustom(3)).getCustom(0)).getHeadUrl());
                                    dVar.e("nickname", ((com.tencent.mm.protocal.protobuf.FinderContact) ((r45.xn1) ((r45.yz1) ((r45.wz1) ((r45.nw1) dl2Var2.getCustom(1)).getCustom(30)).getCustom(7)).getCustom(3)).getCustom(0)).getNickname());
                                    dVar.e("mictype", 2);
                                    jSONArray.put(dVar);
                                    map.put("micInfos", jSONArray);
                                    map.put("ret", 0);
                                    map.put("err_msg", "");
                                    map.put("requestId", str3);
                                } catch (java.lang.Exception unused2) {
                                    c1Var2 = c1Var3;
                                    str2 = str;
                                    y2Var = y2Var3;
                                    com.tencent.mars.xlog.Log.e("MicroMsg.MsgHandler", "getFinderLivePreviewMicCover ex:${ex.message}");
                                    map.put("ret", -1);
                                    map.put("err_msg", "Invalid input parameters:${ex.message}");
                                    map.put("requestId", "");
                                    c1Var2.i5(y2Var, str2, map);
                                    return null;
                                }
                            } else {
                                str = "onGetFinderLivePreviewMicCover:ok";
                                y2Var2 = y2Var3;
                                int i17 = 0;
                                int i18 = 1;
                                while (i17 < ((r45.wz1) ((r45.nw1) dl2Var2.getCustom(i18)).getCustom(30)).getList(6).size()) {
                                    try {
                                        r45.uz1 uz1Var = (r45.uz1) ((r45.wz1) ((r45.nw1) dl2Var2.getCustom(1)).getCustom(30)).getList(6).get(i17);
                                        if (uz1Var == null || ((r45.xn1) uz1Var.getCustom(0)) == null) {
                                            dl2Var = dl2Var2;
                                        } else {
                                            dl2Var = dl2Var2;
                                            if (((com.tencent.mm.protocal.protobuf.FinderContact) ((r45.xn1) uz1Var.getCustom(0)).getCustom(0)) != null) {
                                                cl0.d dVar2 = new cl0.d();
                                                c1Var = c1Var3;
                                                try {
                                                    dVar2.e("headurl", ((com.tencent.mm.protocal.protobuf.FinderContact) ((r45.xn1) uz1Var.getCustom(0)).getCustom(0)).getHeadUrl());
                                                    dVar2.e("nickname", ((com.tencent.mm.protocal.protobuf.FinderContact) ((r45.xn1) uz1Var.getCustom(0)).getCustom(0)).getNickname());
                                                    i18 = 1;
                                                    dVar2.e("mictype", java.lang.Integer.valueOf(uz1Var.getInteger(1)));
                                                    jSONArray.put(dVar2);
                                                    i17++;
                                                    dl2Var2 = dl2Var;
                                                    c1Var3 = c1Var;
                                                } catch (java.lang.Exception unused3) {
                                                    str2 = str;
                                                    y2Var = y2Var2;
                                                    c1Var2 = c1Var;
                                                    com.tencent.mars.xlog.Log.e("MicroMsg.MsgHandler", "getFinderLivePreviewMicCover ex:${ex.message}");
                                                    map.put("ret", -1);
                                                    map.put("err_msg", "Invalid input parameters:${ex.message}");
                                                    map.put("requestId", "");
                                                    c1Var2.i5(y2Var, str2, map);
                                                    return null;
                                                }
                                            }
                                        }
                                        c1Var = c1Var3;
                                        i18 = 1;
                                        i17++;
                                        dl2Var2 = dl2Var;
                                        c1Var3 = c1Var;
                                    } catch (java.lang.Exception unused4) {
                                        c1Var = c1Var3;
                                        str2 = str;
                                        y2Var = y2Var2;
                                        c1Var2 = c1Var;
                                        com.tencent.mars.xlog.Log.e("MicroMsg.MsgHandler", "getFinderLivePreviewMicCover ex:${ex.message}");
                                        map.put("ret", -1);
                                        map.put("err_msg", "Invalid input parameters:${ex.message}");
                                        map.put("requestId", "");
                                        c1Var2.i5(y2Var, str2, map);
                                        return null;
                                    }
                                }
                                c1Var = c1Var3;
                                map.put("micInfos", jSONArray);
                                map.put("ret", 0);
                                map.put("err_msg", "");
                                map.put("requestId", str3);
                                java.lang.String str5 = str;
                                nw4.y2 y2Var5 = y2Var2;
                                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var5 = c1Var;
                                c1Var5.i5(y2Var5, str5, map);
                                str2 = str5;
                                y2Var = y2Var5;
                                c1Var2 = c1Var5;
                            }
                        } catch (java.lang.Exception unused5) {
                        }
                    }
                    c1Var = c1Var3;
                    java.lang.String str52 = str;
                    nw4.y2 y2Var52 = y2Var2;
                    com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var52 = c1Var;
                    c1Var52.i5(y2Var52, str52, map);
                    str2 = str52;
                    y2Var = y2Var52;
                    c1Var2 = c1Var52;
                }
                return null;
            } catch (java.lang.Exception unused6) {
            }
        } catch (java.lang.Exception unused7) {
            str2 = "onGetFinderLivePreviewMicCover:ok";
            y2Var = y2Var3;
            c1Var2 = c1Var3;
        }
    }
}
