package sp2;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final sp2.i f411047a = new sp2.i();

    public final void a(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, long j17, ml2.x1 actionType, java.lang.String commentscene, java.lang.String chnlExtra) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(actionType, "actionType");
        kotlin.jvm.internal.o.g(commentscene, "commentscene");
        kotlin.jvm.internal.o.g(chnlExtra, "chnlExtra");
        com.tencent.mars.xlog.Log.i("FinderLiveSquareReportUtils", "report21053OnExpose pos: " + j17 + " actionType: " + actionType.f328220d + " commentscene: " + commentscene + " chnlExtra: " + chnlExtra);
        ae2.in inVar = ae2.in.f3688a;
        java.lang.String sessionBuffer = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.V0).getValue()).r()).intValue() == 1 ? feed.getFeedObject().getFeedObject().getSessionBuffer() : "";
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.E9((zy2.zb) c17, feed, actionType, commentscene, chnlExtra, sessionBuffer, 0, 32, null);
    }
}
