package fs3;

/* loaded from: classes15.dex */
public class c implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI f266300a;

    public c(com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI facingCreateChatRoomAllInOneUI) {
        this.f266300a = facingCreateChatRoomAllInOneUI;
    }

    @Override // d85.k0
    public void onOp(java.lang.Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI facingCreateChatRoomAllInOneUI = this.f266300a;
        if (!booleanValue) {
            facingCreateChatRoomAllInOneUI.finish();
            return;
        }
        i11.e eVar = facingCreateChatRoomAllInOneUI.f154752d;
        if (eVar != null) {
            ((i11.h) eVar).k(facingCreateChatRoomAllInOneUI.f154762p0, true);
        }
    }
}
