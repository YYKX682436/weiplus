package he0;

/* loaded from: classes4.dex */
public class i6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.StatusNotifyFunctionEvent f280727d;

    public i6(he0.j6 j6Var, com.tencent.mm.autogen.events.StatusNotifyFunctionEvent statusNotifyFunctionEvent) {
        this.f280727d = statusNotifyFunctionEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.feature.sns.listener.StatusNotifyFunctionListener$1");
        int i17 = (int) this.f280727d.f54869g.f8614c;
        com.tencent.mm.plugin.sns.storage.w1 Aj = com.tencent.mm.plugin.sns.model.l4.Aj();
        Aj.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateToRead", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        java.lang.String str = " update SnsComment set isRead = 1, isReminding = 0 where isRead = 0 and  createTime <= " + i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentStorage", "updateToread " + str);
        boolean A = Aj.f166156d.A("SnsComment", str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateToRead", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        com.tencent.mars.xlog.Log.i("MicroMsg.StatusNotifyFunctionListener", "update msg read " + A);
        com.tencent.mm.plugin.sns.model.c3.I();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.feature.sns.listener.StatusNotifyFunctionListener$1");
    }
}
