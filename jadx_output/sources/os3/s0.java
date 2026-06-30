package os3;

/* loaded from: classes8.dex */
public class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ os3.t0 f348190d;

    public s0(os3.t0 t0Var) {
        this.f348190d = t0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        os3.t0 t0Var = this.f348190d;
        if (t0Var.f348203c.f154837i.f154884f.isFocused()) {
            return;
        }
        com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI = t0Var.f348203c;
        if (!composeUI.f154841o.f154884f.isFocused() && composeUI.f154837i.getMailAddrs().size() == 0 && composeUI.f154841o.getMailAddrs().size() == 0) {
            android.text.Editable text = composeUI.f154837i.f154884f.getText();
            boolean z17 = true;
            if (text == null || text.toString().length() <= 0) {
                android.text.Editable text2 = composeUI.f154841o.f154884f.getText();
                if (text2 != null && text2.toString().length() > 0) {
                    z17 = false;
                }
                if (z17) {
                    composeUI.f154835g.setVisibility(0);
                    composeUI.f154836h.setVisibility(8);
                    composeUI.f154840n.setVisibility(8);
                }
            }
        }
    }
}
