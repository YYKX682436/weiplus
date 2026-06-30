package i33;

/* loaded from: classes5.dex */
public final class j0 implements androidx.recyclerview.widget.v2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i33.t0 f288204d;

    public j0(i33.t0 t0Var) {
        this.f288204d = t0Var;
    }

    @Override // androidx.recyclerview.widget.v2
    public void a(androidx.recyclerview.widget.RecyclerView rv6, android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(rv6);
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/uic/AlbumScrollBarUIC$handleScrollBarFollowGalleryScroll$2", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", this, array);
        kotlin.jvm.internal.o.g(rv6, "rv");
        kotlin.jvm.internal.o.g(e17, "e");
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/uic/AlbumScrollBarUIC$handleScrollBarFollowGalleryScroll$2", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
    }

    @Override // androidx.recyclerview.widget.v2
    public boolean b(androidx.recyclerview.widget.RecyclerView rv6, android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(rv6, "rv");
        kotlin.jvm.internal.o.g(e17, "e");
        return this.f288204d.f288248g;
    }

    @Override // androidx.recyclerview.widget.v2
    public void c(boolean z17) {
    }
}
