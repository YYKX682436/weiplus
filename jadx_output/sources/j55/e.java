package j55;

/* loaded from: classes8.dex */
public class e implements j45.k {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.List f297833d = java.util.Arrays.asList("FinderHomeAffinityUI", "FinderLiveSquareNewEntranceUI", "TingFlutterActivity", "TopStoryHomeUI", "NearbyUI", "LiteAppGameTabUI");

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f297834e;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f297834e = hashMap;
        hashMap.put("find_friends_by_qrcode", "scan");
        hashMap.put("find_friends_by_shake", "shake");
        hashMap.put("find_friends_by_look", "topstories");
        hashMap.put("find_friends_by_search", ya.a.SEARCH);
        hashMap.put("find_friends_by_near", "peoplenearby");
        hashMap.put("jd_market_entrance", "shopping");
        hashMap.put("more_tab_game_recommend", "game");
        hashMap.put("app_brand_entrance", "weapp");
        hashMap.put("find_friends_by_finder", "finder");
        hashMap.put("find_friends_by_finder_live_above_look", "finder_live");
        hashMap.put("find_friends_by_finder_live", "finder_live");
        hashMap.put("ip_call_entrance", "wechat_out");
        hashMap.put("find_friends_by_ting", "ting");
        hashMap.put("find_friends_by_ting_play_state", "ting");
    }

    public static void c(java.lang.String str) {
        java.lang.String str2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        try {
            str2 = j62.e.g().f(new com.tencent.mm.repairer.config.global.RepairerConfigRegisterPostVerifyUrl());
        } catch (c01.c unused) {
            str2 = "https://weixin110.qq.com/security/acct/newreadtemplate?t=literegverify/index";
        }
        sb6.append(str2);
        sb6.append("&scene=%s");
        java.lang.String sb7 = sb6.toString();
        java.lang.Object[] objArr = new java.lang.Object[1];
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = com.eclipsesource.mmv8.Platform.UNKNOWN;
        }
        objArr[0] = str;
        java.lang.String format = java.lang.String.format(sb7, objArr);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", format);
        j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // j45.i
    public boolean b(android.content.Context context, java.lang.String str, android.content.Intent intent, int i17, com.tencent.mm.ui.x7 x7Var) {
        boolean z17;
        java.util.Iterator it = f297833d.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            if (str.contains((java.lang.String) it.next())) {
                z17 = true;
                break;
            }
        }
        if (!z17 || !c01.z1.B()) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RegisterPostVerifyInterceptor", "intercept!");
        c(null);
        return true;
    }
}
