package y11;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ly11/k;", "Lg75/f0;", "Ly11/i;", "Lj75/b;", "Lg75/r;", "pipeline", "<init>", "(Lg75/r;)V", "plugin-messenger-foundation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class k extends g75.f0<y11.i, j75.b> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(g75.r pipeline) {
        super(pipeline);
        kotlin.jvm.internal.o.g(pipeline, "pipeline");
    }

    @Override // g75.f0
    public java.lang.Object i(g75.z zVar, j75.b bVar, kotlin.coroutines.Continuation continuation) {
        y11.i iVar = (y11.i) bVar;
        long j17 = iVar.f458816b;
        com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(iVar.f458817c, j17);
        if (n17.P0() != 5) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SendMsgPPC.SendMsgInsertStgPPC", "msg:%d status:%d should not be resend !", new java.lang.Long(n17.getMsgId()), new java.lang.Integer(n17.P0()));
        }
        n17.r1(1);
        long o17 = c01.w9.o(n17.Q0());
        if (o17 == n17.getCreateTime()) {
            o17++;
        }
        n17.e1(o17);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(j17, n17, true);
        return new y11.j(j17);
    }
}
