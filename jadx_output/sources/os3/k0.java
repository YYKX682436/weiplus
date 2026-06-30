package os3;

/* loaded from: classes8.dex */
public class k0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl f348130d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ os3.l0 f348131e;

    public k0(os3.l0 l0Var, com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl mailAddrsViewControl) {
        this.f348131e = l0Var;
        this.f348130d = mailAddrsViewControl;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f348131e.f348140a.Y.postDelayed(new os3.j0(this), 150L);
    }
}
