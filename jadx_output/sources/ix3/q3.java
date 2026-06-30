package ix3;

/* loaded from: classes5.dex */
public final class q3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f295536d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ix3.s3 f295537e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l15.c f295538f;

    public q3(com.tencent.mm.storage.f9 f9Var, ix3.s3 s3Var, l15.c cVar) {
        this.f295536d = f9Var;
        this.f295537e = s3Var;
        this.f295538f = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/uic/RepairerMsgTypeDebugUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.storage.f9 f9Var = this.f295536d;
        if (f9Var != null) {
            ix3.s3 s3Var = this.f295537e;
            em.j3 T6 = s3Var.T6();
            if (T6.f254473b == null) {
                T6.f254473b = (android.widget.EditText) T6.f254472a.findViewById(com.tencent.mm.R.id.f487484vk2);
            }
            java.lang.Integer h17 = r26.h0.h(T6.f254473b.getText().toString());
            if (h17 == null) {
                androidx.appcompat.app.AppCompatActivity activity = s3Var.getActivity();
                int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activity);
                e4Var.f211776c = "请输入有效的type值";
                e4Var.c();
                yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/uic/RepairerMsgTypeDebugUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            int intValue = h17.intValue();
            l15.c cVar = this.f295538f;
            v05.b k17 = cVar.k();
            if (k17 != null) {
                k17.set(k17.f368365d + 6, java.lang.Integer.valueOf(intValue));
            }
            f9Var.d1(cVar.toXml());
            pt0.f0.f358209b1.s(f9Var.Q0(), f9Var.getMsgId(), f9Var);
            androidx.appcompat.app.AppCompatActivity activity2 = s3Var.getActivity();
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(activity2);
            e4Var2.f211776c = "appMsg type 已修改为 " + intValue;
            e4Var2.c();
            em.j3 T62 = s3Var.T6();
            if (T62.f254474c == null) {
                T62.f254474c = (android.widget.TextView) T62.f254472a.findViewById(com.tencent.mm.R.id.t2a);
            }
            T62.f254474c.setText(java.lang.String.valueOf(intValue));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/uic/RepairerMsgTypeDebugUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
