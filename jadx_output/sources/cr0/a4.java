package cr0;

/* loaded from: classes12.dex */
public final class a4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final cr0.a4 f221585d = new cr0.a4();

    public a4() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str = ((com.tencent.mm.matrix.battery.ProcessTracker$ProcessCallStats) obj).f68693f;
        java.lang.String PROCESS_MAIN = com.tencent.mm.sdk.platformtools.w9.f193053a;
        kotlin.jvm.internal.o.f(PROCESS_MAIN, "PROCESS_MAIN");
        return java.lang.Boolean.valueOf(!kotlin.jvm.internal.o.b(str, ri.i.g(PROCESS_MAIN)));
    }
}
