package ej2;

/* loaded from: classes10.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ej2.j f253290d;

    public b(ej2.j jVar) {
        this.f253290d = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/search/FinderLiveMicBaseSearchWidget$initSearchLogin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ej2.j jVar = this.f253290d;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = jVar.f253306i;
        if (weImageView != null) {
            weImageView.setVisibility(8);
        }
        android.widget.TextView textView = jVar.f253307j;
        if (textView != null) {
            textView.setVisibility(4);
        }
        jVar.f253310m.clear();
        jVar.a().notifyDataSetChanged();
        android.widget.EditText editText = jVar.f253302e;
        if (editText != null) {
            editText.setText("");
            editText.clearFocus();
            com.tencent.mm.sdk.platformtools.t8.t0(editText);
        }
        android.view.View view2 = jVar.f253305h;
        if (view2 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(((android.view.ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd(), 0);
            ofInt.setDuration(200L);
            ofInt.addUpdateListener(new ej2.a(view2));
            ofInt.start();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/search/FinderLiveMicBaseSearchWidget$initSearchLogin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
