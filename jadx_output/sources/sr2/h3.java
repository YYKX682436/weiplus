package sr2;

/* loaded from: classes5.dex */
public final class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.post.PostMainUIC f411578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f411579e;

    public h3(com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC, int i17) {
        this.f411578d = postMainUIC;
        this.f411579e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f411578d.m7().scrollBy(0, this.f411579e);
    }
}
