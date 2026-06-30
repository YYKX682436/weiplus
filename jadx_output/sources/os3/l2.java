package os3;

/* loaded from: classes8.dex */
public class l2 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl f348142d;

    public l2(com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl mailAddrsViewControl) {
        this.f348142d = mailAddrsViewControl;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 5) {
            return true;
        }
        com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl mailAddrsViewControl = this.f348142d;
        java.lang.String obj = mailAddrsViewControl.f154884f.getEditableText().toString();
        if (obj == null || obj.length() <= 0) {
            return true;
        }
        mailAddrsViewControl.e(obj, false);
        mailAddrsViewControl.a();
        return true;
    }
}
