package tb5;

/* loaded from: classes12.dex */
public final class l0 extends androidx.recyclerview.widget.w2 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.AbsListView.OnScrollListener f417067d;

    /* renamed from: e, reason: collision with root package name */
    public final tb5.j0 f417068e;

    /* renamed from: f, reason: collision with root package name */
    public tb5.k0 f417069f;

    public l0(java.lang.String tag, android.widget.AbsListView.OnScrollListener onScrollListener, tb5.j0 listener, int i17, kotlin.jvm.internal.i iVar) {
        onScrollListener = (i17 & 2) != 0 ? null : onScrollListener;
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f417067d = onScrollListener;
        this.f417068e = listener;
        this.f417069f = tb5.k0.f417063d;
    }

    public final void a(android.view.View view, int i17) {
        if (com.tencent.mars.xlog.Log.isDebug()) {
            java.util.Objects.toString(this.f417069f);
        }
        tb5.j0 j0Var = this.f417068e;
        if (i17 != 0 && this.f417069f == tb5.k0.f417063d) {
            this.f417069f = tb5.k0.f417064e;
            j0Var.getClass();
            ((com.tencent.mm.feature.performance.q1) ((ob0.x2) i95.n0.c(ob0.x2.class))).wi(j0Var);
        } else if (i17 == 0 && this.f417069f == tb5.k0.f417064e) {
            this.f417069f = tb5.k0.f417063d;
            j0Var.f();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/report/FPSDetectOnScrollListener", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        android.widget.AbsListView.OnScrollListener onScrollListener = this.f417067d;
        if (onScrollListener != null) {
            onScrollListener.onScroll(absListView, i17, i18, i19);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/report/FPSDetectOnScrollListener", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/report/FPSDetectOnScrollListener", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        android.widget.AbsListView.OnScrollListener onScrollListener = this.f417067d;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(absListView, i17);
        }
        a(absListView, i17);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/report/FPSDetectOnScrollListener", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/report/FPSDetectOnScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/report/FPSDetectOnScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/report/FPSDetectOnScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        a(recyclerView, i17);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/report/FPSDetectOnScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }
}
