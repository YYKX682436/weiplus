package qd2;

/* loaded from: classes10.dex */
public final class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qd2.g1 f361845d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f361846e;

    public v0(qd2.g1 g1Var, android.widget.Button button) {
        this.f361845d = g1Var;
        this.f361846e = button;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/helper/FinderOriginSheetHelper$initNoticeView$2$confirmBtn$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.Button this_apply = this.f361846e;
        kotlin.jvm.internal.o.f(this_apply, "$this_apply");
        qd2.g1 g1Var = this.f361845d;
        android.widget.CheckBox checkBox = g1Var.f361753g;
        if ((checkBox == null || checkBox.isChecked()) ? false : true) {
            android.content.Context context = g1Var.f361747a;
            com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context, 1, 0);
            z2Var.m(context.getResources().getString(com.tencent.mm.R.string.f490347sg), context.getResources().getString(com.tencent.mm.R.string.f490007i9));
            z2Var.o(0);
            z2Var.v(context.getResources().getColor(com.tencent.mm.R.color.a0c));
            qd2.x0 x0Var = new qd2.x0(z2Var);
            qd2.y0 y0Var = new qd2.y0(g1Var, z2Var);
            z2Var.D = x0Var;
            z2Var.E = y0Var;
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ed9, (android.view.ViewGroup) null, false);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.tsc);
            if (textView != null) {
                com.tencent.mm.ui.fk.a(textView);
            }
            android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.tsa);
            if (findViewById != null) {
                findViewById.setOnClickListener(new qd2.z0(g1Var));
            }
            android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.tsb);
            if (findViewById2 != null) {
                findViewById2.setOnClickListener(new qd2.a1(g1Var));
            }
            z2Var.j(inflate);
            z2Var.C();
        } else {
            y9.i iVar = g1Var.f361754h;
            if (iVar != null) {
                iVar.dismiss();
            }
            yz5.a aVar = g1Var.f361764r;
            if (aVar != null) {
                aVar.invoke();
            }
            g1Var.c(this_apply, "view_clk");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/helper/FinderOriginSheetHelper$initNoticeView$2$confirmBtn$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
