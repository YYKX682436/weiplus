package hw2;

/* loaded from: classes5.dex */
public final class b0 implements android.view.View.OnClickListener, yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f285503d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f285504e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f285505f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f285506g;

    public b0(android.view.View view, ju3.d0 status) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(status, "status");
        this.f285503d = view;
        this.f285504e = status;
        this.f285505f = view.getContext();
        this.f285506g = jz5.h.b(new hw2.a0(this));
        view.setOnClickListener(this);
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        return false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/video/plugin/FinderSubRecordDeletePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ju3.d0.k(this.f285504e, ju3.c0.f301893p, null, 2, null);
        ((com.tencent.mm.ui.widget.dialog.j0) ((jz5.n) this.f285506g).getValue()).show();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/video/plugin/FinderSubRecordDeletePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        android.view.View view = this.f285503d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/plugin/FinderSubRecordDeletePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/video/plugin/FinderSubRecordDeletePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
