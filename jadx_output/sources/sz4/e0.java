package sz4;

/* loaded from: classes12.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iz4.i f414192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f414193e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sz4.f0 f414194f;

    public e0(sz4.f0 f0Var, iz4.i iVar, android.os.Bundle bundle) {
        this.f414194f = f0Var;
        this.f414192d = iVar;
        this.f414193e = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        sz4.f0 f0Var = this.f414194f;
        com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText = f0Var.f414195f;
        iz4.i iVar = this.f414192d;
        wXRTEditText.setRichTextEditing(iVar.f296155t);
        f0Var.f414195f.x();
        com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText2 = f0Var.f414195f;
        synchronized (wXRTEditText2) {
            wXRTEditText2.f188120v = true;
        }
        com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText3 = f0Var.f414195f;
        le0.r rVar = com.tencent.mm.pluginsdk.ui.span.c0.f191193c;
        int i17 = f0Var.f414182d.f333309q;
        com.tencent.mm.pluginsdk.ui.span.c0.q(wXRTEditText3, this.f414193e, rVar, i17 == 2 ? 9 : i17 == 1 ? 8 : 0);
        com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText4 = f0Var.f414195f;
        synchronized (wXRTEditText4) {
            wXRTEditText4.f188120v = false;
        }
        f0Var.f414195f.C();
        if (iVar.f296104b) {
            int i18 = iVar.f296105c;
            if (i18 == -1 || i18 >= f0Var.f414195f.getText().toString().length()) {
                com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText5 = f0Var.f414195f;
                wXRTEditText5.setSelection(wXRTEditText5.getText().toString().length());
            } else {
                f0Var.f414195f.setSelection(iVar.f296105c);
            }
            f0Var.f414195f.requestFocus();
            com.tencent.mm.sdk.platformtools.u3.i(new sz4.d0(this), 500L);
        } else if (f0Var.f414195f.hasFocus()) {
            f0Var.f414195f.clearFocus();
        }
        if (iVar.f296112j) {
            iVar.f296112j = false;
            com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText6 = f0Var.f414195f;
            wXRTEditText6.D = true;
            wXRTEditText6.onTextContextMenuItem(android.R.id.paste);
        }
    }
}
