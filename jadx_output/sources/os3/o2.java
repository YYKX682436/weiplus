package os3;

/* loaded from: classes8.dex */
public class o2 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl f348165d;

    public o2(com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl mailAddrsViewControl) {
        this.f348165d = mailAddrsViewControl;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl mailAddrsViewControl = this.f348165d;
        os3.u2 u2Var = mailAddrsViewControl.f154887i;
        if (u2Var != null) {
            os3.t0 t0Var = (os3.t0) u2Var;
            com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI = t0Var.f348203c;
            composeUI.f154834f.setVisibility(4);
            composeUI.f154839m.setVisibility(4);
            composeUI.f154842p.setVisibility(4);
            t0Var.f348201a.setVisibility(z17 ? 0 : 4);
            int i17 = t0Var.f348202b;
            if ((i17 == 1 || i17 == 2) && !z17) {
                composeUI.f154835g.postDelayed(new os3.s0(t0Var), 10L);
            }
        }
        java.lang.String obj = mailAddrsViewControl.f154884f.getEditableText().toString();
        if (!z17 && obj.trim().length() > 0) {
            mailAddrsViewControl.e(obj, false);
        }
        android.view.View view2 = mailAddrsViewControl.f154889n;
        if (view2 != null && view2.isSelected()) {
            mailAddrsViewControl.f154889n.setSelected(z17);
            mailAddrsViewControl.f154889n = null;
        }
        mailAddrsViewControl.a();
    }
}
