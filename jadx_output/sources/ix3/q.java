package ix3;

/* loaded from: classes.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f295533d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ix3.s f295534e;

    public q(com.tencent.mm.storage.f9 f9Var, ix3.s sVar) {
        this.f295533d = f9Var;
        this.f295534e = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/uic/RepairerAppMsgDebugUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.storage.f9 f9Var = this.f295533d;
        if (f9Var != null) {
            f9Var.e1(c01.id.c() - 1296000000);
            pt0.f0.f358209b1.s(f9Var.Q0(), f9Var.getMsgId(), f9Var);
            androidx.appcompat.app.AppCompatActivity activity = this.f295534e.getActivity();
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activity);
            e4Var.f211776c = "消息时间已修改为15天之前";
            e4Var.c();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/uic/RepairerAppMsgDebugUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
