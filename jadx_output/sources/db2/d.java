package db2;

/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f227938d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db2.e f227939e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.util.List list, db2.e eVar) {
        super(0);
        this.f227938d = list;
        this.f227939e = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.List<r45.e20> list = this.f227938d;
        for (r45.e20 e20Var : list) {
            if (e20Var.getLong(0) != 0) {
                cu2.u.f222441a.b(e20Var.getLong(0));
                com.tencent.mm.autogen.events.FeedDeleteEvent feedDeleteEvent = new com.tencent.mm.autogen.events.FeedDeleteEvent();
                feedDeleteEvent.f54247g.f6437a = e20Var.getLong(0);
                feedDeleteEvent.e();
                com.tencent.mars.xlog.Log.i("CgiCheckPrefetch", "onCgiEnd: deleteItem by id " + e20Var.getLong(0));
            }
        }
        if (!list.isEmpty()) {
            int size = list.size();
            db2.e eVar = this.f227939e;
            if (size == eVar.f227951u.size()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCgiEnd: should trigger refresh, tabType = ");
                int i17 = eVar.f227950t;
                sb6.append(i17);
                com.tencent.mars.xlog.Log.i("CgiCheckPrefetch", sb6.toString());
                com.tencent.mm.autogen.events.FinderTimelineRefreshEvent finderTimelineRefreshEvent = new com.tencent.mm.autogen.events.FinderTimelineRefreshEvent();
                finderTimelineRefreshEvent.f54334g.f7420a = i17;
                finderTimelineRefreshEvent.e();
            }
        }
        return jz5.f0.f302826a;
    }
}
