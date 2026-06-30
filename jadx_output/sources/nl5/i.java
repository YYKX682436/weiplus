package nl5;

/* loaded from: classes15.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nl5.j f338292d;

    public i(nl5.j jVar) {
        this.f338292d = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/edittext/InsertHandle$onClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        nl5.s g17 = this.f338292d.f338294d.g();
        android.widget.PopupWindow popupWindow = g17.f338340b;
        if (popupWindow.isShowing()) {
            popupWindow.dismiss();
        } else {
            g17.a();
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/edittext/InsertHandle$onClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
