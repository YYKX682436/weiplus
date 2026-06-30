package p61;

/* loaded from: classes11.dex */
public class q4 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.MobileFriendUI f352359d;

    public q4(com.tencent.mm.plugin.account.bind.ui.MobileFriendUI mobileFriendUI) {
        this.f352359d = mobileFriendUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.account.bind.ui.MobileFriendUI mobileFriendUI = this.f352359d;
        if (mobileFriendUI.f73087h != null) {
            gm0.j1.d().d(mobileFriendUI.f73087h);
        }
    }
}
