package zs5;

/* loaded from: classes15.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zs5.y f475494d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(zs5.y yVar) {
        super(0);
        this.f475494d = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        zs5.y yVar = this.f475494d;
        yVar.f475511l = false;
        yVar.f475510k = false;
        if (yVar.f475513n) {
            yVar.f475513n = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.AffScanDecodeQueue", "stopSession finish and try startSession");
            zs5.c cVar = this.f475494d.f475516q;
            if (cVar != null) {
                this.f475494d.c(cVar.f475326a, cVar.f475327b, cVar.f475328c, cVar.f475329d);
            }
        }
        return jz5.f0.f302826a;
    }
}
