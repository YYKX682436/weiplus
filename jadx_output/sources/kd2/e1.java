package kd2;

/* loaded from: classes10.dex */
public final class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kd2.p1 f306736d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f306737e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FeedData f306738f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f306739g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f306740h;

    public e1(kd2.p1 p1Var, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, com.tencent.mm.plugin.finder.storage.FeedData feedData, long j17, boolean z17) {
        this.f306736d = p1Var;
        this.f306737e = finderItem;
        this.f306738f = feedData;
        this.f306739g = j17;
        this.f306740h = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pm0.v.X(new kd2.d1(this.f306736d, this.f306737e, this.f306738f, this.f306739g, this.f306740h));
    }
}
