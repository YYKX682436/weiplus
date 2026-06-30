package xz3;

/* loaded from: classes15.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xz3.f f458210d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sz3.x0 f458211e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(xz3.f fVar, sz3.x0 x0Var) {
        super(1);
        this.f458210d = fVar;
        this.f458211e = x0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.AiScanImageGetProductTask", "addScanProductResultForFullImage success: %s", java.lang.Boolean.valueOf(booleanValue));
        xz3.f fVar = this.f458210d;
        if (!booleanValue) {
            fVar.f458216e.j(fVar);
        } else if (fVar.f458215d.f414089k) {
            xz3.f.a(fVar, this.f458211e);
        } else {
            fVar.f458216e.j(fVar);
        }
        return jz5.f0.f302826a;
    }
}
