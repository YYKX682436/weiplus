package y80;

@j95.b
/* loaded from: classes8.dex */
public final class n1 extends i95.w implements z80.n0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f459887d = "MicroMsg.POIMoreActionSheetLogicService";

    public static final void Ai(y80.n1 n1Var, android.content.Context context, android.view.MenuItem menuItem, int i17, z80.s0 s0Var) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4 = n1Var.f459887d;
        if (menuItem == null) {
            com.tencent.mars.xlog.Log.i(str4, "handleMenuSelect: menuItem null");
            return;
        }
        int itemId = menuItem.getItemId();
        z80.u0 u0Var = z80.u0.f470677d;
        if (itemId == 0) {
            com.tencent.mm.plugin.location.model.LocationInfo locationInfo = s0Var.f470671c;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_Msg_content", va3.w.b(locationInfo));
            intent.putExtra("Retr_Msg_Type", 9);
            o72.r3.a(intent, new com.tencent.mm.sendtowework.LocationData(locationInfo.f144591m, locationInfo.f144589h, java.lang.Double.valueOf(locationInfo.f144587f), java.lang.Double.valueOf(locationInfo.f144586e), java.lang.Double.valueOf(locationInfo.f144588g)));
            j45.l.u(context, ".ui.transmit.MsgRetransmitUI", intent, null);
            yz5.l lVar = s0Var.f470673e;
            if (lVar != null) {
                lVar.invoke(u0Var);
                return;
            }
            return;
        }
        z80.u0 u0Var2 = z80.u0.f470679f;
        if (itemId == 2) {
            com.tencent.mm.plugin.location.model.LocationInfo locationInfo2 = s0Var.f470671c;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String str5 = locationInfo2.f144591m;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str5 == null) {
                str5 = "";
            }
            sb6.append(str5);
            sb6.append(' ');
            java.lang.String str6 = locationInfo2.f144589h;
            sb6.append(str6 != null ? str6 : "");
            com.tencent.mm.sdk.platformtools.b0.e(sb6.toString());
            dp.a.makeText(context, com.tencent.mm.R.string.f490361st, 0).show();
            yz5.l lVar2 = s0Var.f470673e;
            if (lVar2 != null) {
                lVar2.invoke(u0Var2);
                return;
            }
            return;
        }
        if (itemId == 3) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_poi_feedback_new_weapp, 0) == 1) {
                com.tencent.mm.plugin.appbrand.service.h6 h6Var = (com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class);
                l81.b1 b1Var = new l81.b1();
                b1Var.f317014b = "wx1cb063fc29603166";
                com.tencent.mm.plugin.location.model.LocationInfo locationInfo3 = s0Var.f470671c;
                android.net.Uri.Builder buildUpon = android.net.Uri.parse("pages/homePage/homePage").buildUpon();
                buildUpon.appendQueryParameter("src", "wxlocation");
                if (locationInfo3 == null || (str2 = java.lang.Double.valueOf(locationInfo3.f144586e).toString()) == null) {
                    str2 = "";
                }
                buildUpon.appendQueryParameter("latitude", str2);
                if (locationInfo3 == null || (str3 = java.lang.Double.valueOf(locationInfo3.f144587f).toString()) == null) {
                    str3 = "";
                }
                buildUpon.appendQueryParameter("longitude", str3);
                java.lang.String str7 = locationInfo3 != null ? locationInfo3.f144591m : null;
                if (str7 == null) {
                    str7 = "";
                }
                buildUpon.appendQueryParameter(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, str7);
                java.lang.String str8 = locationInfo3 != null ? locationInfo3.f144589h : null;
                if (str8 == null) {
                    str8 = "";
                }
                buildUpon.appendQueryParameter("address", str8);
                str = locationInfo3 != null ? locationInfo3.f144594p : null;
                java.lang.String str9 = str != null ? str : "";
                if (r26.i0.y(str9, "qqmap_", false)) {
                    buildUpon.appendQueryParameter("poi_id", r26.n0.W(str9, "qqmap_"));
                    buildUpon.appendQueryParameter("poi_type", "1");
                } else if (r26.i0.y(str9, "nearby_", false)) {
                    buildUpon.appendQueryParameter("poi_id", r26.n0.W(str9, "nearby_"));
                    buildUpon.appendQueryParameter("poi_type", "2");
                }
                com.tencent.mars.xlog.Log.i(str4, "createPOIFeedbackWeAppPageUrl: " + buildUpon.build());
                java.lang.String uri = buildUpon.build().toString();
                kotlin.jvm.internal.o.f(uri, "toString(...)");
                b1Var.f317022f = uri;
                b1Var.f317032k = com.tencent.mm.plugin.appbrand.jsapi.audio.u1.CTRL_INDEX;
                ((com.tencent.mm.plugin.appbrand.launching.xc) h6Var).bj(context, b1Var);
            } else {
                com.tencent.mm.plugin.location.model.LocationInfo locationInfo4 = s0Var.f470671c;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("showPOICorrectGuideView: ");
                sb7.append(locationInfo4 != null ? locationInfo4.f144591m : null);
                com.tencent.mars.xlog.Log.i(str4, sb7.toString());
                java.lang.String str10 = locationInfo4 != null ? locationInfo4.f144594p : null;
                java.lang.String str11 = str10 == null ? "" : str10;
                java.lang.String str12 = locationInfo4 != null ? locationInfo4.f144591m : null;
                java.lang.String str13 = str12 == null ? "" : str12;
                str = locationInfo4 != null ? locationInfo4.f144589h : null;
                ((y80.e1) ((z80.m0) i95.n0.c(z80.m0.class))).wi(context, new z80.q0(str11, str13, str == null ? "" : str, locationInfo4 != null ? (float) locationInfo4.f144587f : 0.0f, locationInfo4 != null ? (float) locationInfo4.f144586e : 0.0f));
            }
            yz5.l lVar3 = s0Var.f470673e;
            if (lVar3 != null) {
                lVar3.invoke(u0Var2);
            }
        }
    }

    public static final void wi(y80.n1 n1Var, db5.g4 g4Var, z80.v0 v0Var, z80.s0 s0Var) {
        n1Var.getClass();
        if (g4Var == null) {
            return;
        }
        int ordinal = v0Var.f470683a.ordinal();
        z80.u0 u0Var = v0Var.f470683a;
        if (ordinal == 0) {
            g4Var.j(u0Var.ordinal(), com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f490559yh), com.tencent.mm.R.raw.icons_filled_share, com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.f478502m), v0Var.f470684b);
            return;
        }
        if (ordinal == 1) {
            g4Var.clear();
            ((db5.h4) g4Var.j(u0Var.ordinal(), com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.guz), com.tencent.mm.R.raw.icons_filled_share, com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.f478502m), v0Var.f470684b)).f228372p = android.text.TextUtils.TruncateAt.END;
            return;
        }
        boolean z17 = v0Var.f470684b;
        if (ordinal == 2) {
            g4Var.l(u0Var.ordinal(), com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.guw), com.tencent.mm.R.raw.location_copy, z17);
        } else {
            if (ordinal != 3) {
                return;
            }
            g4Var.l(u0Var.ordinal(), com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.p3o), com.tencent.mm.R.raw.pencil_rectangle_regular, z17);
        }
    }
}
