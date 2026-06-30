package y11;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ly11/q;", "Lg75/f0;", "Ly11/g;", "Lj75/b;", "Lg75/r;", "pipeline", "<init>", "(Lg75/r;)V", "plugin-messenger-foundation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class q extends g75.f0<y11.g, j75.b> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(g75.r pipeline) {
        super(pipeline);
        kotlin.jvm.internal.o.g(pipeline, "pipeline");
    }

    @Override // g75.f0
    public java.lang.Object i(g75.z zVar, j75.b bVar, kotlin.coroutines.Continuation continuation) {
        long j17;
        java.lang.String str;
        com.tencent.mm.storage.f9 f9Var = ((y11.g) bVar).f458814b;
        com.tencent.mars.xlog.Log.i("MicroMsg.SendMsgPPC.SendMsgInsertStgPPC", "SendMsgInsertStgPPC: content.size=" + f9Var.j().length() + " , time=" + f9Var.getCreateTime() + " ,  pipeline:" + this.f269401a.hashCode());
        try {
            j17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().N9(f9Var, true);
        } catch (com.tencent.wcdb.database.SQLiteException e17) {
            jx3.f.INSTANCE.idkeyStat(111L, 255L, 1L, false);
            if (!r26.n0.D(e17.toString(), "UNIQUE constraint failed", false, 2, null)) {
                throw e17;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.SendMsgPPC.SendMsgInsertStgPPC", "fallback to insert");
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().tb();
            j17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().N9(f9Var, true);
        } catch (java.lang.IllegalStateException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SendMsgPPC.SendMsgInsertStgPPC", e18, "", new java.lang.Object[0]);
            j17 = 0;
        }
        if (j17 != -1) {
            if (((u63.e) ((vg3.v3) i95.n0.c(vg3.v3.class))).wi(j().f442127b)) {
                vg3.v3 v3Var = (vg3.v3) i95.n0.c(vg3.v3.class);
                java.lang.String str2 = j().f442127b;
                java.lang.String r17 = c01.z1.r();
                java.lang.String str3 = j().f442129d;
                java.lang.String Q0 = f9Var.Q0();
                u63.e eVar = (u63.e) v3Var;
                eVar.getClass();
                eVar.Bi(str2, r17, str3, j17, c01.id.e(), Q0);
            }
        }
        if (j().f442135j.f37227b > 0) {
            dh3.c.f232489a.d(f9Var, new com.tencent.mm.plugin.msg.MsgIdTalker(j().f442135j.f37227b, j().f442135j.f37229d));
        } else {
            java.lang.String str4 = j().f442140o;
            if (!(str4 == null || str4.length() == 0) && (str = j().f442140o) != null) {
                dh3.c.f232489a.b(f9Var.Q0(), f9Var, str);
            }
        }
        iz5.a.g(null, j17 != -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.SendMsgPPC.SendMsgInsertStgPPC", "new msg inserted to db , local id = " + j17);
        return new y11.h(j17);
    }

    public final w11.r1 j() {
        java.lang.Object d17 = h().d("PPCKey_Params");
        kotlin.jvm.internal.o.d(d17);
        return (w11.r1) d17;
    }
}
