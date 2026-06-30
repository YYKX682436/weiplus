package vw3;

/* loaded from: classes10.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerBlockDetectUI f441128d;

    public u(com.tencent.mm.plugin.repairer.ui.RepairerBlockDetectUI repairerBlockDetectUI) {
        this.f441128d = repairerBlockDetectUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerBlockDetectUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        em.u2 U6 = this.f441128d.U6();
        if (U6.f254845c == null) {
            U6.f254845c = (android.widget.EditText) U6.f254843a.findViewById(com.tencent.mm.R.id.vec);
        }
        java.lang.String obj = U6.f254845c.getText().toString();
        ix3.i.f295434j.b().f295443g = com.tencent.mm.sdk.platformtools.t8.V(obj, 32L);
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerBlockDetectUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
