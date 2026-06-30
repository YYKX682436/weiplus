package mx2;

/* loaded from: classes2.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.image.FinderImageBanner f332495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f332496e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f332497f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f332498g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f332499h;

    public k(com.tencent.mm.plugin.finder.view.image.FinderImageBanner finderImageBanner, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i17, boolean z17, java.util.LinkedList linkedList) {
        this.f332495d = finderImageBanner;
        this.f332496e = baseFinderFeed;
        this.f332497f = i17;
        this.f332498g = z17;
        this.f332499h = linkedList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlinx.coroutines.l.d(v65.m.a(this.f332495d), null, null, new mx2.j(this.f332496e, this.f332495d, this.f332497f, this.f332498g, this.f332499h, null), 3, null);
    }
}
