package z83;

/* loaded from: classes14.dex */
public final class i implements ck5.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI f470741d;

    public i(com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI) {
        this.f470741d = kidsWatchRegGetInfoUI;
    }

    @Override // ck5.e
    public void R5(java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI = this.f470741d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = kidsWatchRegGetInfoUI.f143150q;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        db5.e1.i(kidsWatchRegGetInfoUI.getContext(), com.tencent.mm.R.string.it9, com.tencent.mm.R.string.itb);
    }

    @Override // ck5.e
    public void c1(java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        int i17 = com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI.f143139t;
        com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI = this.f470741d;
        kidsWatchRegGetInfoUI.f143144h = com.tencent.mm.sdk.platformtools.c5.h(kidsWatchRegGetInfoUI.T6().f444001m.getText().toString());
        java.lang.String str = kidsWatchRegGetInfoUI.f143146m + kidsWatchRegGetInfoUI.f143144h;
        kidsWatchRegGetInfoUI.hideVKB();
        if (!kidsWatchRegGetInfoUI.f143149p) {
            ((x51.c1) kidsWatchRegGetInfoUI.f143152s).a(kidsWatchRegGetInfoUI, new z83.a(kidsWatchRegGetInfoUI, str));
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = kidsWatchRegGetInfoUI.f143150q;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        java.lang.String string = kidsWatchRegGetInfoUI.getString(com.tencent.mm.R.string.gbc, com.tencent.mm.sdk.platformtools.m2.d(), "CN", "kidswatchreg", 1, 0);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        js.s0 s0Var = (js.s0) i95.n0.c(js.s0.class);
        androidx.appcompat.app.AppCompatActivity context = kidsWatchRegGetInfoUI.getContext();
        ((is.h) s0Var).getClass();
        c71.b.c(context, string, 30847, false);
    }

    @Override // ck5.e
    public void w0(java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI = this.f470741d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = kidsWatchRegGetInfoUI.f143150q;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        db5.e1.i(kidsWatchRegGetInfoUI.getContext(), com.tencent.mm.R.string.it_, com.tencent.mm.R.string.itb);
    }
}
