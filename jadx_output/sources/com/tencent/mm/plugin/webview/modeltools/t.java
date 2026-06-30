package com.tencent.mm.plugin.webview.modeltools;

/* loaded from: classes15.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f183346a = null;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.modeltools.s f183347b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f183348c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f183349d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f183350e;

    public t() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f183348c = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ScanQRCodeOprationEvent>(a0Var) { // from class: com.tencent.mm.plugin.webview.modeltools.LicenceScanner$1
            {
                this.__eventId = 2058274619;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ScanQRCodeOprationEvent scanQRCodeOprationEvent) {
                com.tencent.mm.autogen.events.ScanQRCodeOprationEvent scanQRCodeOprationEvent2 = scanQRCodeOprationEvent;
                if (!(scanQRCodeOprationEvent2 instanceof com.tencent.mm.autogen.events.ScanQRCodeOprationEvent) || scanQRCodeOprationEvent2.f54734g.f8400a != 1) {
                    return false;
                }
                com.tencent.mm.plugin.webview.modeltools.t tVar = com.tencent.mm.plugin.webview.modeltools.t.this;
                java.lang.String str = tVar.f183346a;
                com.tencent.mm.plugin.webview.modeltools.s sVar = tVar.f183347b;
                if (sVar != null) {
                    sVar.b(str);
                }
                com.tencent.mm.plugin.webview.modeltools.t.a(tVar);
                return false;
            }
        };
        this.f183349d = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ScanBankCardConfirmResultEvent>(a0Var) { // from class: com.tencent.mm.plugin.webview.modeltools.LicenceScanner$2
            {
                this.__eventId = 582289590;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ScanBankCardConfirmResultEvent scanBankCardConfirmResultEvent) {
                com.tencent.mm.autogen.events.ScanBankCardConfirmResultEvent scanBankCardConfirmResultEvent2 = scanBankCardConfirmResultEvent;
                if (!(scanBankCardConfirmResultEvent2 instanceof com.tencent.mm.autogen.events.ScanBankCardConfirmResultEvent)) {
                    return false;
                }
                com.tencent.mm.plugin.webview.modeltools.t tVar = com.tencent.mm.plugin.webview.modeltools.t.this;
                if (!com.tencent.midas.api.APMidasPayAPI.PAY_CHANNEL_BANK.equals(tVar.f183346a)) {
                    return false;
                }
                am.ps psVar = scanBankCardConfirmResultEvent2.f54726g;
                int i17 = psVar.f7657b;
                if (i17 == 0) {
                    java.lang.String str = tVar.f183346a;
                    com.tencent.mm.plugin.webview.modeltools.s sVar = tVar.f183347b;
                    if (sVar != null) {
                        sVar.b(str);
                    }
                } else if (i17 == 1) {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(psVar.f7656a)) {
                        java.lang.String str2 = tVar.f183346a;
                        com.tencent.mm.plugin.webview.modeltools.s sVar2 = tVar.f183347b;
                        if (sVar2 != null) {
                            sVar2.a(str2);
                        }
                    } else {
                        try {
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            jSONObject.put("bankcard_number", scanBankCardConfirmResultEvent2.f54726g.f7656a);
                            java.lang.String str3 = tVar.f183346a;
                            com.tencent.mm.plugin.webview.modeltools.s sVar3 = tVar.f183347b;
                            if (sVar3 != null) {
                                sVar3.c(str3, jSONObject, null);
                            }
                        } catch (org.json.JSONException e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.LicenceScanner", "type = bankcard, add cardNum into json, exp = %s ", e17);
                            java.lang.String str4 = tVar.f183346a;
                            com.tencent.mm.plugin.webview.modeltools.s sVar4 = tVar.f183347b;
                            if (sVar4 != null) {
                                sVar4.a(str4);
                            }
                        }
                    }
                }
                com.tencent.mm.plugin.webview.modeltools.t.a(tVar);
                return false;
            }
        };
        this.f183350e = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ScanCardResultEvent>(a0Var) { // from class: com.tencent.mm.plugin.webview.modeltools.LicenceScanner$3
            {
                this.__eventId = 630715104;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ScanCardResultEvent scanCardResultEvent) {
                com.tencent.mm.autogen.events.ScanCardResultEvent scanCardResultEvent2 = scanCardResultEvent;
                if (!(scanCardResultEvent2 instanceof com.tencent.mm.autogen.events.ScanCardResultEvent)) {
                    return false;
                }
                com.tencent.mm.plugin.webview.modeltools.t tVar = com.tencent.mm.plugin.webview.modeltools.t.this;
                if (!tVar.f183346a.equalsIgnoreCase(scanCardResultEvent2.f54728g.f7837a)) {
                    return false;
                }
                am.rs rsVar = scanCardResultEvent2.f54728g;
                int i17 = rsVar.f7838b;
                if (i17 == 0) {
                    java.lang.String str = tVar.f183346a;
                    com.tencent.mm.plugin.webview.modeltools.s sVar = tVar.f183347b;
                    if (sVar != null) {
                        sVar.a(str);
                    }
                } else if (i17 == 2) {
                    java.lang.String str2 = tVar.f183346a;
                    com.tencent.mm.plugin.webview.modeltools.s sVar2 = tVar.f183347b;
                    if (sVar2 != null) {
                        sVar2.b(str2);
                    }
                } else {
                    try {
                        if (com.tencent.mm.sdk.platformtools.t8.K0(null)) {
                            java.lang.String str3 = tVar.f183346a;
                            android.graphics.Bitmap bitmap = rsVar.f7839c;
                            com.tencent.mm.plugin.webview.modeltools.s sVar3 = tVar.f183347b;
                            if (sVar3 != null) {
                                sVar3.c(str3, null, bitmap);
                            }
                        } else {
                            org.json.JSONObject jSONObject = new org.json.JSONObject((java.lang.String) null);
                            java.lang.String str4 = tVar.f183346a;
                            android.graphics.Bitmap bitmap2 = rsVar.f7839c;
                            com.tencent.mm.plugin.webview.modeltools.s sVar4 = tVar.f183347b;
                            if (sVar4 != null) {
                                sVar4.c(str4, jSONObject, bitmap2);
                            }
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.LicenceScanner", "Failed to parse json string: %s", e17.getMessage());
                        java.lang.String str5 = tVar.f183346a;
                        com.tencent.mm.plugin.webview.modeltools.s sVar5 = tVar.f183347b;
                        if (sVar5 != null) {
                            sVar5.a(str5);
                        }
                    }
                }
                com.tencent.mm.plugin.webview.modeltools.t.a(tVar);
                return false;
            }
        };
    }

    public static void a(com.tencent.mm.plugin.webview.modeltools.t tVar) {
        tVar.f183347b = null;
        tVar.f183348c.dead();
        tVar.f183349d.dead();
        tVar.f183350e.dead();
    }

    public boolean b(java.lang.String str, android.content.Context context, com.tencent.mm.plugin.webview.modeltools.s sVar) {
        boolean equalsIgnoreCase = com.tencent.midas.api.APMidasPayAPI.PAY_CHANNEL_BANK.equalsIgnoreCase(str);
        com.tencent.mm.sdk.event.IListener iListener = this.f183348c;
        if (equalsIgnoreCase) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("BaseScanUI_select_scan_mode", 7);
            intent.putExtra("scan_bankcard_with_confirm_ui", true);
            intent.addFlags(268435456);
            j45.l.j(context, "scanner", ".ui.ScanCardUI", intent, null);
            this.f183347b = sVar;
            this.f183346a = com.tencent.midas.api.APMidasPayAPI.PAY_CHANNEL_BANK;
            iListener.alive();
            this.f183349d.alive();
            return true;
        }
        if (!"identity_pay_auth".equalsIgnoreCase(str)) {
            return false;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("BaseScanUI_select_scan_mode", 11);
        j45.l.j(context, "scanner", ".ui.ScanCardUI", intent2, null);
        this.f183347b = sVar;
        this.f183346a = "identity_pay_auth";
        iListener.alive();
        this.f183350e.alive();
        return true;
    }
}
