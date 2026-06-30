package vw3;

/* loaded from: classes.dex */
public final class f0 implements o65.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerChatroomDebugUI f440946a;

    public f0(com.tencent.mm.plugin.repairer.ui.RepairerChatroomDebugUI repairerChatroomDebugUI) {
        this.f440946a = repairerChatroomDebugUI;
    }

    @Override // o65.b
    public final void a(int i17, int i18, java.lang.String str, o65.b bVar) {
        com.tencent.mm.plugin.repairer.ui.RepairerChatroomDebugUI repairerChatroomDebugUI = this.f440946a;
        if (i17 == 0 && i18 == 0) {
            android.widget.Toast.makeText((android.content.Context) repairerChatroomDebugUI, (java.lang.CharSequence) "GetChatRoomInfo成功", 0).show();
        } else {
            android.widget.Toast.makeText((android.content.Context) repairerChatroomDebugUI, (java.lang.CharSequence) "GetChatRoomInfo失败", 0).show();
        }
    }
}
