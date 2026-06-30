package xn5;

/* loaded from: classes13.dex */
public final class l1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final xn5.l1 f455693d = new xn5.l1();

    public l1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.lifecycle.y yVar;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Iterator it = ((java.util.LinkedHashMap) xn5.q1.f455714b).entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            jz5.f0 f0Var = jz5.f0.f302826a;
            if (!hasNext) {
                xn5.q1 q1Var = xn5.q1.f455713a;
                xn5.q1.f455716d = false;
                com.tencent.mars.xlog.Log.i("MicroMsg.X2C.X2CViewCreator", "fillingCacheViewList cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                return f0Var;
            }
            xn5.c0 c0Var = (xn5.c0) ((java.util.Map.Entry) it.next()).getValue();
            if (c0Var instanceof xn5.k1) {
                java.lang.ref.WeakReference weakReference = ((xn5.k1) c0Var).f455688e;
                if (weakReference == null || (yVar = (androidx.lifecycle.y) weakReference.get()) == null) {
                    f0Var = null;
                } else if (yVar.mo133getLifecycle().b() == androidx.lifecycle.n.DESTROYED) {
                    it.remove();
                } else {
                    xn5.q1.a(xn5.q1.f455713a, c0Var);
                }
                if (f0Var == null) {
                    xn5.q1 q1Var2 = xn5.q1.f455713a;
                    it.remove();
                }
            } else {
                xn5.q1.a(xn5.q1.f455713a, c0Var);
            }
        }
    }
}
