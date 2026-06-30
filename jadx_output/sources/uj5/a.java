package uj5;

/* loaded from: classes3.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj5.e f428446d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(uj5.e eVar) {
        super(0);
        this.f428446d = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        uj5.e eVar = this.f428446d;
        eVar.getClass();
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.util.List P6 = eVar.P6(eVar.O6());
            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotPrintLayoutUIC", "printLayoutInfo begin");
            java.util.Iterator it = ((java.util.ArrayList) P6).iterator();
            while (it.hasNext()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotPrintLayoutUIC", (java.lang.String) it.next());
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotPrintLayoutUIC", "printLayoutInfo end cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScreenShotPrintLayoutUIC", th6, "printLayoutInfo err", new java.lang.Object[0]);
        }
        return jz5.f0.f302826a;
    }
}
