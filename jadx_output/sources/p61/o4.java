package p61;

/* loaded from: classes.dex */
public class o4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.MobileFriendUI f352339d;

    public o4(com.tencent.mm.plugin.account.bind.ui.MobileFriendUI mobileFriendUI) {
        this.f352339d = mobileFriendUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        com.tencent.mm.plugin.account.bind.ui.MobileFriendUI mobileFriendUI = this.f352339d;
        androidx.appcompat.app.AppCompatActivity context = mobileFriendUI.getContext();
        ((sb0.f) jVar).getClass();
        j35.u.g(context);
        mobileFriendUI.finish();
    }
}
