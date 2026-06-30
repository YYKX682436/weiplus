package um;

/* loaded from: classes12.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f428690a = new java.util.HashMap();

    public static java.lang.Object a(um.o oVar, java.lang.String str, java.lang.Object obj) {
        if (oVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ICacheService.Factory", "null service");
            return obj;
        }
        try {
            return ((jt0.i) ((m11.q0) oVar).f322769d).get(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ICacheService.Factory", "cast failed, different type ?");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.ICacheService.Factory", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return obj;
        }
    }

    public static um.o b(java.lang.String str) {
        um.o oVar = (um.o) ((java.util.HashMap) f428690a).get(str);
        if (oVar != null) {
            return oVar;
        }
        fs.q g17 = fs.g.g(um.p.class, str);
        if (g17 != null) {
            return (um.o) g17.get();
        }
        return null;
    }
}
