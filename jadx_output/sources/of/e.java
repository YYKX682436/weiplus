package of;

/* loaded from: classes3.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of.h f344826d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(of.h hVar) {
        super(0);
        this.f344826d = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.List list = (java.util.List) this.f344826d.f344829b.get("[stack]");
        if (list == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Luggage.ProcMapsInfo", "guessVirtualMemoryLimit, stackVmaInfoList is null");
            return -1L;
        }
        if (1 != list.size()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Luggage.ProcMapsInfo", "guessVirtualMemoryLimit, invalid stackVmaInfoList size: " + list.size());
            return -1L;
        }
        long j17 = 1;
        while (j17 < ((of.t) list.get(0)).f344860c) {
            j17 <<= 1;
        }
        return java.lang.Long.valueOf(j17);
    }
}
