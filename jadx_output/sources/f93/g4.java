package f93;

/* loaded from: classes.dex */
public class g4 implements k93.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelUI f260343a;

    public g4(com.tencent.mm.plugin.label.ui.ContactLabelUI contactLabelUI) {
        this.f260343a = contactLabelUI;
    }

    @Override // k93.b0
    public void a(db5.b7 b7Var) {
        com.tencent.mm.plugin.label.ui.ContactLabelUI contactLabelUI = this.f260343a;
        java.lang.String string = contactLabelUI.getResources().getString(com.tencent.mm.R.string.g9h);
        java.lang.String string2 = this.f260343a.getResources().getString(com.tencent.mm.R.string.g9d);
        int i17 = com.tencent.mm.plugin.label.ui.ContactLabelUI.L;
        com.tencent.mm.ui.tools.f5 f5Var = new com.tencent.mm.ui.tools.f5(contactLabelUI);
        contactLabelUI.f143298f = f5Var;
        f5Var.f210400e = contactLabelUI;
        contactLabelUI.f143298f.f();
        db5.f3 f3Var = new db5.f3(contactLabelUI, false);
        contactLabelUI.f143297e = f3Var;
        f3Var.A(48);
        contactLabelUI.f143297e.l(new f93.h4(contactLabelUI));
        db5.f3 f3Var2 = contactLabelUI.f143297e;
        f3Var2.L.setText(string);
        f3Var2.M.setHint(string2);
        f3Var2.N.setOnClickListener(new db5.c3(f3Var2, new f93.i4(contactLabelUI)));
        contactLabelUI.f143297e.C();
        contactLabelUI.f143297e.M.postDelayed(new f93.j4(contactLabelUI), 100L);
    }
}
