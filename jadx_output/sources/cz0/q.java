package cz0;

/* loaded from: classes5.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final cz0.q f224962d = new cz0.q();

    public q() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = "";
        java.util.concurrent.locks.ReentrantLock reentrantLock = cz0.y.f224973e;
        reentrantLock.lock();
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSdkResMgr", "checkSoSha1: ");
            cz0.y yVar = cz0.y.f224969a;
            java.lang.String f17 = yVar.f(yVar.g());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkSoSha1: so:");
            sb6.append(f17);
            sb6.append(" record:");
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("maas_sdk");
            kotlin.jvm.internal.o.f(M, "getMMKV(...)");
            java.lang.String string = M.getString("KEY_SDK_SHA1", "");
            if (string == null) {
                string = "";
            }
            sb6.append(string);
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSdkResMgr", sb6.toString());
            com.tencent.mm.sdk.platformtools.o4 M2 = com.tencent.mm.sdk.platformtools.o4.M("maas_sdk");
            kotlin.jvm.internal.o.f(M2, "getMMKV(...)");
            java.lang.String string2 = M2.getString("KEY_SDK_SHA1", "");
            if (string2 != null) {
                str = string2;
            }
            if (!kotlin.jvm.internal.o.b(f17, str)) {
                com.tencent.mm.vfs.w6.h(yVar.g());
            }
            reentrantLock.unlock();
            return jz5.f0.f302826a;
        } catch (java.lang.Throwable th6) {
            cz0.y.f224973e.unlock();
            throw th6;
        }
    }
}
