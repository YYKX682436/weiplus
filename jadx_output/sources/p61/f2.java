package p61;

/* loaded from: classes5.dex */
public class f2 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindMobilePolicyUI f352246a;

    public f2(com.tencent.mm.plugin.account.bind.ui.BindMobilePolicyUI bindMobilePolicyUI) {
        this.f352246a = bindMobilePolicyUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.account.bind.ui.BindMobilePolicyUI bindMobilePolicyUI = this.f352246a;
        if (z17) {
            int i17 = com.tencent.mm.plugin.account.bind.ui.BindMobilePolicyUI.E;
            bindMobilePolicyUI.i7(12905);
            return;
        }
        int i18 = com.tencent.mm.plugin.account.bind.ui.BindMobilePolicyUI.E;
        bindMobilePolicyUI.i7(12904);
        final n61.c cVar = new n61.c(3, (java.lang.String) gm0.j1.u().c().l(274436, null), bindMobilePolicyUI.C);
        gm0.j1.d().g(cVar);
        if (!bindMobilePolicyUI.A) {
            bindMobilePolicyUI.V6();
            return;
        }
        gm0.j1.d().a(268, bindMobilePolicyUI);
        bindMobilePolicyUI.D = com.tencent.mm.ui.widget.dialog.u3.c(bindMobilePolicyUI, bindMobilePolicyUI.getString(com.tencent.mm.R.string.f490393tq), true, 0, new android.content.DialogInterface.OnCancelListener() { // from class: p61.f2$$a
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(android.content.DialogInterface dialogInterface) {
                p61.f2 f2Var = p61.f2.this;
                f2Var.getClass();
                gm0.j1.d().d(cVar);
                gm0.j1.d().q(268, f2Var.f352246a);
            }
        });
        bindMobilePolicyUI.D.show();
    }
}
