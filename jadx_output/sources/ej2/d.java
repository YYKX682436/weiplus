package ej2;

/* loaded from: classes10.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ej2.j f253292d;

    public d(ej2.j jVar) {
        this.f253292d = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/search/FinderLiveMicBaseSearchWidget$initSearchLogin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ej2.j jVar = this.f253292d;
        android.widget.EditText editText = jVar.f253302e;
        if (editText != null) {
            editText.setText("");
        }
        jVar.f253310m.clear();
        jVar.getClass();
        jVar.a().notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/search/FinderLiveMicBaseSearchWidget$initSearchLogin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
