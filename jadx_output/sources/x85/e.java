package x85;

/* loaded from: classes10.dex */
public final class e implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x85.c f452590a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f452591b;

    public e(x85.c cVar, java.lang.String str) {
        this.f452590a = cVar;
        this.f452591b = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.p64 p64Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        com.tencent.mars.xlog.Log.i("MicroMsg.GetLensInfoTask", "GetLensInfo: " + i17 + ", " + i18 + ", " + fVar.f70617c);
        if (i17 == 0 && i18 == 0) {
            r45.vh3 vh3Var = (r45.vh3) fVar.f70618d;
            if (vh3Var != null && (p64Var = vh3Var.f388233d) != null) {
                synchronized (v85.a.f434096a) {
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    jt0.j jVar = v85.a.f434097b;
                    jz5.l lVar = (jz5.l) jVar.get(p64Var.f382792d);
                    if (lVar == null) {
                        lVar = new jz5.l(p64Var, java.lang.Long.valueOf(elapsedRealtime));
                    }
                    jVar.put(p64Var.f382792d, lVar);
                    com.tencent.mars.xlog.Log.i("MicroMsg.LensInfoMemCache", "update: " + p64Var.f382792d + ", " + elapsedRealtime);
                }
            }
            x85.c cVar = this.f452590a;
            if (cVar == null) {
                return null;
            }
            r45.vh3 vh3Var2 = (r45.vh3) fVar.f70618d;
            cVar.a(0, vh3Var2 != null ? vh3Var2.f388233d : null);
            return jz5.f0.f302826a;
        }
        if (i17 != 4 || i18 != -436) {
            x85.c cVar2 = this.f452590a;
            if (cVar2 == null) {
                return null;
            }
            cVar2.a(1, null);
            return jz5.f0.f302826a;
        }
        x85.c cVar3 = this.f452590a;
        if (cVar3 != null) {
            cVar3.a(2, null);
        }
        v85.a aVar = v85.a.f434096a;
        java.lang.String lensId = this.f452591b;
        synchronized (aVar) {
            kotlin.jvm.internal.o.g(lensId, "lensId");
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
            com.tencent.mars.xlog.Log.i("MicroMsg.LensInfoMemCache", "markInvalid: " + lensId + ", " + elapsedRealtime2);
            v85.a.f434098c.put(lensId, java.lang.Long.valueOf(elapsedRealtime2));
        }
        return jz5.f0.f302826a;
    }
}
