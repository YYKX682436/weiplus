package r35;

/* loaded from: classes9.dex */
public class s0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.j f369250d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f369251e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ db5.d5 f369252f;

    public s0(com.tencent.mm.ui.widget.dialog.j jVar, android.view.View view, db5.d5 d5Var) {
        this.f369250d = jVar;
        this.f369251e = view;
        this.f369252f = d5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/applet/ConfirmDialog$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.dialog.j jVar = this.f369250d;
        if (jVar != null) {
            android.view.View view2 = this.f369251e;
            jVar.a(true, r35.j1.a(view2), r35.j1.b(view2));
        }
        db5.d5 d5Var = this.f369252f;
        d5Var.dismiss();
        d5Var.setFocusable(false);
        d5Var.setTouchable(false);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/applet/ConfirmDialog$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
