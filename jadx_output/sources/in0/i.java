package in0;

/* loaded from: classes3.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in0.q f292751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f292752e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f292753f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(in0.q qVar, int i17, java.lang.String str) {
        super(0);
        this.f292751d = qVar;
        this.f292752e = i17;
        this.f292753f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj;
        p05.l0 l0Var = (p05.l0) this.f292751d.W1;
        l0Var.getClass();
        java.lang.String message = this.f292753f;
        kotlin.jvm.internal.o.g(message, "message");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#setAnimationMessageToWeVision gestureId=");
        int i17 = this.f292752e;
        sb6.append(i17);
        sb6.append(" message=");
        sb6.append(message);
        com.tencent.mars.xlog.Log.i("FinderLiveGestureRenderEffect", sb6.toString());
        java.util.Iterator it = l0Var.f350579e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((java.lang.Number) ((jz5.o) obj).f302842e).intValue() == i17) {
                break;
            }
        }
        jz5.o oVar = (jz5.o) obj;
        if (oVar == null) {
            com.tencent.mars.xlog.Log.e("FinderLiveGestureRenderEffect", "#setAnimationMessageToWeVision gestureId=" + i17 + " not match");
        } else {
            rh0.d0 d0Var = l0Var.f350576b;
            if (d0Var != null) {
                ((p05.l4) d0Var).G(((java.lang.Number) oVar.f302841d).longValue(), message, 0);
            }
        }
        return jz5.f0.f302826a;
    }
}
