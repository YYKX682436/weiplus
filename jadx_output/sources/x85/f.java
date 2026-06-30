package x85;

/* loaded from: classes10.dex */
public final class f extends x85.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(im5.b bVar, java.lang.String lensId, x85.c cVar) {
        super(bVar, lensId, cVar);
        r45.p64 p64Var;
        boolean z17;
        kotlin.jvm.internal.o.g(lensId, "lensId");
        com.tencent.mars.xlog.Log.i("MicroMsg.GetLensInfoTask", "GetLensInfoTaskImpl: ".concat(lensId));
        v85.a aVar = v85.a.f434096a;
        synchronized (aVar) {
            jt0.j jVar = v85.a.f434097b;
            jz5.l lVar = (jz5.l) jVar.get(lensId);
            if (lVar != null) {
                long longValue = ((java.lang.Number) lVar.f302834e).longValue();
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (android.os.SystemClock.elapsedRealtime() - longValue > 180000) {
                    jVar.remove(lensId);
                    com.tencent.mars.xlog.Log.i("MicroMsg.LensInfoMemCache", "get: expired " + lensId + ", " + ((java.lang.Number) lVar.f302834e).longValue());
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LensInfoMemCache", "get: from cache " + lensId + ", " + ((java.lang.Number) lVar.f302834e).longValue());
                    p64Var = (r45.p64) lVar.f302833d;
                }
            }
            p64Var = null;
        }
        synchronized (aVar) {
            jt0.j jVar2 = v85.a.f434098c;
            java.lang.Long l17 = (java.lang.Long) jVar2.get(lensId);
            if (l17 != null) {
                long longValue2 = l17.longValue();
                boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (android.os.SystemClock.elapsedRealtime() - longValue2 > 180000) {
                    jVar2.remove(lensId);
                    com.tencent.mars.xlog.Log.i("MicroMsg.LensInfoMemCache", "isInvalid: expired " + lensId + ", " + longValue2);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LensInfoMemCache", "isInvalid: from cache " + lensId + " invalid");
                    z17 = true;
                }
            }
            z17 = false;
        }
        if (z17) {
            if (cVar != null) {
                cVar.a(2, null);
            }
        } else {
            if (p64Var != null) {
                if (cVar != null) {
                    cVar.a(0, p64Var);
                    return;
                }
                return;
            }
            x85.a aVar2 = new x85.a(lensId);
            aVar2.f70649i = true;
            pq5.g l18 = aVar2.l();
            l18.H(new x85.e(cVar, lensId));
            if (bVar != null) {
                l18.f(bVar);
            }
        }
    }
}
