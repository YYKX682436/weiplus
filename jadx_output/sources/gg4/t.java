package gg4;

/* loaded from: classes8.dex */
public class t implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchUI f271778d;

    public t(com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchUI contactSearchUI) {
        this.f271778d = contactSearchUI;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 66) {
            return false;
        }
        com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchUI contactSearchUI = this.f271778d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(contactSearchUI.f172425d.getText().toString().trim())) {
            return false;
        }
        contactSearchUI.T6();
        return false;
    }
}
