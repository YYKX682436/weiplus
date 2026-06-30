package o53;

/* loaded from: classes8.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o53.e f343117d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.model.LocalTabCornerSetting f343118e;

    public d(o53.e eVar, com.tencent.mm.plugin.game.model.LocalTabCornerSetting localTabCornerSetting) {
        this.f343117d = eVar;
        this.f343118e = localTabCornerSetting;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.game.autogen.chatroom.HalfScreen halfScreen;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/liteapp/GameLiteSettingActionBar$initTopIcon$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.model.LocalJumpInfo localJumpInfo = this.f343118e.f140179g;
        o53.e eVar = this.f343117d;
        eVar.getClass();
        if (localJumpInfo != null) {
            java.lang.String str = localJumpInfo.f140173e;
            int i17 = localJumpInfo.f140172d;
            if (i17 == 4) {
                android.net.Uri parse = android.net.Uri.parse(str);
                if (kotlin.jvm.internal.o.b(parse.getPath(), "chat")) {
                    long e17 = eVar.e(parse, "sourceid");
                    long e18 = eVar.e(parse, com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SSID);
                    long e19 = eVar.e(parse, "chatVcSelectTab");
                    android.content.Intent intent = new android.content.Intent(eVar.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.game.ui.chat_tab.ChatRoomTabUI.class);
                    if (e19 != 0) {
                        intent.putExtra("game_msg_center_tab_type", (int) e19);
                    }
                    intent.putExtra("game_report_sourceid", e17);
                    intent.putExtra("game_report_ssid", e18);
                    intent.putExtra("game_need_bottom_tab", false);
                    android.content.Context context = eVar.getContext();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/game/ui/liteapp/GameLiteSettingActionBar", "handleJumpInfo", "(Lcom/tencent/mm/plugin/game/model/LocalJumpInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(context, "com/tencent/mm/plugin/game/ui/liteapp/GameLiteSettingActionBar", "handleJumpInfo", "(Lcom/tencent/mm/plugin/game/model/LocalJumpInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    eVar.f(true, eVar.Q);
                } else {
                    com.tencent.mars.xlog.Log.e("GameLiteSettingActionBar", "gamelog handleJumpInfo HOST IS unSupport");
                }
            } else {
                android.content.Context context2 = eVar.getContext();
                com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo = new com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo();
                jumpInfo.jump_type = i17;
                jumpInfo.jump_url = str;
                com.tencent.mm.plugin.game.autogen.chatroom.WeappJumpInfo weappJumpInfo = null;
                com.tencent.mm.plugin.game.model.LocalHalfScreen localHalfScreen = localJumpInfo.f140175g;
                if (localHalfScreen != null) {
                    halfScreen = new com.tencent.mm.plugin.game.autogen.chatroom.HalfScreen();
                    halfScreen.type = localHalfScreen.f140169d;
                    halfScreen.screen_height_dp = localHalfScreen.f140170e;
                    halfScreen.screen_height_percent = localHalfScreen.f140171f;
                } else {
                    halfScreen = null;
                }
                jumpInfo.half_screen = halfScreen;
                com.tencent.mm.plugin.game.model.WeAppJumpInfo weAppJumpInfo = localJumpInfo.f140174f;
                if (weAppJumpInfo != null) {
                    weappJumpInfo = new com.tencent.mm.plugin.game.autogen.chatroom.WeappJumpInfo();
                    weappJumpInfo.appid = weAppJumpInfo.f140187d;
                    weappJumpInfo.path = weAppJumpInfo.f140188e;
                }
                jumpInfo.weapp_jump_info = weappJumpInfo;
                s33.y.h(context2, jumpInfo);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/liteapp/GameLiteSettingActionBar$initTopIcon$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
