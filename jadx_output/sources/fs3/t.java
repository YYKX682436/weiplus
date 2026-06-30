package fs3;

/* loaded from: classes15.dex */
public class t implements com.tencent.mm.ui.widget.dialog.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI f266318a;

    public t(com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI facingCreateChatRoomAllInOneUI) {
        this.f266318a = facingCreateChatRoomAllInOneUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.v1
    public void a(boolean z17, java.lang.String str, boolean z18) {
        if (z17) {
            return;
        }
        this.f266318a.finish();
    }
}
