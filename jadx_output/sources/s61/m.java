package s61;

/* loaded from: classes15.dex */
public class m implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI f403368d;

    public m(com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI findMContactAddUI) {
        this.f403368d = findMContactAddUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI findMContactAddUI = this.f403368d;
        java.lang.String str = findMContactAddUI.f73127s;
        if (str == null || !str.contains("2")) {
            findMContactAddUI.a7();
            return;
        }
        android.content.Intent intent = new android.content.Intent(findMContactAddUI, (java.lang.Class<?>) com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI.class);
        intent.putExtra("regsetinfo_ticket", findMContactAddUI.f73125q);
        intent.putExtra("login_type", findMContactAddUI.f73129u);
        intent.putExtra("regsetinfo_NextStyle", findMContactAddUI.f73128t);
        com.tencent.mm.ui.MMWizardActivity.X6(findMContactAddUI, intent);
    }
}
