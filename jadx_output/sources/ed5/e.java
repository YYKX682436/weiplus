package ed5;

/* loaded from: classes5.dex */
public final class e implements androidx.recyclerview.widget.v2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ed5.m f251357d;

    public e(ed5.m mVar) {
        this.f251357d = mVar;
    }

    @Override // androidx.recyclerview.widget.v2
    public void a(androidx.recyclerview.widget.RecyclerView rv6, android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(rv6);
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/widgets/MsgHistoryGalleryLocateHighlightAnimator$animate$2", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", this, array);
        kotlin.jvm.internal.o.g(rv6, "rv");
        kotlin.jvm.internal.o.g(e17, "e");
        yj0.a.h(this, "com/tencent/mm/ui/chatting/history/widgets/MsgHistoryGalleryLocateHighlightAnimator$animate$2", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
    }

    @Override // androidx.recyclerview.widget.v2
    public boolean b(androidx.recyclerview.widget.RecyclerView rv6, android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(rv6, "rv");
        kotlin.jvm.internal.o.g(e17, "e");
        if (e17.getAction() != 0) {
            return false;
        }
        ed5.m.a(this.f251357d);
        return false;
    }

    @Override // androidx.recyclerview.widget.v2
    public void c(boolean z17) {
    }
}
