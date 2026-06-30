package p05;

/* loaded from: classes10.dex */
public final class c5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final p05.c5 f350476d = new p05.c5();

    public c5() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        p05.e5.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.XLabEffectUtil", "start load ".concat(it));
        p05.l4.R.a();
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).getClass();
        boolean g17 = com.tencent.mm.plugin.expansions.i0.g(it);
        if (!g17) {
            try {
                com.tencent.mars.xlog.Log.w("MicroMsg.XLabEffectUtil", "IExpansionsService load " + it + " failed");
                fp.d0.n(it);
                g17 = true;
            } catch (java.lang.Error unused) {
                boolean z17 = p05.e5.f350510a;
                com.tencent.mars.xlog.Log.w("MicroMsg.XLabEffectUtil", "LoadLibrary " + it + " fail");
            }
        }
        if (g17) {
            p05.e5.f350511b.remove(it);
        } else {
            p05.e5.f350511b.add(it);
        }
        boolean z18 = tq5.k.f421272a;
        java.util.HashSet hashSet = p05.e5.f350511b;
        tq5.k.f421272a = hashSet.isEmpty();
        com.tencent.mars.xlog.Log.i("MicroMsg.XLabEffectUtil", "end load " + it + ", success " + g17 + ", list: " + hashSet);
        return jz5.f0.f302826a;
    }
}
