package sm3;

/* loaded from: classes10.dex */
public final class t implements androidx.recyclerview.widget.v2 {

    /* renamed from: d, reason: collision with root package name */
    public float f409906d;

    /* renamed from: e, reason: collision with root package name */
    public float f409907e;

    /* renamed from: f, reason: collision with root package name */
    public long f409908f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView f409909g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sm3.g0 f409910h;

    public t(com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView mvTracksEditView, sm3.g0 g0Var) {
        this.f409909g = mvTracksEditView;
        this.f409910h = g0Var;
    }

    @Override // androidx.recyclerview.widget.v2
    public void a(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.MotionEvent event) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(event);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/widget/MvTracksEditView$5", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(event, "event");
        if (this.f409909g.f152023s) {
            this.f409910h.b(event);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/widget/MvTracksEditView$5", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x01ed  */
    @Override // androidx.recyclerview.widget.v2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(androidx.recyclerview.widget.RecyclerView r26, android.view.MotionEvent r27) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sm3.t.b(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):boolean");
    }

    @Override // androidx.recyclerview.widget.v2
    public void c(boolean z17) {
    }
}
