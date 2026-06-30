package fs3;

/* loaded from: classes3.dex */
public class a implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI f266298d;

    public a(com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI facingCreateChatRoomAllInOneUI) {
        this.f266298d = facingCreateChatRoomAllInOneUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI facingCreateChatRoomAllInOneUI = this.f266298d;
        androidx.appcompat.app.AppCompatActivity context = facingCreateChatRoomAllInOneUI.getContext();
        ((sb0.f) jVar).getClass();
        j35.u.g(context);
        facingCreateChatRoomAllInOneUI.finish();
    }
}
