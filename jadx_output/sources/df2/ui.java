package df2;

/* loaded from: classes3.dex */
public final class ui extends kotlin.jvm.internal.q implements yz5.t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.wi f231534d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui(df2.wi wiVar) {
        super(6);
        this.f231534d = wiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.t
    public java.lang.Object J(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
        r45.m01 m01Var;
        byte[] byteArray;
        r45.nw1 nw1Var;
        r45.z53 z53Var;
        java.lang.String string;
        yg2.c securityDataScope;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        java.lang.String str = (java.lang.String) obj4;
        android.os.Bundle bundle = (android.os.Bundle) obj5;
        r45.l01 l01Var = (r45.l01) obj6;
        df2.wi wiVar = this.f231534d;
        com.tencent.mars.xlog.Log.i(wiVar.f231690m, "postExternalLive success:" + booleanValue + " errCode:" + intValue + " errType:" + intValue2 + " errMsg:" + str + " extInfo:" + bundle);
        com.tencent.mm.plugin.finder.live.view.k0 b76 = wiVar.b7();
        r45.qp1 qp1Var = null;
        qp1Var = null;
        qp1Var = null;
        if (b76 != null && (securityDataScope = b76.getSecurityDataScope()) != null) {
            kotlinx.coroutines.z0.c(securityDataScope, null);
        }
        if (booleanValue) {
            if (wiVar.g7()) {
                dk2.ef.h(dk2.ef.f233372a, wiVar.getStore().getLiveRoomData(), wiVar.getStore(), null, 1, null, 20, null);
            }
            h63.s1 s1Var = (h63.s1) i95.n0.c(h63.s1.class);
            android.content.Context O6 = wiVar.O6();
            r45.n73 c76 = wiVar.c7();
            java.lang.String str2 = (c76 == null || (z53Var = (r45.z53) c76.getCustom(1)) == null || (string = z53Var.getString(0)) == null) ? "" : string;
            int i17 = ((mm2.c1) wiVar.business(mm2.c1.class)).f328788c5;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((mm2.s1) wiVar.business(mm2.s1.class)).f329398u);
            mm2.e1 e1Var = (mm2.e1) wiVar.business(mm2.e1.class);
            ((h63.g1) s1Var).Di(O6, str2, i17, bool, valueOf, java.lang.Long.valueOf((e1Var == null || (nw1Var = e1Var.f328988r) == null) ? 0L : nw1Var.getLong(0)));
            com.tencent.mm.autogen.events.FinderGamePostEvent finderGamePostEvent = new com.tencent.mm.autogen.events.FinderGamePostEvent();
            am.hb hbVar = finderGamePostEvent.f54277g;
            hbVar.f6829a = true;
            hbVar.f6830b = true;
            finderGamePostEvent.e();
        } else {
            java.lang.String str3 = "handleStartMiniGameLiveFail: errCode:" + intValue + ", errType:" + intValue2 + ", errMsg:" + str;
            java.lang.String str4 = wiVar.f231690m;
            com.tencent.mars.xlog.Log.i(str4, str3);
            if (intValue == -200008) {
                java.lang.String string2 = bundle != null ? bundle.getString("EXT_INFO_KEY_REAL_NAME_URL", "") : null;
                java.lang.String str5 = string2 != null ? string2 : "";
                com.tencent.mars.xlog.Log.i(str4, "handleStartMiniGameLiveFail: realnameUrl".concat(str5));
                if ((str5.length() > 0) == true) {
                    com.tencent.mars.xlog.Log.i(str4, "gotoFaceVerify ".concat(str5));
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("LIVE_HELP_TYPE", 1);
                    intent.putExtra("FACE_VERIFY_URL", str5);
                    com.tencent.mm.ui.MMActivity N6 = wiVar.N6();
                    if (N6 != null) {
                        intent.setClass(N6, com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI.class);
                        N6.startActivityForResult(intent, 10000);
                    }
                } else {
                    db5.t7.makeText(wiVar.O6(), wiVar.O6().getResources().getString(com.tencent.mm.R.string.dzz), 0).show();
                }
            } else {
                if (bundle != null && (byteArray = bundle.getByteArray("EXT_INFO_KEY_ERROR_PAGE")) != null) {
                    r45.qp1 qp1Var2 = new r45.qp1();
                    try {
                        qp1Var2.parseFrom(byteArray);
                        qp1Var = qp1Var2;
                    } catch (java.lang.Exception e17) {
                        com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                    }
                }
                if (!hz2.d.f286313a.j(intValue2, intValue, qp1Var)) {
                    if (intValue != -200196) {
                        if (intValue != -100038) {
                            switch (intValue) {
                                default:
                                    switch (intValue) {
                                        case -200013:
                                            break;
                                        case -200012:
                                        case -200011:
                                            db5.t7.makeText(wiVar.O6(), wiVar.O6().getResources().getString(com.tencent.mm.R.string.dcd), 0).show();
                                            break;
                                        case -200010:
                                            db5.t7.makeText(wiVar.O6(), wiVar.O6().getResources().getString(com.tencent.mm.R.string.d4k), 0).show();
                                            break;
                                        case -200009:
                                            db5.t7.makeText(wiVar.O6(), wiVar.O6().getResources().getString(com.tencent.mm.R.string.clb), 0).show();
                                            break;
                                        default:
                                            db5.t7.makeText(wiVar.O6(), wiVar.O6().getResources().getString(com.tencent.mm.R.string.cla), 0).show();
                                            com.tencent.mars.xlog.Log.i(str4, "unknown errCode:" + intValue);
                                            break;
                                    }
                                case -200018:
                                case -200017:
                                    db5.t7.makeText(wiVar.O6(), wiVar.O6().getResources().getString(com.tencent.mm.R.string.cla), 0).show();
                                    break;
                            }
                        } else {
                            com.tencent.mars.xlog.Log.i(str4, "handleStartMiniGameLiveFail: errCode = LiveSvrErrCode.MM_LIVE_ERR_LIVE_CLOSED");
                        }
                    } else if (l01Var != null && (m01Var = (r45.m01) l01Var.getCustom(6)) != null) {
                        wiVar.f7(m01Var);
                    }
                }
            }
        }
        com.tencent.mm.plugin.finder.assist.d9 d9Var = wiVar.f231692o;
        if (d9Var != null) {
            d9Var.b();
        }
        return jz5.f0.f302826a;
    }
}
