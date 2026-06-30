package fs3;

/* loaded from: classes15.dex */
public class r implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI f266316d;

    public r(com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI facingCreateChatRoomAllInOneUI) {
        this.f266316d = facingCreateChatRoomAllInOneUI;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI facingCreateChatRoomAllInOneUI = this.f266316d;
        if (z17) {
            com.tencent.mm.pluginsdk.model.lbs.Location location = new com.tencent.mm.pluginsdk.model.lbs.Location(f18, f17, (int) d18, i17, "", "");
            if (!(location.f189366d == -85.0f || location.f189367e == -1000.0f)) {
                facingCreateChatRoomAllInOneUI.f154757i = location;
                facingCreateChatRoomAllInOneUI.f154755g = true;
                com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI.U6(facingCreateChatRoomAllInOneUI);
            }
        } else {
            if (!facingCreateChatRoomAllInOneUI.K && !com.tencent.mm.sdk.platformtools.n2.a()) {
                facingCreateChatRoomAllInOneUI.K = true;
                db5.e1.C(facingCreateChatRoomAllInOneUI, facingCreateChatRoomAllInOneUI.getString(com.tencent.mm.R.string.fs_), facingCreateChatRoomAllInOneUI.getString(com.tencent.mm.R.string.f490573yv), facingCreateChatRoomAllInOneUI.getString(com.tencent.mm.R.string.g6z), facingCreateChatRoomAllInOneUI.getString(com.tencent.mm.R.string.f490347sg), false, new fs3.q(this), null);
            }
            facingCreateChatRoomAllInOneUI.f154755g = false;
        }
        return false;
    }
}
