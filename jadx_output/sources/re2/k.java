package re2;

/* loaded from: classes.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f394440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f394441e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394442f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f394443g;

    public k(boolean z17, yz5.l lVar, java.lang.String str, yz5.p pVar) {
        this.f394440d = z17;
        this.f394441e = lVar;
        this.f394442f = str;
        this.f394443g = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f394440d) {
            this.f394441e.invoke(this.f394442f);
        } else {
            this.f394443g.invoke(-1, "merge render failed");
        }
    }
}
