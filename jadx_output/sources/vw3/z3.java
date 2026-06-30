package vw3;

/* loaded from: classes4.dex */
public final class z3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerNewXmlUI f441206d;

    public z3(com.tencent.mm.plugin.repairer.ui.RepairerNewXmlUI repairerNewXmlUI) {
        this.f441206d = repairerNewXmlUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerNewXmlUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.j4 j4Var = new r45.j4();
        j4Var.f377560g = 10002;
        com.tencent.mm.plugin.repairer.ui.RepairerNewXmlUI repairerNewXmlUI = this.f441206d;
        java.lang.String obj = ((com.tencent.mm.ui.widget.MMEditText) repairerNewXmlUI.findViewById(com.tencent.mm.R.id.psp)).getText().toString();
        r45.du5 du5Var = new r45.du5();
        du5Var.f372756d = obj;
        du5Var.f372757e = true;
        j4Var.f377561h = du5Var;
        java.lang.String obj2 = ((com.tencent.mm.ui.widget.MMEditText) repairerNewXmlUI.findViewById(com.tencent.mm.R.id.pwk)).getText().toString();
        r45.du5 du5Var2 = new r45.du5();
        du5Var2.f372756d = obj2;
        du5Var2.f372757e = true;
        j4Var.f377558e = du5Var2;
        java.lang.Long j17 = r26.h0.j(((com.tencent.mm.ui.widget.MMEditText) repairerNewXmlUI.findViewById(com.tencent.mm.R.id.t2y)).getText().toString());
        long longValue = j17 != null ? j17.longValue() : 0L;
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = new com.tencent.mm.modelbase.p0(j4Var, false, false, false);
        new com.tencent.mm.sdk.platformtools.n3().postDelayed(new vw3.y3(h0Var), longValue);
        java.lang.String str = com.tencent.mm.plugin.repairer.ui.RepairerNewXmlUI.d;
        kotlin.jvm.internal.o.g(obj, "<set-?>");
        com.tencent.mm.plugin.repairer.ui.RepairerNewXmlUI.d = obj;
        kotlin.jvm.internal.o.g(obj2, "<set-?>");
        com.tencent.mm.plugin.repairer.ui.RepairerNewXmlUI.e = obj2;
        db5.t7.n(repairerNewXmlUI.getContext(), "推送成功！");
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerNewXmlUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
