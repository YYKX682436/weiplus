package k64;

/* loaded from: classes4.dex */
public abstract class s implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f304609d;

    public s(int i17) {
        this.f304609d = i17;
    }

    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED, "com.tencent.mm.plugin.sns.ad.netscene.NetSceneEnd");
        try {
            b(-1, null);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("NetSceneEnd", "there is an exception: " + th6.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED, "com.tencent.mm.plugin.sns.ad.netscene.NetSceneEnd");
    }

    public abstract void b(int i17, com.tencent.mm.modelbase.m1 m1Var);

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneEnd");
        try {
            gm0.j1.d().q(this.f304609d, this);
            com.tencent.mars.xlog.Log.i("NetSceneEnd", "errType is " + i17 + ", errCode is " + i18 + ", errMsg is " + str);
            if (i17 == 0 && i18 == 0 && m1Var != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(ya.b.SUCCESS, "com.tencent.mm.plugin.sns.ad.netscene.NetSceneEnd");
                b(0, m1Var);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(ya.b.SUCCESS, "com.tencent.mm.plugin.sns.ad.netscene.NetSceneEnd");
            } else {
                a();
            }
        } catch (java.lang.Throwable unused) {
            a();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneEnd");
    }
}
