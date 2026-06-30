package fs3;

/* loaded from: classes15.dex */
public class k implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI f266309d;

    public k(com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI facingCreateChatRoomAllInOneUI) {
        this.f266309d = facingCreateChatRoomAllInOneUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.pluginsdk.model.lbs.Location location;
        com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI facingCreateChatRoomAllInOneUI = this.f266309d;
        if (facingCreateChatRoomAllInOneUI.f154768v || (location = facingCreateChatRoomAllInOneUI.f154757i) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "cancel refresh chat room member.");
            return false;
        }
        facingCreateChatRoomAllInOneUI.Q = new es3.a(0, facingCreateChatRoomAllInOneUI.f154758m, facingCreateChatRoomAllInOneUI.f154769w, location.f189366d, location.f189367e, location.f189368f, location.f189369g, location.f189370h, location.f189371i);
        c01.d9.e().g(facingCreateChatRoomAllInOneUI.Q);
        return false;
    }
}
