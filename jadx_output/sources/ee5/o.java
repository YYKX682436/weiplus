package ee5;

/* loaded from: classes10.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.z f251983d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f251984e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ee5.z zVar, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f251983d = zVar;
        this.f251984e = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ee5.o(this.f251983d, this.f251984e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ee5.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z17;
        int size;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        new java.util.ArrayList();
        nc5.a aVar2 = nc5.a.f336188a;
        ee5.z zVar = this.f251983d;
        long d17 = aVar2.d(zVar.f252099f);
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiImageUIC", "getToIdentifyData >> timestamp: " + d17);
        boolean z18 = this.f251984e;
        if (d17 == -1) {
            android.database.Cursor A6 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).A6(zVar.f252099f, 500);
            kotlin.jvm.internal.o.f(A6, "getLimitImage(...)");
            java.util.ArrayList c17 = aVar2.c(A6, true);
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiImageUIC", "getToIdentifyData >> imageDataListResult: " + c17.size() + ", " + z18);
            if (!z18 && (!c17.isEmpty())) {
                zVar.W6();
            }
            return new jz5.l(c17, new java.util.ArrayList());
        }
        android.database.Cursor J3 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).J3(zVar.f252099f, d17);
        kotlin.jvm.internal.o.f(J3, "getImageLargeThanTime(...)");
        java.util.ArrayList c18 = aVar2.c(J3, false);
        int size2 = c18.size();
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiImageUIC", "getToIdentifyData >> latestSize: " + size2 + ", " + z18);
        if (size2 > 0 && !z18) {
            zVar.W6();
            z18 = true;
        }
        long e17 = aVar2.e(zVar.f252099f);
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiImageUIC", "getToIdentifyData >> oldest timeStamp: " + e17);
        if (e17 != -1 && e17 != d17) {
            android.database.Cursor K3 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).K3(zVar.f252099f, e17, 50);
            kotlin.jvm.internal.o.f(K3, "getImageSmallThanTime(...)");
            java.util.ArrayList c19 = aVar2.c(K3, false);
            int size3 = c19.size();
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiImageUIC", "getToIdentifyData >> oldestSize: " + size3 + ", " + z18);
            c18.addAll(c19);
            if (size3 > 0 && !z18) {
                zVar.W6();
                z17 = true;
                java.util.ArrayList d18 = com.tencent.mm.storage.s8.f195314a.d(zVar.f252099f, "0");
                size = d18.size();
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiImageUIC", "getToIdentifyData >> oldDataInIdentifyDBSize: " + size + ", " + z17);
                if (size > 0 && !z17) {
                    zVar.W6();
                }
                if (c18.isEmpty() && d18.isEmpty()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiImageUIC", "show image done when get data");
                    pm0.v.X(new ee5.n(zVar));
                }
                return new jz5.l(c18, d18);
            }
        }
        z17 = z18;
        java.util.ArrayList d182 = com.tencent.mm.storage.s8.f195314a.d(zVar.f252099f, "0");
        size = d182.size();
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiImageUIC", "getToIdentifyData >> oldDataInIdentifyDBSize: " + size + ", " + z17);
        if (size > 0) {
            zVar.W6();
        }
        if (c18.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiImageUIC", "show image done when get data");
            pm0.v.X(new ee5.n(zVar));
        }
        return new jz5.l(c18, d182);
    }
}
