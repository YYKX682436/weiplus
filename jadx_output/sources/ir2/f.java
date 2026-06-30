package ir2;

/* loaded from: classes2.dex */
public final class f implements s40.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FeedUpdateEvent f294132a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ so2.h1 f294133b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ir2.o f294134c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f294135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f294136e;

    public f(com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent, so2.h1 h1Var, ir2.o oVar, int i17, kotlin.jvm.internal.c0 c0Var) {
        this.f294132a = feedUpdateEvent;
        this.f294133b = h1Var;
        this.f294134c = oVar;
        this.f294135d = i17;
        this.f294136e = c0Var;
    }

    @Override // s40.t0
    public void onLiveStatusCallback(long j17, int i17, java.lang.Object obj) {
        r45.o52 o52Var;
        com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = this.f294132a;
        if (j17 == feedUpdateEvent.f54252g.f6918a && (obj instanceof r45.l71)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("TYPE_LIVE_REFRESH id:");
            sb6.append(feedUpdateEvent.f54252g.f6918a);
            sb6.append(",username:");
            sb6.append(feedUpdateEvent.f54252g.f6924g);
            sb6.append(",liveStaus:");
            sb6.append(feedUpdateEvent.f54252g.f6925h);
            sb6.append(',');
            r45.l71 l71Var = (r45.l71) obj;
            r45.nw1 nw1Var = (r45.nw1) l71Var.getCustom(1);
            sb6.append((nw1Var == null || (o52Var = (r45.o52) nw1Var.getCustom(28)) == null) ? null : cm2.a.f43328a.l(o52Var));
            sb6.append(", ori streamUrl:");
            so2.h1 h1Var = this.f294133b;
            r45.nw1 liveInfo = h1Var.getFeedObject().getLiveInfo();
            sb6.append(liveInfo != null ? liveInfo.getString(3) : null);
            sb6.append(" ,new streamUrl:");
            r45.nw1 nw1Var2 = (r45.nw1) l71Var.getCustom(1);
            sb6.append(nw1Var2 != null ? nw1Var2.getString(3) : null);
            com.tencent.mars.xlog.Log.i("Finder.DefaultLoaderActions", sb6.toString());
            h1Var.getFeedObject().setLiveInfo((r45.nw1) l71Var.getCustom(1));
            r45.mb4 liveFinderMedia = h1Var.getFeedObject().getLiveFinderMedia();
            if (liveFinderMedia != null) {
                r45.nw1 liveInfo2 = h1Var.getFeedObject().getLiveInfo();
                liveFinderMedia.set(0, liveInfo2 != null ? liveInfo2.getString(3) : null);
            }
            ir2.o.g(this.f294134c, this.f294135d, 1, null, null, 12, null);
            ir2.o.c(this.f294134c, h1Var);
            this.f294136e.f310112d = true;
        }
    }
}
