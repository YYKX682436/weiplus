package fs3;

/* loaded from: classes3.dex */
public class b implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI f266299d;

    public b(com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI facingCreateChatRoomAllInOneUI) {
        this.f266299d = facingCreateChatRoomAllInOneUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f266299d.finish();
    }
}
