package ye3;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final ye3.j f461221a = new ye3.j();

    public final d95.b0 a(java.lang.String cacheDbPath, java.util.HashMap factories, boolean z17, boolean z18) {
        d95.b0 b0Var;
        ye3.i iVar;
        java.lang.Object m521constructorimpl;
        java.lang.Object m521constructorimpl2;
        kotlin.jvm.internal.o.g(cacheDbPath, "cacheDbPath");
        kotlin.jvm.internal.o.g(factories, "factories");
        com.tencent.mars.xlog.Log.i("MB_External_surface_DB", "tryReInit start: cacheDbPath=" + cacheDbPath + ", wal=" + z18);
        java.util.Iterator it = kz5.c0.i(ye3.h.f461218c, new ye3.g(cacheDbPath), new ye3.e(cacheDbPath)).iterator();
        do {
            b0Var = null;
            if (!it.hasNext()) {
                com.tencent.mars.xlog.Log.e("MB_External_surface_DB", "tryReInit failed: all attempts failed, return null");
                return null;
            }
            iVar = (ye3.i) it.next();
            d95.b0 b0Var2 = new d95.b0();
            yz5.a aVar = iVar.f461220b;
            if (aVar != null) {
                aVar.invoke();
            }
            java.lang.String str = iVar.f461219a;
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                boolean S = b0Var2.S(cacheDbPath, factories, z17, z18);
                com.tencent.mars.xlog.Log.i("MB_External_surface_DB", "tryInit " + str + ": success=" + S);
                m521constructorimpl = kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(S));
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
            if (m524exceptionOrNullimpl != null) {
                com.tencent.mars.xlog.Log.e("MB_External_surface_DB", "tryInit " + str + " failed: " + m524exceptionOrNullimpl.getMessage(), m524exceptionOrNullimpl);
            }
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
                m521constructorimpl = bool;
            }
            if (((java.lang.Boolean) m521constructorimpl).booleanValue()) {
                b0Var = b0Var2;
            } else {
                try {
                    b0Var2.close();
                    com.tencent.mars.xlog.Log.i("MB_External_surface_DB", "closeDb: success");
                    m521constructorimpl2 = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
                } catch (java.lang.Throwable th7) {
                    kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                    m521constructorimpl2 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th7));
                }
                java.lang.Throwable m524exceptionOrNullimpl2 = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl2);
                if (m524exceptionOrNullimpl2 != null) {
                    com.tencent.mars.xlog.Log.e("MB_External_surface_DB", "closeDb failed: " + m524exceptionOrNullimpl2.getMessage(), m524exceptionOrNullimpl2);
                }
            }
        } while (b0Var == null);
        com.tencent.mars.xlog.Log.i("MB_External_surface_DB", "tryReInit success: " + iVar.f461219a);
        return b0Var;
    }
}
