package sc2;

/* loaded from: classes2.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f406319d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f406320e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f406321f;

    public w(in5.s0 s0Var, xc2.p0 p0Var, sc2.h1 h1Var) {
        this.f406319d = s0Var;
        this.f406320e = p0Var;
        this.f406321f = h1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$onBindView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xc2.y2 y2Var = xc2.y2.f453343a;
        in5.s0 s0Var = this.f406319d;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        y2Var.h(context, this.f406320e, 1, s0Var);
        sc2.h1.I(this.f406321f, s0Var, com.tencent.mm.plugin.finder.report.f3.f125017f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$onBindView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
