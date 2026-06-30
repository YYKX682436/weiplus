package fs3;

/* loaded from: classes15.dex */
public class s implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI f266317d;

    public s(com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI facingCreateChatRoomAllInOneUI) {
        this.f266317d = facingCreateChatRoomAllInOneUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI facingCreateChatRoomAllInOneUI = this.f266317d;
        facingCreateChatRoomAllInOneUI.f154754f = false;
        facingCreateChatRoomAllInOneUI.Z6(fs3.u.Unknow);
        return true;
    }
}
