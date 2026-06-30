package w52;

/* loaded from: classes15.dex */
public abstract class b {
    public static nm5.b a() {
        if (com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.c()) {
            com.tencent.mars.xlog.Log.w("HABBYGE-MALI.BaseBizCollector", "BaseBizCollector, getCurPageFlowItem, doNotNeedSessionMonitor: TRUE");
            return null;
        }
        r45.c45 e17 = x52.c.e();
        if (e17 == null) {
            com.tencent.mars.xlog.Log.e("HABBYGE-MALI.BaseBizCollector", "BaseBizCollector, curSession is NULL");
            return null;
        }
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.BaseBizCollector", "BaseBizCollector, curSession: %s", e17.f371270d);
        r45.b2 e18 = f52.c.b().e();
        if (e18 == null) {
            com.tencent.mars.xlog.Log.e("HABBYGE-MALI.BaseBizCollector", "BaseBizCollector, curAR is NULL");
            return null;
        }
        nm5.b e19 = y52.b.e(e17.f371270d, e18.f370434d.f370900d);
        if (e19 == null) {
            com.tencent.mars.xlog.Log.e("HABBYGE-MALI.BaseBizCollector", "BaseBizCollector, getPageFlowItemOfCurSession is NULL");
            return null;
        }
        ((java.lang.Integer) e19.a(1)).intValue();
        return e19;
    }
}
