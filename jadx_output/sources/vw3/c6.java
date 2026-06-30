package vw3;

/* loaded from: classes.dex */
public final class c6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f440912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerTestConfigUI f440913e;

    public c6(android.widget.EditText editText, com.tencent.mm.plugin.repairer.ui.RepairerTestConfigUI repairerTestConfigUI) {
        this.f440912d = editText;
        this.f440913e = repairerTestConfigUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerTestConfigUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        x51.o1.f452059l = java.lang.Integer.parseInt(this.f440912d.getText().toString());
        dp.a.makeText((android.content.Context) this.f440913e, com.tencent.mm.R.string.f490480w9, 0).show();
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerTestConfigUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
