package gg4;

/* loaded from: classes11.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.Preference f271757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.pluginapp.AddMoreFriendsUI f271758e;

    public k(com.tencent.mm.plugin.subapp.ui.pluginapp.AddMoreFriendsUI addMoreFriendsUI, com.tencent.mm.ui.base.preference.Preference preference) {
        this.f271758e = addMoreFriendsUI;
        this.f271757d = preference;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = "find_friends_by_brand_service".equals(this.f271757d.f197780q) ? 211 : 210;
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        android.content.Intent a17 = su4.r2.a();
        a17.putExtra("KRightBtn", true);
        a17.putExtra("ftsneedkeyboard", true);
        a17.putExtra("key_load_js_without_delay", true);
        a17.putExtra("ftsType", 33554499);
        a17.putExtra("ftsbizscene", i17);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        java.util.Map b17 = su4.r2.b(i17, false, 33554499);
        tg0.o1 o1Var = (tg0.o1) i95.n0.c(tg0.o1.class);
        java.util.HashMap hashMap = (java.util.HashMap) b17;
        int D1 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) hashMap.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), 0);
        ((sg0.y3) o1Var).getClass();
        java.lang.String f17 = su4.r2.f(D1);
        hashMap.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, f17);
        hashMap.put("subSessionId", f17);
        a17.putExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, f17);
        a17.putExtra("subSessionId", f17);
        a17.putExtra("rawUrl", su4.r2.e(b17, 0));
        boolean C = com.tencent.mm.ui.bk.C();
        com.tencent.mm.plugin.subapp.ui.pluginapp.AddMoreFriendsUI addMoreFriendsUI = this.f271758e;
        j45.l.z(addMoreFriendsUI, a17, (C || addMoreFriendsUI.isVASValid()) ? null : android.app.ActivityOptions.makeSceneTransitionAnimation(addMoreFriendsUI, new android.util.Pair[0]).toBundle());
        su4.k2.a(i17, f17, f17, false, "", 33554499, "", false, "");
    }
}
