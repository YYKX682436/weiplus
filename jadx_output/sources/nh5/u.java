package nh5;

/* loaded from: classes3.dex */
public final class u implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nh5.c0 f337163d;

    public u(nh5.c0 c0Var) {
        this.f337163d = c0Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/matrix/MatrixOpenGLLeakResultUI$ResultViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("UI: ");
        nh5.c0 c0Var = this.f337163d;
        java.lang.Object value = ((jz5.n) c0Var.f337130d).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        sb6.append((java.lang.Object) ((android.widget.TextView) value).getText());
        sb6.append("; TYPE: ");
        java.lang.Object value2 = ((jz5.n) c0Var.f337131e).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        sb6.append((java.lang.Object) ((android.widget.TextView) value2).getText());
        sb6.append("; ID: ");
        java.lang.Object value3 = ((jz5.n) c0Var.f337132f).getValue();
        kotlin.jvm.internal.o.f(value3, "getValue(...)");
        sb6.append((java.lang.Object) ((android.widget.TextView) value3).getText());
        sb6.append("; EglContext: ");
        sb6.append((java.lang.Object) c0Var.i().getText());
        sb6.append("; java: ");
        sb6.append((java.lang.Object) c0Var.j().getText());
        sb6.append("; native: ");
        sb6.append((java.lang.Object) c0Var.k().getText());
        com.tencent.mm.sdk.platformtools.b0.e(sb6.toString());
        dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "已复制", 0).show();
        yj0.a.i(true, this, "com/tencent/mm/ui/matrix/MatrixOpenGLLeakResultUI$ResultViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
