package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes8.dex */
public class r implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f185370d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f185371e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f185372f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final int f185373g;

    /* renamed from: h, reason: collision with root package name */
    public android.content.Context f185374h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.stub.z0 f185375i;

    public r(int i17) {
        this.f185373g = i17;
    }

    public final void a(com.tencent.mm.plugin.webview.model.h1 h1Var, int i17, r45.g14 g14Var) {
        com.tencent.mm.modelbase.o oVar = h1Var.f182906d;
        r45.h14 h14Var = oVar == null ? null : (r45.h14) oVar.f70710a.f70684a;
        r45.i14 H = h1Var.H();
        com.tencent.mm.plugin.webview.ui.tools.jsapi.m mVar = com.tencent.mm.plugin.webview.ui.tools.jsapi.m.RET_FAIL;
        if (h14Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.webview.JSVerifyHelper", "authReq is null");
            h1Var.f182908f.b(mVar, null, null, i17, h1Var.H().f376661d.f377491d);
            return;
        }
        if (H == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.webview.JSVerifyHelper", "authResp is null");
            h1Var.f182908f.b(mVar, null, null, i17, h1Var.H().f376661d.f377491d);
            return;
        }
        gm0.j1.d().a(1096, this);
        java.util.LinkedList linkedList = H.f376664g;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.q24 q24Var = (r45.q24) it.next();
                if (q24Var != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.webview.JSVerifyHelper", "apiname = %s, scope = %s, scope desc = %s, status = %d, now jsapi name = %s", q24Var.f383608g, q24Var.f383605d, q24Var.f383607f, java.lang.Integer.valueOf(q24Var.f383606e), h14Var.f375751f);
                    q24Var.f383606e = 1;
                }
            }
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                r45.q24 q24Var2 = (r45.q24) it6.next();
                if (q24Var2 != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.webview.JSVerifyHelper", "apiname = %s, scope = %s, scope desc = %s, status = %d, now jsapi name = %s", q24Var2.f383608g, q24Var2.f383605d, q24Var2.f383607f, java.lang.Integer.valueOf(q24Var2.f383606e), h14Var.f375751f);
                }
            }
        }
        gm0.j1.d().g(new com.tencent.mm.plugin.webview.model.k1(g14Var, h14Var.f375749d, h14Var.f375759q, h14Var.f375750e, h14Var.f375751f, h14Var.f375752g, h14Var.f375753h, h14Var.f375754i, h14Var.f375755m, h14Var.f375756n, h14Var.f375757o, linkedList, this.f185373g, ((r45.h14) ((com.tencent.mm.modelbase.o) h1Var.getReqResp()).f70710a.f70684a).f375760r));
        h1Var.f182908f.b(com.tencent.mm.plugin.webview.ui.tools.jsapi.m.RET_OK, null, null, i17, h1Var.H().f376661d.f377491d);
    }

    public final java.lang.String b(java.lang.String str) {
        int indexOf = str.indexOf("#");
        return indexOf < 0 ? str : str.substring(0, indexOf);
    }

    public java.lang.String c(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.util.HashMap hashMap = this.f185371e;
        java.lang.String str2 = (java.lang.String) hashMap.get(str);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return str2;
        }
        java.lang.String b17 = b(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.webview.JSVerifyHelper", "appid = %s, url = %s, drophash url = %s", str2, str, b17);
        return !com.tencent.mm.sdk.platformtools.t8.K0(b17) ? (java.lang.String) hashMap.get(b17) : str2;
    }

    public com.tencent.mm.plugin.webview.ui.tools.jsapi.q d(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.util.HashMap hashMap = this.f185372f;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.q qVar = (com.tencent.mm.plugin.webview.ui.tools.jsapi.q) hashMap.get(str);
        return qVar == null ? (com.tencent.mm.plugin.webview.ui.tools.jsapi.q) hashMap.get(b(str)) : qVar;
    }

    public void e(com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper, java.lang.String str, java.lang.String str2, int i17, nw4.y2 y2Var, int i18, com.tencent.mm.plugin.webview.ui.tools.jsapi.n nVar) {
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        int i19;
        java.lang.String str6;
        java.lang.String str7 = str;
        java.lang.String str8 = y2Var != null ? y2Var.f341019i : "";
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str8);
        com.tencent.mm.plugin.webview.ui.tools.jsapi.m mVar = com.tencent.mm.plugin.webview.ui.tools.jsapi.m.RET_ACCESS_DENIED;
        if (K0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.webview.JSVerifyHelper", "jsapi is null, %s", str);
            nVar.b(mVar, null, null, 0, 0);
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.jsapi.m mVar2 = com.tencent.mm.plugin.webview.ui.tools.jsapi.m.RET_FAIL;
        if (jsapiPermissionWrapper == null || com.tencent.mm.sdk.platformtools.t8.K0(str) || y2Var == null || jsapiPermissionWrapper.f192180d == null) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = str7;
            objArr[1] = str8;
            objArr[2] = java.lang.Boolean.valueOf(jsapiPermissionWrapper != null);
            com.tencent.mars.xlog.Log.e("MicroMsg.webview.JSVerifyHelper", "handleJSVerify invalid argument, currentUrl = %s, jsapi = %s, %s", objArr);
            nVar.b(mVar2, "localParameters", null, 0, 0);
            return;
        }
        int d17 = jsapiPermissionWrapper.d(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.webview.JSVerifyHelper", "handleJSVerify jsApi = %s, permission pos = %d, permission = %s currentUrl = %s", str8, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(d17), str7);
        java.lang.String str9 = (java.lang.String) this.f185371e.get(str7);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str9)) {
            str9 = (java.lang.String) y2Var.f340790a.get("verifyAppId");
        }
        java.util.HashMap hashMap = (java.util.HashMap) y2Var.f341018h;
        hashMap.put("permissionValue", java.lang.Integer.valueOf(d17));
        hashMap.put("appId", str9);
        if (d17 == 0) {
            nVar.b(mVar, null, null, 0, 0);
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.jsapi.m mVar3 = com.tencent.mm.plugin.webview.ui.tools.jsapi.m.RET_OK;
        if (d17 == 1) {
            nVar.b(mVar3, null, null, 0, 0);
            return;
        }
        if (d17 == 2) {
            if (str8.equals("preVerifyJSAPI")) {
                nVar.b(mVar3, null, null, 0, 0);
                return;
            } else {
                nVar.b(mVar, null, null, 0, 0);
                return;
            }
        }
        if (d17 != 3) {
            if (d17 == 4) {
                str7 = (java.lang.String) y2Var.f340790a.get("url");
                r45.g14 g14Var = (r45.g14) this.f185370d.get(str8 + str7);
                if (g14Var != null && g14Var.f374801e == 1) {
                    nVar.b(mVar3, null, null, 0, 0);
                    return;
                }
            }
            nVar.b(mVar2, "unkonwPermission_" + d17, null, 0, 0);
            com.tencent.mars.xlog.Log.e("MicroMsg.webview.JSVerifyHelper", "unknow permission");
        }
        java.lang.String str10 = str7;
        java.lang.String str11 = (java.lang.String) y2Var.f340790a.get("verifySignature");
        java.lang.String str12 = (java.lang.String) y2Var.f340790a.get("verifyNonceStr");
        java.lang.String str13 = (java.lang.String) y2Var.f340790a.get("verifyTimestamp");
        java.lang.String str14 = (java.lang.String) y2Var.f340790a.get("verifySignType");
        java.lang.String str15 = (java.lang.String) y2Var.f340790a.get("scope");
        java.lang.String str16 = (java.lang.String) y2Var.f340790a.get("addrSign");
        com.tencent.mars.xlog.Log.i("MicroMsg.webview.JSVerifyHelper", "handleJSVerify addrSign = %s, signature = %s", str16, str11);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str11) || com.tencent.mm.sdk.platformtools.t8.K0(str16)) {
            str3 = str14;
            str4 = str9;
            str5 = str12;
            i19 = !com.tencent.mm.sdk.platformtools.t8.K0(str11) ? 2 : 0;
            str6 = str11;
        } else {
            java.lang.String str17 = (java.lang.String) y2Var.f340790a.get("appId");
            java.lang.String str18 = (java.lang.String) y2Var.f340790a.get("addrSign");
            java.lang.String str19 = (java.lang.String) y2Var.f340790a.get("signType");
            java.lang.String str20 = (java.lang.String) y2Var.f340790a.get("timeStamp");
            str6 = str18;
            str3 = str19;
            str5 = (java.lang.String) y2Var.f340790a.get("nonceStr");
            i19 = 1;
            str13 = str20;
            str4 = str17;
        }
        org.json.JSONObject b17 = nw4.x2.b(y2Var.f340790a);
        byte[] bytes = b17 != null ? b17.toString().getBytes() : null;
        if (d17 == 4) {
            com.tencent.mm.plugin.webview.model.h1 h1Var = new com.tencent.mm.plugin.webview.model.h1(nVar, str10, str2, str4, str8, str13, str5, str6, str3, bytes, i19, str15, this.f185373g, i18);
            gm0.j1.d().a(com.tencent.mm.plugin.appbrand.jsapi.channels.j.CTRL_INDEX, this);
            gm0.j1.d().g(h1Var);
            return;
        }
        if (d17 == 3) {
            com.tencent.mm.plugin.webview.model.j1 j1Var = new com.tencent.mm.plugin.webview.model.j1(nVar, str10, str2, str4, str8, str13, str5, str6, str3, bytes, this.f185373g, i18);
            gm0.j1.d().a(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.v.CTRL_INDEX, this);
            gm0.j1.d().g(j1Var);
            return;
        }
        nVar.b(mVar2, "unkonwPermission_" + d17, null, 0, 0);
        com.tencent.mars.xlog.Log.e("MicroMsg.webview.JSVerifyHelper", "unknow permission");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r45.j14 j14Var;
        r45.j14 j14Var2;
        com.tencent.mars.xlog.Log.i("MicroMsg.webview.JSVerifyHelper", "JSVerifyHelper onSceneEnd: type[%d], errType[%s], errCode[%s], errMsg[%s]", java.lang.Integer.valueOf(m1Var.getType()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (!(m1Var instanceof com.tencent.mm.plugin.webview.ui.tools.jsapi.o)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.webview.JSVerifyHelper", "JSVerifyHelper onSceneEnd: net scene type mismatched, return");
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.jsapi.o oVar = (com.tencent.mm.plugin.webview.ui.tools.jsapi.o) m1Var;
        int s17 = oVar.s();
        int i19 = this.f185373g;
        if (s17 != i19) {
            com.tencent.mars.xlog.Log.i("MicroMsg.webview.JSVerifyHelper", "JSVerifyHelper onSceneEnd: this.binderId = %d, incoming binderId = %d, not equal, return", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(oVar.s()));
            return;
        }
        int type = m1Var.getType();
        com.tencent.mm.plugin.webview.ui.tools.jsapi.m mVar = com.tencent.mm.plugin.webview.ui.tools.jsapi.m.RET_OK;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.m mVar2 = com.tencent.mm.plugin.webview.ui.tools.jsapi.m.RET_FAIL;
        int i27 = 0;
        if (type == 1093) {
            gm0.j1.d().q(bb1.g.CTRL_INDEX, this);
            com.tencent.mm.plugin.webview.model.i1 i1Var = (com.tencent.mm.plugin.webview.model.i1) m1Var;
            com.tencent.mm.plugin.webview.ui.tools.jsapi.n nVar = i1Var.f182931f;
            if (nVar == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.webview.JSVerifyHelper", "dealJSAPIPreVerify, VerifyCallback is null");
                return;
            }
            int i28 = (i1Var.H() == null || i1Var.H().f390710d == null) ? 0 : i1Var.H().f390710d.f377491d;
            if (i17 != 0 || i18 != 0) {
                if (i17 != 4) {
                    i1Var.f182931f.b(mVar2, null, null, i18, i28);
                    return;
                }
                i1Var.f182931f.b(mVar2, i18 + "_" + str, null, i18, i28);
                return;
            }
            r45.y14 H = i1Var.H();
            com.tencent.mm.modelbase.o oVar2 = i1Var.f182929d;
            r45.x14 x14Var = oVar2 == null ? null : (r45.x14) oVar2.f70710a.f70684a;
            java.lang.String str2 = i1Var.f182932g;
            if (H == null || com.tencent.mm.sdk.platformtools.t8.K0(str2) || x14Var == null || com.tencent.mm.sdk.platformtools.t8.K0(x14Var.f389651e)) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = java.lang.Boolean.valueOf(H == null);
                objArr[1] = java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(str2));
                objArr[2] = java.lang.Boolean.valueOf(x14Var == null);
                com.tencent.mars.xlog.Log.e("MicroMsg.webview.JSVerifyHelper", "something null %b, %b, %b", objArr);
                i1Var.f182931f.b(mVar2, null, null, i18, i28);
                return;
            }
            r45.j14 j14Var3 = H.f390710d;
            if (j14Var3 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.webview.JSVerifyHelper", "jsapi_baseresponse null");
                i1Var.f182931f.b(mVar2, null, null, i18, i28);
                return;
            }
            int i29 = j14Var3.f377491d;
            if (i29 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.webview.JSVerifyHelper", "jsapi baseresponse errcode fail : %d, errmsg = %s", java.lang.Integer.valueOf(i29), H.f390710d.f377492e);
                i1Var.f182931f.b(mVar2, H.f390710d.f377492e, null, i18, i28);
                return;
            }
            nVar.a(H.f390713g);
            this.f185371e.put(b(x14Var.f389650d), x14Var.f389651e);
            com.tencent.mm.plugin.webview.ui.tools.jsapi.q qVar = new com.tencent.mm.plugin.webview.ui.tools.jsapi.q(x14Var.f389651e, H);
            java.util.HashMap hashMap = this.f185372f;
            hashMap.put(b(x14Var.f389650d), qVar);
            hashMap.put(b(x14Var.f389660q), qVar);
            i1Var.f182931f.b(mVar, null, H.f390711e, i18, i28);
            return;
        }
        java.util.HashMap hashMap2 = this.f185370d;
        if (type != 1095) {
            if (type != 1094) {
                if (type == 1096) {
                    gm0.j1.d().q(1096, this);
                    com.tencent.mm.plugin.webview.model.k1 k1Var = (com.tencent.mm.plugin.webview.model.k1) m1Var;
                    com.tencent.mm.modelbase.o oVar3 = k1Var.f182976d;
                    r45.b24 b24Var = oVar3 == null ? null : (r45.b24) oVar3.f70710a.f70684a;
                    if (b24Var == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.webview.JSVerifyHelper", "JSAPISetOAuth, setAuthReq is null");
                        return;
                    }
                    if (i17 != 0 || i18 != 0) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.webview.JSVerifyHelper", "JSAPISetOAuth, errType[%s], errCode[%s], %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), b24Var.f370455f);
                        return;
                    }
                    java.lang.String str3 = b24Var.f370455f;
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (o45.vf.b(str3 != null ? str3 : "") == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.webview.JSVerifyHelper", "JSAPISetOAuth, errType[%s], errCode[%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                        return;
                    }
                    r45.g14 g14Var = k1Var.f182978f;
                    g14Var.f374801e = 1;
                    hashMap2.put(b24Var.f370455f + b24Var.f370453d, g14Var);
                    return;
                }
                return;
            }
            gm0.j1.d().q(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.v.CTRL_INDEX, this);
            com.tencent.mm.plugin.webview.model.j1 j1Var = (com.tencent.mm.plugin.webview.model.j1) m1Var;
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(157L, 24L, 1L, false);
            if (j1Var.H() != null && j1Var.H().f369666d != null) {
                i27 = j1Var.H().f369666d.f377491d;
            }
            if (i17 != 0 || i18 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.webview.JSVerifyHelper", "dealJSAPIRealtimeVerify netscene error", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                g0Var.idkeyStat(157L, 25L, 1L, false);
                if (i17 != 4) {
                    j1Var.f182952f.b(mVar2, null, null, i18, i27);
                    return;
                }
                j1Var.f182952f.b(mVar2, i18 + "_" + str, null, i18, i27);
                return;
            }
            r45.a24 H2 = j1Var.H();
            if (H2 == null || (j14Var = H2.f369666d) == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.webview.JSVerifyHelper", "dealJSAPIRealtimeVerify resp is null");
                j1Var.f182952f.b(mVar2, null, null, i18, i27);
                return;
            }
            int i37 = j14Var.f377491d;
            if (i37 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.webview.JSVerifyHelper", "realtime jsapi_baseresponse %s, %s", java.lang.Integer.valueOf(i37), H2.f369666d.f377492e);
                j1Var.f182952f.b(mVar2, H2.f369666d.f377492e, null, i18, i27);
                return;
            }
            r45.lx6 lx6Var = H2.f369667e;
            if (lx6Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.webview.JSVerifyHelper", "realtime not ok, vInfo is null");
                j1Var.f182952f.b(mVar2, "verifyFail", null, i18, i27);
                return;
            }
            int i38 = lx6Var.f379959f;
            if (i38 == 1) {
                j1Var.f182952f.b(mVar, null, null, i18, i27);
                return;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.webview.JSVerifyHelper", "realtime not ok, %s", java.lang.Integer.valueOf(i38));
                j1Var.f182952f.b(mVar2, "verifyFail", null, i18, i27);
                return;
            }
        }
        gm0.j1.d().q(com.tencent.mm.plugin.appbrand.jsapi.channels.j.CTRL_INDEX, this);
        com.tencent.mm.plugin.webview.model.h1 h1Var = (com.tencent.mm.plugin.webview.model.h1) m1Var;
        int i39 = (h1Var.H() == null || h1Var.H().f376661d == null) ? 0 : h1Var.H().f376661d.f377491d;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.webview.JSVerifyHelper", "dealJSAPIAuth netscene error, %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            if (i17 == 4) {
                h1Var.f182908f.b(mVar2, str, null, i18, i39);
                return;
            } else {
                h1Var.f182908f.b(mVar2, null, null, i18, i39);
                return;
            }
        }
        java.lang.String str4 = h1Var.f182909g;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.webview.JSVerifyHelper", "scene.jsapi is null or nil.");
            h1Var.f182908f.b(mVar2, null, null, i18, i39);
            return;
        }
        r45.i14 H3 = h1Var.H();
        if (H3 == null || (j14Var2 = H3.f376661d) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.webview.JSVerifyHelper", "dealJSAPIAuth resp is null");
            h1Var.f182908f.b(mVar2, null, null, i18, i39);
            return;
        }
        int i47 = j14Var2.f377491d;
        if (i47 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.webview.JSVerifyHelper", "auth jsapi_baseresponse %s, %s", java.lang.Integer.valueOf(i47), H3.f376661d.f377492e);
            h1Var.f182908f.b(mVar2, H3.f376661d.f377492e, null, i18, i39);
            return;
        }
        com.tencent.mm.modelbase.o oVar4 = h1Var.f182906d;
        if ((oVar4 == null ? null : (r45.h14) oVar4.f70710a.f70684a) != null) {
            i27 = (oVar4 == null ? null : (r45.h14) oVar4.f70710a.f70684a).f375757o;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.webview.JSVerifyHelper", "signature flag : %d.", java.lang.Integer.valueOf(i27));
        java.lang.String str5 = h1Var.f182910h;
        if (i27 == 1) {
            java.util.LinkedList linkedList = H3.f376664g;
            if (linkedList == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.webview.JSVerifyHelper", "dealJSAPI scope_auth_info is null.");
                h1Var.f182908f.b(mVar2, null, null, i18, i39);
                return;
            }
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.q24 q24Var = (r45.q24) it.next();
                java.util.LinkedList linkedList2 = q24Var.f383608g;
                if (linkedList2 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.webview.JSVerifyHelper", "authInfo.apiname is null.");
                } else {
                    java.util.Iterator it6 = linkedList2.iterator();
                    while (it6.hasNext()) {
                        java.lang.String str6 = (java.lang.String) it6.next();
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(str6)) {
                            r45.g14 g14Var2 = new r45.g14();
                            g14Var2.f374800d = str6;
                            g14Var2.f374801e = q24Var.f383606e;
                            g14Var2.f374802f = q24Var.f383607f;
                            hashMap2.put(g14Var2.f374800d + str5, g14Var2);
                            it = it;
                        }
                    }
                }
            }
        } else {
            java.util.LinkedList linkedList3 = H3.f376662e;
            if (linkedList3 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.webview.JSVerifyHelper", "dealJSAPIAuth auth_info is null");
                h1Var.f182908f.b(mVar2, "nullAuthInfo", null, i18, i39);
                return;
            }
            java.util.Iterator it7 = linkedList3.iterator();
            while (it7.hasNext()) {
                r45.g14 g14Var3 = (r45.g14) it7.next();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(g14Var3.f374800d)) {
                    hashMap2.put(g14Var3.f374800d + str5, g14Var3);
                }
            }
        }
        r45.g14 g14Var4 = (r45.g14) hashMap2.get(str4 + str5);
        if (g14Var4 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.webview.JSVerifyHelper", "The JSAPIAuthInfo is null. (jsapi : %s , url : %s)", str4, str5);
            h1Var.f182908f.b(mVar2, null, null, i18, i39);
            return;
        }
        if (g14Var4.f374801e == 1) {
            h1Var.f182908f.b(mVar, null, null, i18, i39);
            return;
        }
        android.content.Context context = this.f185374h;
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.webview.JSVerifyHelper", "JSVerify context not activity");
            a(h1Var, i18, g14Var4);
            return;
        }
        com.tencent.mm.plugin.webview.stub.z0 z0Var = this.f185375i;
        java.lang.String str7 = g14Var4.f374803g;
        java.lang.String str8 = str7 == null ? "" : str7;
        java.lang.String str9 = g14Var4.f374802f;
        com.tencent.mm.plugin.webview.stub.WebViewStubTempUI.U6(context, z0Var, false, str8, str9 == null ? "" : str9, context.getString(com.tencent.mm.R.string.g6u), this.f185374h.getString(com.tencent.mm.R.string.g6t), new com.tencent.mm.plugin.webview.ui.tools.jsapi.k(this, h1Var, i18, g14Var4), new com.tencent.mm.plugin.webview.ui.tools.jsapi.l(this, h1Var, i18));
    }
}
