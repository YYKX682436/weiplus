package s33;

/* loaded from: classes8.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final lt0.l f402541a = new lt0.l(8);

    public static android.graphics.Bitmap a(android.graphics.Bitmap bitmap) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int[] iArr = {android.graphics.Color.argb(180, 0, 0, 0), android.graphics.Color.argb(125, 0, 0, 0)};
        com.tencent.mm.ui.bk.C();
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, iArr);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
        gradientDrawable.draw(new android.graphics.Canvas(bitmap));
        com.tencent.mars.xlog.Log.i("GameChatRoom.GameChatUtils", "addGradientDrawableToBitmap end, cost:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        return bitmap;
    }

    public static java.lang.String b(java.lang.String str, java.lang.String str2) {
        android.net.Uri parse = android.net.Uri.parse(str);
        java.lang.String query = parse.getQuery();
        if (query != null) {
            str2 = query + "&" + str2;
        }
        try {
            return new java.net.URI(parse.getScheme(), parse.getAuthority(), parse.getPath(), str2, parse.getFragment()).toString();
        } catch (java.net.URISyntaxException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("GameChatRoom.GameChatUtils", e17, "", new java.lang.Object[0]);
            return str;
        }
    }

    public static boolean c(boolean z17) {
        for (android.app.ActivityManager.AppTask appTask : ((android.app.ActivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getAppTasks()) {
            android.content.ComponentName component = appTask.getTaskInfo().baseIntent.getComponent();
            if (component != null && component.getClassName().equals(com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomAffinityUI.class.getName())) {
                if (z17) {
                    appTask.finishAndRemoveTask();
                }
                com.tencent.mars.xlog.Log.i("GameChatRoom.GameChatUtils", "finish and remove multi task, clear:%b", java.lang.Boolean.valueOf(z17));
                return true;
            }
        }
        return false;
    }

    public static java.lang.String d(java.util.List list) {
        if (com.tencent.mm.sdk.platformtools.t8.L0(list)) {
            return "()";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(");
        for (int i17 = 0; i17 < list.size() - 1; i17++) {
            sb6.append("'");
            sb6.append((java.lang.String) list.get(i17));
            sb6.append("',");
        }
        sb6.append("'");
        sb6.append((java.lang.String) list.get(list.size() - 1));
        sb6.append("')");
        return sb6.toString();
    }

    public static s33.g e(java.lang.String str) {
        java.util.Map map = s33.n.f402529a;
        return !((java.util.HashMap) map).containsKey(str) ? new s33.g() : (s33.g) ((java.util.HashMap) map).get(str);
    }

    public static boolean f(com.tencent.mm.ui.MMActivity mMActivity) {
        boolean z17 = mMActivity instanceof com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomAffinityUI;
        java.lang.String str = s33.n.f402531c;
        return z17 && (str != null && str.contains(com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomAffinityUI.class.getName()));
    }

    public static boolean g() {
        return ((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).wi(e42.d0.clicfg_game_chatroom_open_multitask, 0) == 1;
    }

    public static int h(android.content.Context context, com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo) {
        return i(context, jumpInfo, 0, null);
    }

    public static int i(final android.content.Context context, final com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo, final int i17, final java.lang.String str) {
        if (jumpInfo == null) {
            return 0;
        }
        int i18 = jumpInfo.jump_type;
        if (i18 == 1) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(jumpInfo.jump_url)) {
                return 0;
            }
            ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).Di(jumpInfo.jump_url, new m33.f1() { // from class: s33.y$$a
                @Override // m33.f1
                public final void a(m33.e1 e1Var) {
                    android.content.Context context2 = context;
                    int i19 = i17;
                    java.lang.String str2 = str;
                    android.os.Bundle bundle = new android.os.Bundle();
                    java.util.Objects.toString(e1Var);
                    com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo2 = jumpInfo;
                    if (e1Var == null || com.tencent.mm.sdk.platformtools.t8.K0(e1Var.f323282a) || com.tencent.mm.sdk.platformtools.t8.K0(e1Var.f323283b) || (com.tencent.mm.plugin.game.commlib.i.l() != null && com.tencent.mm.plugin.game.commlib.i.l().f324125d.contains(e1Var.f323282a))) {
                        s33.y.j(context2, jumpInfo2, i19, str2);
                        return;
                    }
                    android.net.Uri parse = android.net.Uri.parse(jumpInfo2.jump_url);
                    bundle.putString("pkgId", parse.getQueryParameter("wechat_pkgid"));
                    java.lang.String query = parse.getQuery();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                        query = query + "&__game_center_present_custom_data__=" + str2;
                    }
                    bundle.putString("appId", e1Var.f323282a);
                    bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, e1Var.f323283b);
                    bundle.putString("query", query);
                    if (jumpInfo2.half_screen != null) {
                        bundle.putInt("KHalfScreenBackGroundColor", com.tencent.mm.ui.bk.C() ? context2.getColor(com.tencent.mm.R.color.f479225td) : context2.getColor(com.tencent.mm.R.color.f479224tc));
                        bundle.putBoolean("isHalfScreen", true);
                        bundle.putBoolean(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_TRANSPARENT, true);
                        bundle.putDouble("heightPercent", jumpInfo2.half_screen.screen_height_percent);
                    }
                    if (((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Bj(e1Var.f323282a) == null) {
                        s33.y.j(context2, jumpInfo2, i19, str2);
                        return;
                    }
                    s33.z zVar = new s33.z();
                    boolean Jj = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Jj(bundle.getString("appId"));
                    com.tencent.liteapp.storage.WxaLiteAppInfo Bj = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Bj(bundle.getString("appId"));
                    java.lang.String queryParameter = android.net.Uri.parse(jumpInfo2.jump_url).getQueryParameter("force_open_liteapp");
                    boolean z17 = false;
                    boolean z18 = queryParameter == null || !queryParameter.equals("0");
                    if (Bj != null && !com.tencent.mm.plugin.lite.LiteAppCenter.checkPageExists(Bj.path, Bj.appId, Bj.signatureKey, bundle.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH))) {
                        if (z18) {
                            z17 = true;
                        } else {
                            s33.y.j(context2, jumpInfo2, i19, str2);
                            zVar.fail();
                        }
                    }
                    if (!Jj) {
                        com.tencent.mars.xlog.Log.e("GameChatRoom.GameChatUtils", "gamelog.util, jumpToPage, openLiteApp  is forbidden");
                        zVar.fail();
                        s33.y.j(context2, jumpInfo2, i19, str2);
                        return;
                    }
                    java.lang.String string = bundle.getString("preInjectData");
                    cl0.g gVar = new cl0.g();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                        try {
                            cl0.g gVar2 = new cl0.g();
                            try {
                                gVar2.h("preInjectData", new cl0.g(string));
                                gVar = gVar2;
                            } catch (org.json.JSONException e17) {
                                e = e17;
                                gVar = gVar2;
                                com.tencent.mars.xlog.Log.e("GameChatRoom.GameChatUtils", "parse preInjectData fail. %s", e.toString());
                                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).hk(context2, bundle, z17, gVar, null, new s33.a0(zVar, context2, jumpInfo2, i19, str2));
                            }
                        } catch (org.json.JSONException e18) {
                            e = e18;
                        }
                    }
                    ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).hk(context2, bundle, z17, gVar, null, new s33.a0(zVar, context2, jumpInfo2, i19, str2));
                }
            });
            return 2;
        }
        if (i18 != 2) {
            return 0;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.WeappJumpInfo weappJumpInfo = jumpInfo.weapp_jump_info;
        if (weappJumpInfo == null) {
            return 3;
        }
        java.lang.String str2 = weappJumpInfo.appid;
        java.lang.String str3 = weappJumpInfo.path;
        l81.b1 b1Var = new l81.b1();
        b1Var.f317014b = str2;
        b1Var.f317022f = str3;
        b1Var.f317016c = 0;
        b1Var.f317032k = 1079;
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(context, b1Var);
        return 3;
    }

    public static int j(android.content.Context context, com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo, int i17, java.lang.String str) {
        com.tencent.mm.plugin.game.autogen.chatroom.HalfScreen halfScreen = jumpInfo.half_screen;
        if (halfScreen != null) {
            int i18 = halfScreen.type;
            if (i18 == 1) {
                com.tencent.mm.plugin.game.commlib.util.n.a(context, jumpInfo.jump_url, i17, true, halfScreen.screen_height_dp, -1.0f, str, null);
                return 2;
            }
            if (i18 == 2) {
                com.tencent.mm.plugin.game.commlib.util.n.a(context, jumpInfo.jump_url, i17, true, 0, halfScreen.screen_height_percent, str, null);
                return 2;
            }
        }
        com.tencent.mm.plugin.game.commlib.util.n.b(context, jumpInfo.jump_url, i17, true, str);
        return 2;
    }

    public static int k(java.lang.String str, int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(i17);
        }
        java.lang.Integer l17 = l(str);
        if (l17 == null) {
            l17 = java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(i17));
        }
        return l17.intValue();
    }

    public static java.lang.Integer l(java.lang.String str) {
        try {
            return java.lang.Integer.valueOf(android.graphics.Color.parseColor(str));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("GameChatRoom.GameChatUtils", "parseColor: " + e17.getMessage());
            return null;
        }
    }

    public static java.lang.String m(java.lang.String str, boolean z17) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && str.startsWith("ChatRoomImgPath://")) {
            try {
                java.lang.String decode = java.net.URLDecoder.decode(new java.net.URI(str).getPath());
                if (!com.tencent.mm.sdk.platformtools.t8.K0(decode)) {
                    decode = decode.substring(1);
                }
                java.lang.String decode2 = java.net.URLDecoder.decode(decode);
                java.lang.String str2 = s33.n.f402532d + com.tencent.mm.sdk.platformtools.w2.a(decode2);
                com.tencent.mars.xlog.Log.i("GameChatRoom.GameChatUtils", "pre send img, path:$filePath");
                return z17 ? str2 : decode2;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("GameChatRoom.GameChatUtils", e17, "", new java.lang.Object[0]);
            }
        }
        return null;
    }
}
