package ek2;

/* loaded from: classes.dex */
public final class d1 extends ek2.g0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(long j17, java.lang.String micId, long j18, long j19) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(micId, "micId");
        r45.it1 it1Var = new r45.it1();
        it1Var.set(2, java.lang.Long.valueOf(j17));
        it1Var.set(3, micId);
        it1Var.set(4, java.lang.Long.valueOf(j18));
        it1Var.set(7, java.lang.Long.valueOf(j19));
        com.tencent.mars.xlog.Log.i("CgiFinderLiveGetMicReplayInfo", "CgiFinderLiveGetMicReplayInfo: objectId=" + j17 + ", micId=" + micId + ", uin=" + j18 + ", replayType=" + j19);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = it1Var;
        r45.jt1 jt1Var = new r45.jt1();
        jt1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) jt1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = jt1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivegetmicreplayinfo";
        lVar.f70667d = 16051;
        p(lVar.a());
    }
}
