package p05;

/* loaded from: classes10.dex */
public final class y3 implements com.tencent.mm.xeffect.IWeVisReport {
    @Override // com.tencent.mm.xeffect.IWeVisReport
    public void report(long j17, java.lang.String str) {
        p05.z3 z3Var = p05.l4.R;
        com.tencent.mars.xlog.Log.i("MicroMsg.XLabEffect", "report id:" + j17 + ", value: " + str);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat((int) j17, str);
    }
}
