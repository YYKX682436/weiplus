package qh5;

/* loaded from: classes15.dex */
public class b implements androidx.recyclerview.widget.v2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.matrix.recyclerview.JsonRecyclerView f363451d;

    public b(com.tencent.mm.ui.matrix.recyclerview.JsonRecyclerView jsonRecyclerView) {
        this.f363451d = jsonRecyclerView;
    }

    @Override // androidx.recyclerview.widget.v2
    public void a(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/matrix/recyclerview/JsonRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/ui/matrix/recyclerview/JsonRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
    }

    @Override // androidx.recyclerview.widget.v2
    public boolean b(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction() & motionEvent.getActionMasked();
        com.tencent.mm.ui.matrix.recyclerview.JsonRecyclerView jsonRecyclerView = this.f363451d;
        if (action == 0) {
            jsonRecyclerView.f209116b2 = 1;
        } else if (action == 1) {
            jsonRecyclerView.f209116b2 = 0;
        } else if (action != 2) {
            if (action == 5) {
                jsonRecyclerView.f209117c2 = com.tencent.mm.ui.matrix.recyclerview.JsonRecyclerView.g1(jsonRecyclerView, motionEvent);
                jsonRecyclerView.f209116b2++;
            } else if (action == 6) {
                jsonRecyclerView.f209116b2--;
            }
        } else if (jsonRecyclerView.f209116b2 >= 2) {
            float g17 = com.tencent.mm.ui.matrix.recyclerview.JsonRecyclerView.g1(jsonRecyclerView, motionEvent);
            if (java.lang.Math.abs(g17 - jsonRecyclerView.f209117c2) > 0.5f) {
                jsonRecyclerView.setTextSize(qh5.a.f363450d * (g17 / jsonRecyclerView.f209117c2));
                jsonRecyclerView.f209117c2 = g17;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.v2
    public void c(boolean z17) {
    }
}
