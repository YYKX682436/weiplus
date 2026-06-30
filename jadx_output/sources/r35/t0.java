package r35;

/* loaded from: classes9.dex */
public class t0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.j f369259d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db5.d5 f369260e;

    public t0(com.tencent.mm.ui.widget.dialog.j jVar, db5.d5 d5Var) {
        this.f369259d = jVar;
        this.f369260e = d5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/applet/ConfirmDialog$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.dialog.j jVar = this.f369259d;
        if (jVar != null) {
            jVar.a(false, null, 0);
        }
        db5.d5 d5Var = this.f369260e;
        d5Var.dismiss();
        d5Var.setFocusable(false);
        d5Var.setTouchable(false);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/applet/ConfirmDialog$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
