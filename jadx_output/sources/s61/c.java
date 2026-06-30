package s61;

/* loaded from: classes11.dex */
public class c implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI f403330d;

    public c(com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI findMContactAddUI) {
        this.f403330d = findMContactAddUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI findMContactAddUI = this.f403330d;
        androidx.appcompat.app.AppCompatActivity context = findMContactAddUI.getContext();
        ((sb0.f) jVar).getClass();
        j35.u.g(context);
        findMContactAddUI.f73132x = true;
        findMContactAddUI.finish();
    }
}
