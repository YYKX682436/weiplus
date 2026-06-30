package ug5;

/* loaded from: classes3.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f427645d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ug5.v f427646e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f427647f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f427648g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ug5.i f427649h;

    public r(android.view.View view, ug5.v vVar, android.widget.FrameLayout frameLayout, android.view.View view2, ug5.i iVar) {
        this.f427645d = view;
        this.f427646e = vVar;
        this.f427647f = frameLayout;
        this.f427648g = view2;
        this.f427649h = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f427645d;
        view.animate().setListener(null);
        view.animate().setUpdateListener(null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("do Animation, withEndAction done, params: ");
        ug5.v vVar = this.f427646e;
        sb6.append(vVar.f427658a);
        com.tencent.mars.xlog.Log.i("ViewFluentPerformer", sb6.toString());
        android.widget.FrameLayout frameLayout = this.f427647f;
        ug5.i iVar = this.f427649h;
        android.view.View view2 = this.f427648g;
        ug5.v vVar2 = this.f427646e;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (n3.x0.b(frameLayout)) {
            frameLayout.addOnAttachStateChangeListener(new ug5.q(frameLayout, iVar, view2, frameLayout, vVar2));
        } else {
            android.content.Context context = view2.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            iVar.a(context, view2, frameLayout, vVar2);
        }
        ug5.g gVar = vVar.f427658a;
        boolean z17 = gVar.f427610x;
        android.view.View view3 = this.f427648g;
        if (z17) {
            ug5.o oVar = new ug5.o(vVar);
            gVar.getClass();
            view3.postDelayed(oVar, 0L);
        } else {
            long j17 = gVar.f427604r;
            if (j17 > 0) {
                view3.postDelayed(new ug5.p(vVar), j17);
            }
        }
    }
}
