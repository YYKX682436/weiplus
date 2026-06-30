package wo4;

/* loaded from: classes10.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo4.l f448269d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(wo4.l lVar) {
        super(1);
        this.f448269d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wo4.l lVar;
        long longValue = ((java.lang.Number) obj).longValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogDecoder", "get bitmap " + longValue);
        while (true) {
            lVar = this.f448269d;
            if (longValue <= lVar.f448278g) {
                break;
            }
            zv3.g gVar = lVar.f448279h;
            if (gVar == null) {
                kotlin.jvm.internal.o.o("frameRetriever");
                throw null;
            }
            zv3.a a17 = gVar.a();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get frame ");
            sb6.append(a17 != null ? java.lang.Long.valueOf(a17.f476428b) : null);
            sb6.append(" blendBitmapProvider: ");
            sb6.append(longValue);
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogDecoder", sb6.toString());
            if (a17 == null) {
                break;
            }
            long j17 = a17.f476428b;
            if (j17 <= 0) {
                break;
            }
            lVar.f448278g += j17;
            lVar.f448277f = a17;
        }
        zv3.a aVar = lVar.f448277f;
        if (aVar != null) {
            return aVar.f476427a;
        }
        return null;
    }
}
