package kf3;

/* loaded from: classes5.dex */
public class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f307341d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kf3.k0 f307342e;

    public f0(kf3.k0 k0Var, java.lang.String str) {
        this.f307342e = k0Var;
        this.f307341d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/masssend/ui/MassSendHistoryAdapter$OnSendAgainClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if3.y n07 = if3.k0.Ai().n0(this.f307341d);
        java.lang.String e17 = n07.e();
        kf3.k0 k0Var = this.f307342e;
        java.lang.String t17 = kf3.k0.t(k0Var, e17);
        int c17 = if3.k0.Bi().c();
        if (com.tencent.mm.sdk.platformtools.t8.K0(t17)) {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(k0Var.f307381t);
            u1Var.u(k0Var.f307381t.getResources().getString(com.tencent.mm.R.string.m6e));
            u1Var.n(k0Var.f307381t.getResources().getString(com.tencent.mm.R.string.f490454vi));
            u1Var.l(new kf3.d0(this));
            u1Var.q(false);
        } else if (k0Var.f307384w > c17) {
            com.tencent.mm.ui.widget.dialog.u1 u1Var2 = new com.tencent.mm.ui.widget.dialog.u1(k0Var.f307381t);
            u1Var2.u(k0Var.f307381t.getResources().getString(com.tencent.mm.R.string.m69, java.lang.Integer.valueOf(c17)));
            u1Var2.n(k0Var.f307381t.getResources().getString(com.tencent.mm.R.string.f490454vi));
            u1Var2.l(new kf3.e0(this));
            u1Var2.q(false);
        } else {
            android.content.Intent intent = new android.content.Intent(k0Var.f307381t, (java.lang.Class<?>) com.tencent.mm.plugin.masssend.ui.MassSendMsgUI.class);
            intent.putExtra("mass_send_contact_list", kf3.k0.t(k0Var, n07.e()));
            intent.putExtra("mass_send_again", true);
            k0Var.f307381t.startActivityForResult(intent, 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/masssend/ui/MassSendHistoryAdapter$OnSendAgainClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
