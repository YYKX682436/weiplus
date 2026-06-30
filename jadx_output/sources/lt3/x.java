package lt3;

/* loaded from: classes10.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lt3.f0 f321283d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(lt3.f0 f0Var) {
        super(1);
        this.f321283d = f0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        lt3.f0 f0Var;
        long longValue = ((java.lang.Number) obj).longValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.VideoMixer", "get bitmap " + longValue);
        while (true) {
            long j17 = longValue / 1000;
            f0Var = this.f321283d;
            if (j17 <= f0Var.f321214c) {
                break;
            }
            zv3.g gVar = f0Var.f321216e;
            if (gVar == null) {
                kotlin.jvm.internal.o.o("frameRetriever");
                throw null;
            }
            zv3.a a17 = gVar.a();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get frame ");
            sb6.append(a17 != null ? java.lang.Long.valueOf(a17.f476428b) : null);
            sb6.append(" blendBitmapProvider: ");
            sb6.append(longValue);
            com.tencent.mars.xlog.Log.i("MicroMsg.Media.VideoMixer", sb6.toString());
            if (a17 == null) {
                break;
            }
            long j18 = a17.f476428b;
            if (j18 <= 0) {
                break;
            }
            f0Var.f321214c += j18;
            f0Var.f321215d = a17;
        }
        zv3.a aVar = f0Var.f321215d;
        if (aVar != null) {
            return aVar.f476427a;
        }
        return null;
    }
}
