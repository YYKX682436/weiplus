package os3;

/* loaded from: classes8.dex */
public class i0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl f348104d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ os3.l0 f348105e;

    public i0(os3.l0 l0Var, com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl mailAddrsViewControl) {
        this.f348105e = l0Var;
        this.f348104d = mailAddrsViewControl;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f348104d.f154884f.setText("");
        this.f348105e.f348140a.Y.postDelayed(new os3.h0(this), 150L);
    }
}
