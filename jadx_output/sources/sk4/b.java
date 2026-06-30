package sk4;

/* loaded from: classes14.dex */
public final class b extends com.tencent.unit_rc.BaseObject implements jm4.i0 {

    /* renamed from: d, reason: collision with root package name */
    public f25.m0 f408966d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f408967e = new java.util.LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f408968f = new java.util.concurrent.locks.ReentrantLock();

    public static final void a(sk4.b bVar, int i17, byte[] extraData) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = bVar.f408968f;
        reentrantLock.lock();
        try {
            java.util.List<jm4.j0> S0 = kz5.n0.S0(bVar.f408967e);
            reentrantLock.unlock();
            for (jm4.j0 j0Var : S0) {
                if (j0Var != null) {
                    kotlin.jvm.internal.o.g(extraData, "extraData");
                    urgen.ur_0025.UR_AFAF.UR_A8E0(((jm4.k0) j0Var).getCppPointer(), i17, extraData);
                }
            }
        } catch (java.lang.Throwable th6) {
            reentrantLock.unlock();
            throw th6;
        }
    }
}
