package xj1;

/* loaded from: classes7.dex */
public final class a0 extends xj1.h0 {

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f454776n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f454777o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f454778p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(android.view.View root) {
        super(root, null);
        kotlin.jvm.internal.o.g(root, "root");
        this.f454776n = root.findViewById(com.tencent.mm.R.id.f483094wf);
        this.f454777o = root.findViewById(com.tencent.mm.R.id.f483095wg);
        this.f454778p = root.findViewById(com.tencent.mm.R.id.dlm);
        android.view.ViewGroup.LayoutParams layoutParams = this.f454796f.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = 0;
        }
        this.f454796f.requestLayout();
        android.view.View view = this.f454797g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/collection/CollectionSortViewHolder", "<init>", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/ui/collection/CollectionSortViewHolder", "<init>", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // xj1.h0
    public boolean k() {
        return false;
    }
}
