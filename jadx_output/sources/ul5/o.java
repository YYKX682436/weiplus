package ul5;

/* loaded from: classes15.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ul5.x f428637d;

    public o(ul5.x xVar) {
        this.f428637d = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        ul5.x xVar = this.f428637d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/pulldown/NestScrollBounceSettingDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            java.lang.Object value = ((jz5.n) xVar.f428650n).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            ul5.y.f428660d = (int) java.lang.Float.parseFloat(((android.widget.EditText) value).getText().toString());
            java.lang.Object value2 = ((jz5.n) xVar.f428651o).getValue();
            kotlin.jvm.internal.o.f(value2, "getValue(...)");
            ul5.y.f428661e = (int) java.lang.Float.parseFloat(((android.widget.EditText) value2).getText().toString());
            java.lang.Object value3 = ((jz5.n) xVar.f428653q).getValue();
            kotlin.jvm.internal.o.f(value3, "getValue(...)");
            ul5.y.f428659c = (int) java.lang.Float.parseFloat(((android.widget.EditText) value3).getText().toString());
            java.lang.Object value4 = ((jz5.n) xVar.f428652p).getValue();
            kotlin.jvm.internal.o.f(value4, "getValue(...)");
            ul5.y.f428658b = (int) java.lang.Float.parseFloat(((android.widget.EditText) value4).getText().toString());
            java.lang.Object value5 = ((jz5.n) xVar.f428654r).getValue();
            kotlin.jvm.internal.o.f(value5, "getValue(...)");
            ul5.y.f428657a = java.lang.Float.parseFloat(((android.widget.EditText) value5).getText().toString());
        } catch (java.lang.Throwable unused) {
        }
        xVar.dismiss();
        yj0.a.h(this, "com/tencent/mm/ui/widget/pulldown/NestScrollBounceSettingDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
