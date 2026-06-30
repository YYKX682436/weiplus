package s61;

/* loaded from: classes11.dex */
public class d implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI f403338d;

    public d(com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI findMContactAddUI) {
        this.f403338d = findMContactAddUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI findMContactAddUI = this.f403338d;
        findMContactAddUI.f73132x = true;
        findMContactAddUI.finish();
    }
}
