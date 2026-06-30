package q53;

/* loaded from: classes8.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q53.f f360192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.model.LocalTabCornerSetting f360193e;

    public e(q53.f fVar, com.tencent.mm.plugin.game.model.LocalTabCornerSetting localTabCornerSetting) {
        this.f360192d = fVar;
        this.f360193e = localTabCornerSetting;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.game.autogen.chatroom.HalfScreen halfScreen;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/web/GameWebSettingActionBar$initTopIcon$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.model.LocalJumpInfo localJumpInfo = this.f360193e.f140179g;
        q53.f fVar = this.f360192d;
        fVar.getClass();
        if (localJumpInfo != null) {
            java.lang.String str = localJumpInfo.f140173e;
            int i17 = localJumpInfo.f140172d;
            if (i17 == 4) {
                android.net.Uri parse = android.net.Uri.parse(str);
                if (kotlin.jvm.internal.o.b(parse.getPath(), "chat")) {
                    long n17 = fVar.n(parse, "sourceid");
                    long n18 = fVar.n(parse, com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SSID);
                    long n19 = fVar.n(parse, "chatVcSelectTab");
                    android.content.Intent intent = new android.content.Intent(fVar.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.game.ui.chat_tab.ChatRoomTabUI.class);
                    if (n19 != 0) {
                        intent.putExtra("game_msg_center_tab_type", (int) n19);
                    }
                    intent.putExtra("game_report_sourceid", n17);
                    intent.putExtra("game_report_ssid", n18);
                    intent.putExtra("game_need_bottom_tab", false);
                    android.content.Context context = fVar.getContext();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/game/ui/web/GameWebSettingActionBar", "handleJumpInfo", "(Lcom/tencent/mm/plugin/game/model/LocalJumpInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(context, "com/tencent/mm/plugin/game/ui/web/GameWebSettingActionBar", "handleJumpInfo", "(Lcom/tencent/mm/plugin/game/model/LocalJumpInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    fVar.o(true, fVar.B1);
                } else {
                    com.tencent.mars.xlog.Log.e("GameWebSettingActionBar", "gamelog handleJumpInfo HOST IS unSupport");
                }
            } else {
                android.content.Context context2 = fVar.getContext();
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
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/web/GameWebSettingActionBar$initTopIcon$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
