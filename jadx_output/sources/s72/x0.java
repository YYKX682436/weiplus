package s72;

/* loaded from: classes11.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final s72.x0 f404171a = new s72.x0();

    /* renamed from: b, reason: collision with root package name */
    public static final kotlinx.coroutines.y0 f404172b = kotlinx.coroutines.z0.a(new kotlinx.coroutines.g2(((ku5.t0) ku5.t0.f312615d).p("MicroMsg.SyncDBCoreCoroutines")));

    public final kotlinx.coroutines.f1 a(java.lang.String str, yz5.p block) {
        kotlin.jvm.internal.o.g(block, "block");
        com.tencent.mars.xlog.Log.i("MicroMsg.SyncDBCoreCoroutines", "[launchAsync] start[" + str + ']');
        return kotlinx.coroutines.l.b(f404172b, null, null, new s72.w0(block, null), 3, null);
    }
}
