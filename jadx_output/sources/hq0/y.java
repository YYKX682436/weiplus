package hq0;

/* loaded from: classes7.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f283073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hq0.b0 f283074e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(android.view.View view, hq0.b0 b0Var) {
        super(0);
        this.f283073d = view;
        this.f283074e = b0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        hq0.b0 b0Var = this.f283074e;
        android.view.View view = this.f283073d;
        try {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.getParent();
            if (viewGroup == null || viewGroup.indexOfChild(view) == -1) {
                com.tencent.mars.xlog.Log.i(b0Var.f282971y, "removeSelfFromParent view parent is null");
            } else {
                com.tencent.mars.xlog.Log.i(b0Var.f282971y, "removeSelfFromParent view parent is not null");
                viewGroup.removeView(view);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(b0Var.f282971y, e17, "removeSelfFromParent exception", new java.lang.Object[0]);
            i95.m c17 = i95.n0.c(je3.i.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            je3.i.x2((je3.i) c17, "MagicRemoveFromSelfException", 1, null, 0.001f, 4, null);
        }
        return jz5.f0.f302826a;
    }
}
