package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public abstract class z0 extends com.tencent.mm.wallet_core.model.d1 {
    protected static final int ERR_RETCODE_JSON_RESOLVE_ERROR = -10089;
    private static final int ERR_RETCODE_NO_JSON = -10088;
    private static final java.lang.String PAY_END = "1";
    private static final java.lang.String TAG = "MicroMsg.NetScenePayBase";
    protected com.tencent.mm.modelbase.u0 callback;
    private java.lang.String errDialogCancelText;
    private java.lang.String errDialogOkText;
    protected java.lang.String error_detail_url;
    private com.tencent.mm.wallet_core.model.p0 jumpRemind;

    /* renamed from: rr, reason: collision with root package name */
    protected com.tencent.mm.modelbase.o f214040rr;
    protected int SVR_ERR_TYPE = 0;
    protected int SVR_ERR_CODE = 0;
    private java.lang.String payFlag = "";
    private java.lang.String payAppUrl = "";
    private java.lang.String wappay_jumped_url = "";
    protected boolean isChildConsume = false;
    public int is_gen_cert = 0;
    public java.lang.String crt_token = "";
    public int is_hint_cert = 0;
    public java.lang.String crt_wording = "";
    public int is_ignore_cert = 0;
    public boolean hasRevServerRep = false;
    private java.util.Map<java.lang.String, java.lang.String> _request = new java.util.HashMap();
    private boolean hasProcessWalletError = false;

    public static com.tencent.mm.wallet_core.model.o getRetModel(int i17, int i18, java.lang.String str, int i19, java.lang.String str2, int i27, java.lang.String str3, int i28, java.lang.String str4) {
        com.tencent.mm.wallet_core.model.o oVar = new com.tencent.mm.wallet_core.model.o(i17, i18, str);
        if (i17 != 0 || i18 != 0) {
            getRetModel(i17, i18, str, oVar);
        } else if (i19 != 0) {
            com.tencent.mars.xlog.Log.w(TAG, "hy: resolve busi error: plat ret is error");
            oVar.a(1000, i19, str2, 1);
        } else if (i27 != 0) {
            com.tencent.mars.xlog.Log.w(TAG, "hy: resolve busi error: errType is error");
            oVar.a(1000, i27, str3, 2);
        } else if (i28 != 0) {
            com.tencent.mars.xlog.Log.w(TAG, "hy: resolve busi error: retCode is error");
            if (i28 != ERR_RETCODE_JSON_RESOLVE_ERROR && i28 != ERR_RETCODE_NO_JSON) {
                oVar.a(1000, i28, str4, 2);
            } else {
                oVar.a(1000, 2, str4, 2);
            }
        } else {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                com.tencent.mars.xlog.Log.i(TAG, "finModel.errMsg = biz_errMsg");
                oVar.f213954c = str3;
            }
            com.tencent.mars.xlog.Log.i(TAG, "hy: all's OK");
        }
        return oVar;
    }

    public void addRequestData(java.util.Map<java.lang.String, java.lang.String> map) {
        if (map == null) {
            map = new java.util.HashMap<>();
        }
        map.remove("uin");
        if (this._request == null) {
            this._request = new java.util.HashMap();
        }
        java.util.Map<java.lang.String, java.lang.String> map2 = this._request;
        if (map2 != null) {
            map2.remove("uin");
        }
        for (java.lang.Object obj : map.keySet().toArray()) {
            java.lang.String str = map.get(obj);
            if (this._request.containsKey(obj)) {
                this._request.remove(obj);
            }
            this._request.put((java.lang.String) obj, str);
        }
        setRequestData(this._request);
    }

    public boolean callbackUIWhenWalletError() {
        return false;
    }

    public boolean checkRecSrvResp() {
        return this.hasRevServerRep;
    }

    public abstract void configRequest(boolean z17, boolean z18);

    @Override // com.tencent.mm.wallet_core.model.d1
    public int getCgicmdForKV() {
        return getPayCgicmd();
    }

    public com.tencent.mm.modelbase.o getCommReqResp() {
        return this.f214040rr;
    }

    public abstract java.lang.String getEncryptUrl(java.lang.String str);

    public java.lang.String getErrDetailUrl() {
        return this.error_detail_url;
    }

    public java.lang.String getErrDialogCancelBtnText() {
        return !com.tencent.mm.sdk.platformtools.t8.K0(this.errDialogCancelText) ? this.errDialogCancelText : com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490507x1);
    }

    public java.lang.String getErrDialogOkBtnText() {
        return !com.tencent.mm.sdk.platformtools.t8.K0(this.errDialogOkText) ? this.errDialogOkText : com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.klh);
    }

    public com.tencent.mm.wallet_core.model.p0 getJumpRemind() {
        return this.jumpRemind;
    }

    public abstract int getPayCgicmd();

    public abstract com.tencent.mm.wallet_core.model.e1 getRetModel(com.tencent.mm.modelbase.o oVar);

    public java.lang.String getReturnUrl() {
        return this.payAppUrl;
    }

    public java.lang.String getToken() {
        return null;
    }

    public java.lang.String getWappayJumpUrl() {
        return this.wappay_jumped_url;
    }

    public boolean hasProcessWalletError() {
        return this.hasProcessWalletError;
    }

    public boolean isBlock() {
        return true;
    }

    public boolean isJumpRemind() {
        return this.jumpRemind != null;
    }

    public boolean isPayEnd() {
        java.lang.String str = this.payFlag;
        if (str == null) {
            return false;
        }
        return "1".equals(str.trim());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01c7  */
    @Override // com.tencent.mm.wallet_core.model.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGYNetEnd(int r29, int r30, int r31, java.lang.String r32, com.tencent.mm.network.v0 r33, byte[] r34, long r35) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.wallet_core.model.z0.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[], long):void");
    }

    public abstract void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject);

    public void onGYNetEnd2(com.tencent.mm.wallet_core.model.o oVar, org.json.JSONObject jSONObject) {
    }

    public void onRawGYNetEnd(com.tencent.mm.wallet_core.model.o oVar, org.json.JSONObject jSONObject) {
        onGYNetEnd(oVar.f213953b, oVar.f213954c, jSONObject);
    }

    public void onRawGYNetEnd2(com.tencent.mm.wallet_core.model.o oVar, org.json.JSONObject jSONObject) {
        onGYNetEnd2(oVar, jSONObject);
    }

    public java.lang.String parseErrDialogCancelBtnText(org.json.JSONObject jSONObject) {
        return null;
    }

    public java.lang.String parseErrDialogOkBtnText(org.json.JSONObject jSONObject) {
        return null;
    }

    public abstract void putToReqText(com.tencent.mm.modelbase.o oVar, r45.cu5 cu5Var);

    public void putToRequest(java.lang.StringBuilder sb6, java.lang.String str) {
        sb6.append(str);
    }

    public abstract void putToWXReqText(com.tencent.mm.modelbase.o oVar, r45.cu5 cu5Var);

    public void reportCellInfo(int i17, int i18) {
        java.lang.String substring;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String substring2;
        java.lang.String str3;
        try {
            if (i17 == 0) {
                com.tencent.mars.xlog.Log.e(TAG, "errType is OK, reportCellInfo do nothing");
                return;
            }
            if (!at4.g0.g()) {
                com.tencent.mars.xlog.Log.e(TAG, "shouldReportCellInfo is false, reportCellInfo do nothing");
                return;
            }
            r45.r1 c17 = at4.g0.c();
            if (c17 == null || com.tencent.mm.sdk.platformtools.t8.K0(c17.f384415o) || com.tencent.mm.sdk.platformtools.t8.K0(c17.f384416p)) {
                return;
            }
            int payCgicmd = getPayCgicmd();
            java.lang.String str4 = c17.f384415o;
            java.lang.String str5 = c17.f384414n;
            java.lang.String str6 = c17.f384416p;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str6)) {
                return;
            }
            int length = str6.length();
            if (length <= 5000) {
                if (length > 4000) {
                    substring = str6.substring(0, 1000);
                    substring2 = str6.substring(1000, 2000);
                    str3 = str6.substring(2000, 3000);
                    str2 = str6.substring(3000, 4000);
                    str = str6.substring(4000, length);
                } else if (length > 3000) {
                    substring = str6.substring(0, 1000);
                    substring2 = str6.substring(1000, 2000);
                    str3 = str6.substring(2000, 3000);
                    str2 = str6.substring(3000, length);
                    str = "";
                } else if (length > 2000) {
                    substring = str6.substring(0, 1000);
                    substring2 = str6.substring(1000, 2000);
                    str3 = str6.substring(2000, length);
                    str = "";
                    str2 = str;
                } else if (length > 1000) {
                    substring = str6.substring(0, 1000);
                    substring2 = str6.substring(1000, length);
                    str = "";
                    str2 = str;
                    str3 = str2;
                } else if (length > 0) {
                    substring = str6.substring(0, length);
                    str = "";
                    str2 = str;
                    str3 = str2;
                    substring2 = str3;
                }
                com.tencent.mars.xlog.Log.e(TAG, "reportCellInfo do report");
                com.tencent.mm.autogen.mmdata.rpt.ClientCellInfoReportStruct clientCellInfoReportStruct = new com.tencent.mm.autogen.mmdata.rpt.ClientCellInfoReportStruct();
                clientCellInfoReportStruct.f55690d = payCgicmd;
                clientCellInfoReportStruct.f55691e = i17;
                clientCellInfoReportStruct.f55692f = i18;
                clientCellInfoReportStruct.f55693g = clientCellInfoReportStruct.b("EncryptKey", str4, true);
                clientCellInfoReportStruct.f55694h = clientCellInfoReportStruct.b("EncryptUserinfo", str5, true);
                clientCellInfoReportStruct.f55695i = clientCellInfoReportStruct.b("EncryptCellinfoLength", "" + length, true);
                clientCellInfoReportStruct.f55696j = clientCellInfoReportStruct.b("EncryptCellinfo_01", substring, true);
                clientCellInfoReportStruct.f55697k = clientCellInfoReportStruct.b("EncryptCellinfo_02", substring2, true);
                clientCellInfoReportStruct.f55698l = clientCellInfoReportStruct.b("EncryptCellinfo_03", str3, true);
                clientCellInfoReportStruct.f55699m = clientCellInfoReportStruct.b("EncryptCellinfo_04", str2, true);
                clientCellInfoReportStruct.f55700n = clientCellInfoReportStruct.b("EncryptCellinfo_05", str, true);
                clientCellInfoReportStruct.k();
            }
            com.tencent.mars.xlog.Log.e(TAG, "reportCellInfo. cell info is too long to report");
            str = "";
            substring = str;
            str2 = substring;
            str3 = str2;
            substring2 = str3;
            com.tencent.mars.xlog.Log.e(TAG, "reportCellInfo do report");
            com.tencent.mm.autogen.mmdata.rpt.ClientCellInfoReportStruct clientCellInfoReportStruct2 = new com.tencent.mm.autogen.mmdata.rpt.ClientCellInfoReportStruct();
            clientCellInfoReportStruct2.f55690d = payCgicmd;
            clientCellInfoReportStruct2.f55691e = i17;
            clientCellInfoReportStruct2.f55692f = i18;
            clientCellInfoReportStruct2.f55693g = clientCellInfoReportStruct2.b("EncryptKey", str4, true);
            clientCellInfoReportStruct2.f55694h = clientCellInfoReportStruct2.b("EncryptUserinfo", str5, true);
            clientCellInfoReportStruct2.f55695i = clientCellInfoReportStruct2.b("EncryptCellinfoLength", "" + length, true);
            clientCellInfoReportStruct2.f55696j = clientCellInfoReportStruct2.b("EncryptCellinfo_01", substring, true);
            clientCellInfoReportStruct2.f55697k = clientCellInfoReportStruct2.b("EncryptCellinfo_02", substring2, true);
            clientCellInfoReportStruct2.f55698l = clientCellInfoReportStruct2.b("EncryptCellinfo_03", str3, true);
            clientCellInfoReportStruct2.f55699m = clientCellInfoReportStruct2.b("EncryptCellinfo_04", str2, true);
            clientCellInfoReportStruct2.f55700n = clientCellInfoReportStruct2.b("EncryptCellinfo_05", str, true);
            clientCellInfoReportStruct2.k();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "reportCellInfo error. %s", e17.getMessage());
        }
    }

    public boolean resend() {
        reset();
        return false;
    }

    public void setCommReqResp(com.tencent.mm.modelbase.o oVar) {
        this.f214040rr = oVar;
    }

    public void setHasProcessWalletError(boolean z17) {
        this.hasProcessWalletError = z17;
    }

    public void setPayInfo(com.tencent.mm.pluginsdk.wallet.PayInfo payInfo, java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2) {
        setPayInfo(payInfo, map, map2, false);
    }

    public void setRequestData(java.util.Map<java.lang.String, java.lang.String> map) {
        if (map == null) {
            map = new java.util.HashMap<>();
        }
        map.remove("uin");
        if (!h45.y.c()) {
            map.put("jsapi_reqkey", h45.y.f278968a);
        }
        this._request = map;
        configRequest(true, true);
        java.lang.String str = map.get("req_key");
        o45.zg reqObj = getCommReqResp().getReqObj();
        com.tencent.mm.wallet_core.ui.r1.J(str);
        int i17 = 0;
        reqObj.setRouteInfo(0);
        java.lang.Object[] array = map.keySet().toArray();
        java.util.Arrays.sort(array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = false;
        while (true) {
            if (i17 >= array.length) {
                break;
            }
            java.lang.Object obj = array[i17];
            java.lang.String str2 = map.get(obj);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                if (z17) {
                    sb6.append("&");
                }
                sb6.append(obj);
                sb6.append("=");
                putToRequest(sb6, str2);
                z17 = true;
            }
            i17++;
        }
        if (z65.c.a()) {
            com.tencent.mars.xlog.Log.i(TAG, "RQ: Cmd : " + getPayCgicmd() + ", req = " + sb6.toString() + " " + toString() + " " + com.tencent.mm.sdk.platformtools.z3.b(true));
        } else {
            com.tencent.mars.xlog.Log.i(TAG, "RQ: Cmd : " + getPayCgicmd() + ", req = " + sb6.toString() + " " + toString());
        }
        java.lang.String encryptUrl = getEncryptUrl(sb6.toString());
        sb6.append(z17 ? "&" : "");
        sb6.append("WCPaySign");
        sb6.append("=");
        sb6.append(encryptUrl);
        byte[] bytes = sb6.toString().getBytes();
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(bytes);
        putToReqText(this.f214040rr, cu5Var);
        com.tencent.mars.xlog.Log.i(TAG, "setRequestData getPayCgicmd: %s type: %s this: %s cgi %s ", java.lang.Integer.valueOf(getPayCgicmd()), java.lang.Integer.valueOf(getType()), toString(), this.f214040rr.f70712c);
    }

    public void setWXRequestData(java.util.Map<java.lang.String, java.lang.String> map) {
        configRequest(false, false);
        if (map != null) {
            r45.r1 c17 = at4.g0.c();
            if (c17 != null) {
                com.tencent.mars.xlog.Log.i(TAG, "location found");
                map.put("province", c17.f384407d);
                if (!map.containsKey("city")) {
                    map.put("city", c17.f384408e);
                }
                map.put("location_timestamp", c17.f384411h + "");
                map.put("encrypt_key", c17.f384415o + "");
                map.put("encrypt_userinfo", c17.f384414n + "");
                if (at4.g0.g()) {
                    map.put("encrypt_cellinfo", c17.f384416p + "");
                }
            }
            java.lang.Object[] array = map.keySet().toArray();
            java.util.Arrays.sort(array);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            boolean z17 = false;
            for (java.lang.Object obj : array) {
                java.lang.String str = map.get(obj);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    if (z17) {
                        sb6.append("&");
                    }
                    sb6.append(obj);
                    sb6.append("=");
                    sb6.append(str);
                    z17 = true;
                }
            }
            if (z65.c.a()) {
                getPayCgicmd();
            }
            byte[] bytes = sb6.toString().getBytes();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(bytes);
            putToWXReqText(this.f214040rr, cu5Var);
        }
    }

    public boolean shouldResolveJsonWhenError() {
        return false;
    }

    public void setPayInfo(com.tencent.mm.pluginsdk.wallet.PayInfo payInfo, java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2, boolean z17) {
        if (map2 == null) {
            map2 = new java.util.HashMap<>();
        }
        if (payInfo == null) {
            com.tencent.mars.xlog.Log.e(TAG, "Cmd : " + getPayCgicmd() + ", payInfo is null");
            map2.put("devicename", wo.w0.m());
            setWXRequestData(map2);
            return;
        }
        map.put("req_key", payInfo.f192114m);
        map.put("partner_id", payInfo.f192118q);
        map.put("pay_sign", payInfo.f192119r);
        if (payInfo.H > -1) {
            map.put("auto_deduct_flag", payInfo.H + "");
        }
        if (payInfo.f192109e > 0) {
            map.put("pay_scene", payInfo.f192109e + "");
        }
        if (payInfo.f192108d >= 0) {
            map.put("bindbankscene", payInfo.f192108d + "");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(payInfo.I)) {
            map.put("deduct_bank_type", payInfo.I);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(payInfo.f192107J)) {
            map.put("deduct_bind_serial", payInfo.f192107J);
        }
        if (z17) {
            map.put("use_touch", "0");
        } else {
            map.put("use_touch", "" + payInfo.f192125x);
        }
        map.put("fp_identify_num", "" + payInfo.D);
        if (!android.text.TextUtils.isEmpty(payInfo.A)) {
            map.put("encrypted_pay_info", java.net.URLEncoder.encode(payInfo.A));
        }
        if (!android.text.TextUtils.isEmpty(payInfo.B)) {
            map.put("encrypted_rsa_sign", java.net.URLEncoder.encode(payInfo.B));
        }
        map2.put("uuid", payInfo.f192115n);
        map2.put("appid", payInfo.f192116o);
        map2.put("appsource", payInfo.f192117p);
        map2.put("channel", payInfo.f192111g + "");
        map2.put("devicename", wo.w0.m());
        map2.put("soter_req", payInfo.G);
    }

    public static void getRetModel(int i17, int i18, java.lang.String str, com.tencent.mm.wallet_core.model.o oVar) {
        if (i17 == 0 && i18 == 0) {
            return;
        }
        com.tencent.mars.xlog.Log.w(TAG, "hy: resolve system error.");
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "e", null);
        if (d17 != null) {
            oVar.f213954c = (java.lang.String) d17.get(".e.Content");
            return;
        }
        if (i18 != -1 && i18 != -500) {
            com.tencent.mars.xlog.Log.w(TAG, "hy: unknown system error");
            oVar.f213954c = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kkk);
        } else {
            com.tencent.mars.xlog.Log.w(TAG, "hy: network error");
            oVar.f213954c = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.krl);
        }
    }
}
