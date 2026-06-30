package sb2;

/* loaded from: classes2.dex */
public final class a extends tc2.c {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f405406e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(tc2.g store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f405406e = "Finder.FinderFeedLogController";
    }

    @Override // tc2.c
    public void P6() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(hashCode());
        sb6.append(" onBind ");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f417141d.f417148h;
        sb6.append(pm0.v.u(baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L));
        com.tencent.mars.xlog.Log.i(this.f405406e, sb6.toString());
    }

    @Override // tc2.c
    public void Q6() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(hashCode());
        sb6.append(" onFocusFeedCenter ");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f417141d.f417148h;
        sb6.append(pm0.v.u(baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L));
        com.tencent.mars.xlog.Log.i(this.f405406e, sb6.toString());
    }

    @Override // tc2.c
    public void R6(java.util.List list) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(hashCode());
        sb6.append(" onHotpatch ");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f417141d.f417148h;
        sb6.append(pm0.v.u(baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L));
        com.tencent.mars.xlog.Log.i(this.f405406e, sb6.toString());
    }

    @Override // tc2.c
    public void S6(android.view.View view, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(view, "view");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(hashCode());
        sb6.append(" onMediaClick ");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f417141d.f417148h;
        sb6.append(pm0.v.u(baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L));
        com.tencent.mars.xlog.Log.i(this.f405406e, sb6.toString());
    }

    @Override // tc2.c
    public void U6() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(hashCode());
        sb6.append(" onUnFocusFeedCenter ");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f417141d.f417148h;
        sb6.append(pm0.v.u(baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L));
        com.tencent.mars.xlog.Log.i(this.f405406e, sb6.toString());
    }

    @Override // tc2.c
    public void V6(ec2.f ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(hashCode());
        sb6.append(" onVideoPause ");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f417141d.f417148h;
        sb6.append(pm0.v.u(baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L));
        com.tencent.mars.xlog.Log.i(this.f405406e, sb6.toString());
    }

    @Override // tc2.c
    public void W6(ec2.f ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(hashCode());
        sb6.append(" onVideoRealPlay ");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f417141d.f417148h;
        sb6.append(pm0.v.u(baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L));
        com.tencent.mars.xlog.Log.i(this.f405406e, sb6.toString());
    }

    @Override // tc2.c
    public void X6() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(hashCode());
        sb6.append(" onViewRecycled ");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f417141d.f417148h;
        sb6.append(pm0.v.u(baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L));
        com.tencent.mars.xlog.Log.i(this.f405406e, sb6.toString());
    }
}
