package p53;

/* loaded from: classes8.dex */
public class r implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.game.ui.tab.RichGameTabWidget$OpenUrlData richGameTabWidget$OpenUrlData = (com.tencent.mm.plugin.game.ui.tab.RichGameTabWidget$OpenUrlData) obj;
        java.lang.ref.WeakReference j17 = com.tencent.mm.app.w.INSTANCE.j();
        android.content.Context context = j17 != null ? (android.content.Context) j17.get() : null;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        m53.p3 p3Var = richGameTabWidget$OpenUrlData.f141774d;
        boolean z17 = r53.f.f392653a;
        com.tencent.mm.plugin.game.model.r0 r0Var = new com.tencent.mm.plugin.game.model.r0();
        java.lang.String str = p3Var.f323963e;
        r0Var.jump_url = str;
        r0Var.f140430e = str;
        int i17 = p3Var.f323962d;
        r0Var.f140429d = i17;
        r0Var.jump_type = i17;
        com.tencent.mm.plugin.game.autogen.chatroom.HalfScreen halfScreen = new com.tencent.mm.plugin.game.autogen.chatroom.HalfScreen();
        m53.f3 f3Var = p3Var.f323965g;
        if (f3Var != null) {
            halfScreen.type = f3Var.f323676d;
            halfScreen.screen_height_dp = f3Var.f323677e;
            halfScreen.screen_height_percent = f3Var.f323678f;
        }
        r0Var.half_screen = halfScreen;
        com.tencent.mm.plugin.game.autogen.chatroom.WeappJumpInfo weappJumpInfo = new com.tencent.mm.plugin.game.autogen.chatroom.WeappJumpInfo();
        m53.c6 c6Var = p3Var.f323964f;
        if (c6Var != null) {
            weappJumpInfo.appid = c6Var.f323607d;
            weappJumpInfo.path = c6Var.f323608e;
        }
        r0Var.weapp_jump_info = weappJumpInfo;
        s33.y.h(context, r0Var);
    }
}
