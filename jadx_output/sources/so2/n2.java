package so2;

/* loaded from: classes2.dex */
public final class n2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.o2 f410493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f410494e;

    public n2(so2.o2 o2Var, java.lang.String str) {
        this.f410493d = o2Var;
        this.f410494e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        so2.o2 o2Var = this.f410493d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = o2Var.f410523e;
        java.lang.String str = this.f410494e;
        java.lang.Integer num = (java.lang.Integer) concurrentHashMap.get(str);
        if (num == null || num.intValue() != 2) {
            if (num != null && num.intValue() == 1) {
                com.tencent.mars.xlog.Log.i("FinderLiveJumpReportManager", "[tryCheckExposeReport] expose report with resume}");
                so2.m2 m2Var = (so2.m2) o2Var.f410521c.get(str);
                if (m2Var != null) {
                    ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).getClass();
                    ml2.f0 liveFeed = m2Var.f410479a;
                    kotlin.jvm.internal.o.g(liveFeed, "liveFeed");
                    ml2.j0.f327584m.i(liveFeed, m2Var.f410480b);
                    return;
                }
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveJumpReportManager", "[tryCheckExposeReport] expose report with pageSelected}");
        so2.l2 l2Var = (so2.l2) o2Var.f410522d.get(str);
        if (l2Var != null) {
            zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
            int i17 = l2Var.f410464b;
            com.tencent.mm.plugin.finder.storage.FeedData feedData = l2Var.f410466d;
            r45.qt2 qt2Var = l2Var.f410467e;
            ((ml2.j0) zbVar).getClass();
            ml2.x1 actionType = l2Var.f410463a;
            kotlin.jvm.internal.o.g(actionType, "actionType");
            java.lang.String commentscene = l2Var.f410465c;
            kotlin.jvm.internal.o.g(commentscene, "commentscene");
            ml2.j0.f327584m.j(actionType, i17, commentscene, feedData, qt2Var);
        }
    }
}
