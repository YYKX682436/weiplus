package cq4;

/* loaded from: classes10.dex */
public final class p implements androidx.recyclerview.widget.v2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView f221482d;

    public p(com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView vLogThumbView) {
        this.f221482d = vLogThumbView;
    }

    @Override // androidx.recyclerview.widget.v2
    public void a(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.MotionEvent event) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(event);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$3", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogThumbView", "onTouchEvent: " + event.getX());
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$3", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
    }

    @Override // androidx.recyclerview.widget.v2
    public boolean b(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogThumbView", "onInterceptTouchEvent: " + event.getX() + ", " + event.getAction());
        float x17 = event.getX();
        com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView vLogThumbView = this.f221482d;
        vLogThumbView.f176147u = x17;
        vLogThumbView.f176148v = event.getY();
        int action = event.getAction();
        if (action == 0) {
            vLogThumbView.A = false;
            recyclerView.f1();
            vLogThumbView.f176140n = false;
            bp4.c0 c0Var = vLogThumbView.f176151y;
            if (c0Var != null) {
                c0Var.pause();
            }
            bp4.c0 audioSeekable = vLogThumbView.getAudioSeekable();
            if (audioSeekable != null) {
                audioSeekable.pause();
            }
            java.lang.System.currentTimeMillis();
            vLogThumbView.getClass();
            float f17 = vLogThumbView.f176147u;
            vLogThumbView.getClass();
            float f18 = vLogThumbView.f176148v;
            vLogThumbView.getClass();
        } else if (action == 1 || action == 3) {
            vLogThumbView.getClass();
            if (recyclerView.getScrollState() == 0) {
                vLogThumbView.f176140n = true;
                bp4.c0 c0Var2 = vLogThumbView.f176151y;
                if (c0Var2 != null) {
                    c0Var2.resume();
                }
                vLogThumbView.A = false;
            } else {
                vLogThumbView.A = true;
            }
            java.lang.System.currentTimeMillis();
            vLogThumbView.getClass();
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.v2
    public void c(boolean z17) {
    }
}
