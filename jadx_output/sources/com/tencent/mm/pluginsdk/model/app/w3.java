package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes8.dex */
public class w3 extends com.tencent.mm.pluginsdk.model.app.u3 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f189112e = {"wxf109da3e26cf89f1", "wxc56bba830743541e", "wx41dd4f6ef137bd0b"};

    public w3(java.util.List list) {
        com.tencent.mm.sdk.platformtools.o4 R;
        java.util.List linkedList = new java.util.LinkedList(list);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.v93();
        lVar.f70665b = new r45.w93();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getappinfolist";
        lVar.f70667d = 451;
        boolean z17 = false;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f189090d = a17;
        r45.v93 v93Var = (r45.v93) a17.f70710a.f70684a;
        java.util.LinkedList d17 = d(linkedList);
        v93Var.f388002e = d17;
        v93Var.f388001d = d17.size();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList) && (R = com.tencent.mm.sdk.platformtools.o4.R("key_open_sdk_pkg")) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                linkedList2.add(R.u((java.lang.String) it.next(), ""));
            }
            java.util.Iterator it6 = linkedList2.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                } else if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) it6.next())) {
                    z17 = true;
                    break;
                }
            }
            if (z17) {
                linkedList3 = d(linkedList2);
            }
        }
        v93Var.f388004g = linkedList3;
        v93Var.f388003f = linkedList3.size();
    }

    @Override // com.tencent.mm.pluginsdk.model.app.u3
    public void a(byte[] bArr) {
        if (bArr == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetAppInfoList", "buf is null");
            return;
        }
        try {
            this.f189090d.f70711b.fromProtoBuf(bArr);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetAppInfoList", "parse error: " + e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneGetAppInfoList", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.pluginsdk.model.app.u3
    public int b() {
        return 7;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.u3
    public byte[] c() {
        try {
            return ((com.tencent.mm.modelbase.m) this.f189090d.getReqObj()).toProtoBuf();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetAppInfoList", "toProtBuf failed: " + e17.getMessage());
            return null;
        }
    }

    public final java.util.LinkedList d(java.util.List list) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (list == null) {
            return linkedList;
        }
        int size = list.size();
        java.lang.String[] strArr = new java.lang.String[size];
        list.toArray(strArr);
        for (int i17 = 0; i17 < size; i17++) {
            java.lang.String str = strArr[i17];
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                linkedList.add(x51.j1.i(str));
            }
        }
        return linkedList;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.pluginsdk.model.app.m mVar;
        boolean z17;
        java.lang.String str2;
        java.lang.String str3;
        boolean z18;
        boolean update;
        java.lang.String str4;
        java.lang.String str5;
        if (i18 != 0 || i19 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetAppInfoList", "errType = " + i18 + ", errCode = " + i19);
            return;
        }
        java.util.LinkedList linkedList = ((r45.w93) this.f189090d.f70711b.f70700a).f388986e;
        if (linkedList == null || linkedList.isEmpty()) {
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.ej ejVar = (r45.ej) it.next();
            if (ejVar != null) {
                com.tencent.mm.pluginsdk.model.app.m j17 = com.tencent.mm.pluginsdk.model.app.w.j(ejVar.f373544d, false, false);
                if (j17 == null) {
                    com.tencent.mm.pluginsdk.model.app.m mVar2 = new com.tencent.mm.pluginsdk.model.app.m();
                    mVar2.field_appId = ejVar.f373544d;
                    mVar = mVar2;
                    z17 = true;
                } else {
                    mVar = j17;
                    z17 = false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetAppInfoList", "appid:[%s], appinfoflag:[%d] AppSupportContentType:%d", ejVar.f373544d, java.lang.Integer.valueOf(ejVar.f373559v), java.lang.Long.valueOf(ejVar.C));
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetAppInfoList", "appId=%s, appName=%s, status=%s, appInfoFlag=%s", mVar.field_appId, mVar.field_appName, java.lang.Integer.valueOf(mVar.field_status), java.lang.Integer.valueOf(mVar.field_appInfoFlag));
                if (!mVar.G0() || com.tencent.mm.sdk.platformtools.t8.K0(mVar.field_appName)) {
                    mVar.field_appName = ejVar.f373545e;
                }
                if (!mVar.G0() || com.tencent.mm.sdk.platformtools.t8.K0(mVar.field_appName_en)) {
                    mVar.field_appName_en = ejVar.f373547g;
                }
                if (!mVar.G0() || com.tencent.mm.sdk.platformtools.t8.K0(mVar.field_appName_tw)) {
                    mVar.field_appName_tw = ejVar.f373549i;
                }
                mVar.field_appDiscription = ejVar.f373546f;
                mVar.field_appDiscription_en = ejVar.f373548h;
                mVar.field_appDiscription_tw = ejVar.f373550m;
                mVar.field_appWatermarkUrl = ejVar.f373554q;
                mVar.field_packageName = ejVar.f373555r;
                java.lang.String str6 = ejVar.f373556s;
                if (str6 == null || str6.length() == 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppUtil", "getDbSignature, svrSign is null");
                    str2 = null;
                } else {
                    str2 = com.tencent.mm.pluginsdk.model.app.j1.e(str6);
                }
                mVar.field_signature = str2;
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetAppInfoList", "get signature, server sig : %s, gen sig: %s pkd: %s", ejVar.f373556s, str2, ejVar.f373555r);
                java.lang.String str7 = ejVar.f373557t;
                mVar.field_appType = str7;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str7) && (mVar.field_appType.startsWith("1") || mVar.field_appType.startsWith("6"))) {
                    mVar.field_appType = "," + mVar.field_appType;
                }
                mVar.field_appInfoFlag = ejVar.f373559v;
                mVar.field_appVersion = ejVar.f373560w;
                mVar.I = ejVar.f373558u;
                mVar.A = true;
                mVar.field_appWatermarkUrl = ejVar.f373554q;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(ejVar.f373563z) && !com.tencent.mm.sdk.platformtools.t8.K0(ejVar.A)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetAppInfoList", "get app download url and download md5 : [%s], [%s], [%s]", mVar.field_appName, ejVar.f373563z, ejVar.A);
                    mVar.z0(ejVar.f373563z);
                    mVar.y0(ejVar.A);
                }
                mVar.A0(ejVar.B);
                mVar.field_svrAppSupportContentType = ejVar.C;
                int i27 = ejVar.f373561x;
                if (i27 > mVar.K) {
                    mVar.L = 1;
                    mVar.A = true;
                }
                mVar.K = i27;
                mVar.A = true;
                java.util.LinkedList<r45.z7> linkedList2 = ejVar.E;
                if (linkedList2 == null || linkedList2.isEmpty()) {
                    str3 = "";
                } else {
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    for (r45.z7 z7Var : linkedList2) {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        try {
                            str4 = z7Var.f391757e;
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetAppInfoList", "convertPackInfosToJson failed:" + e17.getMessage());
                        }
                        if (str4 != null && str4.length() != 0) {
                            str5 = com.tencent.mm.pluginsdk.model.app.j1.e(str4);
                            jSONObject.put("PackageName", z7Var.f391756d);
                            jSONObject.put("AndroidSignature", str5);
                            jSONArray.put(jSONObject);
                            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetAppInfoList", "convertPackInfosToJson pgk: " + z7Var.f391756d + ", sig: " + z7Var.f391757e + ", dbSig: " + str5);
                        }
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppUtil", "getDbSignature, svrSign is null");
                        str5 = null;
                        jSONObject.put("PackageName", z7Var.f391756d);
                        jSONObject.put("AndroidSignature", str5);
                        jSONArray.put(jSONObject);
                        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetAppInfoList", "convertPackInfosToJson pgk: " + z7Var.f391756d + ", sig: " + z7Var.f391757e + ", dbSig: " + str5);
                    }
                    str3 = jSONArray.toString();
                }
                mVar.field_packageInfos = str3;
                java.lang.String str8 = ejVar.f373555r;
                boolean z19 = str8 == null || str8.length() == 0 || str8.length() == 0;
                if (z19) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetAppInfoList", "no android app, packageName = " + ejVar.f373555r + "appid: " + mVar.field_appId);
                }
                if (mVar.k()) {
                    com.tencent.mm.pluginsdk.ui.tools.n0.c(mVar.field_appId);
                }
                com.tencent.mm.pluginsdk.model.app.z Ri = zo3.p.Ri();
                java.lang.String[] strArr = f189112e;
                if (z17) {
                    mVar.field_status = z19 ? 3 : 4;
                    mVar.field_modifyTime = java.lang.System.currentTimeMillis();
                    mVar.field_appIconUrl = ejVar.f373552o;
                    if (mVar.field_appId != null) {
                        int i28 = 0;
                        while (true) {
                            if (i28 >= 3) {
                                break;
                            }
                            if (mVar.field_appId.equals(strArr[i28])) {
                                mVar.field_status = -1;
                                break;
                            }
                            i28++;
                        }
                    }
                    if (Ri.insert(mVar)) {
                        zo3.p.Di().a(mVar.field_appId, 1);
                        zo3.p.Di().a(mVar.field_appId, 2);
                        zo3.p.Di().a(mVar.field_appId, 3);
                        zo3.p.Di().a(mVar.field_appId, 4);
                        zo3.p.Di().a(mVar.field_appId, 5);
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetAppInfoList", "onGYNetEnd : insert fail");
                    }
                } else {
                    mVar.field_status = z19 ? 3 : mVar.field_status;
                    if (mVar.field_appId != null) {
                        int i29 = 0;
                        while (true) {
                            if (i29 >= 3) {
                                break;
                            }
                            if (mVar.field_appId.equals(strArr[i29])) {
                                mVar.field_status = -1;
                                break;
                            }
                            i29++;
                        }
                    }
                    java.lang.String str9 = mVar.field_appIconUrl;
                    if (str9 == null || str9.length() == 0) {
                        z18 = true;
                    } else {
                        java.lang.String str10 = ejVar.f373562y;
                        z18 = (str10 == null || str10.length() == 0) ? false : !mVar.field_appIconUrl.equals(ejVar.f373552o);
                    }
                    if (z18) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetAppInfoList", "oldIcon = %s, newIcon = %s", mVar.field_appIconUrl, ejVar.f373552o);
                        mVar.field_appIconUrl = ejVar.f373552o;
                        update = Ri.update(mVar, new java.lang.String[0]);
                        zo3.p.Di().a(mVar.field_appId, 1);
                        zo3.p.Di().a(mVar.field_appId, 2);
                        zo3.p.Di().a(mVar.field_appId, 3);
                        zo3.p.Di().a(mVar.field_appId, 4);
                        zo3.p.Di().a(mVar.field_appId, 5);
                    } else {
                        update = Ri.update(mVar, new java.lang.String[0]);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetAppInfoList", "update appinfo " + update + ", appid = " + ejVar.f373544d);
                }
            }
        }
    }
}
