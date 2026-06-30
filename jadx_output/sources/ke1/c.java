package ke1;

/* loaded from: classes15.dex */
public final class c implements ke1.b {

    /* renamed from: a, reason: collision with root package name */
    public b8.c f306926a;

    @Override // ke1.b
    public he1.k a() {
        try {
            b8.c cVar = this.f306926a;
            if (cVar == null) {
                return new he1.i(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID, "OPPO wallet service not available");
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TransitCard.OppoVendor", "getCardList via querySignedCards");
            he1.k m17 = m(((b8.a) cVar).k());
            return m17 instanceof he1.j ? new he1.j(l(((he1.j) m17).f280884a)) : m17;
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.OppoVendor", "getCardList RemoteException: " + e17.getMessage());
            return new he1.i(10013, "getCardList RemoteException: " + e17.getMessage());
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.OppoVendor", "getCardList error: " + e18.getMessage());
            return new he1.i(10014, "getCardList failed: " + e18.getMessage());
        }
    }

    @Override // ke1.b
    public he1.k b(he1.f command) {
        kotlin.jvm.internal.o.g(command, "command");
        java.lang.String str = command.f280870g;
        java.lang.String str2 = command.f280867d;
        java.lang.String str3 = command.f280866c;
        try {
            b8.c cVar = this.f306926a;
            if (cVar == null) {
                return new he1.i(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID, "OPPO wallet service not available");
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("issuerID", str3);
            hashMap.put("orderNo", str2);
            hashMap.put("operation", str);
            hashMap.put("signData", command.f280868e);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TransitCard.OppoVendor", "issueCard, issuerID=" + str3 + ", orderNo=" + str2 + ", operation=" + str);
            java.lang.String g17 = ((b8.a) cVar).g(hashMap);
            he1.k m17 = m(g17);
            if (m17 instanceof he1.j) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TransitCard.OppoVendor", "issueCard success, querying cardNo via queryTransitCardInfo");
                he1.k n17 = n(cVar, str3);
                if (n17 instanceof he1.j) {
                    kotlin.jvm.internal.o.d(g17);
                    return k(g17, ((he1.j) n17).f280884a);
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.TransitCard.OppoVendor", "issueCard success but queryCardNo failed: " + n17);
            }
            return m17;
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.OppoVendor", "issueCard RemoteException: " + e17.getMessage());
            return new he1.i(10013, "issueCard RemoteException: " + e17.getMessage());
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.OppoVendor", "issueCard error: " + e18.getMessage());
            return new he1.i(10007, "issueCard failed: " + e18.getMessage());
        }
    }

    @Override // ke1.b
    public he1.k c(he1.a command) {
        kotlin.jvm.internal.o.g(command, "command");
        java.lang.String str = command.f280856c;
        try {
            b8.c cVar = this.f306926a;
            if (cVar == null) {
                return new he1.i(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID, "OPPO wallet service not available");
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("issuerID", str);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TransitCard.OppoVendor", "checkIssueConditions, issuerID=" + str);
            return m(((b8.a) cVar).d(hashMap));
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.OppoVendor", "checkIssueConditions RemoteException: " + e17.getMessage());
            return new he1.i(10013, "checkIssueConditions RemoteException: " + e17.getMessage());
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.OppoVendor", "checkIssueConditions error: " + e18.getMessage());
            return new he1.i(10014, "checkIssueConditions failed: " + e18.getMessage());
        }
    }

    @Override // ke1.b
    public he1.k d() {
        try {
            b8.c cVar = this.f306926a;
            if (cVar == null) {
                return new he1.i(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID, "OPPO wallet service not available");
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TransitCard.OppoVendor", "queryCplc");
            return m(((b8.a) cVar).j());
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.OppoVendor", "queryCplc RemoteException: " + e17.getMessage());
            return new he1.i(10013, "queryCplc RemoteException: " + e17.getMessage());
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.OppoVendor", "queryCplc error: " + e18.getMessage());
            return new he1.i(10014, "queryCplc failed: " + e18.getMessage());
        }
    }

    @Override // ke1.b
    public he1.k e(he1.g command) {
        kotlin.jvm.internal.o.g(command, "command");
        java.lang.String str = command.f280878g;
        java.lang.String str2 = command.f280875d;
        java.lang.String str3 = command.f280874c;
        try {
            b8.c cVar = this.f306926a;
            if (cVar == null) {
                return new he1.i(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID, "OPPO wallet service not available");
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("issuerID", str3);
            hashMap.put("orderNo", str2);
            hashMap.put("operation", str);
            hashMap.put("signData", command.f280876e);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TransitCard.OppoVendor", "recharge, issuerID=" + str3 + ", orderNo=" + str2 + ", operation=" + str);
            return m(((b8.a) cVar).p(hashMap));
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.OppoVendor", "recharge RemoteException: " + e17.getMessage());
            return new he1.i(10013, "recharge RemoteException: " + e17.getMessage());
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.OppoVendor", "recharge error: " + e18.getMessage());
            return new he1.i(10008, "recharge failed: " + e18.getMessage());
        }
    }

    @Override // ke1.b
    public he1.k f(he1.b command) {
        kotlin.jvm.internal.o.g(command, "command");
        java.lang.String str = command.f280862g;
        java.lang.String str2 = command.f280858c;
        try {
            b8.c cVar = this.f306926a;
            if (cVar == null) {
                return new he1.i(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID, "OPPO wallet service not available");
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("issuerID", str2);
            hashMap.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, command.f280861f);
            hashMap.put("signData", command.f280860e);
            hashMap.put("spID", "1542810206");
            if (str.length() > 0) {
                hashMap.put("refundAccountNumber", str);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TransitCard.OppoVendor", "deleteCard, issuerID=" + str2);
            return m(((b8.a) cVar).e(hashMap));
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.OppoVendor", "deleteCard RemoteException: " + e17.getMessage());
            return new he1.i(10013, "deleteCard RemoteException: " + e17.getMessage());
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.OppoVendor", "deleteCard error: " + e18.getMessage());
            return new he1.i(10009, "deleteCard failed: " + e18.getMessage());
        }
    }

    @Override // ke1.b
    public he1.k g(he1.d command) {
        kotlin.jvm.internal.o.g(command, "command");
        java.lang.String str = command.f280864c;
        try {
            b8.c cVar = this.f306926a;
            if (cVar == null) {
                return new he1.i(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID, "OPPO wallet service not available");
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("issuerID", str);
            java.util.Set X0 = kz5.n0.X0(command.f280865d);
            boolean contains = X0.contains("cardNo");
            hashMap.put("readCardNo", java.lang.String.valueOf(contains));
            hashMap.put("readLogicCardNo", java.lang.String.valueOf(contains));
            hashMap.put("readBalance", java.lang.String.valueOf(X0.contains("balance")));
            hashMap.put("readValidateDate", java.lang.String.valueOf(X0.contains("validateDate")));
            hashMap.put("readRecords", java.lang.String.valueOf(X0.contains("transactionRecords")));
            hashMap.put("readActivateStatus", "true");
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TransitCard.OppoVendor", "queryCardInfo, issuerID=" + str + ", fields=" + X0);
            he1.k m17 = m(((b8.a) cVar).l(hashMap));
            return m17 instanceof he1.j ? new he1.j(j(((he1.j) m17).f280884a)) : m17;
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.OppoVendor", "queryCardInfo RemoteException: " + e17.getMessage());
            return new he1.i(10013, "queryCardInfo RemoteException: " + e17.getMessage());
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.OppoVendor", "queryCardInfo error: " + e18.getMessage());
            return new he1.i(10014, "queryCardInfo failed: " + e18.getMessage());
        }
    }

    @Override // ke1.b
    public void h(android.os.IBinder binder) {
        kotlin.jvm.internal.o.g(binder, "binder");
        int i17 = b8.b.f18239d;
        android.os.IInterface queryLocalInterface = binder.queryLocalInterface("com.finshell.wallet.nfc.transit.IPostPayOpenService");
        this.f306926a = (queryLocalInterface == null || !(queryLocalInterface instanceof b8.c)) ? new b8.a(binder) : (b8.c) queryLocalInterface;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TransitCard.OppoVendor", "init, binder: " + binder);
    }

    @Override // ke1.b
    public java.lang.String i() {
        return "OPPO";
    }

    public final java.lang.String j(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            java.lang.Object opt = jSONObject.opt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
            if (opt != null) {
                jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, opt);
            }
            java.lang.String jSONObject3 = jSONObject2.toString();
            kotlin.jvm.internal.o.d(jSONObject3);
            return jSONObject3;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.OppoVendor", "extractDataField error: " + e17.getMessage());
            return str;
        }
    }

    public final he1.k k(java.lang.String str, java.lang.String str2) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = new org.json.JSONObject(str2).optString("cardNo", "");
            jSONObject.put("cardNo", optString);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TransitCard.OppoVendor", "mergeIssueResultWithCardNo success, cardNo=" + optString);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            return new he1.j(jSONObject2);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.OppoVendor", "mergeIssueResultWithCardNo error: " + e17.getMessage());
            return new he1.j(str);
        }
    }

    public final java.lang.String l(java.lang.String str) {
        try {
            org.json.JSONObject optJSONObject = new org.json.JSONObject(str).optJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
            org.json.JSONArray optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray("cards") : null;
            if (optJSONArray == null) {
                optJSONArray = new org.json.JSONArray();
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, optJSONArray);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TransitCard.OppoVendor", "normalizeCardList, cards count=" + optJSONArray.length());
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.d(jSONObject2);
            return jSONObject2;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.OppoVendor", "normalizeCardList error: " + e17.getMessage());
            return str;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final he1.k m(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ke1.c.m(java.lang.String):he1.k");
    }

    public final he1.k n(b8.c cVar, java.lang.String str) {
        he1.i iVar;
        try {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("issuerID", str);
            hashMap.put("readCardNo", "true");
            hashMap.put("readLogicCardNo", "true");
            hashMap.put("readBalance", "false");
            hashMap.put("readRecords", "false");
            hashMap.put("readActivateStatus", "false");
            hashMap.put("readValidateDate", "false");
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TransitCard.OppoVendor", "queryCardNoAfterIssue, issuerID=" + str);
            return m(((b8.a) cVar).l(hashMap));
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.OppoVendor", "queryCardNoAfterIssue RemoteException: " + e17.getMessage());
            iVar = new he1.i(10013, "queryCardNoAfterIssue RemoteException: " + e17.getMessage());
            return iVar;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.OppoVendor", "queryCardNoAfterIssue error: " + e18.getMessage());
            iVar = new he1.i(10014, "queryCardNoAfterIssue failed: " + e18.getMessage());
            return iVar;
        }
    }

    @Override // ke1.b
    public void release() {
        this.f306926a = null;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TransitCard.OppoVendor", "release");
    }
}
