package we0;

@j95.b
/* loaded from: classes11.dex */
public final class w1 extends i95.w implements bi4.a1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f445180d = "MicroMsg.TextStatusVisibilityService";

    public void wi(java.lang.String statusId, int i17, long j17) {
        kotlin.jvm.internal.o.g(statusId, "statusId");
        long j18 = i17 == 1 ? 101L : 100L;
        com.tencent.mm.autogen.mmdata.rpt.TextStateCardExposeStruct textStateCardExposeStruct = new com.tencent.mm.autogen.mmdata.rpt.TextStateCardExposeStruct();
        textStateCardExposeStruct.f61096f = textStateCardExposeStruct.b("TextStatusID", statusId, true);
        textStateCardExposeStruct.f61111u = j18;
        textStateCardExposeStruct.f61113w = c01.id.c();
        textStateCardExposeStruct.f61108r = j17;
        textStateCardExposeStruct.k();
        java.lang.String n17 = textStateCardExposeStruct.n();
        kotlin.jvm.internal.o.f(n17, "toShowString(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.tsReport", "report%s %s", 22216, r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false));
    }
}
