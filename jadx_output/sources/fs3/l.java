package fs3;

/* loaded from: classes15.dex */
public class l extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI f266310a;

    public l(com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI facingCreateChatRoomAllInOneUI) {
        this.f266310a = facingCreateChatRoomAllInOneUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        int i17 = message.what;
        com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI facingCreateChatRoomAllInOneUI = this.f266310a;
        if (i17 != 10001) {
            if (i17 != 10002) {
                return;
            }
            com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI.T6(facingCreateChatRoomAllInOneUI, 1);
        } else {
            fs3.y yVar = facingCreateChatRoomAllInOneUI.A;
            if (yVar != null) {
                yVar.a(facingCreateChatRoomAllInOneUI.f154770x);
            }
        }
    }
}
