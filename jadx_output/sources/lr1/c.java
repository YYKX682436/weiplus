package lr1;

/* loaded from: classes5.dex */
public final class c extends qz5.l implements yz5.p {
    public c(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new lr1.c(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        lr1.c cVar = new lr1.c((kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        cVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            long a17 = lr1.e.a(lr1.e.f320651a);
            android.database.Cursor f17 = yq1.u0.Ai().f256007d.f("SELECT createTime FROM BizContactConversationMassSend ORDER BY createTime DESC LIMIT 1", null, 2);
            if (f17 != null) {
                try {
                    r4 = f17.moveToFirst() ? f17.getLong(0) : -1L;
                    vz5.b.a(f17, null);
                } finally {
                }
            }
            if (a17 != r4) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                yq1.u0.Ai().z0();
                long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(2107L, 1L, 1L);
                com.tencent.mars.xlog.Log.i("MicroMsg.BizMassSendStorageUtil", "cleared new table, total cost: " + currentTimeMillis2 + "ms");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizMassSendStorageUtil", "checkClearNewTableAsync failed", e17);
        }
        return jz5.f0.f302826a;
    }
}
