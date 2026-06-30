package os3;

/* loaded from: classes8.dex */
public class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f348121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl f348122e;

    public j2(com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl mailAddrsViewControl, android.widget.Button button) {
        this.f348122e = mailAddrsViewControl;
        this.f348121d = button;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.Button button = this.f348121d;
        button.invalidate();
        button.setOnTouchListener(new os3.i2(this));
        com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl mailAddrsViewControl = this.f348122e;
        mailAddrsViewControl.a();
        mailAddrsViewControl.invalidate();
    }
}
