package s61;

/* loaded from: classes11.dex */
public class p implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI f403382d;

    public p(com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI findMContactInviteUI) {
        this.f403382d = findMContactInviteUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI findMContactInviteUI = this.f403382d;
        findMContactInviteUI.f73149w = true;
        findMContactInviteUI.finish();
    }
}
