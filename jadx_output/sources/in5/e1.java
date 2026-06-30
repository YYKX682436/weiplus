package in5;

/* loaded from: classes.dex */
public final class e1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerAdapter f293032d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f293033e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f293034f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.c f293035g;

    public e1(com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter, int i17, android.view.View view, in5.c cVar) {
        this.f293032d = wxRecyclerAdapter;
        this.f293033e = i17;
        this.f293034f = view;
        this.f293035g = cVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/recyclerview/WxRecyclerAdapter$bindViewListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f293032d;
        androidx.recyclerview.widget.k3 m07 = wxRecyclerAdapter.b0().m0(view);
        int adapterPosition = m07 != null ? m07.getAdapterPosition() : this.f293033e;
        in5.u uVar = wxRecyclerAdapter.B;
        if (uVar != null) {
            kotlin.jvm.internal.o.d(motionEvent);
            z17 = uVar.a(this.f293034f, motionEvent, this.f293035g, adapterPosition);
        } else {
            z17 = false;
        }
        yj0.a.i(z17, this, "com/tencent/mm/view/recyclerview/WxRecyclerAdapter$bindViewListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z17;
    }
}
