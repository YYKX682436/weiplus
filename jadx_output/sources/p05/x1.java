package p05;

/* loaded from: classes10.dex */
public final class x1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p05.w0 f350726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p05.d2 f350727e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(p05.w0 w0Var, p05.d2 d2Var) {
        super(0);
        this.f350726d = w0Var;
        this.f350727e = d2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj;
        long j17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#newWayAppend begin ");
        p05.w0 w0Var = this.f350726d;
        sb6.append(w0Var);
        com.tencent.mars.xlog.Log.i("FinderLivePkGiftEffect", sb6.toString());
        p05.d2 d2Var = this.f350727e;
        if (!d2Var.f350487b) {
            com.tencent.mars.xlog.Log.i("FinderLivePkGiftEffect", "This effect is not attached!");
        }
        if (d2Var.f350487b) {
            java.util.Iterator it = d2Var.f350491f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((p05.s1) obj).f350682b, w0Var.f350716a)) {
                    break;
                }
            }
            p05.s1 s1Var = (p05.s1) obj;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("#newWayAppend same_ptr=");
            sb7.append(s1Var != null ? java.lang.Long.valueOf(s1Var.f350681a) : null);
            sb7.append(" same_stage=");
            sb7.append(s1Var != null ? java.lang.Integer.valueOf(s1Var.f350684d) : null);
            com.tencent.mars.xlog.Log.i("FinderLivePkGiftEffect", sb7.toString());
            if (s1Var == null) {
                rh0.d0 d0Var = d2Var.f350488c;
                if (d0Var != null) {
                    j17 = ((p05.l4) d0Var).d(w0Var.f350717b + "/Lua");
                } else {
                    j17 = -1;
                }
                com.tencent.mars.xlog.Log.i("FinderLivePkGiftEffect", "#newWayAppend " + w0Var.f350716a + ' ' + w0Var.f350717b + " new gl_ptr is:" + j17);
                if (j17 != -1) {
                    d2Var.e(100L, new p05.v1(d2Var, j17, w0Var));
                }
            } else {
                d2Var.e(100L, new p05.w1(d2Var, s1Var, w0Var));
            }
        }
        return jz5.f0.f302826a;
    }
}
