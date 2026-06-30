package gf2;

/* loaded from: classes2.dex */
public final class a0 extends androidx.viewpager.widget.a {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f271258d;

    @Override // androidx.viewpager.widget.a
    public void destroyItem(android.view.ViewGroup container, int i17, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(obj, "obj");
        if (obj instanceof android.view.View) {
            container.removeView((android.view.View) obj);
        }
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        java.util.ArrayList arrayList = this.f271258d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.viewpager.widget.a
    public int getItemPosition(java.lang.Object obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        java.util.ArrayList arrayList = this.f271258d;
        if (arrayList == null) {
            return -2;
        }
        if (kz5.n0.O(arrayList, obj instanceof android.view.View ? (android.view.View) obj : null)) {
            return arrayList.indexOf(obj);
        }
        return -2;
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.Object instantiateItem(android.view.ViewGroup container, int i17) {
        kotlin.jvm.internal.o.g(container, "container");
        java.util.ArrayList arrayList = this.f271258d;
        if (arrayList != null) {
            boolean z17 = false;
            if (i17 >= 0 && i17 < arrayList.size()) {
                z17 = true;
            }
            if (z17) {
                java.lang.Object obj = arrayList.get(i17);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                android.view.View view = (android.view.View) obj;
                android.view.ViewParent parent = view.getParent();
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
                container.addView(view);
                return view;
            }
        }
        android.widget.TextView textView = new android.widget.TextView(container.getContext());
        textView.setText("Invalid position: " + i17);
        container.addView(textView);
        return textView;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(android.view.View view, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(obj, "obj");
        return view == obj;
    }
}
