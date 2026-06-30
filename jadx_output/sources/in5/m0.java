package in5;

/* loaded from: classes8.dex */
public final class m0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.n0 f293091d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f293092e;

    public m0(in5.n0 n0Var, androidx.recyclerview.widget.k3 k3Var) {
        this.f293091d = n0Var;
        this.f293092e = k3Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/recyclerview/RecyclerViewAdapterEx$onCreateViewHolder$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(motionEvent, "motionEvent");
        androidx.recyclerview.widget.k3 m07 = this.f293091d.b0().m0(view);
        int adapterPosition = m07 != null ? m07.getAdapterPosition() : -1;
        in5.n0 n0Var = this.f293091d;
        in5.z zVar = n0Var.f293106p;
        boolean f17 = zVar != null ? zVar.f(n0Var, view, adapterPosition, this.f293092e, motionEvent) : false;
        yj0.a.i(f17, this, "com/tencent/mm/view/recyclerview/RecyclerViewAdapterEx$onCreateViewHolder$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return f17;
    }
}
