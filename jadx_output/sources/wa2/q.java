package wa2;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.LayoutManager f444169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f444170e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f444171f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, kotlin.jvm.internal.f0 f0Var, int i17) {
        super(0);
        this.f444169d = layoutManager;
        this.f444170e = f0Var;
        this.f444171f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) this.f444169d;
        int i17 = this.f444170e.f310116d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(this.f444171f));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$genExitCallback$exitCallback$1$3", "invoke", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$genExitCallback$exitCallback$1$3", "invoke", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        return jz5.f0.f302826a;
    }
}
