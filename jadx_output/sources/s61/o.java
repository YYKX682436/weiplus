package s61;

/* loaded from: classes11.dex */
public class o implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI f403380d;

    public o(com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI findMContactInviteUI) {
        this.f403380d = findMContactInviteUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI findMContactInviteUI = this.f403380d;
        androidx.appcompat.app.AppCompatActivity context = findMContactInviteUI.getContext();
        ((sb0.f) jVar).getClass();
        j35.u.g(context);
        findMContactInviteUI.f73149w = true;
        findMContactInviteUI.finish();
    }
}
