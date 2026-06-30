package nu3;

/* loaded from: classes10.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final nu3.l f340228a = new nu3.l();

    public final void a(boolean z17, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryRemuxIDKeyStat", "markStoryRemuxResult, isLocalCapture:" + z17 + ", bitrate:" + i17 + ", fps:" + i18);
        if (z17) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.C(986L, 56L, 1L);
            g0Var.C(986L, 60L, i17);
            g0Var.C(986L, 63L, i18);
            return;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var2.C(986L, 57L, 1L);
        g0Var2.C(986L, 66L, i17);
        g0Var2.C(986L, 69L, i18);
    }
}
