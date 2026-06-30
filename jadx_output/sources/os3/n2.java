package os3;

/* loaded from: classes8.dex */
public class n2 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl f348158d;

    public n2(com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl mailAddrsViewControl) {
        this.f348158d = mailAddrsViewControl;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        java.lang.String charSequence2 = charSequence.toString();
        boolean endsWith = charSequence2.endsWith("\n");
        com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl mailAddrsViewControl = this.f348158d;
        if (endsWith || charSequence2.endsWith(" ")) {
            java.util.regex.Pattern pattern = com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl.f154881p;
            mailAddrsViewControl.e(charSequence2, true);
        }
        mailAddrsViewControl.a();
    }
}
