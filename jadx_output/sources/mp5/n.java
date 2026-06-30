package mp5;

/* loaded from: classes9.dex */
public class n implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.keyboard.WcPayKeyboard f330491d;

    public n(com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard) {
        this.f330491d = wcPayKeyboard;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        java.lang.String inputConnectionText;
        if (keyEvent.getKeyCode() != 66 || keyEvent.getAction() != 0) {
            return false;
        }
        java.lang.String text = this.f330491d.f213802J.getText();
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayKeyBoard", "click enter, code: %s text:%s", java.lang.Integer.valueOf(this.f330491d.K), text);
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = this.f330491d;
        mp5.u uVar = wcPayKeyboard.H;
        if (uVar != null) {
            if (wcPayKeyboard.N != null) {
                inputConnectionText = wcPayKeyboard.getInputConnectionText();
                com.tencent.mars.xlog.Log.i("MicroMsg.WcPayKeyBoard", "click enter, realText:%s", inputConnectionText);
                com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard2 = this.f330491d;
                mp5.u uVar2 = wcPayKeyboard2.H;
                int i18 = wcPayKeyboard2.K;
                o05.j jVar = ((ps4.f) uVar2).f358150a;
                if (jVar != null) {
                    jVar.b(i18, inputConnectionText);
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(29733, 1, 2);
            } else {
                int i19 = wcPayKeyboard.K;
                o05.j jVar2 = ((ps4.f) uVar).f358150a;
                if (jVar2 != null) {
                    jVar2.b(i19, text);
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(29733, 1, 1);
            }
        }
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard3 = this.f330491d;
        wcPayKeyboard3.L = text;
        wu5.c cVar = wcPayKeyboard3.M;
        if (cVar != null) {
            cVar.cancel(false);
            this.f330491d.M = null;
        }
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard4 = this.f330491d;
        ku5.u0 u0Var = ku5.t0.f312615d;
        mp5.m mVar = new mp5.m(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        wcPayKeyboard4.M = t0Var.z(mVar, 30000L, false);
        this.f330491d.K = 0;
        return true;
    }
}
