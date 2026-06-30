package su1;

/* loaded from: classes13.dex */
public final class k implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ su1.l f412731d;

    public k(su1.l lVar) {
        this.f412731d = lVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public final void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r45.o82 o82Var;
        cl0.g gVar;
        int intValue;
        int intValue2;
        java.lang.String optString;
        int i19;
        int i27;
        float f17;
        float f18;
        kotlin.jvm.internal.o.e(m1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.cast.netscene.NetSceneGetScreenCastAuthorization");
        r45.pr1 pr1Var = ((uu1.a) m1Var).f431265e;
        if (pr1Var == null || (o82Var = (r45.o82) pr1Var.getCustom(2)) == null) {
            return;
        }
        if (nu1.n.f340170e == null) {
            nu1.n.f340170e = new tu1.o();
        }
        tu1.o oVar = nu1.n.f340170e;
        if (oVar != null) {
            java.lang.String string = o82Var.getString(0);
            this.f412731d.getClass();
            com.tencent.mars.xlog.Log.i("ScanQrcodeLiveAuthorizationEventListner", "#getRemoteConfig jsonStr=" + string);
            pu1.b bVar = new pu1.b();
            if (string != null) {
                try {
                    gVar = new cl0.g(string);
                    bVar.f256314d = gVar.optInt("VideoBitRate") * 1000;
                    bVar.f358418o = java.lang.Integer.valueOf(gVar.optInt("port"));
                    java.lang.String optString2 = gVar.optString("CanvasDirection");
                    kotlin.jvm.internal.o.f(optString2, "optString(...)");
                    java.lang.Integer h17 = r26.h0.h(optString2);
                    if (h17 != null) {
                        bVar.f358421r = h17.intValue();
                    }
                    java.lang.String optString3 = gVar.optString("VideoSolution");
                    kotlin.jvm.internal.o.d(optString3);
                    java.util.List f07 = r26.n0.f0(optString3, new java.lang.String[]{"*"}, false, 0, 6, null);
                    java.lang.Integer h18 = r26.h0.h((java.lang.String) kz5.n0.X(f07));
                    intValue = h18 != null ? h18.intValue() : 0;
                    java.lang.Integer h19 = r26.h0.h((java.lang.String) kz5.n0.i0(f07));
                    intValue2 = h19 != null ? h19.intValue() : 0;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PluginCast", e17, "isScreenCastCode error", new java.lang.Object[0]);
                }
                if (intValue == 0 || intValue2 == 0) {
                    android.graphics.Point h27 = com.tencent.mm.ui.bk.h(com.tencent.mm.sdk.platformtools.x2.f193071a);
                    if (bVar.f358421r == 0) {
                        int i28 = h27.y;
                        bVar.f256313c = (h27.x / 16) * 16;
                        bVar.f256312b = (i28 / 16) * 16;
                        com.tencent.mars.xlog.Log.i("MicroMsg.PluginCast", "width is " + intValue + " and height is " + intValue2 + " and screen size is" + h27.x + " amd " + h27.y);
                    } else {
                        int i29 = h27.x;
                        bVar.f256313c = (h27.y / 16) * 16;
                        bVar.f256312b = (i29 / 16) * 16;
                    }
                } else {
                    android.graphics.Point h28 = com.tencent.mm.ui.bk.h(com.tencent.mm.sdk.platformtools.x2.f193071a);
                    if (intValue > intValue2) {
                        i27 = h28.x;
                        i19 = h28.y;
                        h28.x = i19;
                        h28.y = i27;
                        if (i19 > i27) {
                            f17 = intValue;
                            f18 = i27 / (i19 / f17);
                            com.tencent.mars.xlog.Log.i("MicroMsg.PluginCast", "width is " + intValue + " and height is " + intValue2 + " and screen size is" + h28.x + " amd " + h28.y + " and resule is " + f17 + " * " + f18);
                            bVar.f256313c = (((int) f18) / 16) * 16;
                            bVar.f256312b = (((int) f17) / 16) * 16;
                        }
                        float f19 = intValue;
                        float f27 = i19 * (i27 / f19);
                        f18 = f19;
                        f17 = f27;
                        com.tencent.mars.xlog.Log.i("MicroMsg.PluginCast", "width is " + intValue + " and height is " + intValue2 + " and screen size is" + h28.x + " amd " + h28.y + " and resule is " + f17 + " * " + f18);
                        bVar.f256313c = (((int) f18) / 16) * 16;
                        bVar.f256312b = (((int) f17) / 16) * 16;
                    } else {
                        i19 = h28.x;
                        i27 = h28.y;
                        if (i19 <= i27) {
                            f17 = intValue2;
                            f18 = i27 * (i19 / f17);
                            com.tencent.mars.xlog.Log.i("MicroMsg.PluginCast", "width is " + intValue + " and height is " + intValue2 + " and screen size is" + h28.x + " amd " + h28.y + " and resule is " + f17 + " * " + f18);
                            bVar.f256313c = (((int) f18) / 16) * 16;
                            bVar.f256312b = (((int) f17) / 16) * 16;
                        }
                        float f192 = intValue;
                        float f272 = i19 * (i27 / f192);
                        f18 = f192;
                        f17 = f272;
                        com.tencent.mars.xlog.Log.i("MicroMsg.PluginCast", "width is " + intValue + " and height is " + intValue2 + " and screen size is" + h28.x + " amd " + h28.y + " and resule is " + f17 + " * " + f18);
                        bVar.f256313c = (((int) f18) / 16) * 16;
                        bVar.f256312b = (((int) f17) / 16) * 16;
                    }
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PluginCast", e17, "isScreenCastCode error", new java.lang.Object[0]);
                }
                java.lang.String optString4 = gVar.optString("VideoFrameRate");
                kotlin.jvm.internal.o.f(optString4, "optString(...)");
                java.lang.Integer h29 = r26.h0.h(optString4);
                if (h29 != null) {
                    bVar.f256315e = h29.intValue();
                }
                java.lang.String optString5 = gVar.optString("VideoIFrameInterval");
                kotlin.jvm.internal.o.f(optString5, "optString(...)");
                java.lang.Integer h37 = r26.h0.h(optString5);
                if (h37 != null) {
                    bVar.f256317g = h37.intValue();
                }
                java.lang.String optString6 = gVar.optString("AudioRecordUseAndroidMic");
                kotlin.jvm.internal.o.f(optString6, "optString(...)");
                java.lang.Integer h38 = r26.h0.h(optString6);
                pu1.a aVar = bVar.f358419p;
                if (h38 != null) {
                    aVar.f358415a = h38.intValue() == 1;
                }
                java.lang.String optString7 = gVar.optString("AudioSampleRate");
                kotlin.jvm.internal.o.f(optString7, "optString(...)");
                java.lang.Integer h39 = r26.h0.h(optString7);
                if (h39 != null) {
                    aVar.f358416b = h39.intValue();
                }
                java.lang.String optString8 = gVar.optString("AudioChannelCnt");
                kotlin.jvm.internal.o.f(optString8, "optString(...)");
                java.lang.Integer h47 = r26.h0.h(optString8);
                if (h47 != null) {
                    aVar.f358417c = h47.intValue();
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                cl0.e f28 = gVar.f("ip_list");
                if (f28 != null) {
                    int length = f28.length();
                    for (int i37 = 0; i37 < length; i37++) {
                        java.lang.String optString9 = f28.optString(i37);
                        if (optString9 != null) {
                            arrayList.add(optString9);
                            com.tencent.mars.xlog.Log.i("ScanQrcodeLiveAuthorizationEventListner", "add new ip: " + optString9);
                        }
                    }
                }
                if (arrayList.isEmpty() && (optString = gVar.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_CGI_PROXY_IP)) != null) {
                    arrayList.add(optString);
                    com.tencent.mars.xlog.Log.i("ScanQrcodeLiveAuthorizationEventListner", "add old ip: " + optString);
                }
                bVar.f358420q = arrayList;
            }
            oVar.f422110a = bVar;
        }
        j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, "cast", ".ui.ScreenCastActivity", new android.content.Intent(), null);
    }
}
