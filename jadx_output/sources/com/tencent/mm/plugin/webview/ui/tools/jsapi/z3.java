package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class z3 extends com.tencent.mm.plugin.webview.ui.tools.jsapi.p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185581b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.JsapiPermissionWrapper f185582c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o45.m f185583d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185584e;

    public z3(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, nw4.y2 y2Var, com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper, o45.m mVar) {
        this.f185584e = c1Var;
        this.f185581b = y2Var;
        this.f185582c = jsapiPermissionWrapper;
        this.f185583d = mVar;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.jsapi.n
    public void b(com.tencent.mm.plugin.webview.ui.tools.jsapi.m mVar, java.lang.String str, java.util.LinkedList linkedList, int i17, int i18) {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.m mVar2;
        int i19;
        int i27;
        nw4.y2 y2Var = this.f185581b;
        ((java.util.HashMap) y2Var.c()).put("baseErrorCode", java.lang.Integer.valueOf(i17));
        ((java.util.HashMap) y2Var.c()).put("jsapiErrorCode", java.lang.Integer.valueOf(i18));
        java.lang.String str2 = y2Var.f341019i;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185584e;
        boolean O6 = c1Var.O6(str2);
        com.tencent.mm.plugin.webview.ui.tools.jsapi.m mVar3 = com.tencent.mm.plugin.webview.ui.tools.jsapi.m.RET_OK;
        if (O6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "current jsapi(%s) invoked is came from menu event.(original retCode : %s)", y2Var.f341019i, mVar);
            mVar2 = mVar3;
        } else {
            mVar2 = mVar;
        }
        i19 = c1Var.B;
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "onJSVerifyEnd, put webviewID = %d, %s, %d", java.lang.Integer.valueOf(i19), y2Var.f341019i, java.lang.Integer.valueOf(mVar2.h()));
        java.util.Map map = y2Var.f340790a;
        i27 = c1Var.B;
        ((java.util.HashMap) map).put("webview_instance_id", java.lang.Integer.valueOf(i27));
        boolean z17 = false;
        if (mVar2 != mVar3) {
            com.tencent.mm.plugin.webview.ui.tools.jsapi.m mVar4 = com.tencent.mm.plugin.webview.ui.tools.jsapi.m.RET_ACCESS_DENIED;
            o45.m mVar5 = this.f185583d;
            if (mVar2 == mVar4) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MsgHandler", "handleMsg access denied %s", mVar5.b());
                if (y2Var.f341019i.equalsIgnoreCase("getBrandWCPayRequest")) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(157L, 1L, 1L, false);
                }
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.A3(c1Var, y2Var);
                c1Var.i5(y2Var, "system:access_denied", null);
                c(true);
            } else if (mVar2 == com.tencent.mm.plugin.webview.ui.tools.jsapi.m.RET_REJECT) {
                c1Var.i5(y2Var, mVar5.a() + ":" + str, null);
                c(true);
            } else {
                if (com.tencent.mm.sdk.platformtools.t8.K0(mVar5.a())) {
                    c1Var.f184993v = false;
                    c(false);
                    c1Var.Q6(y2Var, false);
                    return;
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    c1Var.i5(y2Var, mVar5.a() + ":fail", null);
                } else {
                    c1Var.i5(y2Var, mVar5.a() + ":fail_" + str, null);
                }
                c(true);
            }
        } else {
            if (xw4.a.a(y2Var, c1Var)) {
                c(true);
                return;
            }
            boolean equals = y2Var.f341019i.equals("sendAppMessage");
            com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper = this.f185582c;
            if (equals) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.n3(c1Var, y2Var, jsapiPermissionWrapper, false);
                c(true);
            } else if (y2Var.f341019i.equals("sendAppMessagePrivate")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.n3(c1Var, y2Var, jsapiPermissionWrapper, true);
                c(true);
            } else if (y2Var.f341019i.equals(com.google.android.gms.common.Scopes.PROFILE)) {
                c(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.R3(c1Var, y2Var, jsapiPermissionWrapper));
            } else if (y2Var.f341019i.equals("shareWeibo")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.c4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equals(com.tencent.mm.plugin.appbrand.jsapi.share.g1.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.n4(c1Var, y2Var, jsapiPermissionWrapper, false);
                c(true);
            } else if (y2Var.f341019i.equals("shareTimelinePrivate")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.n4(c1Var, y2Var, jsapiPermissionWrapper, true);
                c(true);
            } else if (y2Var.f341019i.equals("updateTimelineShareData")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.y4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equals("updateAppMessageShareData")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.J4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equals(com.tencent.mm.plugin.appbrand.jsapi.z1.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.U4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equals("streamingVideoPlay")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.a(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equals("addContact")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.l(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equals("getWidgetCaptureImgUrl")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.w(c1Var, y2Var, jsapiPermissionWrapper);
                c(false);
            } else if (y2Var.f341019i.equals("imagePreview")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.H(c1Var, y2Var, jsapiPermissionWrapper);
                c(false);
            } else if (y2Var.f341019i.equals("hideOptionMenu")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.S(c1Var);
                c(false);
            } else if (y2Var.f341019i.equals("showOptionMenu")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.d0(c1Var);
                c(false);
            } else if (y2Var.f341019i.equals("closeWindow")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.o0(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equals(com.tencent.mm.plugin.appbrand.jsapi.appdownload.g0.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.z0(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equals("scanQRCode")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.K0(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equals("jumpToInstallUrl")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.V0(c1Var, y2Var, jsapiPermissionWrapper);
                c(false);
            } else if (y2Var.f341019i.equalsIgnoreCase("getBrandWCPayRequest")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.h1(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase(yc1.f0.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.s1(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("wcpaySecurityCrosscutBack")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.D1(c1Var, y2Var, jsapiPermissionWrapper);
                c(false);
            } else if (y2Var.f341019i.equalsIgnoreCase("editAddress")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.O1(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("getLatestAddress")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.Z1(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("getHeadingAndPitch")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.k2(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("sendEmail")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.v2(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase(com.tencent.mm.plugin.appbrand.jsapi.appdownload.q.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.G2(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("addDownloadApp")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.R2(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase(com.tencent.mm.plugin.appbrand.jsapi.appdownload.x.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.c3(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase(com.tencent.mm.plugin.appbrand.jsapi.appdownload.h1.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.o3(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase(com.tencent.mm.plugin.appbrand.jsapi.pc.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.z3(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase(com.tencent.mm.plugin.appbrand.jsapi.appdownload.l1.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.E3(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase(com.tencent.mm.plugin.appbrand.jsapi.appdownload.m0.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.G3(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("openSpecificView")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.H3(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("launch3rdApp")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.K3(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("jumpWCMall")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.M3(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase(com.tencent.mm.plugin.appbrand.jsapi.cf.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.O3(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("openProductView")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.P3(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("openProductViewWithPid")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.Q3(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("getBrandWCPayBindCardRequest")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.S3(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("geoLocation")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.T3(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("jumpToBizProfile")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.U3(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase(com.tencent.mm.plugin.appbrand.jsapi.lbs.g0.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.V3(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("timelineCheckIn")) {
                c(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.W3(c1Var, y2Var, jsapiPermissionWrapper));
            } else if (y2Var.f341019i.equalsIgnoreCase("getBrandWCPayCreateCreditCardRequest")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.X3(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("sendServiceAppMessage")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.Y3(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("mmsf0001")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.Z3(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("musicPlay")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.a4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("getTransferMoneyRequest")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.b4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase(com.tencent.mm.plugin.appbrand.jsapi.pay.m0.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.d4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("chooseCard")) {
                c(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.e4(c1Var, y2Var, jsapiPermissionWrapper));
            } else if (y2Var.f341019i.equalsIgnoreCase(com.tencent.mm.plugin.appbrand.jsapi.s4.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.f4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("batchAddCard")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.g4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("setCloseWindowConfirmDialogInfo")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.h4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("preVerifyJSAPI")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.i4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase(com.tencent.mm.plugin.appbrand.jsapi.audio.d3.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.j4(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase(com.tencent.mm.plugin.appbrand.jsapi.audio.l3.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.k4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase(com.tencent.mm.plugin.appbrand.jsapi.audio.v2.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.l4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase(com.tencent.mm.plugin.appbrand.jsapi.audio.y1.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.m4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase(com.tencent.mm.plugin.appbrand.jsapi.audio.h3.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.o4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("uploadVoice")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.p4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("downloadVoice")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.q4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase(com.tencent.mm.plugin.appbrand.jsapi.media.e3.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.r4(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("uploadImage")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.s4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("downloadImage")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.t4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("hideMenuItems")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.u4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("showMenuItems")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.v4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("hideAllNonBaseMenuItem")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.w4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("showAllNonBaseMenuItem")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.x4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("checkJsApi")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.z4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("translateVoice")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.A4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("shareQQ")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.B4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("shareWeiboApp")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.C4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("configWXDeviceWiFi")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.D4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("getCurrentSSID")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.E4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("getPaymentOrderRequest")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.F4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("verifyWCPayPassword")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.G4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("startMonitoringBeacons")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.H4(c1Var, y2Var, jsapiPermissionWrapper, new int[0]);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("stopMonitoringBeacons")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.I4(c1Var, y2Var, jsapiPermissionWrapper, new int[0]);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("getSendC2CMessageRequest")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.K4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("batchViewCard")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.L4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("setPageOwner")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.M4(c1Var, y2Var, jsapiPermissionWrapper);
                c(false);
            } else if (y2Var.f341019i.equalsIgnoreCase("getWechatVerifyTicket")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.N4(c1Var, y2Var, jsapiPermissionWrapper);
                c(false);
            } else if (y2Var.f341019i.equalsIgnoreCase("openWXDeviceLib")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.O4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("closeWXDeviceLib")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.P4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("startScanWXDevice")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.Q4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("stopScanWXDevice")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.R4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("connectWXDevice")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.S4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("disconnectWXDevice")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.T4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("getWXDeviceTicket")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.V4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("getWXDeviceInfos")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.W4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("sendDataToWXDevice")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.X4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("setSendDataDirection")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.Y4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("openGameDetail")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.Z4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("openGameCenter")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.a5(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("setGameDebugConfig")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.b5(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("shareQZone")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.B4(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("startTempSession")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.c5(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("getRecevieBizHongBaoRequest")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.d5(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("openMyDeviceProfile")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.e5(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("selectPedometerSource")) {
                c1Var.P5(y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("getH5PrepayRequest")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.b(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("getH5TransactionRequest")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.c(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("jumpToWXWallet")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.d(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("nfcIsConnect")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.e(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("nfcConnect")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.f(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("nfcTransceive")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.g(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("nfcBatchTransceive")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.h(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("nfcGetId")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.i(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("nfcGetInfo")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.j(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("nfcCheckState")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.k(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("getSearchData")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.m(c1Var, y2Var, jsapiPermissionWrapper);
                c(false);
            } else if (y2Var.f341019i.equalsIgnoreCase("enterWeappContact")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.n(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("getFestivalLiveInfo")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.o(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("showWeDrawHomeView")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.p(c1Var, y2Var, jsapiPermissionWrapper);
                c(false);
            } else if (y2Var.f341019i.equalsIgnoreCase("getChatSearchData")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.q(c1Var, y2Var, jsapiPermissionWrapper);
                c(false);
            } else if (y2Var.f341019i.equalsIgnoreCase("getPoiInfo")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.r(c1Var, y2Var, jsapiPermissionWrapper);
                c(false);
            } else if (y2Var.f341019i.equalsIgnoreCase("updateReddotTimeStamps")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.s(c1Var, y2Var);
                c(false);
            } else if (y2Var.f341019i.equalsIgnoreCase("reloadSearchWAWidgetData")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.t(c1Var, y2Var, jsapiPermissionWrapper);
                c(false);
            } else if (y2Var.f341019i.equalsIgnoreCase("gotoEmoticonPad")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.u(c1Var, y2Var, jsapiPermissionWrapper);
                c(false);
            } else if (y2Var.f341019i.equalsIgnoreCase("querySimilarEmotion")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.v(c1Var, y2Var, jsapiPermissionWrapper);
                c(false);
            } else if (y2Var.f341019i.equalsIgnoreCase("openFinderFeed")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.x(c1Var, y2Var, jsapiPermissionWrapper);
                c(false);
            } else if (y2Var.f341019i.equalsIgnoreCase("getCurrentLocation")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.y(c1Var, y2Var, jsapiPermissionWrapper);
                c(false);
            } else if (y2Var.f341019i.equalsIgnoreCase("navControl")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.z(c1Var, y2Var, jsapiPermissionWrapper);
                c(false);
            } else if (y2Var.f341019i.equalsIgnoreCase("setInteractivePopGestureEnabled")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.A(c1Var, y2Var, jsapiPermissionWrapper);
                c(false);
            } else if (y2Var.f341019i.equalsIgnoreCase("showNavBarShadow")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.B(c1Var, y2Var, jsapiPermissionWrapper);
                c(false);
            } else if (y2Var.f341019i.equalsIgnoreCase("hideNavBarShadow")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.C(c1Var, y2Var, jsapiPermissionWrapper);
                c(false);
            } else if (y2Var.f341019i.equalsIgnoreCase(com.tencent.mm.plugin.appbrand.jsapi.finder.h0.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.D(c1Var, y2Var, jsapiPermissionWrapper);
                c(false);
            } else if (y2Var.f341019i.equalsIgnoreCase("playMusic")) {
                c1Var.N6(y2Var, jsapiPermissionWrapper);
                c(false);
            } else if (y2Var.f341019i.equalsIgnoreCase("openMusicPage")) {
                c1Var.L6(y2Var, jsapiPermissionWrapper);
                c(false);
            } else if (y2Var.f341019i.equalsIgnoreCase("getTeachSearchData")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.E(c1Var, y2Var, jsapiPermissionWrapper);
                c(false);
            } else if (y2Var.f341019i.equalsIgnoreCase("getSearchGuideData")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.F(c1Var, y2Var, jsapiPermissionWrapper);
                c(false);
            } else if (y2Var.f341019i.equalsIgnoreCase("getSearchAvatarList")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.G(c1Var, y2Var, jsapiPermissionWrapper);
                c(false);
            } else if (y2Var.f341019i.equalsIgnoreCase("getSearchSnsImageList")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.I(c1Var, y2Var, jsapiPermissionWrapper);
                c(false);
            } else if (y2Var.f341019i.equalsIgnoreCase("getSearchImageList")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.J(c1Var, y2Var, jsapiPermissionWrapper);
                c(false);
            } else if (y2Var.f341019i.equalsIgnoreCase("getSearchDisplayNameList")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.K(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("startSearchItemDetailPage")) {
                c(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.L(c1Var, y2Var, jsapiPermissionWrapper));
            } else if (y2Var.f341019i.equalsIgnoreCase("startCommonSearchItemDetailPage")) {
                c(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.M(c1Var, y2Var, jsapiPermissionWrapper));
            } else if (y2Var.f341019i.equalsIgnoreCase("reportSearchStatistics")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.N(c1Var, y2Var, jsapiPermissionWrapper);
                c(false);
            } else if (y2Var.f341019i.equalsIgnoreCase("reportSearchRealTimeStatistics")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.O(c1Var, y2Var, jsapiPermissionWrapper);
                c(false);
            } else if (y2Var.f341019i.equalsIgnoreCase("searchDataHasResult")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.P(c1Var, y2Var, jsapiPermissionWrapper);
                c(false);
            } else if (y2Var.f341019i.equalsIgnoreCase("getSearchSuggestionData")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.Q(c1Var, y2Var, jsapiPermissionWrapper);
                c(false);
            } else if (y2Var.f341019i.equalsIgnoreCase("openEmotionPage")) {
                c(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.R(c1Var, y2Var, jsapiPermissionWrapper));
            } else if (y2Var.f341019i.equalsIgnoreCase("setSearchInputWord")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.T(c1Var, y2Var, jsapiPermissionWrapper);
                c(false);
            } else if (y2Var.f341019i.equalsIgnoreCase("querySearchWeb")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.U(c1Var, y2Var, jsapiPermissionWrapper);
                c(false);
            } else if (y2Var.f341019i.equalsIgnoreCase("openWeAppPage")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.V(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("reportWeAppSearchRealtime")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.W(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("doSearchOperation")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.X(c1Var, y2Var, jsapiPermissionWrapper);
                c(false);
            } else if (y2Var.f341019i.equalsIgnoreCase("operateGameCenterMsg")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.Y(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("getWebPayCheckoutCounterRequst")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.Z(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("setSnsObjectXmlDescList")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.a0(c1Var, y2Var, jsapiPermissionWrapper);
                c(false);
            } else if (y2Var.f341019i.equalsIgnoreCase("clickSnsMusicPlayButton")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.b0(c1Var, y2Var, jsapiPermissionWrapper);
                c(false);
            } else if (y2Var.f341019i.equalsIgnoreCase("addCustomMenuItems")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.c0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("openEnterpriseChat")) {
                c(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.e0(c1Var, y2Var));
            } else if (y2Var.f341019i.equalsIgnoreCase("openEnterpriseContact")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.f0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("selectEnterpriseContact")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.g0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("sendEnterpriseChat")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.h0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("enterEnterpriseChat")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.i0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("getEnterpriseChat")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.j0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("reportActionInfo")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.k0(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("showSearchOfBizHistory")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.l0(c1Var, y2Var, jsapiPermissionWrapper);
                c(false);
            } else if (y2Var.f341019i.equalsIgnoreCase("changePayActivityView")) {
                c(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.m0(c1Var, y2Var));
            } else if (y2Var.f341019i.equalsIgnoreCase("scanLicence")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.n0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("openWeApp")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.p0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("openECard")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.q0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("sendDataToMiniProgram")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.r0(c1Var, y2Var);
                c(false);
            } else if (y2Var.f341019i.equalsIgnoreCase("preloadMiniProgramContacts")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.s0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("getFinderLivePreviewUrl")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.t0(c1Var, y2Var, jsapiPermissionWrapper);
                c(false);
            } else if (y2Var.f341019i.equalsIgnoreCase("getFinderLivePreviewMicCover")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.u0(c1Var, y2Var, jsapiPermissionWrapper);
                c(false);
            } else if (y2Var.f341019i.equalsIgnoreCase("enablePullDownRefresh")) {
                c1Var.D5(y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase(nd1.f2.NAME)) {
                c1Var.W5(y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase(nd1.g2.NAME)) {
                c1Var.Y5(y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("disablePullDownRefresh")) {
                c1Var.C5();
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("disableBounceScroll")) {
                c1Var.B5(y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("clearBounceBackground")) {
                c1Var.z5(y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase(hc1.i.NAME)) {
                c1Var.V5(y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("openMapNavigateMenu")) {
                c1Var.L5(y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("enableFullScreen")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.v0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("setStatusBarStyle")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.w0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("forceUpdateWxaAttr")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.x0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase(com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.l.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.y0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("openFinderProduct")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.A0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase(com.tencent.mm.plugin.appbrand.jsapi.fakenative.h.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.B0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("reportIDKey")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.C0(c1Var, y2Var);
                c(false);
            } else if (y2Var.f341019i.equalsIgnoreCase("quicklyAddBrandContact")) {
                c(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.D0(c1Var, y2Var));
            } else if (y2Var.f341019i.equalsIgnoreCase("consumedShareCard")) {
                c(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.E0(c1Var, y2Var));
            } else if (y2Var.f341019i.equalsIgnoreCase(vd1.h.NAME)) {
                c1Var.H5(y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("realtimeReport")) {
                c1Var.N5(y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("getLocalData")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.F0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("setLocalData")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.G0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("clearLocalData")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.H0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("selectSingleContact")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.I0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("sendAppMessageToSpecifiedContact")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.J0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("deleteAccountSuccess")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.L0(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("chooseVideo")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.M0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("uploadVideo")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.N0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("openDesignerEmojiView")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.O0(c1Var, y2Var, false);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase(com.tencent.mm.plugin.appbrand.jsapi.emoji.m.NAME)) {
                c(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.P0(c1Var, y2Var, false));
            } else if (y2Var.f341019i.equalsIgnoreCase("openEmoticonTopicList")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.Q0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("openDesignerEmojiViewLocal")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.O0(c1Var, y2Var, true);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("openDesignerProfileLocal")) {
                c(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.P0(c1Var, y2Var, true));
            } else if (y2Var.f341019i.equalsIgnoreCase("openEmotionDetailViewLocal")) {
                c(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.R0(c1Var, y2Var, true));
            } else if (y2Var.f341019i.equalsIgnoreCase("openNewPage")) {
                c(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.S0(c1Var, y2Var));
            } else if (y2Var.f341019i.equalsIgnoreCase("getSearchEmotionData")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.T0(c1Var, y2Var);
                c(false);
            } else if (y2Var.f341019i.equalsIgnoreCase("openEmotionUrl")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.U0(c1Var, y2Var);
                c(false);
            } else if (y2Var.f341019i.equals("getWCPayRealnameVerify")) {
                c1Var.b6(y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("selectWalletCurrency")) {
                c1Var.Z5(y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase(com.tencent.mm.plugin.appbrand.jsapi.audio.e1.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.W0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase(com.tencent.mm.plugin.appbrand.jsapi.audio.g0.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.X0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("clearWebviewCache")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.Y0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("requireSoterBiometricAuthentication")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.Z0(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equals("getSupportSoter")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.a1(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equals("unbindBankCard")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.b1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("setBounceBackground")) {
                c1Var.S5(y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("doExposePreparation")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.c1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("getMsgProofItems")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.d1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("uploadMediaFile")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.e1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("openSecurityView")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.f1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("getOpenDeviceId")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.i1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase("getRouteUrl")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.j1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("idCardRealnameVerify")) {
                c1Var.G5(y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("uploadIdCardSuccess")) {
                c1Var.a6(y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("openCamera")) {
                c(c1Var.J5(y2Var));
            } else if (y2Var.f341019i.equals("getGameCommInfo")) {
                c1Var.F5(y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("openGameRegion")) {
                c1Var.K5(y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("chooseIdCard")) {
                c1Var.u5(y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("openLuckyMoneyDetailView")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.k1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("resendRemittanceMsg")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.l1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("recordVideo")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.m1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("previewVideo")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.n1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("uploadEncryptMediaFile")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.o1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("openCustomWebview")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.p1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals(com.tencent.mm.plugin.appbrand.jsapi.media.z3.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.q1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("openLuckyMoneyHistory")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.r1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("requestWxFacePictureVerify")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.t1(c1Var, y2Var, false);
                c(true);
            } else if (y2Var.f341019i.equals("getWePkgAuthResult")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.u1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("getLocalWePkgInfo")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.v1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("openGameWebView")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.w1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("launchApplication")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.x1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("login") || y2Var.f341019i.equals(com.tencent.mm.plugin.appbrand.jsapi.auth.o1.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.y1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("requestWxFacePictureVerifyUnionVideo")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.t1(c1Var, y2Var, true);
                c(true);
            } else if (y2Var.f341019i.equals("checkIsSupportFaceDetect")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.z1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals(com.tencent.mm.plugin.appbrand.jsapi.audio.p0.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.A1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals(com.tencent.mm.plugin.appbrand.jsapi.audio.e2.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.B1(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equals(com.tencent.mm.plugin.appbrand.jsapi.audio.e0.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.C1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("setBackgroundAudioStateMV")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.E1(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equals(com.tencent.mm.plugin.appbrand.jsapi.audio.i0.NAME)) {
                c(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.F1(c1Var, y2Var));
            } else if (y2Var.f341019i.equals("setTingAudioState")) {
                c(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.G1(c1Var, y2Var));
            } else if (y2Var.f341019i.equals(com.tencent.mm.plugin.appbrand.jsapi.audio.u1.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.H1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equalsIgnoreCase(com.tencent.mm.plugin.appbrand.jsapi.appdownload.v.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.I1(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equals("setScreenOrientation")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.J1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("addToEmoticon")) {
                c(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.K1(c1Var, y2Var));
            } else if (y2Var.f341019i.equals("shareEmoticon")) {
                c(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.L1(c1Var, y2Var));
            } else if (y2Var.f341019i.equals("requestWxFaceRegisterInternal")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.M1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("requestWxFaceVerifyInternal")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.N1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals(com.tencent.mm.plugin.appbrand.jsapi.advertise.r.NAME)) {
                c(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.P1(c1Var, y2Var, 0));
            } else if (y2Var.f341019i.equals("openSearchCanvas")) {
                c(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.P1(c1Var, y2Var, 1));
            } else if (y2Var.f341019i.equals("opVoteAdData")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.Q1(c1Var, y2Var);
                c(false);
            } else if (y2Var.f341019i.equals("opJumpView")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.R1(c1Var, y2Var);
                c(false);
            } else if (y2Var.f341019i.equals("opAdH5Func")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.S1(c1Var, y2Var);
                c(false);
            } else if (y2Var.f341019i.equals("selectContact")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.T1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals(com.tencent.mm.plugin.appbrand.jsapi.z7.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.U1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("setWCPayPassword")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.V1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals(com.tencent.mm.plugin.appbrand.jsapi.u4.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.W1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("showSearchActionSheet")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.X1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("cancelSearchActionSheet")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.Y1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("showSearchToast")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.a2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("showSearchLoading")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.b2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("hideSearchLoading")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.c2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("updateWASearchTemplate")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.d2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("preloadSearchWeapp")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.e2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("uxSearchOpLog")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.f2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("openSearchWAWidgetLogView")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.g2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("openBizChat")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.h2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("tapSearchWAWidgetView")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.i2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("getMatchContactList")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.j2(c1Var, y2Var);
                c(false);
            } else if (y2Var.f341019i.equals("openSearchWebView")) {
                c(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.l2(c1Var, y2Var));
            } else if (y2Var.f341019i.equalsIgnoreCase("openWXSearchPage")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.m2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("viewTypeChange")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.n2(c1Var, y2Var);
                c(false);
            } else if (y2Var.f341019i.equals("openGameUrlWithExtraWebView")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.o2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("requestWxVoicePrintVerifyInternal")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.p2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("closeWindowAndGoNext")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.q2(c1Var, y2Var, jsapiPermissionWrapper);
                c(true);
            } else if (y2Var.f341019i.equals(pf1.f.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.r2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("setGameData")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.s2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("getGameData")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.t2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("clearGameData")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.u2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("handleWCPayWalletBuffer")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.w2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("reportGamePageTime")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.x2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("insertVideoPlayer")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.y2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals(com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.m.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.z2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals(com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.l.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.A2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals(com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.h.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.B2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("getSearchHistory")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.C2(c1Var, y2Var);
                c(false);
            } else if (y2Var.f341019i.equals("deleteSearchHistory")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.D2(c1Var, y2Var);
                c(false);
            } else if (y2Var.f341019i.equals("doGoToRecVideoList") || y2Var.f341019i.equals("jumpWSRecVideoList")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.E2(c1Var, y2Var);
                c(false);
            } else if (y2Var.f341019i.equals("recordHistory")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.F2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals(com.tencent.mm.plugin.appbrand.jsapi.w9.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.H2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("openWCPayCardList")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.I2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("bindEmail")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.J2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("getSystemInfo")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.K2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("serviceClick")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.L2(c1Var, y2Var);
                c(false);
            } else if (y2Var.f341019i.equals(cb1.o0.NAME)) {
                c(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.M2(c1Var, y2Var));
            } else if (y2Var.f341019i.equals("sendSingleAppMessage")) {
                c(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.N2(c1Var, y2Var));
            } else if (y2Var.f341019i.equals("openWebSearchOutLinkItem")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.O2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("wcPrivacyPolicyResult")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.P2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("currentMpInfo")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.Q2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals(com.tencent.mm.plugin.appbrand.jsapi.bio.face.j.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.S2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("jumpDownloaderWidget")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.T2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("batchUpdateWepkg")) {
                c(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.U2(c1Var, y2Var));
            } else if (y2Var.f341019i.equals("privateOpenWeappFunctionalPage")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.V2(c1Var, y2Var);
                c(false);
            } else if (y2Var.f341019i.equals("privateCommonApi")) {
                c(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.W2(c1Var, y2Var));
            } else if (y2Var.f341019i.equals("internelWxFaceVerify")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.X2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("openWebViewUseFastLoad")) {
                c(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.Y2(c1Var, y2Var));
            } else if (y2Var.f341019i.equals("handleHaokanAction")) {
                c(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.Z2(c1Var, y2Var));
            } else if (y2Var.f341019i.equals(com.tencent.mm.plugin.appbrand.jsapi.pay.p1.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.a3(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals(com.tencent.mm.plugin.appbrand.jsapi.pay.g0.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.b3(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals(com.tencent.mm.plugin.appbrand.jsapi.pay.h1.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.d3(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals(be1.a1.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.e3(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals(com.tencent.mm.plugin.appbrand.jsapi.wccoin.q.NAME)) {
                c(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.f3(c1Var, y2Var));
            } else if (y2Var.f341019i.equals(com.tencent.mm.plugin.appbrand.jsapi.wccoin.s.NAME)) {
                c(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.g3(c1Var, y2Var));
            } else if (y2Var.f341019i.equals(com.tencent.mm.plugin.appbrand.jsapi.wccoin.y.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.h3(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals(com.tencent.mm.plugin.appbrand.jsapi.wccoin.u.NAME)) {
                c(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.i3(c1Var, y2Var));
            } else if (y2Var.f341019i.equals("getCCData")) {
                c(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.j3(c1Var, y2Var));
            } else if (y2Var.f341019i.equals("calRqt")) {
                c(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.k3(c1Var, y2Var));
            } else if (y2Var.f341019i.equals("addGameDownloadTask")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.l3(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("reportGameWeb")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.m3(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("getDownloadWidgetTaskInfos")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.p3(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("chooseHaowanMedia")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.q3(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("queryHaowanPublish")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.r3(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("publishHaowanEdition")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.s3(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("cancelHaowanPublish")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.t3(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("launchGameVideoEditor")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.u3(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals(com.tencent.mm.plugin.appbrand.jsapi.c6.NAME)) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.v3(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("qqMailLoginResult")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.w3(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("requestOverlayPermission")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.x3(c1Var, y2Var);
                c(true);
            } else if (y2Var.f341019i.equals("getWAServiceVoipRecordLocalId")) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.y3(c1Var, y2Var);
                c(true);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.MsgHandler", "unknown function = " + y2Var.f341019i);
                c1Var.i5(y2Var, "system:function_not_exist", null);
                c(true);
            }
            z17 = true;
        }
        java.lang.Object obj = ((java.util.HashMap) y2Var.c()).get("Internal@AsyncReport");
        if (obj == null || !(obj instanceof java.lang.Boolean) || !((java.lang.Boolean) obj).booleanValue()) {
            c1Var.Q6(y2Var, z17);
        }
        if (z17) {
            return;
        }
        c1Var.a7(y2Var, 1, mVar2.h());
    }
}
