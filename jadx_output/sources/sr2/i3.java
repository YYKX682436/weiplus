package sr2;

/* loaded from: classes5.dex */
public final class i3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.post.PostMainUIC f411586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f411587e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f411588f;

    public i3(com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC, int i17, int i18) {
        this.f411586d = postMainUIC;
        this.f411587e = i17;
        this.f411588f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean booleanValue = ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.ad0.f126402a.a().r()).booleanValue();
        int i17 = this.f411588f;
        int i18 = this.f411587e;
        com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC = this.f411586d;
        if (booleanValue) {
            postMainUIC.m7().smoothScrollBy(0, i18 - i17);
        } else {
            postMainUIC.m7().scrollBy(0, i18 - i17);
        }
    }
}
