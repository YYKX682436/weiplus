package cr0;

/* loaded from: classes12.dex */
public final class b4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final cr0.b4 f221596d = new cr0.b4();

    public b4() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.matrix.battery.ProcessTracker$ProcessCallStats processTracker$ProcessCallStats = (com.tencent.mm.matrix.battery.ProcessTracker$ProcessCallStats) obj;
        boolean z17 = true;
        if (!(processTracker$ProcessCallStats.f68694g.length() == 0)) {
            java.lang.String PROCESS_MAIN = com.tencent.mm.sdk.platformtools.w9.f193053a;
            kotlin.jvm.internal.o.f(PROCESS_MAIN, "PROCESS_MAIN");
            if (!kotlin.jvm.internal.o.b(processTracker$ProcessCallStats.f68694g, ri.i.g(PROCESS_MAIN))) {
                z17 = false;
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
