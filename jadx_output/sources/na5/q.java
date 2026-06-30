package na5;

/* loaded from: classes5.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.anim.RepairerSharedElementDemo2 f336017d;

    public q(com.tencent.mm.ui.anim.RepairerSharedElementDemo2 repairerSharedElementDemo2) {
        this.f336017d = repairerSharedElementDemo2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.CharSequence text;
        java.lang.String obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/anim/RepairerSharedElementDemo2$loadBtns$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.Button button = view instanceof android.widget.Button ? (android.widget.Button) view : null;
        this.f336017d.X6((button == null || (text = button.getText()) == null || (obj = text.toString()) == null) ? 1 : java.lang.Integer.parseInt(obj));
        yj0.a.h(this, "com/tencent/mm/ui/anim/RepairerSharedElementDemo2$loadBtns$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
