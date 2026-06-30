package eb2;

/* loaded from: classes2.dex */
public final class e0 extends com.tencent.mm.plugin.finder.feed.model.internal.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.qt2 f250735d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f250736e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f250737f = true;

    /* renamed from: g, reason: collision with root package name */
    public volatile int f250738g;

    public e0(r45.qt2 qt2Var, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this.f250735d = qt2Var;
    }

    public final com.tencent.mm.plugin.finder.feed.model.d5 b(r45.jt4 itemInfo) {
        kotlin.jvm.internal.o.g(itemInfo, "itemInfo");
        if (itemInfo.getInteger(0) == 1) {
            return new com.tencent.mm.plugin.finder.feed.model.d5(itemInfo);
        }
        com.tencent.mars.xlog.Log.i("FinderNativeDramaRecommendItemConvertFactory", "not support type " + itemInfo.getInteger(0));
        return null;
    }

    public final void c(boolean z17, int i17, com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var) {
        pm0.v.T(new db2.o4(this.f250735d, this.f250736e).l(), new eb2.d0(z17, i17, this, n0Var));
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchInit(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f250736e = null;
        this.f250737f = true;
        c(false, 1000, callback);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchLoadMore(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        kotlin.jvm.internal.o.g(callback, "callback");
        if (this.f250737f) {
            c(true, 2, callback);
        } else {
            callback.onFetchDone(new eb2.c0(0, 0, null));
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchRefresh(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f250736e = null;
        this.f250737f = true;
        int i17 = this.f250738g;
        if (this.f250738g == 0) {
            this.f250738g = 1;
        }
        c(false, i17, callback);
    }
}
