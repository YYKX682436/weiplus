package jf2;

/* loaded from: classes3.dex */
public final class d implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jf2.n f299363d;

    public d(jf2.n nVar) {
        this.f299363d = nVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/bottomoption/FinderLiveVisitorBottomFolderPanel$mAdapter$2$1$onBindViewHolder$6$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.d(motionEvent);
        com.tencent.mm.plugin.finder.live.widget.e30 e30Var = (com.tencent.mm.plugin.finder.live.widget.e30) this.f299363d;
        e30Var.getClass();
        e30Var.f118215t.dispatchTouchEvent(motionEvent);
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/live/controller/bottomoption/FinderLiveVisitorBottomFolderPanel$mAdapter$2$1$onBindViewHolder$6$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
