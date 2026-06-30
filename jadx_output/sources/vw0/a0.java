package vw0;

/* loaded from: classes5.dex */
public final class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vw0.i0 f440765d;

    public a0(vw0.i0 i0Var) {
        this.f440765d = i0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/TextStyleView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vw0.d0 selectedTextStyleCallback = this.f440765d.getSelectedTextStyleCallback();
        if (selectedTextStyleCallback != null) {
            selectedTextStyleCallback.w1();
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/TextStyleView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
