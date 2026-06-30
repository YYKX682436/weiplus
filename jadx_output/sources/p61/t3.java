package p61;

/* loaded from: classes8.dex */
public class t3 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.GoogleFriendUI f352382d;

    public t3(com.tencent.mm.plugin.account.bind.ui.GoogleFriendUI googleFriendUI) {
        this.f352382d = googleFriendUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.account.bind.ui.GoogleFriendUI googleFriendUI = this.f352382d;
        googleFriendUI.f73076o = true;
        gm0.j1.d().d(googleFriendUI.f73078q);
    }
}
