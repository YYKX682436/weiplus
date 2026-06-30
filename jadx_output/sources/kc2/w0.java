package kc2;

/* loaded from: classes15.dex */
public final class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kc2.g1 f306512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f306513e;

    public w0(kc2.g1 g1Var, int i17) {
        this.f306512d = g1Var;
        this.f306513e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        java.lang.Object obj;
        int e17 = c01.id.e();
        kc2.c d17 = this.f306512d.d();
        kc2.k.f306427e.getClass();
        java.util.Iterator it = ((kz5.h) kc2.k.f306444y).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            i17 = this.f306513e;
            if (!hasNext) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((kc2.k) obj).f306445d == i17 + 1) {
                    break;
                }
            }
        }
        kc2.k kVar = (kc2.k) obj;
        if (kVar == null) {
            kVar = kc2.k.f306428f;
        }
        d17.a(new kc2.a(kVar, e17));
        com.tencent.mars.xlog.Log.i("FinderKaraInfoManager", "onPageSelected(" + java.lang.Thread.currentThread().getName() + ") selectTime=" + e17 + " position=" + i17);
    }
}
